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
		Sign_Up("", "", "", "", "");  
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
		Sign_Up_TEST("1234567@123", "", "", ""); 
		System.out.println("Assertion");
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.signUp.REGISTER_EMAIL_NOT_VALID)).isDisplayed());
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
		Sign_Up_TEST("miroslaw.palysiewicz.fb@dev.spilgames.eu", "", "", "");
		System.out.println("Assertion");
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.signUp.REGISTER_EMAIL_NOT_VALID)).isDisplayed());
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
		Sign_Up_TEST("", "none", "", "");
		System.out.println("Assertion");
		assertFalse(driver.findElement(By.id(Webdriver.mappings.signUp.REGISTER_USERNAME_VALID)).isDisplayed());
		System.out.println("Assertion");
		assertFalse(driver.findElement(By.id(Webdriver.mappings.signUp.REGISTER_USERNAME_NOT_VALID)).isDisplayed());
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
		Sign_Up_TEST("", "a", "", "");
		System.out.println("Assertion");
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.signUp.REGISTER_USERNAME_NOT_VALID)).isDisplayed());
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
		Sign_Up_TEST("", "mptest", "", "");
		System.out.println("Assertion");
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.signUp.REGISTER_USERNAME_NOT_VALID)).isDisplayed());
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
		Sign_Up_TEST("", "", "", "2");
		System.out.println("Assertion");
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.signUp.REGISTER_AGE_NOT_VALID)).isDisplayed());
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
		Sign_Up_TEST("", "", "1", "");
		System.out.println("Assertion");
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.signUp.REGISTER_PASSWORD_NOT_VALID)).isDisplayed());
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
		Sign_Up_TEST("", "!@#$%^&*()_", "", "");
		System.out.println("Assertion");
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.signUp.REGISTER_USERNAME_NOT_VALID)).isDisplayed());
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
		Sign_Up_TEST("!@#$%^&*(@123", "", "", ""); 
		System.out.println("Assertion");
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.signUp.REGISTER_EMAIL_NOT_VALID)).isDisplayed());
	}		
	
//	Sign up (with wrong email - special chars)
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
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.signUp.REGISTER_AGE_NOT_VALID)).isDisplayed());
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
		Sign_Up_TEST("", "", "!#@$^&*(", ""); 
		System.out.println("Assertion");
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.signUp.REGISTER_PASSWORD_VALID)).isDisplayed());
	}			
}