package Webdriver;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URL;
import java.text.SimpleDateFormat;
import org.apache.commons.io.FileUtils;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestResult;
import org.openqa.selenium.server.commands.CaptureNetworkTrafficCommand.Entry;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.openqa.selenium.TakesScreenshot;


public class SeleniumBase extends Common{
//	private static final Entry TrafficResult = null;
	DesiredCapabilities capability=null;
	
	 @BeforeClass
	 @Parameters({ "xBrowser"})
	  public static void createAndStartService(String xBrowser) throws IOException {
		 if (xBrowser.contains("chrome")) {
			 service = new ChromeDriverService.Builder()
		        .usingChromeDriverExecutable(new File(".\\lib\\chromedriver.exe"))
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
	  public void createDriver(String xBrowser, Method method) throws IOException {
		if (xBrowser.contains("firefox")) {
			System.out.println("firefox");
			capability= DesiredCapabilities.firefox();
			capability.setBrowserName("firefox");
			capability.setPlatform(org.openqa.selenium.Platform.ANY);
			//WebDriverBackedSelenium(CaptureNetworkTrafficCommand.capture(TrafficResult));
			
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
		//driver.manage().deleteAllCookies();
	  }


	@AfterMethod
	  @Parameters({ "xBrowser"})
	  public void quitDriver(String xBrowser, ITestResult _result, Method method) throws IOException {
		if (!_result.isSuccess()){
			System.out.println("TestCase " + this.getClass().getName() + "__" + method.getName() + " was Failed!!!");
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
			} else {
			System.out.println("TestCase " + this.getClass().getName() + "__" + method.getName() + " was Passed!!!");
			}
			  //driver.manage().deleteAllCookies();
			  driver.quit();
	  }
}


//package Webdriver;
//
//import java.io.File;
//import java.io.IOException;
//import java.lang.reflect.Method;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.chrome.ChromeDriverService;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.openqa.selenium.remote.CapabilityType;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.remote.RemoteWebDriver;
//import org.testng.ITestResult;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Parameters;
//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.TakesScreenshot;
//
//
//public class SeleniumBase extends Common{
//// public WebDriver driver;
//
//@BeforeClass
//@Parameters({"xBrowser"})
//public static void createAndStartService(String xBrowser) throws IOException {
//if (xBrowser.contains("chrome")) {
//service = new ChromeDriverService.Builder()
//.usingChromeDriverExecutable(new File("C:\\Users\\CP27\\Automation\\lib\\chromedriver.exe"))
//.usingAnyFreePort()
//.build();
//
//service.start();
//}
//}
//
//@AfterClass
//@Parameters({"xBrowser"})
//public static void createAndStopService(String xBrowser) throws IOException {
//if (xBrowser.contains("chrome")) {
//service.stop();
//}
//}
//
//@BeforeMethod
//@Parameters({"xBrowser"})
//public void createDriver(String xBrowser, Method method) throws IOException {
//System.out.println("Start Test Case " + this.getClass().getName() + "_" + method.getName());
//if (xBrowser.contains("firefox")) {
//driver = new FirefoxDriver();
//} else if (xBrowser.contains("chrome")) {
//driver = new RemoteWebDriver(service.getUrl(),
//DesiredCapabilities.chrome());
//} else if (xBrowser.contains("ie")) {
//DesiredCapabilities ieCapabilities = DesiredCapabilities.internetExplorer();
//            ieCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
//            ieCapabilities.setCapability(CapabilityType.ForSeleniumServer.ENSURING_CLEAN_SESSION, true);
//            driver = new InternetExplorerDriver(ieCapabilities);
//}
//driver.manage().deleteAllCookies();
//}
//
//@AfterMethod
//@Parameters({"xBrowser"})
//public void quitDriver(String xBrowser, ITestResult _result, Method method) throws IOException {
//if (!_result.isSuccess()){
//System.out.println("TestCase " + this.getClass().getName() + "__" + method.getName() + " was Failed!!!");
//Date date = new Date();
//SimpleDateFormat formatter = new SimpleDateFormat("yyyy.MM.dd");
//SimpleDateFormat formatter2 = new SimpleDateFormat("HH.mm");
//String sDate = formatter.format(date);
//String sTime = formatter2.format(date);
//try{
//File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//FileUtils.copyFile(scrFile, new File("C:\\tmp\\WebDriverLog\\FAILED_" + xBrowser + "_TC_" + this.getClass().getName() + "__" + method.getName() + "__" + sDate + "_" + sTime + "__" + ".png"));
//} catch (Exception e){
//e.printStackTrace();
//}
//} else {
//System.out.println("TestCase " + this.getClass().getName() + "__" + method.getName() + " was Passed!!!");
//}
//          driver.manage().deleteAllCookies();
//          driver.quit();
//}
//}
