package Webdriver;

import java.io.IOException;
import java.util.ArrayList;

import net.sourceforge.htmlunit.corejs.javascript.ast.ConditionalExpression;

import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.protocol.*;
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
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Webdriver.mappings.hyves;


class MyRequestInterceptor implements HttpRequestInterceptor {
    public ArrayList<String> requests = new ArrayList<String>();
    public void process(
            HttpRequest request,
            HttpContext context) throws HttpException, IOException {
            requests.add(request.getRequestLine().getUri());
    }

    
}
public class GoogleAnalitycs {

    public WebDriver driver;
    String xBrowser = "firefox";

    
	@Test
    public void testSetPropertyTrackingLabel() throws Exception {
        // start the proxy
	    //DesiredCapabilities capability=null;
        ProxyServer server = new ProxyServer(9090);
        
        server.start();
//        capability= DesiredCapabilities.firefox();
//        capability.setBrowserName("firefox");
//        capability.setPlatform(org.openqa.selenium.Platform.ANY);
        //WebDriverBackedSelenium(CaptureNetworkTrafficCommand.capture(TrafficResult));
        
        //driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);
        // get the Selenium proxy object
        Proxy proxy = server.seleniumProxy();
        
        
        // configure it as a desired capability
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.PROXY, proxy);
        driver = new FirefoxDriver(capabilities);
        
        // create a new HAR with the label "yahoo.com"sco
        MyRequestInterceptor mri = new MyRequestInterceptor();
        server.addRequestInterceptor(mri);
        server.newHar("hyves.nl");
        HyvesNavigator navigator = new HyvesNavigator(driver);
        

        navigator.get("http://www.hyves.nl");
        //navigator.get("http://www.onet.pl");
        server.endPage();

        
        //WebElement we = driver.findElement(By.cssSelector("li.firstItem a"));
        //we.click();
        //navigator.sleep(10);
        navigator.login("najcik", "amiga123");
        //Assert.assertNotNull(driver.findElement(By.cssSelector("a.logo")));
        
        //navigator.sleep(3);
        //navigator.login("najcik", "amiga123");
        server.endPage();
        navigator.get("http://www.hyves.nl/games_dev_06");
        server.endPage();
        for (String r : mri.requests) {
            System.out.println(r);
        }
        driver.quit();
        server.stop();
    }
}
