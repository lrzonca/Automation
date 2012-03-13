package Webdriver;

import java.io.File;
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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import static org.testng.Assert.*;


public class Fb_CheckLink {
	public WebDriver driver;
	public static ChromeDriverService service;
	DesiredCapabilities capability=null;
	String FanPageUrl = "http://www.facebook.com/pages/Zapapa-games/210288149066461";
	
	//String xAppName = "Zapapa-Staging";
	//String xAppName = "Zapapa Games QA";
	String xAppName = "Zapapa games";
	
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
				 service = new ChromeDriverService.Builder()
			        .usingChromeDriverExecutable(new File(".\\lib\\chromedriver.exe"))
			        .usingAnyFreePort()
			        .build();
				  	
			    service.start();
		
			
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
		
		  WebElement UsernameF = driver.findElement(By.cssSelector(Webdriver.mappings.facebook.USERNAME_FIELD));
		  UsernameF.clear();
		  Thread.sleep(500);
		  UsernameF.sendKeys(xUsername);
		  driver.findElement(By.cssSelector(Webdriver.mappings.facebook.PASSWORD_FIELD)).sendKeys(xPass);
		  WebElement FbButton = driver.findElement(By.cssSelector(Webdriver.mappings.facebook.LOGIN_BUTTON));
		  //new Actions(driver).moveToElement(FbButton).click().perform();
		  FbButton.click();
		  Thread.sleep(2000);
	}
	
	@DataProvider
	public Object[][] languages() {
		return new Object [][] {
				//{"العربية","ألعاب ظابابا - العب مع أصدقائك!"},
				{"Deutsch","Spiele von Zapapa - Spiele zusammen mit deinen Freunden!"},
				{"English (UK)","Zapapa Games - Play with your friends!"},
				{"Bahasa Indonesia","Game Zapapa - Mainkan game dengan temanmu!"},
				{"English (US)","Zapapa Games - Play with your friends!"},
				{"Español (España)","Juegos Zapapa - ¡Juega con tus amigos!"},
				{"Español","Juegos Zapapa - ¡Juega con tus amigos!"},
				{"Français (Canada)","Jeux Zapapa - Amuse-toi en jouant avec tes amis!"},
				{"Français (France)","Jeux Zapapa - Amuse-toi en jouant avec tes amis!"},
				{"Italiano","Giochi Zapapa - Gioca con i tuoi amici!"},
				{"Nederlands","Zapapa Games - Spelletjes spelen met en tegen je vrienden!"},
				{"Polski","gry Zapapa - Zagraj w gry ze swoimi przyjaciółmi!"},
				{"Português (Brasil)","Jogos Zapapa - Joga com os teus amigos!"},
				{"Português (Portugal)","Jogos Zapapa - Joga com os teus amigos!"},
				{"Русский","Zapapa Games - Play with your friends!"},
				{"Svenska","Zapapa-spel - Spela spel med dina vänner!"},
				{"Türkçe","Zapapa Games - Arkadaşlarınızla oyun oynayın!"}
		};
	}
	
	
  @Test(dataProvider = "languages")
  public void CheckLink(String xLanguage, String xString) throws InterruptedException {
	  NavigateToZapapa(xLanguage);
//	  WebElement UpperLink = driver.findElement(By.cssSelector(Webdriver.mappings.facebook.UPPER_LINK));
//	  assertEquals(xString, UpperLink.getText());
	  
	  WebElement UpperLink = driver.findElement(By.cssSelector(Webdriver.mappings.facebook.CATBOX_BAR_TEXT));
	  assertEquals(xString, UpperLink.getText());
  }
  
  @Test(dataProvider = "languages")
  public void CheckFanPageLink (String xLanguage, String xString) throws InterruptedException{
	  NavigateToZapapa(xLanguage);
	  WebElement FanPageL = driver.findElement(By.cssSelector(Webdriver.mappings.facebook.FANPAGE_LINK));
	  String windowMain = driver.getWindowHandle();
	  System.out.println(windowMain);
	  FanPageL.click();
	  Thread.sleep(1500);
	  for (String handle : driver.getWindowHandles()) {
	      driver.switchTo().window(handle);
	  }
	  String currentUrl = driver.getCurrentUrl();
	  System.out.println(currentUrl);
	  assertEquals(FanPageUrl, currentUrl);
	  
	  for (String handle : driver.getWindowHandles()) {
	      driver.switchTo().window(handle);
	  }
  }
  
  @AfterClass
  @Parameters({ "xBrowser"})
  public void quitDriver(String xBrowser) {
	  driver.quit();
	  if (xBrowser.contains("chrome")) {
			 service.stop();
	  } 
  }
  
  //Common functions section
  public void NavigateToZapapa(String xLanguage)throws InterruptedException{
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
	  driver.findElement(By.linkText("Zapapa Games QA")).click();
//	  driver.findElement(By.linkText(xAppName)).click();
	  Thread.sleep(4000);
	  driver.switchTo().frame("iframe_canvas"); 
  }
}
