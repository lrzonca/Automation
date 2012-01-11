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
		Thread.sleep(2000);
		Login("cookietest", "123456");		
	    assertEquals("cookietest", driver.findElement(By.cssSelector(Webdriver.mappings.signIn.LOGGED_USERNAME)).getText());
	}
	
//	Sign in unsuccessfully (wrong password)	
	@Test
	@Parameters({"xUrl"})
	public void SignIn2(String xUrl) throws InterruptedException {
		driver.get(xUrl);
		Thread.sleep(2000);
		Login("cookietest", "123456" + "wrong");	
		driver.findElement(By.id(Webdriver.mappings.signIn.WHOLE_POPUP)).isDisplayed();		
		driver.findElement(By.cssSelector(Webdriver.mappings.signIn.ERROR_MESSAGE)).isDisplayed();
	}	
	
//	Sign in unsuccessfully (empty values)
	@Test
	@Parameters({"xUrl"})
	public void SignIn3(String xUrl) throws InterruptedException {
		driver.get(xUrl);
		Thread.sleep(2000);
		Login("", "");	
		driver.findElement(By.id(Webdriver.mappings.signIn.WHOLE_POPUP)).isDisplayed();		
		driver.findElement(By.cssSelector(Webdriver.mappings.signIn.ERROR_MESSAGE)).isDisplayed();
	}		
	
//	Sign in successfully (keep me signed in on)
	@Test
	@Parameters({"xBrowser", "xUrl"})
	public void SignIn4(String xBrowser, String xUrl) throws InterruptedException {
		driver.get(xUrl);
		Thread.sleep(2000);
		Thread.sleep(8000);
		WebElement loginLink = driver.findElement(By.cssSelector(Webdriver.mappings.signIn.SIGN_IN_LINK));
		loginLink.click();
		WebElement usernameBox = driver.findElement(By.cssSelector(Webdriver.mappings.signIn.USERNAME));
		usernameBox.click();
	    usernameBox.sendKeys("cookietest");
	    WebElement passwordBox = driver.findElement(By.cssSelector(Webdriver.mappings.signIn.PASSWORD));
	    passwordBox.click();
	    passwordBox.sendKeys("123456");
	    Thread.sleep(2000);
	    WebElement remember = driver.findElement(By.cssSelector(Webdriver.mappings.signIn.REMEMBER_CHECKBOX));
	    if (!remember.isSelected()){
	    	remember.click();
	    }	    
	    WebElement signInButton = driver.findElement(By.cssSelector(Webdriver.mappings.signIn.SIGN_IN_BUTTON));	    
	    signInButton.click();
	    Thread.sleep(5000);
	    assertEquals("cookietest", driver.findElement(By.cssSelector(Webdriver.mappings.signIn.LOGGED_USERNAME)).getText());
	    
	    driver.quit();
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
		
		driver.get(xUrl);
		Thread.sleep(10000);
		assertEquals("cookietest", driver.findElement(By.cssSelector(Webdriver.mappings.signIn.LOGGED_USERNAME)).getText());
	}		
	
//	Sign in successfully (keep me signed in off)
	@Test
	@Parameters({"xBrowser", "xUrl"})
	public void SignIn5(String xBrowser, String xUrl) throws InterruptedException {
		driver.get(xUrl);
		Thread.sleep(2000);
		Thread.sleep(8000);
		WebElement loginLink = driver.findElement(By.cssSelector(Webdriver.mappings.signIn.SIGN_IN_LINK));
		loginLink.click();
		WebElement usernameBox = driver.findElement(By.cssSelector(Webdriver.mappings.signIn.USERNAME));
		usernameBox.click();
	    usernameBox.sendKeys("cookietest");
	    WebElement passwordBox = driver.findElement(By.cssSelector(Webdriver.mappings.signIn.PASSWORD));
	    passwordBox.click();
	    passwordBox.sendKeys("123456");
	    Thread.sleep(2000);
	    WebElement remember = driver.findElement(By.cssSelector(Webdriver.mappings.signIn.REMEMBER_CHECKBOX));
	    if (remember.isSelected()){
	    	remember.click();
	    }	    
	    WebElement signInButton = driver.findElement(By.cssSelector(Webdriver.mappings.signIn.SIGN_IN_BUTTON));	    
	    signInButton.click();
	    Thread.sleep(5000);
	    assertEquals("cookietest", driver.findElement(By.cssSelector(Webdriver.mappings.signIn.LOGGED_USERNAME)).getText());
	    
	    driver.quit();
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
		
		driver.get(xUrl);
		Thread.sleep(10000);
		assertFalse(driver.findElement(By.cssSelector(Webdriver.mappings.signIn.LOGGED_USERNAME)).isDisplayed());
	}				
}

