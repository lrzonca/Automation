package Webdriver;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriverService;

import junit.framework.TestCase;

public class Common extends TestCase implements mappings {
	public WebDriver driver;
	public static ChromeDriverService service;
	public String e, u, p, a;
	
	
	void Wait_For_Object(int Time, Boolean Object) throws InterruptedException{
		System.out.println(Object);
		for (int i=0; i<Time; i++) {
			if(Object == false){
				Thread.sleep(1000);	
				System.out.println(i + " " + Object);
			} else {
				System.out.println("Wait Time for Object " + Object + " take " + i + " seconds.");
				break;
			}						
		}
	}
	
	void Login (String UserName, String Password) throws InterruptedException{
		Thread.sleep(8000);
		WebElement loginLink = driver.findElement(By.cssSelector(Webdriver.mappings.signIn.SIGN_IN_LINK));
		loginLink.click();
		WebElement usernameBox = driver.findElement(By.cssSelector(Webdriver.mappings.signIn.USERNAME));
		usernameBox.click();
	    usernameBox.sendKeys(UserName);
	    WebElement passwordBox = driver.findElement(By.cssSelector(Webdriver.mappings.signIn.PASSWORD));
	    passwordBox.click();
	    passwordBox.sendKeys(Password);
	    Thread.sleep(2000);
	    WebElement signInButton = driver.findElement(By.cssSelector(Webdriver.mappings.signIn.SIGN_IN_BUTTON));	    
	    signInButton.click();
	    Thread.sleep(5000);
	}
	
	void AssertTrue(Boolean Object) throws InterruptedException{
	    try{
	    	assertTrue(Object);
	    }
	    catch (Throwable e)
	    {
	    	e.printStackTrace();
	    }		
	}

	
	public void Sign_Up(String e_1, String u_1, String p_1, String p2_1, String a_1) throws InterruptedException {
		Sign_Up_TEST(e_1, u_1, p_1, a_1);
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.signUp.REGISTER_EMAIL_VALID)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.signUp.REGISTER_USERNAME_VALID)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.signUp.REGISTER_PASSWORD_VALID)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.signUp.REGISTER_AGE_VALID)).isDisplayed());
		WebElement signMeIn = driver.findElement(By.cssSelector(Webdriver.mappings.signUp.REGISTER_SIGNMEUP));
		signMeIn.click();
		Thread.sleep(5000);
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.signUp.REGISTER_WELCOME_TEXT)).isDisplayed());
		WebElement welcomeClose = driver.findElement(By.cssSelector(Webdriver.mappings.signUp.REGISTER_WELCOME_CLOSE_BTN));
		welcomeClose.click();
		Thread.sleep(10000);
		assertEquals(this.u, driver.findElement(By.cssSelector(Webdriver.mappings.topBar.USERNAME_LINK)).getText());
	}	
	
	/* Description
	 * this sequence is filling data for user creation, user can be created with parameter e_1 - email, u_1 - username, p_1 - password, p2_1 - retype password, 
	 * dobd_1, dobm_1, doby_1 - date of birth, user can fill in this parameters and if this parameter are set then this data are filled in on page but also this 
	 * parameters could be leaved empty and then default values will be set on page
	 */
	public void Sign_Up_TEST(String e_1, String u_1, String p_1, String a_1) throws InterruptedException {
		Thread.sleep(8000);
		Logout();
		long timestamp = new Date().getTime();		
		if (e_1.isEmpty()){
			e = timestamp + "@google.com";
		} else {;
			if (e_1.contains("@")){
				e = e_1;
			} else {
				e = e_1 + timestamp + "@google.com";
			}
		}
		if (u_1.isEmpty()){
			u = "User" + timestamp;
		} else {
			if (u_1.equals("none")){
				u = "";
			} else {
				u = u_1;
			}			
		}	
		if (p_1.isEmpty()){
			p = "123456";
		} else { 
			p = p_1;
		}
		if (a_1.isEmpty()){
			a = "20";
		} else {
			a = a_1;
		}
		WebElement JoinNow = driver.findElement(By.cssSelector(Webdriver.mappings.signUp.JOIN_NOW_LINK));
		JoinNow.click();
		WebElement email = driver.findElement(By.id(Webdriver.mappings.signUp.REGISTER_EMAIL));
		email.sendKeys(e);
		WebElement name = driver.findElement(By.id(Webdriver.mappings.signUp.REGISTER_USERNAME));
		name.sendKeys(u);
		WebElement password = driver.findElement(By.id(Webdriver.mappings.signUp.REGISTER_PASSWORD));
		password.sendKeys(p);	    
		WebElement age = driver.findElement(By.id(Webdriver.mappings.signUp.REGISTER_AGE)); 
		age.sendKeys(a);
		WebElement AgeText = driver.findElement(By.cssSelector(Webdriver.mappings.signUp.HOW_OLD_ARE_YOU));
		AgeText.click();
	}		

	
	/* Description
	 * this sequence is login out a user by clicking a Logout link but only if user is logged in
	 */
	public void Logout() throws InterruptedException {
		if (driver.findElement(By.cssSelector(Webdriver.mappings.signIn.LOGOUT_LINK)).isDisplayed()){
			WebElement Logout = driver.findElement(By.cssSelector(Webdriver.mappings.signIn.LOGOUT_LINK));
			Logout.click();
			Thread.sleep(5000);
		} else {
		}				
//		Thread.sleep(5000);
	}		
}

