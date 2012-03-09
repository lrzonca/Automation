package Webdriver;

import java.io.IOException;
import java.net.URL;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import static org.testng.Assert.*;


public class Fb_CheckLink {
	public WebDriver driver;
	public static ChromeDriverService service;
	DesiredCapabilities capability=null;
	
	String xUrl = "http://www.facebook.com/";
	String xUsername = "mariola.bialy.seven@dev.spilgames.eu";
	String xPass = "123456";
	
	@BeforeClass
	@Parameters({"xBrowser", "xUrl", "xUsername", "xPass"})
	public void createDriver(String xBrowser, String xUrl, String xUsername, String xPass) throws IOException, InterruptedException {
		if (xBrowser.contains("firefox")) {
			System.out.println("firefox");
			capability= DesiredCapabilities.firefox();
			capability.setBrowserName("firefox");
			capability.setPlatform(org.openqa.selenium.Platform.ANY);
			
			driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);
			
		} else if (xBrowser.contains("chrome")) {
			capability= DesiredCapabilities.chrome();
			driver = new RemoteWebDriver(service.getUrl(), capability);
			        
		} else if (xBrowser.contains("iexplore")) {
			System.out.println("iexplore");
			capability= DesiredCapabilities.internetExplorer();
			capability.setBrowserName("iexplore");
			capability.setPlatform(org.openqa.selenium.Platform.WINDOWS);
			capability.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			capability.setCapability(CapabilityType.ForSeleniumServer.ENSURING_CLEAN_SESSION, true);
			driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);
		}
		driver.get(xUrl);
		  driver.findElement(By.cssSelector(Webdriver.mappings.facebook.USERNAME_FIELD)).sendKeys(xUsername);
		  driver.findElement(By.cssSelector(Webdriver.mappings.facebook.PASSWORD_FIELD)).sendKeys(xPass);
		  driver.findElement(By.cssSelector(Webdriver.mappings.facebook.LOGIN_BUTTON)).click();
		  Thread.sleep(2000);
	}
	
	@DataProvider
	public Object[][] languages() {
		return new Object [][] {
				{"Polski","gry Zapapa - Zagraj w gry ze swoimi przyjació³mi!"},
				{"English (US)","Zapapa Games - Play with your friends!"},
				{"Deutsch","Spiele von Zapapa - Spiele zusammen mit deinen Freunden!"}
		};
	}
	
	
  @Test(dataProvider = "languages")
  public void CheckLink(String xLanguage, String xString) throws InterruptedException {
	  driver.switchTo().defaultContent();
	  driver.findElement(By.cssSelector(Webdriver.mappings.facebook.PAGE_LOGO)).click();
	  Thread.sleep(2000);
	  // Check if proper language is set --- BEGIN ---
	  WebElement FbLang = driver.findElement(By.cssSelector(Webdriver.mappings.facebook.FB_LANG));
	  String LanguageCurrent = FbLang.getText();
	  System.out.println(LanguageCurrent);
	  if(!LanguageCurrent.equalsIgnoreCase(xLanguage)){
		  FbLang.click();
		  Thread.sleep(3000);
		  driver.findElement(By.linkText(xLanguage)).click();
	  }
	  Thread.sleep(4000);
	  driver.findElement(By.linkText("Zapapa games")).click();
	  Thread.sleep(4000);
	  driver.switchTo().frame("iframe_canvas");
	  WebElement UpperLink = driver.findElement(By.cssSelector(Webdriver.mappings.facebook.UPPER_LINK));
	  assertEquals(xString, UpperLink.getText());	  
  }
  
  @AfterClass
  @Parameters({ "xBrowser"})
  public void quitDriver(String xBrowser) {
	  driver.quit();
  }
}
