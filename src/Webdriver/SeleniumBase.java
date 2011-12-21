package Webdriver;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


public class SeleniumBase extends mappings{
	public WebDriver driver;
	private static ChromeDriverService service;
	
	 @BeforeClass
	 @Parameters({ "xBrowser"})
	  public static void createAndStartService(String xBrowser) throws IOException {
		 if (xBrowser.contains("chrome")) {
			 service = new ChromeDriverService.Builder()
		        .usingChromeDriverExecutable(new File("C:\\Users\\Mirek\\workspace\\SPILGAMES\\lib\\chromedriver.exe"))
		        .usingAnyFreePort()
		        .build();
			  	
		    service.start();
		 }
	  }
	 
	 @AfterClass
	 @Parameters({ "xBrowser"})
	  public static void createAndStopService(String xBrowser) {
		 if (xBrowser.contains("chrome")) {
			 service.stop();
		 } 
	  }
	
	@BeforeMethod
	@Parameters({ "xBrowser"})
	  public void createDriver(String xBrowser) {
		if (xBrowser.contains("firefox")) {
			driver = new FirefoxDriver();
		} else if (xBrowser.contains("chrome")) {
			driver = new RemoteWebDriver(service.getUrl(),
			        DesiredCapabilities.chrome());
		} else if (xBrowser.contains("ie")) {
			DesiredCapabilities ieCapabilities = DesiredCapabilities.internetExplorer();
            ieCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
            driver = new InternetExplorerDriver(ieCapabilities);
            
		}
	  }

	  @AfterMethod
	  @Parameters({ "xBrowser"})
	  public void quitDriver(String xBrowser) {
			  driver.quit();
	  }
}
