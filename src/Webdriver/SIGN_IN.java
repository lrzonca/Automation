package Webdriver;
import static org.testng.AssertJUnit.assertEquals;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.util.Date;


import org.junit.runners.BlockJUnit4ClassRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.junit.runner.RunWith;

@RunWith(BlockJUnit4ClassRunner.class)
public class SIGN_IN extends SeleniumBase{

long timestamp = new Date().getTime();


	  @Test
	  @Parameters({"xUrl"})
	  public void SignIn1(String xUrl) throws InterruptedException {
	    driver.get(xUrl);
	    Thread.sleep(5000);
	    WebElement loginLink = driver.findElement(By.cssSelector(".tc-login-url"));
	    loginLink.click();
	    WebElement usernameBox = driver.findElement(By.cssSelector(".tc-username-text"));
	    usernameBox.sendKeys("mptest");
	    WebElement passwordBox = driver.findElement(By.cssSelector(".tc-password-text"));
	    passwordBox.sendKeys("123456");
	    Thread.sleep(5000);
	    WebElement signInButton = driver.findElement(By.cssSelector(".login_button .logmein"));
	    signInButton.click();
	    Thread.sleep(5000);
	    assertEquals("mptest", driver.findElement(By.cssSelector(".tc-username-cnt")).getText());
	  }
	  
	  @Test
	  @Parameters({"xUrl"})
	  public void signUp(String xUrl) throws InterruptedException {
		    String username = "mptest" + timestamp;
		 
		  	driver.get(xUrl);
		    Thread.sleep(5000);
		    WebElement JoinNow = driver.findElement(By.cssSelector(Webdriver.mappings.signUp.JOIN_NOW_LINK));
		    JoinNow.clear();
		    JoinNow.click();
		    WebElement email = driver.findElement(By.id(Webdriver.mappings.signUp.REGISTER_EMAIL));
		    email.sendKeys("miroslaw.palysiewicz"+timestamp+"@dev.spilgames.com");
		    WebElement name = driver.findElement(By.id(Webdriver.mappings.signUp.REGISTER_USERNAME));
		    name.sendKeys(username);
		    WebElement password = driver.findElement(By.id(Webdriver.mappings.signUp.REGISTER_PASSWORD));
		    password.sendKeys("123456");	    
		    WebElement age = driver.findElement(By.id(Webdriver.mappings.signUp.REGISTER_AGE)); 
		    age.sendKeys("13");
		    
		    assertTrue(driver.findElement(By.id(Webdriver.mappings.signUp.REGISTER_EMAIL_VALID)).isDisplayed());
		    assertTrue(driver.findElement(By.id(Webdriver.mappings.signUp.REGISTER_USERNAME_VALID)).isDisplayed());
		    assertTrue(driver.findElement(By.id(Webdriver.mappings.signUp.REGISTER_PASSWORD_VALID)).isDisplayed());
		    assertTrue(driver.findElement(By.id(Webdriver.mappings.signUp.REGISTER_AGE_VALID)).isDisplayed());
		    
		    WebElement signMeIn = driver.findElement(By.cssSelector(Webdriver.mappings.signUp.REGISTER_SIGNMEUP));
		    signMeIn.click();
		    Thread.sleep(5000);
		    assertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.signUp.REGISTER_WELCOME_TEXT)).isDisplayed());
		    WebElement welcomeClose = driver.findElement(By.cssSelector(Webdriver.mappings.signUp.REGISTER_WELCOME_CLOSE_BTN));
		    welcomeClose.click();
		    Thread.sleep(3000);
		    assertEquals(username, driver.findElement(By.cssSelector(Webdriver.mappings.topBar.USERNAME_LINK)).getText());
		  }

	private void assertTrue(boolean displayed) {
		// TODO Auto-generated method stub
		
	}


}

