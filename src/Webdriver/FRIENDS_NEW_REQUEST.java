package Webdriver;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FRIENDS_NEW_REQUEST extends SeleniumBase{
	long timestamp = new Date().getTime();

	/** Friend Search decline 
	 * login on User_A and find a user which is not a friend of User_A, e.g. User_B and invite this user by clicking a "Send friend request" button
	 * login on User_B and decline invitation from User_A to be a friend
	 * login on User_A again, find a User_B and check if is possible to send invitation again 
	 * 
	 * environment: live
	 **/
	@Test
	@Parameters({"xUrl"})
	public void Friend01(String xUrl) throws InterruptedException {
		driver.get(xUrl);
		Thread.sleep(2000);
		Login(UN1, UP);		
		Open_User_X_Page(xUrl, UN2);
		sleep(5);
		Friend_Request_Delete_Reject();
	    WebElement MyProfile = driver.findElement(By.cssSelector(Webdriver.mappings.topBar.MY_PROFILE_LINK));
	    MyProfile.click();
	    sleep(5);
	    WebElement FriendsTab = driver.findElement(By.cssSelector(Webdriver.mappings.FRIENDS.TAB_FRIENDS));
	    FriendsTab.click();
	    sleep(5);
	    WebElement SearchText = driver.findElement(By.cssSelector(Webdriver.mappings.FRIENDS.SEARCH_FRIEND_TEXTBOX));
	    SearchText.click();
	    SearchText.sendKeys(UN2);
	    WebElement SearchBtn = driver.findElement(By.cssSelector(Webdriver.mappings.FRIENDS.SEARCH_BUTTON));
	    SearchBtn.click();
	    sleep(5);
	    AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.FRIENDS.FIRST_SEARCHED_FRIEND_NAME_TEXT)).getText().equals(UN2));
	    WebElement FirstSearchedFriend = driver.findElement(By.cssSelector(Webdriver.mappings.FRIENDS.FIRST_SEARCHED_FRIEND_SEND_REQUEST_BUTTON));
	    FirstSearchedFriend.click();
	    sleep(5);;
	    WebElement ClosePopup = driver.findElement(By.cssSelector(Webdriver.mappings.FRIENDS.FRIEND_REQUEST_POPUP_CLOSE_BUTTON));
	    ClosePopup.click();
	    driver.get(xUrl);
		Thread.sleep(2000);
		Logout();
		Login(UN2, UP);
		WebElement MyProfile2 = driver.findElement(By.cssSelector(Webdriver.mappings.topBar.MY_PROFILE_LINK));
		MyProfile2.click();
		sleep(5);
	    WebElement NotificationTab = driver.findElement(By.cssSelector(Webdriver.mappings.notifications.TAB_NOTIFICATIONS));
	    NotificationTab.click();
	    sleep(5);
	    WebElement Reject = driver.findElement(By.cssSelector(Webdriver.mappings.notifications.REJECT_FRIEND_REQUEST_BUTTON));
	    Reject.click();
	    sleep(5);
	    AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.notifications.REJECTED_MESSAGE)).isDisplayed());
	    driver.get(xUrl);
		Thread.sleep(2000);
		Logout();
		Login(UN1, UP);
		WebElement MyProfile3 = driver.findElement(By.cssSelector(Webdriver.mappings.topBar.MY_PROFILE_LINK));
		MyProfile3.click();
		sleep(5);
		WebElement FriendsTab2 = driver.findElement(By.cssSelector(Webdriver.mappings.FRIENDS.TAB_FRIENDS));
	    FriendsTab2.click();
	    sleep(5);
	    WebElement SearchText2 = driver.findElement(By.cssSelector(Webdriver.mappings.FRIENDS.SEARCH_FRIEND_TEXTBOX));
	    SearchText2.click();
	    SearchText2.sendKeys(UN2);
	    WebElement SearchBtn2 = driver.findElement(By.cssSelector(Webdriver.mappings.FRIENDS.SEARCH_BUTTON));
	    SearchBtn2.click();
	    sleep(5);
	    AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.FRIENDS.FIRST_SEARCHED_FRIEND_NAME_TEXT)).getText().equals(UN2));
	    AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.FRIENDS.FIRST_SEARCHED_FRIEND_SEND_REQUEST_BUTTON)).isDisplayed());
	}
	
	
	/** Friend Search accept 
	 * login on User_A and find a user which is not a friend of User_A, e.g. User_B and invite this user by clicking a "Send friend request" button
	 * login on User_B and decline invitation from User_A to be a friend
	 * login on User_A again, find a User_B and check if is possible to send invitation again 
	 * 
	 * environment: live
	 **/
	@Test
	@Parameters({"xUrl"})
	public void Friend02(String xUrl) throws InterruptedException {
		driver.get(xUrl);
		Thread.sleep(2000);
		Login(UN1, UP);		
		Open_User_X_Page(xUrl, UN2);
		Thread.sleep(5000);
		Friend_Request_Delete_Reject();
	    WebElement MyProfile = driver.findElement(By.cssSelector(Webdriver.mappings.topBar.MY_PROFILE_LINK));
	    MyProfile.click();
	    Thread.sleep(5000);
	    WebElement FriendsTab = driver.findElement(By.cssSelector(Webdriver.mappings.FRIENDS.TAB_FRIENDS));
	    FriendsTab.click();
	    Thread.sleep(5000);
	    WebElement SearchText = driver.findElement(By.cssSelector(Webdriver.mappings.FRIENDS.SEARCH_FRIEND_TEXTBOX));
	    SearchText.click();
	    SearchText.sendKeys(UN2);
	    WebElement SearchBtn = driver.findElement(By.cssSelector(Webdriver.mappings.FRIENDS.SEARCH_BUTTON));
	    SearchBtn.click();
	    Thread.sleep(5000);
	    AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.FRIENDS.FIRST_SEARCHED_FRIEND_NAME_TEXT)).getText().equals(UN2));
	    WebElement FirstSearchedFriend = driver.findElement(By.cssSelector(Webdriver.mappings.FRIENDS.FIRST_SEARCHED_FRIEND_SEND_REQUEST_BUTTON));
	    FirstSearchedFriend.click();
	    Thread.sleep(5000);
	    WebElement ClosePopup = driver.findElement(By.cssSelector(Webdriver.mappings.FRIENDS.FRIEND_REQUEST_POPUP_CLOSE_BUTTON));
	    ClosePopup.click();
	    driver.get(xUrl);
		Thread.sleep(2000);
		Logout();
		Login(UN2, UP);
		WebElement MyProfile2 = driver.findElement(By.cssSelector(Webdriver.mappings.topBar.MY_PROFILE_LINK));
		MyProfile2.click();
		Thread.sleep(5000);
	    WebElement NotificationTab = driver.findElement(By.cssSelector(Webdriver.mappings.notifications.TAB_NOTIFICATIONS));
	    NotificationTab.click();
	    Thread.sleep(5000);
	    WebElement Accept = driver.findElement(By.cssSelector(Webdriver.mappings.notifications.ACCEPT_FRIEND_REQUEST_BUTTON));
	    Accept.click();
	    Thread.sleep(3000);
	    driver.get(xUrl);
		Thread.sleep(2000);
		Logout();
		Login(UN1, UP);
		WebElement MyProfile3 = driver.findElement(By.cssSelector(Webdriver.mappings.topBar.MY_PROFILE_LINK));
		MyProfile3.click();
		Thread.sleep(5000);
		WebElement FriendsTab2 = driver.findElement(By.cssSelector(Webdriver.mappings.FRIENDS.TAB_FRIENDS));
	    FriendsTab2.click();
	    Thread.sleep(5000);
	    WebElement SearchText2 = driver.findElement(By.cssSelector(Webdriver.mappings.FRIENDS.SEARCH_FRIEND_TEXTBOX));
	    SearchText2.click();
	    SearchText2.sendKeys(UN2);
	    WebElement SearchBtn2 = driver.findElement(By.cssSelector(Webdriver.mappings.FRIENDS.SEARCH_BUTTON));
	    SearchBtn2.click();
	    Thread.sleep(5000);
	    AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.FRIENDS.FIRST_SEARCHED_FRIEND_NAME_TEXT)).getText().equals(UN2));
	    AssertTrue(driver.findElements(By.cssSelector(Webdriver.mappings.FRIENDS.FIRST_SEARCHED_FRIEND_SEND_REQUEST_BUTTON)).size() == 0);
	}
	
	
	/** Friend Search accept 
	 * login on User_A and find a user which is not a friend of User_A, e.g. User_B and invite this user by clicking a "Send friend request" button
	 * login on User_B and decline invitation from User_A to be a friend
	 * login on User_A again, find a User_B and check if is possible to send invitation again 
	 * 
	 * environment: live
	 **/
	@Test
	@Parameters({"xUrl"})
	public void Friend03(String xUrl) throws InterruptedException {
		driver.get(xUrl);
		Thread.sleep(2000);
		Login(UN2, UP);
		WebElement MyProfile0 = driver.findElement(By.cssSelector(Webdriver.mappings.topBar.MY_PROFILE_LINK));
		MyProfile0.click();
		Thread.sleep(5000);
		WebElement EditSettings = driver.findElement(By.cssSelector(Webdriver.mappings.topBar.EDIT_SETTINGS_LINK));
		EditSettings.click();
		WebElement PublicRadio = driver.findElement(By.id(Webdriver.mappings.OVERVIEW_TAB.EDIT_SETTINGS_PUBLIC_RADIO));
		PublicRadio.click();
		WebElement SaveBtn = driver.findElement(By.id(Webdriver.mappings.OVERVIEW_TAB.EDIT_SETTINGS_SAVE_BUTTON));
		SaveBtn.click();
		driver.get(xUrl);
		Thread.sleep(2000);
		Logout();
		Login(UN1, UP);		
		Open_User_X_Page(xUrl, UN2);
		Thread.sleep(5000);
		Friend_Request_Delete_Reject();
		Open_User_X_Page(xUrl, UN2);
		Thread.sleep(5000);
		WebElement SendFriend = driver.findElement(By.cssSelector(Webdriver.mappings.topBar.SEND_FRIEND_REQUEST_BUTTON));
		SendFriend.click();
	    Thread.sleep(5000);
	    driver.get(xUrl);
		Thread.sleep(2000);
	    Logout();
	    Login(UN2, UP);				
		WebElement MyProfile = driver.findElement(By.cssSelector(Webdriver.mappings.topBar.MY_PROFILE_LINK));
	    MyProfile.click();
	    Thread.sleep(5000);
	    WebElement NotificationTab = driver.findElement(By.cssSelector(Webdriver.mappings.notifications.TAB_NOTIFICATIONS));
	    NotificationTab.click();
	    Thread.sleep(5000);
	    WebElement Reject = driver.findElement(By.cssSelector(Webdriver.mappings.notifications.REJECT_FRIEND_REQUEST_BUTTON));
	    Reject.click();
	    Thread.sleep(5000);	    
	    AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.notifications.REJECTED_MESSAGE)).isDisplayed());
	    driver.get(xUrl);
		Thread.sleep(2000);
	    Logout();
	    Login(UN1, UP);
	    Open_User_X_Page(xUrl, UN2);
	    Thread.sleep(5000);
	    AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.topBar.SEND_FRIEND_REQUEST_BUTTON)).isDisplayed());
	}
	
	
	/** Friend Search accept 
	 * login on User_A and find a user which is not a friend of User_A, e.g. User_B and invite this user by clicking a "Send friend request" button
	 * login on User_B and decline invitation from User_A to be a friend
	 * login on User_A again, find a User_B and check if is possible to send invitation again 
	 * 
	 * environment: live
	 **/
	@Test
	@Parameters({"xUrl"})
	public void Friend04(String xUrl) throws InterruptedException {
		driver.get(xUrl);
		Thread.sleep(2000);
		Login(UN2, UP);
		WebElement MyProfile0 = driver.findElement(By.cssSelector(Webdriver.mappings.topBar.MY_PROFILE_LINK));
		MyProfile0.click();
		Thread.sleep(5000);
		WebElement EditSettings = driver.findElement(By.cssSelector(Webdriver.mappings.topBar.EDIT_SETTINGS_LINK));
		EditSettings.click();
		WebElement PublicRadio = driver.findElement(By.id(Webdriver.mappings.OVERVIEW_TAB.EDIT_SETTINGS_PUBLIC_RADIO));
		PublicRadio.click();
		WebElement SaveBtn = driver.findElement(By.id(Webdriver.mappings.OVERVIEW_TAB.EDIT_SETTINGS_SAVE_BUTTON));
		SaveBtn.click();
		driver.get(xUrl);
		Thread.sleep(2000);
		Logout();
		Login(UN1, UP);		
		Open_User_X_Page(xUrl, UN2);
		Thread.sleep(5000);
		Friend_Request_Delete_Reject();
		Open_User_X_Page(xUrl, UN2);
		Thread.sleep(5000);
		WebElement SendFriend = driver.findElement(By.cssSelector(Webdriver.mappings.topBar.SEND_FRIEND_REQUEST_BUTTON));
		SendFriend.click();
	    Thread.sleep(5000);
	    driver.get(xUrl);
		Thread.sleep(2000);
	    Logout();
	    Login(UN2, UP);				
		WebElement MyProfile = driver.findElement(By.cssSelector(Webdriver.mappings.topBar.MY_PROFILE_LINK));
	    MyProfile.click();
	    Thread.sleep(5000);
	    WebElement NotificationTab = driver.findElement(By.cssSelector(Webdriver.mappings.notifications.TAB_NOTIFICATIONS));
	    NotificationTab.click();
	    Thread.sleep(5000);
	    WebElement Reject = driver.findElement(By.cssSelector(Webdriver.mappings.notifications.ACCEPT_FRIEND_REQUEST_BUTTON));
	    Reject.click();
	    Thread.sleep(5000);	
	    driver.get(xUrl);
		Thread.sleep(2000);
	    Logout();
	    Login(UN1, UP);
	    Open_User_X_Page(xUrl, UN2);
	    Thread.sleep(5000);
	    AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.topBar.FRIEND_REQUEST_ACCEPTED_TEXT)).isDisplayed());
	}

	
	/** Friend Search accept 
	 * login on User_A and find a user which is not a friend of User_A, e.g. User_B and invite this user by clicking a "Send friend request" button
	 * login on User_B and decline invitation from User_A to be a friend
	 * login on User_A again, find a User_B and check if is possible to send invitation again 
	 * 
	 * environment: live
	 **/
	@Test
	@Parameters({"xUrl"})
	public void Friend05(String xUrl) throws InterruptedException {
		driver.get(xUrl);
		Thread.sleep(2000);
		Login(UN2, UP);
		WebElement MyProfile0 = driver.findElement(By.cssSelector(Webdriver.mappings.topBar.MY_PROFILE_LINK));
		MyProfile0.click();
		Thread.sleep(5000);
		WebElement EditSettings = driver.findElement(By.cssSelector(Webdriver.mappings.topBar.EDIT_SETTINGS_LINK));
		EditSettings.click();
		WebElement PublicRadio = driver.findElement(By.id(Webdriver.mappings.OVERVIEW_TAB.EDIT_SETTINGS_PRIVATE_RADIO));
		PublicRadio.click();
		WebElement SaveBtn = driver.findElement(By.id(Webdriver.mappings.OVERVIEW_TAB.EDIT_SETTINGS_SAVE_BUTTON));
		SaveBtn.click();
		driver.get(xUrl);
		Thread.sleep(2000);
		Logout();
		Login(UN1, UP);		
		Open_User_X_Page(xUrl, UN2);
		Thread.sleep(5000);
		Friend_Request_Delete_Reject();
		Open_User_X_Page(xUrl, UN2);
		Thread.sleep(5000);
		WebElement SendFriend = driver.findElement(By.cssSelector(Webdriver.mappings.topBar.SEND_FRIEND_REQUEST_BUTTON));
		SendFriend.click();
	    Thread.sleep(5000);
	    driver.get(xUrl);
		Thread.sleep(2000);
	    Logout();
	    Login(UN2, UP);				
		WebElement MyProfile = driver.findElement(By.cssSelector(Webdriver.mappings.topBar.MY_PROFILE_LINK));
	    MyProfile.click();
	    Thread.sleep(5000);
	    WebElement NotificationTab = driver.findElement(By.cssSelector(Webdriver.mappings.notifications.TAB_NOTIFICATIONS));
	    NotificationTab.click();
	    Thread.sleep(5000);
	    WebElement Reject = driver.findElement(By.cssSelector(Webdriver.mappings.notifications.REJECT_FRIEND_REQUEST_BUTTON));
	    Reject.click();
	    Thread.sleep(5000);	    
	    AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.notifications.REJECTED_MESSAGE)).isDisplayed());
	    driver.get(xUrl);
		Thread.sleep(2000);
	    Logout();
	    Login(UN1, UP);
	    Open_User_X_Page(xUrl, UN2);
	    Thread.sleep(5000);
	    AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.topBar.SEND_FRIEND_REQUEST_BUTTON)).isDisplayed());
	}
	
	
	/** Friend Search accept 
	 * login on User_A and find a user which is not a friend of User_A, e.g. User_B and invite this user by clicking a "Send friend request" button
	 * login on User_B and decline invitation from User_A to be a friend
	 * login on User_A again, find a User_B and check if is possible to send invitation again 
	 * 
	 * environment: live
	 **/
	@Test
	@Parameters({"xUrl"})
	public void Friend06(String xUrl) throws InterruptedException {
		driver.get(xUrl);
		Thread.sleep(2000);
		Login(UN2, UP);
		WebElement MyProfile0 = driver.findElement(By.cssSelector(Webdriver.mappings.topBar.MY_PROFILE_LINK));
		MyProfile0.click();
		Thread.sleep(5000);
		WebElement EditSettings = driver.findElement(By.cssSelector(Webdriver.mappings.topBar.EDIT_SETTINGS_LINK));
		EditSettings.click();
		WebElement PublicRadio = driver.findElement(By.id(Webdriver.mappings.OVERVIEW_TAB.EDIT_SETTINGS_PRIVATE_RADIO));
		PublicRadio.click();
		WebElement SaveBtn = driver.findElement(By.id(Webdriver.mappings.OVERVIEW_TAB.EDIT_SETTINGS_SAVE_BUTTON));
		SaveBtn.click();
		driver.get(xUrl);
		Thread.sleep(2000);
		Logout();
		Login(UN1, UP);		
		Open_User_X_Page(xUrl, UN2);
		Thread.sleep(5000);
		Friend_Request_Delete_Reject();
		Open_User_X_Page(xUrl, UN2);
		Thread.sleep(5000);
		WebElement SendFriend = driver.findElement(By.cssSelector(Webdriver.mappings.topBar.SEND_FRIEND_REQUEST_BUTTON));
		SendFriend.click();
	    Thread.sleep(5000);
	    driver.get(xUrl);
		Thread.sleep(2000);
	    Logout();
	    Login(UN2, UP);				
		WebElement MyProfile = driver.findElement(By.cssSelector(Webdriver.mappings.topBar.MY_PROFILE_LINK));
	    MyProfile.click();
	    Thread.sleep(5000);
	    WebElement NotificationTab = driver.findElement(By.cssSelector(Webdriver.mappings.notifications.TAB_NOTIFICATIONS));
	    NotificationTab.click();
	    Thread.sleep(5000);
	    WebElement Reject = driver.findElement(By.cssSelector(Webdriver.mappings.notifications.ACCEPT_FRIEND_REQUEST_BUTTON));
	    Reject.click();
	    Thread.sleep(5000);	    
	    driver.get(xUrl);
		Thread.sleep(2000);
	    Logout();
	    Login(UN1, UP);
	    Open_User_X_Page(xUrl, UN2);
	    Thread.sleep(5000);
	    AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.topBar.FRIEND_REQUEST_ACCEPTED_TEXT)).isDisplayed());
	}
	
	
	/** Harvesting - Gmail - Load 0 contacts 
	 **/
	@Test
	@Parameters({"xUrl"})
	public void Friend11(String xUrl) throws InterruptedException {
		driver.get(xUrl);
		Thread.sleep(2000);
		String harvesting_mail = "spilautomation0contacts@gmail.com", harvesting_password = "Spil1234";		
		Login("cookietest", "123456");
		Load_Harvesting_Contract(harvesting_mail, harvesting_password);
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.HARVESTING.HARVESTING_NO_CONTRACTS_TEXT)).isDisplayed());
	}		
	
	
	/** Harvesting - Gmail - Load not playing contacts
	 **/
	@Test
	@Parameters({"xUrl"})
	public void Friend12(String xUrl) throws InterruptedException {
		driver.get(xUrl);
		Thread.sleep(2000);
		String harvesting_mail = "spilautomationnoplayedcontacts@gmail.com", harvesting_password = "Spil1234";		
		Login("cookietest", "123456");
		Load_Harvesting_Contract(harvesting_mail, harvesting_password);
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.HARVESTING.HARVESTING_NO_PLAYING_CONTRACTS_TEXT)).isDisplayed());
	}		
	
	
	/** Harvesting - Gmail - Load big number of contacts
	 **/
	@Test
	@Parameters({"xUrl"})
	public void Friend13(String xUrl) throws InterruptedException {
		driver.get(xUrl);
		Thread.sleep(2000);
		String harvesting_mail = "spilautomationbignumber@gmail.com", harvesting_password = "Spil1234";		
		Login("cookietest", "123456");
		Load_Harvesting_Contract(harvesting_mail, harvesting_password);
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.HARVESTING.HARVESTING_SKIP_REGISTERED_FRIEND_LINK)).isDisplayed());
		WebElement SkipLink = driver.findElement(By.cssSelector(Webdriver.mappings.HARVESTING.HARVESTING_SKIP_REGISTERED_FRIEND_LINK));
		SkipLink.click();
		Thread.sleep(3000);	
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.HARVESTING.HARVESTING_NUMBER_OF_CONTRACTS_TEXT)).getText().equals("24"));		
	}
	
	
	/** Harvesting - Single invite to already playing
	 **/
	@Test
	@Parameters({"xUrl"})
	public void Friend14(String xUrl) throws InterruptedException {
		driver.get(xUrl);
		Thread.sleep(2000);
		String harvesting_mail = "spilautomationplayedcontacts@gmail.com", harvesting_password = "Spil1234";		
		Login("cookietest", "123456");
		Load_Harvesting_Contract(harvesting_mail, harvesting_password);
		WebElement SeleckAll = driver.findElement(By.cssSelector(Webdriver.mappings.HARVESTING.HARVESTING_SELECT_ALL_CHECKBOX));
		SeleckAll.click();
		Thread.sleep(3000);
		WebElement SelectFirst = driver.findElement(By.cssSelector(Webdriver.mappings.HARVESTING.HARVESTING_FIRST_FRINED_CHECKBOX));
		SelectFirst.click();
		WebElement SendInv = driver.findElement(By.cssSelector(Webdriver.mappings.HARVESTING.HARVESTING_SEND_INVITE_BUTTON));
		SendInv.click();
		Thread.sleep(10000);
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.HARVESTING.HARVESTING_GET_STARTED_BUTTON)).isDisplayed());		
	}	
	
	
	/** Harvesting - Multiply invites to already playing
	 **/
	@Test
	@Parameters({"xUrl"})
	public void Friend15(String xUrl) throws InterruptedException {
		driver.get(xUrl);
		Thread.sleep(2000);
		String harvesting_mail = "spilautomationplayedcontacts@gmail.com", harvesting_password = "Spil1234";		
		Login("cookietest", "123456");
		Load_Harvesting_Contract(harvesting_mail, harvesting_password);
		WebElement SeleckAll = driver.findElement(By.cssSelector(Webdriver.mappings.HARVESTING.HARVESTING_SELECT_ALL_CHECKBOX));
		if (SeleckAll.isSelected()){
			SeleckAll.click();
		}
		Thread.sleep(3000);
		WebElement SelectFirst = driver.findElement(By.cssSelector(Webdriver.mappings.HARVESTING.HARVESTING_FIRST_FRINED_CHECKBOX));
		SelectFirst.click();
		WebElement SendInv = driver.findElement(By.cssSelector(Webdriver.mappings.HARVESTING.HARVESTING_SEND_INVITE_BUTTON));
		SendInv.click();
		Thread.sleep(10000);
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.HARVESTING.HARVESTING_GET_STARTED_BUTTON)).isDisplayed());		
	}
	
	
	/** Harvesting - Single invite to not playing
	 **/
	@Test
	@Parameters({"xUrl"})
	public void Friend16(String xUrl) throws InterruptedException {
		driver.get(xUrl);
		Thread.sleep(2000);
		String harvesting_mail = "spilautomationplayedcontacts@gmail.com", harvesting_password = "Spil1234";		
		Login("cookietest", "123456");
		Load_Harvesting_Contract(harvesting_mail, harvesting_password);
		WebElement SeleckAll = driver.findElement(By.cssSelector(Webdriver.mappings.HARVESTING.HARVESTING_SELECT_ALL_CHECKBOX));
		if (!SeleckAll.isSelected()){
			SeleckAll.click();
		}
		Thread.sleep(3000);
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.HARVESTING.HARVESTING_NUMBER_OF_CONTRACTS_TEXT)).getText().equals("2"));
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.HARVESTING.HARVESTING_NO_PLAYING_CONTRACTS_TEXT)).isDisplayed());
		WebElement SendInv = driver.findElement(By.cssSelector(Webdriver.mappings.HARVESTING.HARVESTING_SEND_INVITE_BUTTON));
		SendInv.click();
		Thread.sleep(10000);
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.HARVESTING.HARVESTING_GET_STARTED_BUTTON)).isDisplayed());		
	}	
	

	/** Harvesting - Multiply invite to not playing
	 **/
	@Test
	@Parameters({"xUrl"})
	public void Friend17(String xUrl) throws InterruptedException {
		driver.get(xUrl);
		Thread.sleep(2000);
		String harvesting_mail = "spilautomationbignumber@gmail.com", harvesting_password = "Spil1234";		
		Login("cookietest", "123456");
		Load_Harvesting_Contract(harvesting_mail, harvesting_password);
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.HARVESTING.HARVESTING_SKIP_REGISTERED_FRIEND_LINK)).isDisplayed());
		WebElement Skip = driver.findElement(By.cssSelector(Webdriver.mappings.HARVESTING.HARVESTING_SKIP_REGISTERED_FRIEND_LINK));
		Skip.click();
		Thread.sleep(5000);	
		WebElement SeleckAll = driver.findElement(By.cssSelector(Webdriver.mappings.HARVESTING.HARVESTING_SELECT_ALL_CHECKBOX));
		if (!SeleckAll.isSelected()){
			SeleckAll.click();
		}
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.HARVESTING.HARVESTING_NUMBER_OF_CONTRACTS_TEXT)).getText().equals("24"));
		int loop = 1, max_loop = Integer.parseInt(driver.findElement(By.cssSelector(Webdriver.mappings.HARVESTING.HARVESTING_NUMBER_OF_CONTRACTS_TEXT)).getText());	
		while(loop <= max_loop){
			AssertTrue(driver.findElement(By.cssSelector(".harvestNewList table tbody tr:nth-child(" + loop + ") .harvestEmail")).isDisplayed());
			loop++;
		}
		WebElement SendInv = driver.findElement(By.cssSelector(Webdriver.mappings.HARVESTING.HARVESTING_SEND_INVITE_BUTTON));
		SendInv.click();
		Thread.sleep(10000);
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.HARVESTING.HARVESTING_GET_STARTED_BUTTON)).isDisplayed());		
	}		
	
	
	/** Harvesting - More - Send invite using invalid email
	 **/	
	@Test
	@Parameters({"xUrl"})
	public void Friend18(String xUrl) throws InterruptedException {
		driver.get(xUrl);
		Thread.sleep(2000);
		String harvesting_mail = "invalid.mail.com";		
		Login("cookietest", "123456");
		WebElement MyProfile = driver.findElement(By.cssSelector(Webdriver.mappings.topBar.MY_PROFILE_LINK));
	    MyProfile.click();
	    Thread.sleep(5000);
		WebElement TabFriend = driver.findElement(By.cssSelector(Webdriver.mappings.FRIENDS.TAB_FRIENDS));
		TabFriend.click();
	    Thread.sleep(5000);
		WebElement HarvGetStart = driver.findElement(By.cssSelector(Webdriver.mappings.FRIENDS.HARVESTING_GET_STARTED_BUTTON));
		HarvGetStart.click();
	    Thread.sleep(2000);
	    WebElement HarvMail = driver.findElement(By.cssSelector(Webdriver.mappings.HARVESTING.HARVESTING_MORE_EMAIL_TEXTBOX));
	    HarvMail.click();
	    HarvMail.sendKeys(harvesting_mail);
	    WebElement SendInv = driver.findElement(By.cssSelector(Webdriver.mappings.HARVESTING.HARVESTING_MORE_SEND_INVITE_BUTTON));
	    SendInv.click();	  	    
	    Thread.sleep(2000);
	    AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.HARVESTING.HARVESTING_MORE_EMAIL_WRONG_TEXT)).isDisplayed());	    
	}
	

	/** Harvesting - More - Send single invite using valid email
	 **/
	@Test
	@Parameters({"xUrl"})
	public void Friend19(String xUrl) throws InterruptedException {
		driver.get(xUrl);
		Thread.sleep(2000);
		String harvesting_mail = "valid.mail@test.com";		
		Login("cookietest", "123456");
		WebElement MyProfile = driver.findElement(By.cssSelector(Webdriver.mappings.topBar.MY_PROFILE_LINK));
	    MyProfile.click();
	    Thread.sleep(5000);
		WebElement TabFriend = driver.findElement(By.cssSelector(Webdriver.mappings.FRIENDS.TAB_FRIENDS));
		TabFriend.click();
	    Thread.sleep(5000);
		WebElement HarvGetStart = driver.findElement(By.cssSelector(Webdriver.mappings.FRIENDS.HARVESTING_GET_STARTED_BUTTON));
		HarvGetStart.click();
	    Thread.sleep(2000);
	    WebElement HarvMail = driver.findElement(By.cssSelector(Webdriver.mappings.HARVESTING.HARVESTING_MORE_EMAIL_TEXTBOX));
	    HarvMail.click();
	    HarvMail.sendKeys(harvesting_mail);
	    WebElement SendInv = driver.findElement(By.cssSelector(Webdriver.mappings.HARVESTING.HARVESTING_MORE_SEND_INVITE_BUTTON));
	    SendInv.click();	  	    
	    Thread.sleep(5000);
	    AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.HARVESTING.HARVESTING_MORE_EMAIL_CONFIRM_TEXT)).isDisplayed());	    
	}			
	
	
	/** Harvesting - More - Send multiple invites using valid emails
	 **/	
	@Test
	@Parameters({"xUrl"})
	public void Friend20(String xUrl) throws InterruptedException {
		driver.get(xUrl);
		Thread.sleep(2000);
		String harvesting_mail1 = "valid.mail@test.com", harvesting_mail2 = "valid.mail2@test.com";		
		Login("cookietest", "123456");
		WebElement MyProfile = driver.findElement(By.cssSelector(Webdriver.mappings.topBar.MY_PROFILE_LINK));
	    MyProfile.click();
	    Thread.sleep(5000);
		WebElement TabFriend = driver.findElement(By.cssSelector(Webdriver.mappings.FRIENDS.TAB_FRIENDS));
		TabFriend.click();		
	    Thread.sleep(5000);
		WebElement HarvGetStart = driver.findElement(By.cssSelector(Webdriver.mappings.FRIENDS.HARVESTING_GET_STARTED_BUTTON));
		HarvGetStart.click();
	    Thread.sleep(2000);
	    WebElement HarvMail = driver.findElement(By.cssSelector(Webdriver.mappings.HARVESTING.HARVESTING_MORE_EMAIL_TEXTBOX));
	    HarvMail.click();
	    HarvMail.sendKeys(harvesting_mail1);
	    WebElement AddMoreMail = driver.findElement(By.cssSelector(Webdriver.mappings.HARVESTING.HARVESTING_MORE_ADD_MORE_EMAIL_LINK));
	    AddMoreMail.click();	    	    
	    WebElement HarvMail2 = driver.findElement(By.cssSelector(".emailList li:nth-child(2) input"));
	    HarvMail2.click();
	    HarvMail2.sendKeys(harvesting_mail2);
	    WebElement SendInv = driver.findElement(By.cssSelector(Webdriver.mappings.HARVESTING.HARVESTING_MORE_SEND_INVITE_BUTTON));
	    SendInv.click();	  	    
	    Thread.sleep(2000);
	    AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.HARVESTING.HARVESTING_MORE_EMAIL_CONFIRM_TEXT)).isDisplayed());	    
	}
	
	
	/** Harvesting - More - Send multiple invites using valid emails
	 **/	
	@Test
	@Parameters({"xUrl"})
	public void Friend21(String xUrl) throws InterruptedException {
		driver.get(xUrl);
		Thread.sleep(2000);
		Login("mptest", "123456");
	    WebElement MyProfile = driver.findElement(By.cssSelector(Webdriver.mappings.topBar.MY_PROFILE_LINK));
	    MyProfile.click();
	    Thread.sleep(5000);
	    WebElement FriendsTab = driver.findElement(By.cssSelector(Webdriver.mappings.FRIENDS.TAB_FRIENDS));
	    FriendsTab.click();
	    Thread.sleep(5000);
	    AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.FRIENDS.SEARCH_FOR_FRIEND_HEADER_TEXT)).isDisplayed());
	    AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.FRIENDS.SEARCH_FOR_FRIEND_DESCRIPTION_TEXT)).isDisplayed());
	    AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.FRIENDS.SEARCH_FRIEND_TEXTBOX)).isDisplayed());
	    AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.FRIENDS.SEARCH_BUTTON)).isDisplayed());
	    AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.FRIENDS.SEARCH_GIRLS_ICO)).isDisplayed());
	    AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.FRIENDS.HARVESTING_HEADER_TEXT)).isDisplayed());
	    AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.FRIENDS.HARVESTING_DESCRIPTION_TEXT)).isDisplayed());
	    AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.FRIENDS.YAHOO_ICO)).isDisplayed());
	    AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.FRIENDS.GMAIL_ICO)).isDisplayed());
	    AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.FRIENDS.LIVE_ICO)).isDisplayed());
	    AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.FRIENDS.HARVESTING_GET_STARTED_BUTTON)).isDisplayed());
	    AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.FRIENDS.FRIENDS_HEADER_TEXT)).isDisplayed());
	    AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.FRIENDS.FRIENDS_HEADER_FRIENDS_NUMBER_TEXT)).isDisplayed());
	    AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.FRIENDS.FRIENDS_SORTING_BY_USERNAME_BUTTON)).isDisplayed());
	    AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.FRIENDS.FRIENDS_SORTING_BY_LAST_VISIT_BUTTON)).isDisplayed());
	    AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.FRIENDS.FIRST_SEARCHED_FRIEND_NAME_TEXT)).isDisplayed());
	    AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.FRIENDS.FIRST_SEARCHED_FRIEND_AVATAR_ICO)).isDisplayed());
	    AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.FRIENDS.FIRST_SEARCHED_FRIEND_AGE_TEXT)).isDisplayed());
	    AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.FRIENDS.FIRST_SEARCHED_FRIEND_GENDER_TEXT)).isDisplayed());
	    AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.FRIENDS.FIRST_SEARCHED_FRIEND_POINTS_ICO)).isDisplayed());
	    AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.FRIENDS.FIRST_SEARCHED_FRIEND_GALERY_ICO)).isDisplayed());
	    AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.FRIENDS.FIRST_SEARCHED_FRIEND_AWARDS_ICO)).isDisplayed());
	    AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.FRIENDS.FIRST_SEARCHED_FRIEND_FRIENDS_ICO)).isDisplayed());
	    AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.FRIENDS.FIRST_SEARCHED_FRIEND_POINTS_TEXT)).isDisplayed());
	    AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.FRIENDS.FIRST_SEARCHED_FRIEND_GALERY_TEXT)).isDisplayed());
	    AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.FRIENDS.FIRST_SEARCHED_FRIEND_AWARDS_TEXT)).isDisplayed());
	    AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.FRIENDS.FIRST_SEARCHED_FRIEND_FRIENDS_TEXT)).isDisplayed());
	    AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.FRIENDS.FIRST_SEARCHED_FRIEND_POST_ICO)).isDisplayed());
	    AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.FRIENDS.FIRST_SEARCHED_FRIEND_REMOVE_ICO)).isDisplayed());
	}
	
	
	/** Social Harvesting - Gmail - Load 0 contacts 
	 **/
	@Test
	@Parameters({"xUrl"})
	public void Friend22(String xUrl) throws InterruptedException {
		driver.get(xUrl);
		Thread.sleep(2000);
		String harvesting_mail = "spilautomation0contacts@gmail.com", harvesting_password = "Spil1234";		
		Login("cookietest", "123456");
		Load_Harvesting_Contract_From_Pet_Party(xUrl, harvesting_mail, harvesting_password);
		assertIsDisplayed(social.HARVESTING_NO_CONTRACT_MESSAGE);
	}		
	
	
	/** Social Harvesting - Gmail - Load not playing contacts
	 **/
	@Test
	@Parameters({"xUrl"})
	public void Friend23(String xUrl) throws InterruptedException {
		driver.get(xUrl);
		Thread.sleep(2000);
		String harvesting_mail = "spilautomationnoplayedcontacts@gmail.com", harvesting_password = "Spil1234";		
		Login("cookietest", "123456");
		Load_Harvesting_Contract_From_Pet_Party(xUrl, harvesting_mail, harvesting_password);
		assertIsDisplayed(social.HARVESTING_NO_PLAYING_CONTRACTS_TEXT);
	}		
	
	
	/** Social Harvesting - Gmail - Load big number of contacts
	 **/
	@Test
	@Parameters({"xUrl"})
	public void Friend24(String xUrl) throws InterruptedException {
		driver.get(xUrl);
		Thread.sleep(2000);
		String harvesting_mail = "spilautomationnoplayedcontacts@gmail.com", harvesting_password = "Spil1234";		
		Login("cookietest", "123456");
		Load_Harvesting_Contract_From_Pet_Party(xUrl, harvesting_mail, harvesting_password);
		assertIsDisplayed(social.HARVESTING_CONTRACTS_BOX_TEXT);
	}
	
	
	/** Social Harvesting - Single invite to already playing
	 **/
	@Test
	@Parameters({"xUrl"})
	public void Friend25(String xUrl) throws InterruptedException {
		driver.get(xUrl);
		Thread.sleep(2000);
		String harvesting_mail = "spilautomationplayedcontacts@gmail.com", harvesting_password = "Spil1234";		
		Login("cookietest", "123456");
		Load_Harvesting_Contract_From_Pet_Party(xUrl, harvesting_mail, harvesting_password);
		clickElement(HARVESTING.HARVESTING_SELECT_ALL_CHECKBOX);
		sleep(3);
		clickElement(HARVESTING.HARVESTING_FIRST_FRINED_CHECKBOX);
		clickElement(HARVESTING.HARVESTING_SEND_INVITE_BUTTON);
		sleep(10);
		assertIsDisplayed(social.HARVESTING_SUCCESSFULLY_INVITED_TEXT);
	}	
	
	
	/** Social Harvesting - Multiply invites to already playing
	 **/
	@Test
	@Parameters({"xUrl"})
	public void Friend26(String xUrl) throws InterruptedException {
		driver.get(xUrl);
		Thread.sleep(2000);
		String harvesting_mail = "spilautomationplayedcontacts@gmail.com", harvesting_password = "Spil1234";		
		Login("cookietest", "123456");
		Load_Harvesting_Contract_From_Pet_Party(xUrl, harvesting_mail, harvesting_password);
		WebElement SeleckAll = findElement(HARVESTING.HARVESTING_SELECT_ALL_CHECKBOX);
		if (SeleckAll.isSelected()){
			SeleckAll.click();
		}
		sleep(3);
		clickElement(HARVESTING.HARVESTING_FIRST_FRINED_CHECKBOX);
		clickElement(HARVESTING.HARVESTING_SEND_INVITE_BUTTON);
		sleep(10);
		assertIsDisplayed(social.HARVESTING_SUCCESSFULLY_INVITED_TEXT);
	}
	
	
	/** Social Harvesting - Single invite to not playing
	 **/
	@Test
	@Parameters({"xUrl"})
	public void Friend27(String xUrl) throws InterruptedException {
		driver.get(xUrl);
		Thread.sleep(2000);
		String harvesting_mail = "spilautomationplayedcontacts@gmail.com", harvesting_password = "Spil1234";		
		Login("cookietest", "123456");
		Load_Harvesting_Contract_From_Pet_Party(xUrl, harvesting_mail, harvesting_password);
		WebElement SeleckAll = findElement(HARVESTING.HARVESTING_SELECT_ALL_CHECKBOX);
		if (!SeleckAll.isSelected()){
			SeleckAll.click();
		}
		sleep(3);
		assertIsDisplayed(social.HARVESTING_NO_PLAYING_CONTRACTS_TEXT);
		clickElement(HARVESTING.HARVESTING_SEND_INVITE_BUTTON);
		sleep(10);
		assertIsDisplayed(social.HARVESTING_SUCCESSFULLY_INVITED_TEXT);
	}	
	

	/** Social Harvesting - Multiply invite to not playing
	 **/
	@Test
	@Parameters({"xUrl"})
	public void Friend28(String xUrl) throws InterruptedException {
		driver.get(xUrl);
		Thread.sleep(2000);
		String harvesting_mail = "spilautomationplayedcontacts@gmail.com", harvesting_password = "Spil1234";		
		Login("cookietest", "123456");
		Load_Harvesting_Contract_From_Pet_Party(xUrl, harvesting_mail, harvesting_password);
		WebElement SeleckAll = findElement(HARVESTING.HARVESTING_SELECT_ALL_CHECKBOX);
		if (!SeleckAll.isSelected()){
			SeleckAll.click();
		}
		sleep(3);
		int loop = 1;	
		while(driver.findElements(By.cssSelector(".harvestNewList table tbody tr:nth-child(" + loop + ") .harvestEmail")).size() == 1){
			assertIsDisplayed(".harvestNewList table tbody tr:nth-child(" + loop + ") .harvestEmail");
			loop++;
		}
		clickElement(HARVESTING.HARVESTING_SEND_INVITE_BUTTON);
		sleep(10);
		assertIsDisplayed(social.HARVESTING_SUCCESSFULLY_INVITED_TEXT);
	}		
}