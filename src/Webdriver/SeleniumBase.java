package Webdriver;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.MalformedURLException;

import junit.framework.TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverBackedSelenium;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.server.commands.CaptureNetworkTrafficCommand;
import org.openqa.selenium.server.commands.CaptureNetworkTrafficCommand.Entry;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


public class SeleniumBase extends mappings{
	private static final Entry TrafficResult = null;
	public WebDriver driver;
	private static ChromeDriverService service;
	DesiredCapabilities capability=null;
	
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
	  public void createDriver(String xBrowser) throws MalformedURLException {
		if (xBrowser.contains("firefox")) {
			// old version
			// driver = new FirefoxDriver();
			System.out.println("firefox");
			capability= DesiredCapabilities.firefox();
			capability.setBrowserName("firefox");
			capability.setPlatform(org.openqa.selenium.Platform.ANY);
			
	//		WebDriverBackedSelenium(CaptureNetworkTrafficCommand.capture(TrafficResult));
			
			driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);
		} else if (xBrowser.contains("chrome")) {
//			driver = new RemoteWebDriver(service.getUrl(),
//			        DesiredCapabilities.chrome());
			capability= DesiredCapabilities.chrome();
			driver = new RemoteWebDriver(service.getUrl(), capability);
			        
		} else if (xBrowser.contains("iexplore")) {
//			DesiredCapabilities ieCapabilities = DesiredCapabilities.internetExplorer();
//            ieCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
//            driver = new InternetExplorerDriver(ieCapabilities);
			System.out.println("iexplore");
			capability= DesiredCapabilities.internetExplorer();
			capability.setBrowserName("iexplore");
			capability.setPlatform(org.openqa.selenium.Platform.WINDOWS);
			capability.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);
		}
	  }

	  private void WebDriverBackedSelenium(Object capture) {
		// TODO Auto-generated method stub
		
	}



	@AfterMethod
	  @Parameters({ "xBrowser"})
	  public void quitDriver(String xBrowser) {
			  driver.quit();
	  }
}
