package Webdriver;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.util.Date;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.openqa.selenium.By;
import org.junit.runner.RunWith;

@RunWith(BlockJUnit4ClassRunner.class)
public class SIGN_UP extends SeleniumBase{
	long timestamp = new Date().getTime();

//	Sign up (successfully)
	@Test
	@Parameters({"xUrl"})
	public void SignUp1(String xUrl) throws InterruptedException {		 
		System.out.println("Open URL");
		driver.get(xUrl);
		System.out.println("Sleep 2 sek");
		Thread.sleep(2000);
		System.out.println("Sign_Up Common");
//		Sign_Up("", "", "", "", "");  
		Sign_Up2("", "", "", "", "", "", "");
	}
	
//	Sign up (non-working email address)
	@Test
	@Parameters({"xUrl"})
	public void SignUp2(String xUrl) throws InterruptedException {		 
		System.out.println("Open URL");
		driver.get(xUrl);
		System.out.println("Sleep 2 sek");
		Thread.sleep(2000);
		System.out.println("Sign_Up_TEST Common");
//		Sign_Up_TEST("1234567@123", "", "", ""); 
		Sign_Up_TEST2("1234567@123", "", "", "", "", "");
		System.out.println("Assertion");
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.signUp.REGISTER_EMAIL_NOT_VALID)).isDisplayed());
	}	
	
//	Sign up (email address already used)
	@Test
	@Parameters({"xUrl"})
	public void SignUp3(String xUrl) throws InterruptedException {		 
		System.out.println("Open URL");
		driver.get(xUrl);
		System.out.println("Sleep 2 sek");
		Thread.sleep(2000);
		System.out.println("Sign_Up_TEST Common");
//		Sign_Up_TEST("miroslaw.palysiewicz.fb@dev.spilgames.eu", "", "", "");
		Sign_Up_TEST2("miroslaw.palysiewicz.fb@dev.spilgames.eu", "", "", "", "", "");
		System.out.println("Assertion");
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.signUp.REGISTER_EMAIL_NOT_VALID)).isDisplayed());
	}	

//	Sign up (without username)
	@Test
	@Parameters({"xUrl"})
	public void SignUp4(String xUrl) throws InterruptedException {		 
		System.out.println("Open URL");
		driver.get(xUrl);
		System.out.println("Sleep 2 sek");
		Thread.sleep(2000);
		System.out.println("Sign_Up_TEST Common");
//		Sign_Up_TEST("", "none", "", "");
		Sign_Up_TEST2("", "none", "", "", "", "");
		System.out.println("Assertion");
		assertFalse(driver.findElement(By.cssSelector(Webdriver.mappings.signUp.REGISTER_USERNAME_VALID)).isDisplayed());
		System.out.println("Assertion");
		assertFalse(driver.findElement(By.cssSelector(Webdriver.mappings.signUp.REGISTER_USERNAME_NOT_VALID)).isDisplayed());
	}
	
//	Sign up (with too short name)
	@Test
	@Parameters({"xUrl"})
	public void SignUp5(String xUrl) throws InterruptedException {		 
		System.out.println("Open URL");
		driver.get(xUrl);
		System.out.println("Sleep 2 sek");
		Thread.sleep(2000);
		System.out.println("Sign_Up_TEST Common");
//		Sign_Up_TEST("", "a", "", "");
		Sign_Up_TEST2("", "a", "", "", "", "");
		System.out.println("Assertion");
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.signUp.REGISTER_USERNAME_NOT_VALID)).isDisplayed());
	}
	
//	Sign up (username already used)
	@Test
	@Parameters({"xUrl"})
	public void SignUp6(String xUrl) throws InterruptedException {		 
		System.out.println("Open URL");
		driver.get(xUrl);
		System.out.println("Sleep 2 sek");
		Thread.sleep(2000);
		System.out.println("Sign_Up_TEST Common");
//		Sign_Up_TEST("", "mptest", "", "");
		Sign_Up_TEST2("", "mptest", "", "", "", "");
		System.out.println("Assertion");
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.signUp.REGISTER_USERNAME_NOT_VALID)).isDisplayed());
	}	
	
//	Sign up (not old enough)
	@Test
	@Parameters({"xUrl"})
	public void SignUp7(String xUrl) throws InterruptedException {		 
		System.out.println("Open URL");
		driver.get(xUrl);
		System.out.println("Sleep 2 sek");
		Thread.sleep(2000);
		System.out.println("Sign_Up_TEST Common");
//		Sign_Up_TEST("", "", "", "2");
		Sign_Up_TEST2("", "", "", "", "", "2010");
		System.out.println("Assertion");
//		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.signUp.REGISTER_AGE_NOT_VALID)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.signUp.REGISTER_DOB_NOT_VALID)).isDisplayed());
	}		
	
//	Sign up (with too short password)
	@Test
	@Parameters({"xUrl"})
	public void SignUp8(String xUrl) throws InterruptedException {		 
		System.out.println("Open URL");
		driver.get(xUrl);
		System.out.println("Sleep 2 sek");
		Thread.sleep(2000);
		System.out.println("Sign_Up_TEST Common");
//		Sign_Up_TEST("", "", "1", "");
		Sign_Up_TEST2("", "", "1", "", "", "");
		System.out.println("Assertion");
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.signUp.REGISTER_PASSWORD_NOT_VALID)).isDisplayed());
	}	
	
