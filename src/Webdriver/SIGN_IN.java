package Webdriver;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.util.Date;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.junit.runner.RunWith;

@RunWith(BlockJUnit4ClassRunner.class)
public class SIGN_IN extends SeleniumBase{
	long timestamp = new Date().getTime();

//	Sign in (successfully)
	@Test
	@Parameters({"xUrl"})
	public void SignIn1(String xUrl) throws InterruptedException {
		driver.get(xUrl);
		System.out.println("Sleep 2 sek");
		Thread.sleep(2000);
		System.out.println("Login Common");
		Login("cookietest", "123456");		
		System.out.println("Assertion");
	    assertEquals("cookietest", driver.findElement(By.cssSelector(Webdriver.mappings.signIn.LOGGED_USERNAME)).getText());
	}
	
//	Sign in unsuccessfully (wrong password)	
	@Test
	@Parameters({"xUrl"})
	public void SignIn2(String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl);
		System.out.println("Sleep 2 sek");
		Thread.sleep(2000);
		System.out.println("Login Common");
		Login("cookietest", "123456" + "wrong");	
		driver.findElement(By.id(Webdriver.mappings.signIn.WHOLE_POPUP)).isDisplayed();		
		driver.findElement(By.cssSelector(Webdriver.mappings.signIn.ERROR_MESSAGE)).isDisplayed();
	}	
	
//	Sign in unsuccessfully (empty values)
	@Test
	@Parameters({"xUrl"})
	public void SignIn3(String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl);
		System.out.println("Sleep 2 sek");
		Thread.sleep(2000);
		System.out.println("Login Common");
		Login("", "");	
		System.out.println("Find if Element WHOLE_POPUP is visible");
		driver.findElement(By.id(Webdriver.mappings.signIn.WHOLE_POPUP)).isDisplayed();
		System.out.println("Find if Element ERROR_MESSAGE is visible");
		driver.findElement(By.cssSelector(Webdriver.mappings.signIn.ERROR_MESSAGE)).isDisplayed();
	}		
	
//	Sign in successfully (keep me signed in on)
	@Test
	@Parameters({"xBrowser", "xUrl"})
	public void SignIn4(String xBrowser, String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl);
		System.out.println("Sleep 2 sek");
		Thread.sleep(2000);
		System.out.println("Sleep 8 sek");
		Thread.sleep(8000);
		System.out.println("Find Element SIGN_IN_LINK");
		WebElement loginLink = driver.findElement(By.cssSelector(Webdriver.mappings.signIn.SIGN_IN_LINK));
		System.out.println("Click Element SIGN_IN_LINK");
		loginLink.click();
		System.out.println("Find Element USERNAME");
		WebElement usernameBox = driver.findElement(By.cssSelector(Webdriver.mappings.signIn.USERNAME));
		System.out.println("Click Element USERNAME");
		usernameBox.click();
		System.out.println("Insert data into Element USERNAME");
	    usernameBox.sendKeys("cookietest");
	    System.out.println("Find Element PASSWORD");
	    WebElement passwordBox = driver.findElement(By.cssSelector(Webdriver.mappings.signIn.PASSWORD));
	    System.out.println("Click Element PASSWORD");
	    passwordBox.click();
	    System.out.println("Insert data into Element PASSWORD");
	    passwordBox.sendKeys("123456");
	    System.out.println("Sleep 2 sek");
	    Thread.sleep(2000);
	    System.out.println("Find Element REMEMBER_CHECKBOX");
	    WebElement remember = driver.findElement(By.cssSelector(Webdriver.mappings.signIn.REMEMBER_CHECKBOX));
	    System.out.println("Click Element REMEMBER_CHECKBOX if is not selected");
	    if (!remember.isSelected()){
	    	remember.click();
	    }	    
	    System.out.println("Find Element SIGN_IN_BUTTON");
	    WebElement signInButton = driver.findElement(By.cssSelector(Webdriver.mappings.signIn.SIGN_IN_BUTTON));	    
	    System.out.println("Click Element SIGN_IN_BUTTON");
	    signInButton.click();
	    System.out.println("Sleep 5 sek");
	    Thread.sleep(5000);
	    System.out.println("Assertion");
	    assertEquals("cookietest", driver.findElement(By.cssSelector(Webdriver.mappings.signIn.LOGGED_USERNAME)).getText());
	    System.out.println("Close browser");
	    driver.quit();
	    System.out.println("Open browser");
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
		System.out.println("Open URL");
		driver.get(xUrl);
		System.out.println("Sleep 10 sek");
		Thread.sleep(10000);
		System.out.println("Assertion");
		assertEquals("cookietest", driver.findElement(By.cssSelector(Webdriver.mappings.signIn.LOGGED_USERNAME)).getText());
	}		
	
//	Sign in successfully (keep me signed in off)
	@Test
	@Parameters({"xBrowser", "xUrl"})
	public void SignIn5(String xBrowser, String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl);
		System.out.println("Sleep 2 sek");
		Thread.sleep(2000);
		System.out.println("Sleep 8 sek");
		Thread.sleep(8000);
		System.out.println("Find Element SIGN_IN_LINK");
		WebElement loginLink = driver.findElement(By.cssSelector(Webdriver.mappings.signIn.SIGN_IN_LINK));
		System.out.println("Click Element SIGN_IN_LINK");
		loginLink.click();
		System.out.println("Find Element USERNAME");
		WebElement usernameBox = driver.findElement(By.cssSelector(Webdriver.mappings.signIn.USERNAME));
		System.out.println("Click Element USERNAME");
		usernameBox.click();
		System.out.println("Insert data into Element USERNAME");
	    usernameBox.sendKeys("cookietest");
	    System.out.println("Find Element PASSWORD");
	    WebElement passwordBox = driver.findElement(By.cssSelector(Webdriver.mappings.signIn.PASSWORD));
	    System.out.println("Click Element PASSWORD");
	    passwordBox.click();
	    System.out.println("Insert data into Element PASSWORD");
	    passwordBox.sendKeys("123456");
	    System.out.println("Sleep 2 sek");
	    Thread.sleep(2000);
	    System.out.println("Click Element REMEMBER_CHECKBOX if is selected");
	    WebElement remember = driver.findElement(By.cssSelector(Webdriver.mappings.signIn.REMEMBER_CHECKBOX));
	    if (remember.isSelected()){
	    	remember.click();
	    }	  
	    System.out.println("Find Element SIGN_IN_BUTTON");
	    WebElement signInButton = driver.findElement(By.cssSelector(Webdriver.mappings.signIn.SIGN_IN_BUTTON));
	    System.out.println("Click Element SIGN_IN_BUTTON");
	    signInButton.click();
	    System.out.println("Sleep 5 sek");
	    Thread.sleep(5000);
	    System.out.println("Assertion");
	    assertEquals("cookietest", driver.findElement(By.cssSelector(Webdriver.mappings.signIn.LOGGED_USERNAME)).getText());
	    System.out.println("Close browser");
	    driver.quit();
	    System.out.println("Open browser");
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
		System.out.println("Open URL");
		driver.get(xUrl);
		System.out.println("Sleep 10 sek");
		Thread.sleep(10000);
		System.out.println("Assertion");
		assertFalse(driver.findElement(By.cssSelector(Webdriver.mappings.signIn.LOGGED_USERNAME)).isDisplayed());
	}				
}

