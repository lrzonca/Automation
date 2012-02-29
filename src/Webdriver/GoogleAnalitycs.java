package Webdriver;

import java.net.MalformedURLException;
import java.net.UnknownHostException;
import java.util.List;

import org.browsermob.core.har.HarEntry;
import org.browsermob.core.har.HarNameValuePair;
import org.browsermob.proxy.ProxyServer;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;


import static org.testng.Assert.*;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;
import static ch.lambdaj.Lambda.*;
import ch.lambdaj.function.matcher.Predicate;
import static ch.lambdaj.collection.LambdaCollections.*;


import Webdriver.mappings.hyves;

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
            return new InternetExplorerDriver(caps.merge(ieExtraCaps));
        } else if (browser.equals("firefox")) {
            DesiredCapabilities ffExtraCaps = DesiredCapabilities.firefox();
            ffExtraCaps.setBrowserName("firefox");
            ffExtraCaps.setPlatform(org.openqa.selenium.Platform.ANY);
            return new FirefoxDriver(caps.merge(ffExtraCaps));
        } else {
            DesiredCapabilities chromeExtraCaps = DesiredCapabilities.firefox();
            chromeExtraCaps.setBrowserName("chrome");
            chromeExtraCaps.setPlatform(org.openqa.selenium.Platform.ANY);
            return new ChromeDriver(caps.merge(chromeExtraCaps));
        }
    }
    
    @BeforeMethod
    @Parameters({"xUrl"})
    public void beforeTest(String xUrl) throws Exception {
        server.newHar("hyves.nl");
        navigator.get(xUrl);
        navigator.waitFor("iframe[name=\"remote_iframe_-1\"]", 10);
        navigator.switchTo().frame("remote_iframe_-1");
        navigator.switchTo().activeElement();
    }
    
    @AfterMethod
    public void afterTest() {
        server.endPage();
    }
    
    @DataProvider
    public Object[][] tabLinks() {
        return new Object[][] {
                //{"#home_link"},
                {hyves.SOCIAL_LINK},
                //{hyves.MULTIPLAYER_LINK},
                //{"#farm_link"},
//                {"#board-card_link"},
//                {"#puzzle_link"},
//                {"#action_link"},
//                {"#bingo_link"},
//                {"#skill_link"},
//                {"#kids_link"}
        };
    }

    @Test
    public void thereShouldBeCorrectParametersSentToGoogleOnHomePage() throws InterruptedException {
        navigator.wait(4);
        server.endPage();
        List<HarEntry> ga_utmp = filterHarEntriesByQueryParamNameValue("utmp", "/Home/lang/nl_NL", server.getHar().getLog().getEntries());
        List<HarEntry> ga_utme_value = filterHarEntriesByQueryParamNameValue("utme", "homepage", server.getHar().getLog().getEntries());
        
        assertTrue(ga_utmp.size() > 0, "utmp not registered or incorrect value");
        assertTrue(ga_utme_value.size() > 0, "utme not registered or incorrect value");
    }
    
    @Test
    public void utmacShouldReferenceCorrectUACode() throws InterruptedException {
        navigator.wait(4);
        server.endPage();
        String uacode =(String) ((JavascriptExecutor) navigator.driver).executeScript("return g_oSocialnetwork.UACode");
        List<HarEntry> ga_utmac = filterHarEntriesByQueryParamNameValue("utmac", uacode, server.getHar().getLog().getEntries());
        
        assertNotEquals(ga_utmac.size(), 0);
    }


	@Test(dataProvider =  "tabLinks")
    public void thereShouldBeAnalitycsUtmeOnEachCategoryPage(String xCategorySelector) throws Exception {
        navigator.waitFor(xCategorySelector, 10);
        
        server.newHar("hyves.nl");
        navigator.clickElement(xCategorySelector);
        navigator.wait(2);
        
        List<HarEntry> ga_utme = filterHarEntriesByQueryParamNameValue("utme", "categories", server.getHar().getLog().getEntries());
        
        assertNotEquals(ga_utme.size(), 0, "the event type for categories should be category and it's not present");
    }
    
    @Test
    public void correctPageTypeShouldBeSentToGoogleAnalyticsOnGamePage() throws InterruptedException {
        navigator.wait(2);
        navigator.waitFor(hyves.SOCIAL_LINK, 10);
        navigator.clickElement(hyves.SOCIAL_LINK);

        server.newHar("hyves.nl");
        navigator.waitFor(".game-item-link[title=Landleven]", 10);
        navigator.findElement(".game-item-link[title=Landleven]").click();
        navigator.wait(5);
        
        List<HarEntry> ga_utme = filterHarEntriesByQueryParamNameValue("utme", "games-150588", server.getHar().getLog().getEntries());
        assertNotEquals(ga_utme, 0, "the event type for Landleven should be games-150588");
    }
    
    @Test
    public void correctEventsShouldBeSentWhenClickingFeatureGames() throws InterruptedException {
        navigator.wait(2);
        navigator.waitFor("#box_nieuwe-spellen", 10);
        server.newHar("Hyves.nl");
        navigator.wait(4);
        navigator.clickElement("#box_nieuwe-spellen .game-item-link");
        
        List<HarEntry> ga_utmt = filterHarEntriesByQueryParamNameValue("utmt", "event", server.getHar().getLog().getEntries());
        assertNotEquals(ga_utmt, 0, "the event type reported");
        List<HarEntry> ga_utme = filterHarEntriesByQueryParamNameValue("utme", "FeaturedGames", server.getHar().getLog().getEntries());
        assertNotEquals(ga_utme, 0, "the FeaturedGame click was not reported");
        
    }

    protected void assertUrlNotRequested(final String url) {
        assertEquals(with(server.getHar().getLog().getEntries()).retain(
            having(on(HarEntry.class).getRequest().getUrl(), containsString(url))
        ).size(), 0, String.format("Unexpected url: %s was requested", url));
    }
    protected void assertUrlRequested(final String url) {
        assertNotEquals(with(server.getHar().getLog().getEntries()).retain(
            having(on(HarEntry.class).getRequest().getUrl(), containsString(url))
        ).size(), 0, String.format("Url: %s was not requested", url));
    }

    //@Test(dataProvider = "tabLinks2")
    public void thereShouldBeUmtpTypeSentToGoogle(String xCategorySelector, String expectedUtmp) throws Exception {
        navigator.waitFor(xCategorySelector, 10);
        navigator.wait(5);
        server.newHar("hyves.nl");
        navigator.clickElement(xCategorySelector);
        navigator.wait(1);

        List<HarEntry> analitycsEntries = filterHarEntriesByUrl("http://www.google-analytics.com/__utm.gif", server.getHar().getLog().getEntries());
       
        List<HarEntry> eventEntries = filterHarEntriesByQueryParamNameValue("utmp", expectedUtmp, analitycsEntries);
        assertNotEquals(eventEntries.size(), 0, String.format("There was no event with utmp: %s registered", expectedUtmp));
    }
    
    @Test(dataProvider = "tabLinks")
    public void thereShouldBeUnbounceEventSent(String xCategorySelector) throws Exception {
        navigator.waitFor(xCategorySelector, 10);
        navigator.clickElement(xCategorySelector);
        navigator.wait(62);
        List<HarEntry> unbounceEntries = filterHarEntriesByQueryParamNameValue("utme", "unbounce", server.getHar().getLog().getEntries());
        assertNotEquals(
            filterHarEntriesByQueryParamValue(
                "event",
                filterHarEntriesByQueryParamName("utmt", server.getHar().getLog().getEntries())
            ).size(), 0, "There was no utmt with value event registered"
        );
        
        assertNotEquals(
            filterHarEntriesByQueryParamValue(
                "unbounce*each minute*",
                filterHarEntriesByQueryParamName("utme", server.getHar().getLog().getEntries())
            ).size(), 0, ""
        );
    }
    

    private List<HarEntry> filterHarEntriesByUrl(String url, List<HarEntry> entries) {
        return with(entries).retain(
            having(on(HarEntry.class).getRequest().getUrl(), containsString(url))
         );
        
    }
    
    private List<HarEntry> filterHarEntriesByQueryParamName(final String name, List<HarEntry> entries) {

        return with(entries).retain(new Predicate<HarEntry>() {
            
            @Override
            public boolean apply(HarEntry entry) {
                List<HarNameValuePair> pairs = entry.getRequest().getQueryString();
                return 0 < filter(new Predicate<HarNameValuePair>() {
                    @Override
                    public boolean apply(HarNameValuePair pair) {
                        return pair.getName().contains(name);
                    }
                    
                }, pairs).size();
            }
        });
    }
    
    private List<HarEntry> filterHarEntriesByQueryParamValue(final String value, List<HarEntry> entries) {
        return with(entries).retain(new Predicate<HarEntry>() {
            
            @Override
            public boolean apply(HarEntry entry) {
                List<HarNameValuePair> pairs = entry.getRequest().getQueryString();
                return 0 < filter(new Predicate<HarNameValuePair>() {
                    @Override
                    public boolean apply(HarNameValuePair pair) {
                        return pair.getValue().contains(value);
                    }
                    
                }, pairs).size();
            }
        });
    }
    
    private List<HarEntry> filterHarEntriesByQueryParamNameValue(final String name, final String value, List<HarEntry> entries) {
        return filter(
            new Predicate<HarEntry>() {
                @Override
                public boolean apply(HarEntry entry) {
                    List<HarNameValuePair> pairs = entry.getRequest().getQueryString();
                    return 0 < filter(new Predicate<HarNameValuePair>() {
                        @Override
                        public boolean apply(HarNameValuePair pair) {
                            return pair.getName().contains(name) && pair.getValue().contains(value);
                        }
                        
                    }, pairs).size();
                }
        }, entries);
    } 
    
    @AfterClass
    public void afterClass() throws Exception {
        server.stop();
        navigator.quit();
    }
}
