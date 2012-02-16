package Webdriver;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import net.sourceforge.htmlunit.corejs.javascript.ast.ConditionalExpression;

import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.protocol.*;
import org.browsermob.core.har.Har;
import org.browsermob.core.har.HarLog;
import org.browsermob.proxy.ProxyServer;
import org.openqa.selenium.By;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.internal.selenesedriver.FindElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.regexp.RegExpJsToJavaConverter;

import Webdriver.mappings.hyves;

public class GoogleAnalitycs {

    public WebDriver driver;
    String xBrowser = "firefox";
    private ProxyServer server;
    private HyvesNavigator navigator;

    @BeforeTest
    public void beforeTest() throws Exception {
        server = new ProxyServer(9090);
        server.start();
        Proxy proxy = server.seleniumProxy();
        
        // configure it as a desired capability
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.PROXY, proxy);
        navigator = new HyvesNavigator(new FirefoxDriver(capabilities));
    }
	@Test
    @Parameters({"xUrl", "xCategorySelector", "xUsername", "xPass"})
    public void thereShouldBeAnalitycsRequestsOnCategories(String xUrl, String xCategorySelector, String xUsername, String xPass) throws Exception {

        navigator.get(xUrl);
        navigator.login(xUsername, xPass);

        navigator.get(xUrl);
        navigator.waitFor("iframe[name=remote_iframe_-1", 10);
        navigator.switchTo().frame("remote_iframe_-1");
        
        server.newHar("hyves.nl");
        navigator.clickElement(xCategorySelector);
        navigator.wait(20);
        Har h = server.getHar();

        StringWriter sw = new StringWriter();
        h.writeTo(sw);

        Assert.assertTrue(sw.toString().contains("http://www.google-analytics.com/__utm.gif"));
        
    }
	@AfterTest
	public void afterTest() throws Exception {
	    server.stop();
	    navigator.quit();
	}
	
}
