package Webdriver;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.annotations.Parameters;

import junit.framework.TestCase;

public class Common extends TestCase implements mappings {
	public WebDriver driver;
	public static ChromeDriverService service;
	public String e, u, p, a;
	public String UN1 = "qwerty_friend_1";
	public String UP = "123456";
	public String UN2 = "qwerty_friend_3";	
	
	
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
	    usernameBox.sendKeys(UserName);
	    System.out.println("Find Element PASSWORD");
	    WebElement passwordBox = driver.findElement(By.cssSelector(Webdriver.mappings.signIn.PASSWORD));
	    System.out.println("Click Element PASSWORD");
	    passwordBox.click();
	    System.out.println("Insert data into Element PASSWORD");
	    passwordBox.sendKeys(Password);
	    System.out.println("Sleep 2 sek");
	    Thread.sleep(2000);
	    System.out.println("Find Element SIGN_IN_BUTTON");
	    WebElement signInButton = driver.findElement(By.cssSelector(Webdriver.mappings.signIn.SIGN_IN_BUTTON));
	    System.out.println("Click Element SIGN_IN_BUTTON");
	    signInButton.click();
	    System.out.println("Sleep 5 sek");
	    Thread.sleep(5000);
	}
	
	void AssertTrue(Boolean Object) throws InterruptedException{
	    try{
	    	assertTrue(Object);
	    }
	    catch (Throwable e)
	    {
	    	e.printStackTrace();
	    	fail();
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
	
	
	void Open_User_X_Page (String xUrl, String u)throws InterruptedException {
		driver.get(xUrl + "/user/" + u);
	}
	
	void Friend_Request_Delete_Reject() throws InterruptedException {
		if (driver.findElement(By.cssSelector(Webdriver.mappings.myProfile.DELETE_FRIEND_BUTTON)).getAttribute("style").equals("display: inline-block;")){
			WebElement Delete = driver.findElement(By.cssSelector(Webdriver.mappings.myProfile.DELETE_FRIEND_BUTTON));
			Delete.click();
			Thread.sleep(5000);
			WebElement Yes = driver.findElement(By.cssSelector(Webdriver.mappings.myProfile.DELETE_FRIEND_YES_BUTTON));
			Yes.click();
			Thread.sleep(2000);
		}		
		if (driver.findElement(By.cssSelector(Webdriver.mappings.myProfile.FRIEND_REQUEST_SENT_TEXT)).isDisplayed()){
			Logout();
			Login(UN2, UP);
		    WebElement MyProfile = driver.findElement(By.cssSelector(Webdriver.mappings.topBar.MY_PROFILE_LINK));
		    MyProfile.click();
		    Thread.sleep(5000);
		    WebElement Notification = driver.findElement(By.id(Webdriver.mappings.NOTIFICATIONS.TAB_NOTIFICATIONS));
		    Notification.click();
		    Thread.sleep(5000);
		    WebElement Reject = driver.findElement(By.cssSelector(Webdriver.mappings.NOTIFICATIONS.REJECT_FRIEND_REQUEST_BUTTON));
		    Reject.click();
		    Thread.sleep(3000);
		    AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.NOTIFICATIONS.REJECTED_MESSAGE)).isDisplayed());
			Logout();
			Login(UN1, UP);			
		}
	}
	
	
	/* Description
	 */
	public void Load_Harvesting_Contract(String email, String password) throws InterruptedException {
		WebElement MyProfile = driver.findElement(By.cssSelector(Webdriver.mappings.topBar.MY_PROFILE_LINK));
	    MyProfile.click();
	    Thread.sleep(5000);
		WebElement TabFriend = driver.findElement(By.id(Webdriver.mappings.FRIENDS.TAB_FRIENDS));
		TabFriend.click();
	    Thread.sleep(5000);
		WebElement HarvGetStart = driver.findElement(By.cssSelector(Webdriver.mappings.FRIENDS.HARVESTING_GET_STARTED_BUTTON));
		HarvGetStart.click();
	    Thread.sleep(2000);
		WebElement HarvGmailBtn = driver.findElement(By.cssSelector(Webdriver.mappings.FRIENDS.HARVESTING_GMAIL_BUTTON));
		HarvGmailBtn.click();
		WebElement HarvSignIn = driver.findElement(By.cssSelector(Webdriver.mappings.FRIENDS.HARVESTING_SIGN_IN_BUTTON));
		HarvSignIn.click();
	    Thread.sleep(15000);	    
	    System.out.println(driver.getWindowHandles().toString());
	    for (String handle : driver.getWindowHandles()) {
	    	  driver.switchTo().window(handle);
	    	}	    
	    WebElement HarvMail = driver.findElement(By.id(Webdriver.mappings.HARVESTING.EMAIL_TEXTBOX));
	    HarvMail.click();
	    HarvMail.sendKeys(email);
	    WebElement HarvPass = driver.findElement(By.id(Webdriver.mappings.HARVESTING.PASSWORD_TEXTBOX));
	    HarvPass.click();
	    HarvPass.sendKeys(password);	   
	    WebElement HarvLogin = driver.findElement(By.id(Webdriver.mappings.HARVESTING.LOGIN_BUTTON));
	    HarvLogin.click();
	    WebElement HarvAllow = driver.findElement(By.id(Webdriver.mappings.HARVESTING.ALLOW_BUTTON));
	    HarvAllow.click();
	    Thread.sleep(10000);
	    for (String handle : driver.getWindowHandles()) {
	    	  driver.switchTo().window(handle);
	    	}	    
	}
	
	
	/* Description
	 */
	@Parameters({"xUrl"})
	public void Load_Harvesting_Contract_From_Pet_Party(String xUrl, String email, String password) throws InterruptedException {
		driver.get(xUrl + "/game/pet_party.html?socialgames");
		Thread.sleep(5000);
		driver.switchTo().frame(Webdriver.mappings.social.SOCIAL_GAME_BOX);		
		WebElement Invite = driver.findElement(By.id(Webdriver.mappings.social.SOCIAL_GAME_INVITE_BUTTON));
		Invite.click();
		driver.switchTo().defaultContent();
		Thread.sleep(5000);

		WebElement EmailTab = driver.findElement(By.id(Webdriver.mappings.social.FROM_EMAIL_TAB));
		EmailTab.click();
	    Thread.sleep(2000);
		WebElement GmailBtn = driver.findElement(By.cssSelector(Webdriver.mappings.social.FROM_EMAIL_GMAIL_BUTTON));
		GmailBtn.click();		
	    Thread.sleep(15000);	    
	    System.out.println(driver.getWindowHandles().toString());
	    for (String handle : driver.getWindowHandles()) {
	    	  driver.switchTo().window(handle);
	    	}	    
	    WebElement HarvMail = driver.findElement(By.id(Webdriver.mappings.HARVESTING.EMAIL_TEXTBOX));
	    HarvMail.click();
	    HarvMail.sendKeys(email);
	    WebElement HarvPass = driver.findElement(By.id(Webdriver.mappings.HARVESTING.PASSWORD_TEXTBOX));
	    HarvPass.click();
	    HarvPass.sendKeys(password);	   
	    WebElement HarvLogin = driver.findElement(By.id(Webdriver.mappings.HARVESTING.LOGIN_BUTTON));
	    HarvLogin.click();
	    WebElement HarvAllow = driver.findElement(By.id(Webdriver.mappings.HARVESTING.ALLOW_BUTTON));
	    HarvAllow.click();
	    Thread.sleep(10000);
	    for (String handle : driver.getWindowHandles()) {
	    	  driver.switchTo().window(handle);
	    	}	    
	}		
}