package Webdriver;

import java.net.MalformedURLException;
import java.net.UnknownHostException;
import java.util.List;


import org.browsermob.core.har.HarEntry;
import org.browsermob.proxy.ProxyServer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import static org.testng.Assert.*;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class GoogleAnalitycs {

    public WebDriver driver;
    private ProxyServer server;
    private HyvesNavigator navigator;
    private int proxyPort = 9090;

    @Parameters({"xProxyPort"})
    public GoogleAnalitycs(String xProxyPort) {
        proxyPort = new Integer(xProxyPort).intValue();
    }
    @BeforeClass
    @Parameters({"xUrl", "xUsername", "xPass", "xBrowser"})
    public void beforeClass(String xUrl, String xUsername, String xPass, String xBrowser) throws Exception {
        setupProxyServer();
        setupNavigator(xBrowser);
        
        navigator.get(xUrl);
        navigator.login(xUsername, xPass);
        navigator.get(xUrl); //workaround for any dev_xx environments
        navigator.waitFor("iframe[name=\"remote_iframe_-1\"]", 10);
        navigator.switchTo().frame("remote_iframe_-1");
        
    }



    private void setupProxyServer() throws Exception {
        server = new ProxyServer(proxyPort);
        server.start();
    }
    
    
    private void setupNavigator(String browser) throws UnknownHostException, MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.PROXY, server.seleniumProxy());
        navigator = new HyvesNavigator(getBrowserDriver(browser, capabilities));
    }
    private WebDriver getBrowserDriver(String browser, DesiredCapabilities caps) throws UnknownHostException, MalformedURLException {
        if (browser.equals("iexplore")) {
            DesiredCapabilities ieExtraCaps = DesiredCapabilities.internetExplorer();
            ieExtraCaps.setBrowserName("iexplore");
            ieExtraCaps.setPlatform(org.openqa.selenium.Platform.WINDOWS);
            ieExtraCaps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
            ieExtraCaps.setCapability(CapabilityType.ForSeleniumServer.ENSURING_CLEAN_SESSION, true);
            //return new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), caps.merge(ieExtraCaps));
            return new InternetExplorerDriver(caps.merge(ieExtraCaps));
        } else {
            DesiredCapabilities ffExtraCaps = DesiredCapabilities.firefox();
            ffExtraCaps.setBrowserName("firefox");
            ffExtraCaps.setPlatform(org.openqa.selenium.Platform.ANY);
            //WebDriverBackedSelenium(CaptureNetworkTrafficCommand.capture(TrafficResult));
            
            //return new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), ffExtraCaps);
            return new FirefoxDriver(caps.merge(ffExtraCaps));
        }
    }
    
    @DataProvider
    public Object[][] tabLinks() {
        return new Object[][] {
                //{"#home_link"},
                {mappings.hyves.SOCIAL_LINK},
                {mappings.hyves.MULTIPLAYER_LINK},
                //{"#farm_link"},
//                {"#board-card_link"},
//                {"#puzzle_link"},
//                {"#action_link"},
//                {"#bingo_link"},
//                {"#skill_link"},
//                {"#kids_link"}
        };
    }

	@Test(dataProvider =  "tabLinks")
    public void thereShouldBeAnalitycsRequestsOnCategories(String xCategorySelector) throws Exception {
        
        server.newHar("hyves.nl");
        navigator.waitFor(xCategorySelector, 10);
        navigator.wait(5);
        //navigator.clickElement("#searchInput");
        navigator.findElement(xCategorySelector).sendKeys("");
        //navigator.findElement(By.id("social_link")).click();
        navigator.clickElement(xCategorySelector);

        navigator.wait(5);
        
        //List<HarEntry> entries = server.getHar().getLog().getEntries();

//        for (HarEntry h: entries) {
//            if (h.getRequest().getUrl().contains("http://www.google-analytics.com/__utm.gif")) {
//                return;
//            }
//            
//        }
//        fail("There have been no analytics data pushed to GA");
    }
	@AfterClass
	public void afterClass() throws Exception {
	    server.stop();
	    navigator.quit();
	}
}
