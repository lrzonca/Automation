package Webdriver;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ACTIVE_BOX extends SeleniumBase{
	  
//	Active Box - user not logged in - check controls and if Everyone tab is selected 	
	@Test
	@Parameters({"xUrl"})
	public void Active01(String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(3);
		assertIsDisplayed(activebox.ACTIVE_BOX_BOX);
		assertIsDisplayed(activebox.ACTIVE_BOX_TITLE);
		assertIsDisplayed(activebox.ACTIVE_BOX_EVERYONE_TAB_BOX);
		assertIsDisplayed(activebox.ACTIVE_BOX_EVERYONE_TAB_TEXT);
		assertIsDisplayed(activebox.ACTIVE_BOX_FRIENDS_TAB_BOX);
		assertIsDisplayed(activebox.ACTIVE_BOX_FRIENDS_TAB_TEXT);
		assertIsDisplayed(activebox.ACTIVE_BOX_UNLOGGED_CONTENT_BOX);
		assertIsDisplayed(activebox.ACTIVE_BOX_UNLOGGED_USER_BOX);
		assertIsDisplayed(activebox.ACTIVE_BOX_UNLOGGED_USER_TILTE);
		assertIsDisplayed(activebox.ACTIVE_BOX_UNLOGGED_SIGNUP_BTN);
		assertIsDisplayed(activebox.ACTIVE_BOX_UNLOGGED_LOGIN_LINK);
		assertIsDisplayed(activebox.ACTIVE_BOX_UNLOGGED_JOIN_US_BOX);
		assertIsDisplayed(activebox.ACTIVE_BOX_UNLOGGED_JOIN_US_LINK);
		assertTrue(findElement(activebox.ACTIVE_BOX_EVERYONE_TAB_BOX).getAttribute("class").contains("tab-active"));
		
		assertIsNotDisplayed(activebox.ACTIVE_BOX_LOGGED_CONTENT_BOX);
		assertIsNotDisplayed(activebox.ACTIVE_BOX_LOGGED_JOIN_US_BOX);
		assertIsNotDisplayed(activebox.ACTIVE_BOX_LOGGED_VISIT_YOUR_PROFILE_LINK);
	}	
	
//	Active Box - user not logged in - click "what happening" title, check if sign up popup is visible 
//	DEFECT
	@Test
	@Parameters({"xUrl"})
	public void Active02(String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(3);
		clickElement(activebox.ACTIVE_BOX_TITLE);
		assertIsDisplayed(signUp.SIGN_UP_POPUP);
	}		
	
//	Active Box - user not logged in - click "friends" tab, check if sign up popup is visible  	
	@Test
	@Parameters({"xUrl"})
	public void Active03(String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(3);
		clickElement(activebox.ACTIVE_BOX_FRIENDS_TAB_BOX);
		assertIsDisplayed(signUp.SIGN_UP_POPUP);
	}	
	
//	Active Box - user not logged in - click "sign up" btn, check if sign up popup is visible  	
	@Test
	@Parameters({"xUrl"})
	public void Active04(String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(3);
		clickElement(activebox.ACTIVE_BOX_UNLOGGED_SIGNUP_BTN);
		assertIsDisplayed(signUp.SIGN_UP_POPUP);
	}	
	
//	Active Box - user not logged in - click "log in" link, check if sign in popup is visible  	
	@Test
	@Parameters({"xUrl"})
	public void Active05(String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(3);
		clickElement(activebox.ACTIVE_BOX_UNLOGGED_LOGIN_LINK);
		assertIsDisplayed(signIn.SIGN_IN_POPUP);
	}	
	
//	Active Box - user not logged in - click "Join us!" link, check if sign up popup is visible  	
	@Test
	@Parameters({"xUrl"})
	public void Active06(String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(3);
		clickElement(activebox.ACTIVE_BOX_UNLOGGED_JOIN_US_LINK);
		assertIsDisplayed(signUp.SIGN_UP_POPUP);
	}		

//	Active Box - user logged in - check controls and if Everyone tab is selected 	
	@Test
	@Parameters({"xUrl"})
	public void Active07(String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(3);
		Login("cookietest", "123456");	
		sleep(5);
		assertIsDisplayed(activebox.ACTIVE_BOX_BOX);
		assertIsDisplayed(activebox.ACTIVE_BOX_TITLE);
		assertIsDisplayed(activebox.ACTIVE_BOX_EVERYONE_TAB_BOX);
		assertIsDisplayed(activebox.ACTIVE_BOX_EVERYONE_TAB_TEXT);
		assertIsDisplayed(activebox.ACTIVE_BOX_FRIENDS_TAB_BOX);
		assertIsDisplayed(activebox.ACTIVE_BOX_FRIENDS_TAB_TEXT);
		assertIsDisplayed(activebox.ACTIVE_BOX_LOGGED_CONTENT_BOX);
		assertIsDisplayed(activebox.ACTIVE_BOX_LOGGED_JOIN_US_BOX);
		assertIsDisplayed(activebox.ACTIVE_BOX_LOGGED_VISIT_YOUR_PROFILE_LINK);
		assertTrue(findElement(activebox.ACTIVE_BOX_FRIENDS_TAB_BOX).getAttribute("class").contains("tab-active"));		
		assertIsNotDisplayed(activebox.ACTIVE_BOX_UNLOGGED_CONTENT_BOX);
		assertIsNotDisplayed(activebox.ACTIVE_BOX_UNLOGGED_USER_BOX);
		assertIsNotDisplayed(activebox.ACTIVE_BOX_UNLOGGED_USER_TILTE);
		assertIsNotDisplayed(activebox.ACTIVE_BOX_UNLOGGED_SIGNUP_BTN);
		assertIsNotDisplayed(activebox.ACTIVE_BOX_UNLOGGED_LOGIN_LINK);
		assertIsNotDisplayed(activebox.ACTIVE_BOX_UNLOGGED_JOIN_US_BOX);
		assertIsNotDisplayed(activebox.ACTIVE_BOX_UNLOGGED_JOIN_US_LINK);
	}	

//	Active Box - user logged in - click "what happening" title, check if profile page was open
//	DEFECT
	@Test
	@Parameters({"xUrl"})
	public void Active08(String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(3);
		Login("cookietest", "123456");	
		sleep(5);
		clickElement(activebox.ACTIVE_BOX_TITLE);
		sleep(5);
		assertTrue(driver.getCurrentUrl().contains("profile.html"));
	}		
	
//	Active Box - user logged in - click "visit your profile" title, check if profile page was open
	@Test
	@Parameters({"xUrl"})
	public void Active09(String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(3);
		Login("cookietest", "123456");	
		sleep(5);
		clickElement(activebox.ACTIVE_BOX_LOGGED_VISIT_YOUR_PROFILE_LINK);
		sleep(5);
		assertTrue(driver.getCurrentUrl().contains("profile.html"));
	}	
	
//	Active Box - user logged in without friends - check invite friends controls, click invite friends btn and check if My profile - my friends page was open
	@Test
	@Parameters({"xUrl"})
	public void Active10(String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(3);
		Login("cookietest", "123456");	
		sleep(5);
		assertIsDisplayed(activebox.ACTIVE_BOX_LOGGED_NO_FRIENDS_BOX);
		assertIsDisplayed(activebox.ACTIVE_BOX_LOGGED_NO_FRIENDS_INVITE_BTN);
		clickElement(activebox.ACTIVE_BOX_LOGGED_NO_FRIENDS_INVITE_BTN);
		sleep(5);
		assertTrue(driver.getCurrentUrl().contains("myfriends.html"));
	}	
	
//	Active Box - user logged in without friends - click "Everyone" tab and check if messages are visible
	@Test
	@Parameters({"xUrl"})
	public void Active11(String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(3);
		Login("cookietest", "123456");	
		sleep(5);		
		clickElement(activebox.ACTIVE_BOX_EVERYONE_TAB_BOX);
		sleep(5);
		assertIsDisplayed(activebox.ACTIVE_BOX_LOGGED_EVERYONE_MOVING_MSG_BOX);
		assertIsDisplayed(activebox.ACTIVE_BOX_LOGGED_EVERYONE_MOVING_FIRST_MSG_BOX);
	}
	
//	Active Box - user logged in with friends - check if on "Friends" tab messages are visible,
//	click "Everyone" tab and check if messages are visible and are different than on "Friends" tab  
	@Test
	@Parameters({"xUrl"})
	public void Active12(String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(3);
		Login("mptest", "123456");	
		assertIsDisplayed(activebox.ACTIVE_BOX_LOGGED_FRIENDS_MOVING_MSG_BOX);
		assertIsDisplayed(activebox.ACTIVE_BOX_LOGGED_FRIENDS_MOVING_FIRST_MSG_BOX);
		String FriendsMsg = findElement(activebox.ACTIVE_BOX_LOGGED_FRIENDS_MOVING_FIRST_MSG_BOX).getAttribute("innerHTML");
		clickElement(activebox.ACTIVE_BOX_EVERYONE_TAB_BOX);
		assertIsDisplayed(activebox.ACTIVE_BOX_LOGGED_EVERYONE_MOVING_MSG_BOX);
		assertIsDisplayed(activebox.ACTIVE_BOX_LOGGED_EVERYONE_MOVING_FIRST_MSG_BOX);
		String FriendsMsg1 = findElement(activebox.ACTIVE_BOX_LOGGED_EVERYONE_MOVING_FIRST_MSG_BOX).getAttribute("innerHTML");
		System.out.println("1 " + FriendsMsg);
		System.out.println("2 " + FriendsMsg1);
		assertFalse(findElement(activebox.ACTIVE_BOX_LOGGED_EVERYONE_MOVING_FIRST_MSG_BOX).getAttribute("innerHTML").equals(FriendsMsg));
	}	
}