//	Sign up (with wrong username - special chars)
	@Test
	@Parameters({"xUrl"})
	public void SignUp9(String xUrl) throws InterruptedException {		 
		System.out.println("Open URL");
		driver.get(xUrl);
		System.out.println("Sleep 2 sek");
		Thread.sleep(2000);
		System.out.println("Sign_Up_TEST Common");
//		Sign_Up_TEST("", "!@#$%^&*()_", "", "");
		Sign_Up_TEST2("", "!@#$%^&*()_", "", "", "", "");
		System.out.println("Assertion");
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.signUp.REGISTER_USERNAME_NOT_VALID)).isDisplayed());
	}	
	
//	Sign up (with wrong email - special chars)
	@Test
	@Parameters({"xUrl"})
	public void SignUp10(String xUrl) throws InterruptedException {		 
		System.out.println("Open URL");
		driver.get(xUrl);
		System.out.println("Sleep 2 sek");
		Thread.sleep(2000);
		System.out.println("Sign_Up_TEST Common");
//		Sign_Up_TEST("!@#$%^&*(@123", "", "", ""); 
		Sign_Up_TEST2("!@#$%^&*(@123", "", "", "", "", "");
		System.out.println("Assertion");
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.signUp.REGISTER_EMAIL_NOT_VALID)).isDisplayed());
	}		
	
//	Sign up (with wrong email - special chars)
//	not valid in DOB version, valid only for Age version
	@Test
	@Parameters({"xUrl"})	
	public void SignUp11(String xUrl) throws InterruptedException {		 
		System.out.println("Open URL");
		driver.get(xUrl);
		System.out.println("Sleep 2 sek");
		Thread.sleep(2000);
		System.out.println("Sign_Up_TEST Common");
		Sign_Up_TEST("", "", "", "#@"); 
		System.out.println("Assertion");
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.signUp.REGISTER_AGE_NOT_VALID)).isDisplayed());
	}		
	
//	Sign up (with password - special chars)
	@Test
	@Parameters({"xUrl"})
	public void SignUp12(String xUrl) throws InterruptedException {		 
		System.out.println("Open URL");
		driver.get(xUrl);
		System.out.println("Sleep 2 sek");
		Thread.sleep(2000);
		System.out.println("Sign_Up_TEST Common");
//		Sign_Up_TEST("", "", "!#@$^&*(", ""); 
		Sign_Up_TEST2("", "", "!#@$^&*(", "", "", "");
		System.out.println("Assertion");
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.signUp.REGISTER_PASSWORD_VALID)).isDisplayed());
	}
	
//	Already a member - sign in link - click "sign up" button , click "sign in" link, check controls if are present
	@Test
	@Parameters({"xUrl"})
	public void SignUp13(String xUrl) throws InterruptedException {		 
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(5);
		clickElement(signUp.JOIN_NOW_LINK);
		sleep(2);
		clickElement(signUp.REGISTER_SIGN_IN_LINK);
		sleep(5);
	    System.out.println(driver.getCurrentUrl());
	    System.out.println(xUrl);		
		assertTrue(driver.getCurrentUrl().equals(xUrl + "/"));
		assertIsDisplayed(signIn.SIGN_IN_BOX);
	}		
	
//	Privacy Policy - click "sign up" button , click "Privacy Policy" link, check controls if are present
	@Test
	@Parameters({"xUrl"})
	public void SignUp14(String xUrl) throws InterruptedException {		 
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(5);
		clickElement(signUp.JOIN_NOW_LINK);
		sleep(2);
		clickElement(signUp.REGISTER_PRIVACY_POLICY_LINK);
		sleep(3);
	    for (String handle : driver.getWindowHandles()) {
	    	  driver.switchTo().window(handle);
	    	}	
	    sleep(2);
	    System.out.println(driver.getCurrentUrl());
	    System.out.println(xUrl);	    
		assertTrue(driver.getCurrentUrl().contains("privacy_policy.html"));
		assertIsDisplayed(flatPage.FLAT_PAGE_CONTAINER);
	}	
	
//	Terms of Use - click "sign up" button , click "terms of use" link, check controls if are present
	@Test
	@Parameters({"xUrl"})
	public void SignUp15(String xUrl) throws InterruptedException {		 
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(5);
		clickElement(signUp.JOIN_NOW_LINK);
		sleep(2);
		clickElement(signUp.REGISTER_TERMS_OF_USE_LINK);
		sleep(3);
	    for (String handle : driver.getWindowHandles()) {
	    	  driver.switchTo().window(handle);
	    	}
	    sleep(2);
	    System.out.println(driver.getCurrentUrl());
	    System.out.println(xUrl);
		assertTrue(driver.getCurrentUrl().contains("disclaimer.html"));
		assertIsDisplayed(flatPage.FLAT_PAGE_CONTAINER);
	}		

//	More info - click "sign up" button , click "more info" link, check controls if are present
	@Test
	@Parameters({"xUrl"})
	public void SignUp16(String xUrl) throws InterruptedException {		 
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(5);
		clickElement(signUp.JOIN_NOW_LINK);
		sleep(2);
		clickElement(signUp.REGISTER_MORE_INFO);
		sleep(3);
//	    for (String handle : driver.getWindowHandles()) {
//	    	  driver.switchTo().window(handle);
//	    	}	
		sleep(2);
	    System.out.println(driver.getCurrentUrl());
	    System.out.println(xUrl);		
		assertTrue(driver.getCurrentUrl().contains("become_a_member.html"));
		assertIsDisplayed(flatPage.FLAT_PAGE);
		assertIsDisplayed(flatPage.FLAT_PAGE_CONTAINER);
	}		
}