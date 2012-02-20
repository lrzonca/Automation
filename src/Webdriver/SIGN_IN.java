package Webdriver;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.util.Date;
import org.junit.runners.BlockJUnit4ClassRunner;
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
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(5);
		Login("cookietest", "123456");		
		System.out.println("Assertion");
	    assertEquals("cookietest", findElement(signIn.LOGGED_USERNAME).getText());
	}
	
//	Sign in unsuccessfully (wrong password)	
	@Test
	@Parameters({"xUrl"})
	public void SignIn2(String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(2);
		Login("cookietest", "123456" + "wrong");	
//		assertTrue(findElement(signIn.WHOLE_POPUP).isDisplayed());
//		assertTrue(findElement(signIn.ERROR_MESSAGE).isDisplayed());
		assertIsDisplayed(signIn.WHOLE_POPUP);
		assertIsDisplayed(signIn.ERROR_MESSAGE);
	}	
	
//	Sign in unsuccessfully (empty values)
	@Test
	@Parameters({"xUrl"})
	public void SignIn3(String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(2);
		Login("", "");	
//		System.out.println("Find Element WHOLE_POPUP");
//		driver.findElement(By.id(Webdriver.mappings.signIn.WHOLE_POPUP)).isDisplayed();
//		System.out.println("Find Element ERROR_MESSAGE");
//		assertTrue(findElement(signIn.ERROR_MESSAGE).isDisplayed());
		assertIsDisplayed(signIn.WHOLE_POPUP);
		assertIsDisplayed(signIn.ERROR_MESSAGE);
	}		
	
//	Sign in successfully (keep me signed in on)
	@Test
	@Parameters({"xBrowser", "xUrl"})
	public void SignIn4(String xBrowser, String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(2);
		clickElement(signIn.SIGN_IN_LINK);
		insertData(signIn.USERNAME, "cookietest");
		insertData(signIn.PASSWORD, "123456");	   
		sleep(2);
	    System.out.println("Find Element REMEMBER_CHECKBOX");
	    WebElement remember = findElement(signIn.REMEMBER_CHECKBOX);
	    System.out.println("Click Element REMEMBER_CHECKBOX if is not selected");
	    if (!remember.isSelected()){
	    	remember.click();
	    }	    
	    clickElement(signIn.SIGN_IN_BUTTON);
	    sleep(5);
	    System.out.println("Assertion");
	    assertEquals("cookietest", findElement(signIn.LOGGED_USERNAME).getText());
	    System.out.println("Close browser");
	    driver.quit();
	    System.out.println("Open browser");
		if (xBrowser.contains("firefox")) {
			driver = new FirefoxDriver();
		} else if (xBrowser.contains("chrome")) {
			driver = new RemoteWebDriver(service.getUrl(), DesiredCapabilities.chrome());
		} else if (xBrowser.contains("iexplore")) {
			DesiredCapabilities ieCapabilities = DesiredCapabilities.internetExplorer();
            ieCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
            ieCapabilities.setCapability(CapabilityType.ForSeleniumServer.ENSURING_CLEAN_SESSION, true);
            driver = new InternetExplorerDriver(ieCapabilities);            
		}	
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(10);
		System.out.println("Assertion");
		assertEquals("cookietest", findElement(signIn.LOGGED_USERNAME).getText());
	}		
	
//	Sign in successfully (keep me signed in off)
	@Test
	@Parameters({"xBrowser", "xUrl"})
	public void SignIn5(String xBrowser, String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(2);
		clickElement(signIn.SIGN_IN_LINK);
		insertData(signIn.USERNAME, "cookietest");
		insertData(signIn.PASSWORD, "123456");	   
		sleep(2);
	    System.out.println("Find Element REMEMBER_CHECKBOX");
	    WebElement remember = findElement(signIn.REMEMBER_CHECKBOX);
	    System.out.println("Click Element REMEMBER_CHECKBOX if is selected");
	    if (remember.isSelected()){
	    	remember.click();
	    }	  
	    System.out.println("Find Element SIGN_IN_BUTTON");
	    clickElement(signIn.SIGN_IN_BUTTON);
	    sleep(5);	    
	    System.out.println("Assertion");
	    assertEquals("cookietest", findElement(signIn.LOGGED_USERNAME).getText());
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
		assertFalse(findElement(signIn.LOGGED_USERNAME).isDisplayed());
	}
	
	
//	Forgot your password link - click "sign in" button , click "forgot your password" link, check url and controls if are present
	@Test
	@Parameters({"xUrl"})
	public void SignIn6(String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(5);
		clickElement(signIn.SIGN_IN_LINK);
		sleep(2);
		clickElement(signIn.FORGOT_YOUR_PASSWORD_LINK);
		sleep(5);
		assertTrue(driver.getCurrentUrl().contains("forgotten_password.html"));
		assertIsDisplayed(forgotPassword.FORGOT_EMAIL_BOX);
		assertIsDisplayed(forgotPassword.FORGOT_EMAIL_GIRL);
		assertIsDisplayed(forgotPassword.FORGOT_EMAIL_SEND_BUTTON);
		assertIsDisplayed(forgotPassword.FORGOT_EMAIL_TEXT);
		assertIsDisplayed(forgotPassword.FORGOT_EMAIL_TEXTFIELD);
		assertIsDisplayed(forgotPassword.FORGOT_EMAIL_TITLE_TEXT);
	}	
	
	
//	Forgot your password link - click "sign in" button , click "become a member" link, check url and controls if are present
	@Test
	@Parameters({"xUrl"})
	public void SignIn7(String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(5);
		clickElement(signIn.SIGN_IN_LINK);
		sleep(2);
		clickElement(signIn.BECOME_A_MEMBER_LINK);
		sleep(5);
		assertTrue(driver.getCurrentUrl().contains("become_a_member.html"));
		assertIsDisplayed(flatPage.FLAT_PAGE);
		assertIsDisplayed(flatPage.FLAT_PAGE_CONTAINER);
	}	
	
	
//	Sign Up for free link - click "sign in" button , click "sign up for free" link, check controls if are present
	@Test
	@Parameters({"xUrl"})
	public void SignIn8(String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(5);
		clickElement(signIn.SIGN_IN_LINK);
		sleep(2);
		clickElement(signIn.REGISTER_LINK);
		sleep(5);
		assertTrue(driver.getCurrentUrl().equals(xUrl + "/"));
		assertIsDisplayed(signUp.SIGN_UP_POPUP);
	}
	
	
//	Sign Out link - login a user, click "sign out" link, check controls if are present
	@Test
	@Parameters({"xUrl"})
	public void SignOut1(String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(5);
		Login("cookietest", "123456");		
		System.out.println("Assertion");
	    assertEquals("cookietest", findElement(signIn.LOGGED_USERNAME).getText());		
		assertIsDisplayed(signIn.LOGOUT_LINK);
		clickElement(signIn.LOGOUT_LINK);
		sleep(5);
		assertIsDisplayed(signIn.SIGN_IN_LINK);		
	}	
}