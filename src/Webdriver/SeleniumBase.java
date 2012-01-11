package Webdriver;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.TakesScreenshot;


public class SeleniumBase extends Common{
//	public WebDriver driver;
	
	 @BeforeClass
	 @Parameters({"xBrowser"})
	  public static void createAndStartService(String xBrowser) throws IOException {
		 if (xBrowser.contains("chrome")) {
			 service = new ChromeDriverService.Builder()
		        .usingChromeDriverExecutable(new File("C:\\Users\\CP27\\Automation\\lib\\chromedriver.exe"))
		        .usingAnyFreePort()
		        .build();
			  	
		    service.start();
		 }
	  }
	 
	 @AfterClass
	 @Parameters({"xBrowser"})
	  public static void createAndStopService(String xBrowser) throws IOException {
		 if (xBrowser.contains("chrome")) {
			 service.stop();
		 } 
	  }
	
	@BeforeMethod
	@Parameters({"xBrowser"})
	  public void createDriver(String xBrowser, Method method) throws IOException {
		System.out.println("Start Test Case " + this.getClass().getName() + "_" + method.getName());
		if (xBrowser.contains("firefox")) {
			driver = new FirefoxDriver();
		} else if (xBrowser.contains("chrome")) {
			driver = new RemoteWebDriver(service.getUrl(),
			DesiredCapabilities.chrome());
		} else if (xBrowser.contains("ie")) {
			DesiredCapabilities ieCapabilities = DesiredCapabilities.internetExplorer();
            ieCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
            ieCapabilities.setCapability(CapabilityType.ForSeleniumServer.ENSURING_CLEAN_SESSION, true);
            driver = new InternetExplorerDriver(ieCapabilities);            
		}
		driver.manage().deleteAllCookies();
	  }

	  @AfterMethod
	  @Parameters({"xBrowser"})
	  public void quitDriver(String xBrowser, ITestResult _result, Method method) throws IOException {
		  if (!_result.isSuccess()){
			  Date date = new Date();
			  SimpleDateFormat formatter = new SimpleDateFormat("yyyy.MM.dd");
			  SimpleDateFormat formatter2 = new SimpleDateFormat("HH.mm");
			  String sDate = formatter.format(date);
			  String sTime = formatter2.format(date);
			  try{
				  File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				  FileUtils.copyFile(scrFile, new File("C:\\tmp\\WebDriverLog\\FAILED_" + xBrowser + "_TC_" + this.getClass().getName() + "__" + method.getName() + "__" + sDate + "_" + sTime + "__" + ".png"));
			  } catch (Exception e){
				  e.printStackTrace();
			  }			  
		  }
          driver.manage().deleteAllCookies();
          driver.quit();
	  }
}
