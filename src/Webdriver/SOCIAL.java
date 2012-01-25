package Webdriver;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.util.Date;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.junit.runner.RunWith;

@RunWith(BlockJUnit4ClassRunner.class)
public class SOCIAL extends SeleniumBase{
	long timestamp = new Date().getTime();
	  
	@Test
	@Parameters({"xUrl"})
	public void Social01(String xUrl) throws InterruptedException {//ok
		driver.get(xUrl + "/game/pet_party.html?socialgames");
		Thread.sleep(5000);
		driver.switchTo().frame(Webdriver.mappings.social.SOCIAL_GAME_BOX);		
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SOCIAL_GAME)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SOCIAL_GAME_PLAY_BUTTON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SOCIAL_GAME_INVITE_BUTTON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SOCIAL_GAME_GET_SAPPHIRES_BUTTON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SOCIAL_GAME_HELP_BUTTON)).isDisplayed());
	}
	
	
	@Test
	@Parameters({"xUrl"})
	public void Social02(String xUrl) throws InterruptedException {//ok
		driver.get(xUrl + "/game/pet_party.html?socialgames");
		Thread.sleep(5000);
		driver.switchTo().frame(Webdriver.mappings.social.SOCIAL_GAME_BOX);		
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SOCIAL_GAME)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SOCIAL_GAME_PLAY_BUTTON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SOCIAL_GAME_INVITE_BUTTON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SOCIAL_GAME_GET_SAPPHIRES_BUTTON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SOCIAL_GAME_HELP_BUTTON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SOCIAL_GAME_USER_ID_TEXT)).isDisplayed());
		String a = driver.findElement(By.id(Webdriver.mappings.social.SOCIAL_GAME_USER_ID_TEXT)).getText();
		assertFalse(a.contains("mptest"));			
		WebElement Invite = driver.findElement(By.id(Webdriver.mappings.social.SOCIAL_GAME_INVITE_BUTTON));
		Invite.click();
		driver.switchTo().defaultContent();
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_BOX)).isDisplayed());
		WebElement Close = driver.findElement(By.cssSelector(Webdriver.mappings.social.HEADER_CLOSE_BUTTON));
		Close.click();
		driver.switchTo().frame(Webdriver.mappings.social.SOCIAL_GAME_BOX);		
		WebElement GetSapphire = driver.findElement(By.id(Webdriver.mappings.social.SOCIAL_GAME_GET_SAPPHIRES_BUTTON));
		GetSapphire.click();
		Thread.sleep(5000);
		WebElement Close2 = driver.findElement(By.cssSelector(Webdriver.mappings.social.HEADER_GS_CLOSE_BUTTON));
		Close2.click();
		driver.switchTo().defaultContent();
		Login("mptest", "123456");
		driver.switchTo().frame(Webdriver.mappings.social.SOCIAL_GAME_BOX);		
		String b = driver.findElement(By.id(Webdriver.mappings.social.SOCIAL_GAME_USER_ID_TEXT)).getText();
		AssertTrue(b.contains("mptest"));
		WebElement Invite2 = driver.findElement(By.id(Webdriver.mappings.social.SOCIAL_GAME_INVITE_BUTTON));
		Invite2.click();
		driver.switchTo().defaultContent();	
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.HEADER_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.ON_SITE_TAB)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.ON_SITE_FIRST_FRIEND_AVATAR_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.ON_SITE_FIRST_FRIEND_AVATAR_IMG)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.ON_SITE_FIRST_FRIEND_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.ON_SITE_FIRST_FRIEND_CHECKBOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.ON_SITE_FIRST_FRIEND_INFO_NAME_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.ON_SITE_FIRST_FRIEND_INFO_USERNAME_LINK)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.ON_SITE_HEADER_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.ON_SITE_INVITE_BUTTON)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.ON_SITE_SEARCH_YOUR_FRIEND_BUTTON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.ON_SITE_SEARCH_YOUR_FRIEND_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.ON_SITE_SELECT_ALL_CHECKBOX)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.ON_SITE_SELECT_ALL_LINK)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.FROM_EMAIL_TAB)).isDisplayed());
		
		WebElement EmailTab = driver.findElement(By.id(Webdriver.mappings.social.FROM_EMAIL_TAB));
		EmailTab.click();
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.FROM_EMAIL_BOTTOM_DESCRIPTION_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.FROM_EMAIL_GMAIL_BUTTON)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.FROM_EMAIL_SELECT_PROVIDER_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.FROM_EMAIL_TOP_DESCRIPTION_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.FROM_EMAIL_TOP_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.FROM_EMAIL_WINDOWS_LIVE_BUTTON)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.FROM_EMAIL_YAHOO_BUTTON)).isDisplayed());
		WebElement Close3 = driver.findElement(By.cssSelector(Webdriver.mappings.social.HEADER_CLOSE_BUTTON2));
		Close3.click();
		driver.switchTo().frame(Webdriver.mappings.social.SOCIAL_GAME_BOX);		
		WebElement Invite3 = driver.findElement(By.id(Webdriver.mappings.social.SOCIAL_GAME_INVITE_BUTTON));
		Invite3.click();
	}
	
	
	/* Pet Party - on site - invite friends
	 */
	@Test
	@Parameters({"xUrl"})
	public void Social03(String xUrl) throws InterruptedException {//NOT OK
		int friends_number, current_selected_friends, i = 0, j = 0;
		driver.get(xUrl + "/game/pet_party.html?socialgames");
		Thread.sleep(5000);
		Login("mptest", "123456");
		Thread.sleep(5000);
		driver.switchTo().frame(Webdriver.mappings.social.SOCIAL_GAME_BOX);	
		WebElement Invite = driver.findElement(By.id(Webdriver.mappings.social.SOCIAL_GAME_INVITE_BUTTON));
		Invite.click();
		driver.switchTo().defaultContent();
		
		Thread.sleep(5000);
		WebElement try1 = driver.findElement(By.id(Webdriver.mappings.social.harvesting_onsite_container));
		try1.click();
		Thread.sleep(5000);
		System.out.println("a " +driver.findElement(By.cssSelector(Webdriver.mappings.social.ON_SITE_TOTAL_FRIENDS_NUMBER_TEXT)).getText());
		System.out.println("b " +driver.findElement(By.cssSelector(Webdriver.mappings.social.ON_SITE_TOTAL_FRIENDS_NUMBER_TEXT)).getLocation());

		
		friends_number = Integer.parseInt(driver.findElement(By.cssSelector(Webdriver.mappings.social.ON_SITE_TOTAL_FRIENDS_NUMBER_TEXT)).getText());
		current_selected_friends = Integer.parseInt(driver.findElement(By.cssSelector(Webdriver.mappings.social.ON_SITE_SELECTED_FRIENDS_TEXT)).getText());
		assertEquals(friends_number, current_selected_friends);
		WebElement SelectAllCheck = driver.findElement(By.id(Webdriver.mappings.social.ON_SITE_SELECT_ALL_CHECKBOX));
		SelectAllCheck.click();
		current_selected_friends = Integer.parseInt(driver.findElement(By.cssSelector(Webdriver.mappings.social.ON_SITE_SELECTED_FRIENDS_TEXT)).getText());
		assertEquals(0, current_selected_friends);
		WebElement SelectAllLink = driver.findElement(By.id(Webdriver.mappings.social.ON_SITE_SELECT_ALL_LINK));
		SelectAllLink.click();
		current_selected_friends = Integer.parseInt(driver.findElement(By.cssSelector(Webdriver.mappings.social.ON_SITE_SELECTED_FRIENDS_TEXT)).getText());
		assertEquals(friends_number, current_selected_friends);
		while (i < friends_number){
			WebElement InviteFrie = driver.findElement(By.id("myfr_" + i + " div.check-invite input"));
			InviteFrie.click();
			current_selected_friends = Integer.parseInt(driver.findElement(By.cssSelector(Webdriver.mappings.social.ON_SITE_SELECTED_FRIENDS_TEXT)).getText());
			assertEquals(friends_number - i - 1, current_selected_friends);
			i++;
		}
	}
	
	
	/* Pet Party - Sign Up - user is not logged in, click invite and check all controls, close sign up popup and open it again, after reopen check again all controls 
	 */
	@Test
	@Parameters({"xUrl"})
	public void Social04(String xUrl) throws InterruptedException { //ok
		driver.get(xUrl + "/game/pet_party.html?socialgames");
		Thread.sleep(5000);
		driver.switchTo().frame(Webdriver.mappings.social.SOCIAL_GAME_BOX);	
		WebElement Invite = driver.findElement(By.id(Webdriver.mappings.social.SOCIAL_GAME_INVITE_BUTTON));
		Invite.click();
		Thread.sleep(10000);
		driver.switchTo().defaultContent();
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_CLOSE_BUTTON)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_CLOSE_LINK)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_WHITE_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PINK_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_WB_IMG)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_WB_LIST_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_WHATS_THIS_FOR_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_WHATS_THIS_FOR_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_LINE)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_TERMS_OF_USE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_ME_UP_BUTTON)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_IN_BOTTOM_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_IN_BOTTOM_LINK)).isDisplayed());

		WebElement Close = driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_CLOSE_LINK));
		Close.click();
		Thread.sleep(5000);
		driver.switchTo().frame(Webdriver.mappings.social.SOCIAL_GAME_BOX);	
		WebElement InviteSec = driver.findElement(By.id(Webdriver.mappings.social.SOCIAL_GAME_INVITE_BUTTON));
		InviteSec.click();
		Thread.sleep(10000);
		driver.switchTo().defaultContent();
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_CLOSE_BUTTON)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_CLOSE_LINK)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_WHITE_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PINK_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_WB_IMG)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_WB_LIST_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_WHATS_THIS_FOR_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_WHATS_THIS_FOR_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_LINE)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_TERMS_OF_USE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_ME_UP_BUTTON)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_IN_BOTTOM_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_IN_BOTTOM_LINK)).isDisplayed());		
	}
	
	
	/* Pet Party - Sign Up - user is not logged in, click invite next click SIGN me Up button without filling any data,
	 * check all controls and all errors which shown, close sign up popup and open it again, after reopen check again all controls with errors 
	 */
	@Test
	@Parameters({"xUrl"})
	public void Social05(String xUrl) throws InterruptedException {
		driver.get(xUrl + "/game/pet_party.html?socialgames");
		Thread.sleep(5000);
		driver.switchTo().frame(Webdriver.mappings.social.SOCIAL_GAME_BOX);	
		WebElement Invite = driver.findElement(By.id(Webdriver.mappings.social.SOCIAL_GAME_INVITE_BUTTON));
		Invite.click();
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		WebElement SignMeUp = driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_ME_UP_BUTTON));
		SignMeUp.click();
		Thread.sleep(2000);
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_CLOSE_BUTTON)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_CLOSE_LINK)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_WHITE_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PINK_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_WB_IMG)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_WB_LIST_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_WHATS_THIS_FOR_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_ERROR_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_ERROR_EMAIL_WRONG_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_WHATS_THIS_FOR_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_ERROR_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_ERROR_USERNAME_TOO_SHORT_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_ERROR_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_ERROR_PASSWORD_TOO_SHORT_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_ERROR_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_ERROR_NOT_NUMBER_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_LINE)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_TERMS_OF_USE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_ME_UP_BUTTON)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_IN_BOTTOM_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_IN_BOTTOM_LINK)).isDisplayed());

		WebElement Close = driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_CLOSE_LINK));
		Close.click();
		Thread.sleep(2000);
		driver.switchTo().frame(Webdriver.mappings.social.SOCIAL_GAME_BOX);	
		WebElement InviteSec = driver.findElement(By.id(Webdriver.mappings.social.SOCIAL_GAME_INVITE_BUTTON));
		InviteSec.click();
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_CLOSE_BUTTON)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_CLOSE_LINK)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_WHITE_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PINK_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_WB_IMG)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_WB_LIST_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_WHATS_THIS_FOR_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_ERROR_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_ERROR_EMAIL_WRONG_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_WHATS_THIS_FOR_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_ERROR_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_ERROR_USERNAME_TOO_SHORT_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_ERROR_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_ERROR_PASSWORD_TOO_SHORT_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_ERROR_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_ERROR_NOT_NUMBER_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_LINE)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_TERMS_OF_USE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_ME_UP_BUTTON)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_IN_BOTTOM_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_IN_BOTTOM_LINK)).isDisplayed());
	}
	

	/* Pet Party - Sign Up - user is not logged in, click invite next click close button after writing a wrong data in email e.g. 123,
	 * check all controls and email error which shown, close sign up popup and open it again, after reopen check again all controls with error 
	 */
	@Test
	@Parameters({"xUrl"})
	public void Social06(String xUrl) throws InterruptedException {
		driver.get(xUrl + "/game/pet_party.html?socialgames");
		Thread.sleep(5000);
		driver.switchTo().frame(Webdriver.mappings.social.SOCIAL_GAME_BOX);	
		WebElement Invite = driver.findElement(By.id(Webdriver.mappings.social.SOCIAL_GAME_INVITE_BUTTON));
		Invite.click();
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		WebElement EmailText = driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_TEXTFIELD));
		EmailText.click(); 
		EmailText.sendKeys("wrong_mail");
		
		WebElement SignMeUp = driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_ME_UP_BUTTON));
		SignMeUp.click();
		Thread.sleep(2000);
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_CLOSE_BUTTON)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_CLOSE_LINK)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_WHITE_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PINK_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_WB_IMG)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_WB_LIST_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_WHATS_THIS_FOR_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_ERROR_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_ERROR_EMAIL_WRONG_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_WHATS_THIS_FOR_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_ERROR_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_ERROR_USERNAME_TOO_SHORT_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_ERROR_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_ERROR_PASSWORD_TOO_SHORT_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_ERROR_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_ERROR_NOT_NUMBER_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_LINE)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_TERMS_OF_USE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_ME_UP_BUTTON)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_IN_BOTTOM_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_IN_BOTTOM_LINK)).isDisplayed());

		WebElement Close = driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_CLOSE_LINK));
		Close.click();
		Thread.sleep(2000);
		driver.switchTo().frame(Webdriver.mappings.social.SOCIAL_GAME_BOX);	
		WebElement InviteSec = driver.findElement(By.id(Webdriver.mappings.social.SOCIAL_GAME_INVITE_BUTTON));
		InviteSec.click();
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		assertEquals("wrong_mail", driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_TEXTFIELD)).getAttribute("value"));		
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_CLOSE_BUTTON)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_CLOSE_LINK)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_WHITE_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PINK_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_WB_IMG)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_WB_LIST_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_WHATS_THIS_FOR_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_ERROR_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_ERROR_EMAIL_WRONG_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_WHATS_THIS_FOR_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_ERROR_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_ERROR_USERNAME_TOO_SHORT_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_ERROR_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_ERROR_PASSWORD_TOO_SHORT_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_ERROR_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_ERROR_NOT_NUMBER_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_LINE)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_TERMS_OF_USE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_ME_UP_BUTTON)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_IN_BOTTOM_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_IN_BOTTOM_LINK)).isDisplayed());
	}
	
	
	/* Pet Party - Sign Up - user is not logged in, click invite next click close button after writing a wrong data in email e.g. 123,
	 * check all controls and email error which shown, close sign up popup and open it again, after reopen check again all controls with error 
	 */
	@Test
	@Parameters({"xUrl"})
	public void Social07(String xUrl) throws InterruptedException {
		driver.get(xUrl + "/game/pet_party.html?socialgames");
		Thread.sleep(5000);
		driver.switchTo().frame(Webdriver.mappings.social.SOCIAL_GAME_BOX);	
		WebElement Invite = driver.findElement(By.id(Webdriver.mappings.social.SOCIAL_GAME_INVITE_BUTTON));
		Invite.click();
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		WebElement EmailText = driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_TEXTFIELD));
		EmailText.click(); 
		EmailText.sendKeys("miroslaw.palysiewicz.1234567@dev.spilgames.eu");
		
		WebElement SignMeUp = driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_ME_UP_BUTTON));
		SignMeUp.click();
		Thread.sleep(2000);
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_CLOSE_BUTTON)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_CLOSE_LINK)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_WHITE_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PINK_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_WB_IMG)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_WB_LIST_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_WHATS_THIS_FOR_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_ERROR_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_ERROR_EMAIL_TAKEN_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_WHATS_THIS_FOR_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_ERROR_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_ERROR_USERNAME_TOO_SHORT_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_ERROR_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_ERROR_PASSWORD_TOO_SHORT_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_ERROR_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_ERROR_NOT_NUMBER_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_LINE)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_TERMS_OF_USE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_ME_UP_BUTTON)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_IN_BOTTOM_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_IN_BOTTOM_LINK)).isDisplayed());

		WebElement Close = driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_CLOSE_LINK));
		Close.click();
		Thread.sleep(2000);
		driver.switchTo().frame(Webdriver.mappings.social.SOCIAL_GAME_BOX);	
		WebElement InviteSec = driver.findElement(By.id(Webdriver.mappings.social.SOCIAL_GAME_INVITE_BUTTON));
		InviteSec.click();
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		assertEquals("miroslaw.palysiewicz.1234567@dev.spilgames.eu", driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_TEXTFIELD)).getAttribute("value"));		
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_CLOSE_BUTTON)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_CLOSE_LINK)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_WHITE_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PINK_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_WB_IMG)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_WB_LIST_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_WHATS_THIS_FOR_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_ERROR_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_ERROR_EMAIL_TAKEN_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_WHATS_THIS_FOR_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_ERROR_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_ERROR_USERNAME_TOO_SHORT_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_ERROR_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_ERROR_PASSWORD_TOO_SHORT_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_ERROR_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_ERROR_NOT_NUMBER_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_LINE)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_TERMS_OF_USE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_ME_UP_BUTTON)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_IN_BOTTOM_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_IN_BOTTOM_LINK)).isDisplayed());
	}			
	
	
	/* Pet Party - Sign Up - user is not logged in, click invite next click close button after writing a wrong data in email e.g. 123,
	 * check all controls and email error which shown, close sign up popup and open it again, after reopen check again all controls with error 
	 */
	@Test
	@Parameters({"xUrl"})
	public void Social08(String xUrl) throws InterruptedException {
		driver.get(xUrl + "/game/pet_party.html?socialgames");
		Thread.sleep(5000);
		driver.switchTo().frame(Webdriver.mappings.social.SOCIAL_GAME_BOX);	
		WebElement Invite = driver.findElement(By.id(Webdriver.mappings.social.SOCIAL_GAME_INVITE_BUTTON));
		Invite.click();
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		WebElement EmailText = driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_TEXTFIELD));
		EmailText.click(); 
		EmailText.sendKeys("12");
		
		WebElement SignMeUp = driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_ME_UP_BUTTON));
		SignMeUp.click();
		Thread.sleep(2000);
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_CLOSE_BUTTON)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_CLOSE_LINK)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_WHITE_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PINK_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_WB_IMG)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_WB_LIST_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_WHATS_THIS_FOR_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_ERROR_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_ERROR_EMAIL_WRONG_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_WHATS_THIS_FOR_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_ERROR_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_ERROR_USERNAME_TOO_SHORT_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_ERROR_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_ERROR_PASSWORD_TOO_SHORT_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_ERROR_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_ERROR_NOT_NUMBER_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_LINE)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_TERMS_OF_USE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_ME_UP_BUTTON)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_IN_BOTTOM_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_IN_BOTTOM_LINK)).isDisplayed());

		WebElement Close = driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_CLOSE_LINK));
		Close.click();
		Thread.sleep(2000);
		driver.switchTo().frame(Webdriver.mappings.social.SOCIAL_GAME_BOX);	
		WebElement InviteSec = driver.findElement(By.id(Webdriver.mappings.social.SOCIAL_GAME_INVITE_BUTTON));
		InviteSec.click();
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		assertEquals("12", driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_TEXTFIELD)).getAttribute("value"));		
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_CLOSE_BUTTON)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_CLOSE_LINK)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_WHITE_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PINK_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_WB_IMG)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_WB_LIST_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_WHATS_THIS_FOR_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_ERROR_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_ERROR_EMAIL_WRONG_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_WHATS_THIS_FOR_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_ERROR_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_ERROR_USERNAME_TOO_SHORT_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_ERROR_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_ERROR_PASSWORD_TOO_SHORT_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_ERROR_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_ERROR_NOT_NUMBER_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_LINE)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_TERMS_OF_USE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_ME_UP_BUTTON)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_IN_BOTTOM_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_IN_BOTTOM_LINK)).isDisplayed());
	}
	
	
	/* Pet Party - Sign Up - user is not logged in, click invite next click close button after writing a wrong data in email e.g. 123,
	 * check all controls and email error which shown, close sign up popup and open it again, after reopen check again all controls with error 
	 */
	@Test
	@Parameters({"xUrl"})
	public void Social09(String xUrl) throws InterruptedException {
		driver.get(xUrl + "/game/pet_party.html?socialgames");
		Thread.sleep(5000);
		driver.switchTo().frame(Webdriver.mappings.social.SOCIAL_GAME_BOX);	
		WebElement Invite = driver.findElement(By.id(Webdriver.mappings.social.SOCIAL_GAME_INVITE_BUTTON));
		Invite.click();
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		WebElement EmailText = driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_TEXTFIELD));
		EmailText.click(); 
		EmailText.sendKeys("mptest");
		
		WebElement SignMeUp = driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_ME_UP_BUTTON));
		SignMeUp.click();
		Thread.sleep(2000);
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_CLOSE_BUTTON)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_CLOSE_LINK)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_WHITE_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PINK_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_WB_IMG)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_WB_LIST_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_WHATS_THIS_FOR_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_ERROR_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_ERROR_EMAIL_WRONG_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_WHATS_THIS_FOR_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_ERROR_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_ERROR_USERNAME_TAKEN_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_ERROR_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_ERROR_PASSWORD_TOO_SHORT_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_ERROR_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_ERROR_NOT_NUMBER_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_LINE)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_TERMS_OF_USE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_ME_UP_BUTTON)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_IN_BOTTOM_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_IN_BOTTOM_LINK)).isDisplayed());

		WebElement Close = driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_CLOSE_LINK));
		Close.click();
		Thread.sleep(2000);
		driver.switchTo().frame(Webdriver.mappings.social.SOCIAL_GAME_BOX);	
		WebElement InviteSec = driver.findElement(By.id(Webdriver.mappings.social.SOCIAL_GAME_INVITE_BUTTON));
		InviteSec.click();
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		assertEquals("mptest", driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_TEXTFIELD)).getAttribute("value"));		
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_CLOSE_BUTTON)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_CLOSE_LINK)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_WHITE_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PINK_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_WB_IMG)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_WB_LIST_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_WHATS_THIS_FOR_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_ERROR_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_ERROR_EMAIL_WRONG_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_WHATS_THIS_FOR_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_ERROR_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_ERROR_USERNAME_TAKEN_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_ERROR_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_ERROR_PASSWORD_TOO_SHORT_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_ERROR_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_ERROR_NOT_NUMBER_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_LINE)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_TERMS_OF_USE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_ME_UP_BUTTON)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_IN_BOTTOM_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_IN_BOTTOM_LINK)).isDisplayed());
	}
	
	
	/* Pet Party - Sign Up - user is not logged in, click invite next click close button after writing a wrong data in email e.g. 123,
	 * check all controls and email error which shown, close sign up popup and open it again, after reopen check again all controls with error 
	 */
	@Test
	@Parameters({"xUrl"})
	public void Social10(String xUrl) throws InterruptedException {
		driver.get(xUrl + "/game/pet_party.html?socialgames");
		Thread.sleep(5000);
		driver.switchTo().frame(Webdriver.mappings.social.SOCIAL_GAME_BOX);	
		WebElement Invite = driver.findElement(By.id(Webdriver.mappings.social.SOCIAL_GAME_INVITE_BUTTON));
		Invite.click();
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		WebElement EmailText = driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_TEXTFIELD));
		EmailText.click(); 
		EmailText.sendKeys("!@#$%^&*()_+");
		
		WebElement SignMeUp = driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_ME_UP_BUTTON));
		SignMeUp.click();
		Thread.sleep(2000);
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_CLOSE_BUTTON)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_CLOSE_LINK)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_WHITE_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PINK_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_WB_IMG)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_WB_LIST_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_WHATS_THIS_FOR_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_ERROR_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_ERROR_EMAIL_WRONG_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_WHATS_THIS_FOR_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_ERROR_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_ERROR_USERNAME_INCORECT_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_ERROR_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_ERROR_PASSWORD_TOO_SHORT_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_ERROR_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_ERROR_NOT_NUMBER_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_LINE)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_TERMS_OF_USE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_ME_UP_BUTTON)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_IN_BOTTOM_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_IN_BOTTOM_LINK)).isDisplayed());

		WebElement Close = driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_CLOSE_LINK));
		Close.click();
		Thread.sleep(2000);
		driver.switchTo().frame(Webdriver.mappings.social.SOCIAL_GAME_BOX);	
		WebElement InviteSec = driver.findElement(By.id(Webdriver.mappings.social.SOCIAL_GAME_INVITE_BUTTON));
		InviteSec.click();
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		assertEquals("!@#$%^&*()_+", driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_TEXTFIELD)).getAttribute("value"));		
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_CLOSE_BUTTON)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_CLOSE_LINK)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_WHITE_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PINK_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_WB_IMG)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_WB_LIST_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_WHATS_THIS_FOR_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_ERROR_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_ERROR_EMAIL_WRONG_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_WHATS_THIS_FOR_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_ERROR_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_ERROR_USERNAME_INCORECT_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_ERROR_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_ERROR_PASSWORD_TOO_SHORT_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_ERROR_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_ERROR_NOT_NUMBER_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_LINE)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_TERMS_OF_USE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_ME_UP_BUTTON)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_IN_BOTTOM_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_IN_BOTTOM_LINK)).isDisplayed());
	}	
	
	
	/* Pet Party - Sign Up - user is not logged in, click invite next click close button after writing a username which is banned word e.g. fuck,
	 * check all controls and username error which shown, close sign up popup and open it again, after reopen check again all controls with error 
	 */
	@Test
	@Parameters({"xUrl"})
	public void Social11(String xUrl) throws InterruptedException {
		driver.get(xUrl + "/game/pet_party.html?socialgames");
		Thread.sleep(5000);
		driver.switchTo().frame(Webdriver.mappings.social.SOCIAL_GAME_BOX);	
		WebElement Invite = driver.findElement(By.id(Webdriver.mappings.social.SOCIAL_GAME_INVITE_BUTTON));
		Invite.click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		WebElement EmailText = driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_TEXTFIELD));
		EmailText.click(); 
		EmailText.sendKeys("fuck");
		
		WebElement SignMeUp = driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_ME_UP_BUTTON));
		SignMeUp.click();
		Thread.sleep(2000);
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_CLOSE_BUTTON)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_CLOSE_LINK)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_WHITE_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PINK_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_WB_IMG)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_WB_LIST_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_WHATS_THIS_FOR_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_ERROR_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_ERROR_EMAIL_WRONG_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_WHATS_THIS_FOR_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_ERROR_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_ERROR_USERNAME_PROFANITY_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_ERROR_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_ERROR_PASSWORD_TOO_SHORT_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_ERROR_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_ERROR_NOT_NUMBER_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_LINE)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_TERMS_OF_USE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_ME_UP_BUTTON)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_IN_BOTTOM_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_IN_BOTTOM_LINK)).isDisplayed());

		WebElement Close = driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_CLOSE_LINK));
		Close.click();
		Thread.sleep(2000);
		driver.switchTo().frame(Webdriver.mappings.social.SOCIAL_GAME_BOX);	
		WebElement InviteSec = driver.findElement(By.id(Webdriver.mappings.social.SOCIAL_GAME_INVITE_BUTTON));
		InviteSec.click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		assertEquals("fuck", driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_TEXTFIELD)).getAttribute("value"));		
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_CLOSE_BUTTON)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_CLOSE_LINK)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_WHITE_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PINK_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_WB_IMG)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_WB_LIST_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_WHATS_THIS_FOR_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_ERROR_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_ERROR_EMAIL_WRONG_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_WHATS_THIS_FOR_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_ERROR_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_ERROR_USERNAME_PROFANITY_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_ERROR_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_ERROR_PASSWORD_TOO_SHORT_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_ERROR_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_ERROR_NOT_NUMBER_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_LINE)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_TERMS_OF_USE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_ME_UP_BUTTON)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_IN_BOTTOM_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_IN_BOTTOM_LINK)).isDisplayed());
	}
	
	
	/* Pet Party - Sign Up - user is not logged in, click invite next click close button after writing a too short password e.g. 123,
	 * check all controls and password error which shown, close sign up popup and open it again, after reopen check again all controls with error 
	 */
	@Test
	@Parameters({"xUrl"})
	public void Social12(String xUrl) throws InterruptedException {
		driver.get(xUrl + "/game/pet_party.html?socialgames");
		Thread.sleep(5000);
		driver.switchTo().frame(Webdriver.mappings.social.SOCIAL_GAME_BOX);	
		WebElement Invite = driver.findElement(By.id(Webdriver.mappings.social.SOCIAL_GAME_INVITE_BUTTON));
		Invite.click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		WebElement EmailText = driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_TEXTFIELD));
		EmailText.click(); 
		EmailText.sendKeys("123");
		
		WebElement SignMeUp = driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_ME_UP_BUTTON));
		SignMeUp.click();
		Thread.sleep(2000);
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_CLOSE_BUTTON)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_CLOSE_LINK)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_WHITE_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PINK_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_WB_IMG)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_WB_LIST_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_WHATS_THIS_FOR_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_ERROR_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_ERROR_EMAIL_WRONG_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_WHATS_THIS_FOR_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_ERROR_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_ERROR_USERNAME_TOO_SHORT_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_ERROR_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_ERROR_PASSWORD_TOO_SHORT_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_ERROR_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_ERROR_NOT_NUMBER_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_LINE)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_TERMS_OF_USE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_ME_UP_BUTTON)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_IN_BOTTOM_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_IN_BOTTOM_LINK)).isDisplayed());

		WebElement Close = driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_CLOSE_LINK));
		Close.click();
		Thread.sleep(2000);
		driver.switchTo().frame(Webdriver.mappings.social.SOCIAL_GAME_BOX);	
		WebElement InviteSec = driver.findElement(By.id(Webdriver.mappings.social.SOCIAL_GAME_INVITE_BUTTON));
		InviteSec.click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		assertEquals("123", driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_TEXTFIELD)).getAttribute("value"));		
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_CLOSE_BUTTON)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_CLOSE_LINK)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_WHITE_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PINK_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_WB_IMG)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_WB_LIST_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_WHATS_THIS_FOR_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_ERROR_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_ERROR_EMAIL_WRONG_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_WHATS_THIS_FOR_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_ERROR_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_ERROR_USERNAME_TOO_SHORT_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_ERROR_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_ERROR_PASSWORD_TOO_SHORT_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_ERROR_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_ERROR_NOT_NUMBER_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_LINE)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_TERMS_OF_USE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_ME_UP_BUTTON)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_IN_BOTTOM_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_IN_BOTTOM_LINK)).isDisplayed());
	}		
	
	
	/* Pet Party - Sign Up - user is not logged in, click invite next click close button after writing a too short password e.g. 123,
	 * check all controls and password error which shown, close sign up popup and open it again, after reopen check again all controls with error 
	 */
	@Test
	@Parameters({"xUrl"})
	public void Social13(String xUrl) throws InterruptedException {
		driver.get(xUrl + "/game/pet_party.html?socialgames");
		Thread.sleep(5000);
		driver.switchTo().frame(Webdriver.mappings.social.SOCIAL_GAME_BOX);	
		WebElement Invite = driver.findElement(By.id(Webdriver.mappings.social.SOCIAL_GAME_INVITE_BUTTON));
		Invite.click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		WebElement EmailText = driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_TEXTFIELD));
		EmailText.click(); 
		EmailText.sendKeys("%");
		
		WebElement SignMeUp = driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_ME_UP_BUTTON));
		SignMeUp.click();
		Thread.sleep(2000);
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_CLOSE_BUTTON)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_CLOSE_LINK)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_WHITE_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PINK_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_WB_IMG)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_WB_LIST_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_WHATS_THIS_FOR_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_ERROR_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_ERROR_EMAIL_WRONG_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_WHATS_THIS_FOR_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_ERROR_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_ERROR_USERNAME_TOO_SHORT_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_ERROR_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_ERROR_PASSWORD_TOO_SHORT_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_ERROR_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_ERROR_NOT_NUMBER_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_LINE)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_TERMS_OF_USE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_ME_UP_BUTTON)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_IN_BOTTOM_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_IN_BOTTOM_LINK)).isDisplayed());

		WebElement Close = driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_CLOSE_LINK));
		Close.click();
		Thread.sleep(2000);
		driver.switchTo().frame(Webdriver.mappings.social.SOCIAL_GAME_BOX);	
		WebElement InviteSec = driver.findElement(By.id(Webdriver.mappings.social.SOCIAL_GAME_INVITE_BUTTON));
		InviteSec.click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		assertEquals("%", driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_TEXTFIELD)).getAttribute("value"));		
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_CLOSE_BUTTON)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_CLOSE_LINK)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_WHITE_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PINK_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_WB_IMG)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_WB_LIST_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_WHATS_THIS_FOR_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_ERROR_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_ERROR_EMAIL_WRONG_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_WHATS_THIS_FOR_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_ERROR_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_ERROR_USERNAME_TOO_SHORT_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_ERROR_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_ERROR_PASSWORD_TOO_SHORT_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_ERROR_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_ERROR_NOT_NUMBER_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_LINE)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_TERMS_OF_USE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_ME_UP_BUTTON)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_IN_BOTTOM_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_IN_BOTTOM_LINK)).isDisplayed());
	}			
	
	
	/* Pet Party - Sign Up - user is not logged in, click invite next click close button after writing a too short password e.g. 123,
	 * check all controls and password error which shown, close sign up popup and open it again, after reopen check again all controls with error 
	 */
	@Test
	@Parameters({"xUrl"})
	public void Social14(String xUrl) throws InterruptedException {
		driver.get(xUrl + "/game/pet_party.html?socialgames");
		Thread.sleep(5000);
		driver.switchTo().frame(Webdriver.mappings.social.SOCIAL_GAME_BOX);	
		WebElement Invite = driver.findElement(By.id(Webdriver.mappings.social.SOCIAL_GAME_INVITE_BUTTON));
		Invite.click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		WebElement EmailText = driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_TEXTFIELD));
		EmailText.click(); 
		EmailText.sendKeys("1");
		
		WebElement SignMeUp = driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_ME_UP_BUTTON));
		SignMeUp.click();
		Thread.sleep(2000);
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_CLOSE_BUTTON)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_CLOSE_LINK)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_WHITE_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PINK_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_WB_IMG)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_WB_LIST_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_WHATS_THIS_FOR_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_ERROR_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_ERROR_EMAIL_WRONG_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_WHATS_THIS_FOR_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_ERROR_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_ERROR_USERNAME_TOO_SHORT_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_ERROR_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_ERROR_PASSWORD_TOO_SHORT_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_ERROR_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_ERROR_TOO_YOUNG_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_LINE)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_TERMS_OF_USE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_ME_UP_BUTTON)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_IN_BOTTOM_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_IN_BOTTOM_LINK)).isDisplayed());

		WebElement Close = driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_CLOSE_LINK));
		Close.click();
		Thread.sleep(2000);
		driver.switchTo().frame(Webdriver.mappings.social.SOCIAL_GAME_BOX);	
		WebElement InviteSec = driver.findElement(By.id(Webdriver.mappings.social.SOCIAL_GAME_INVITE_BUTTON));
		InviteSec.click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		assertEquals("1", driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_TEXTFIELD)).getAttribute("value"));		
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_CLOSE_BUTTON)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_CLOSE_LINK)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_WHITE_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PINK_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_WB_IMG)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_WB_LIST_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_WHATS_THIS_FOR_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_ERROR_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_ERROR_EMAIL_WRONG_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_WHATS_THIS_FOR_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_ERROR_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_ERROR_USERNAME_TOO_SHORT_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_ERROR_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_ERROR_PASSWORD_TOO_SHORT_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_ERROR_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_ERROR_TOO_YOUNG_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_LINE)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_TERMS_OF_USE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_ME_UP_BUTTON)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_IN_BOTTOM_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_IN_BOTTOM_LINK)).isDisplayed());
	}			
	
	
	/* Pet Party - Sign Up - user is not logged in, click invite next click close button after writing a too short password e.g. 123,
	 * check all controls and password error which shown, close sign up popup and open it again, after reopen check again all controls with error 
	 */
	@Test
	@Parameters({"xUrl"})
	public void Social15(String xUrl) throws InterruptedException {
		driver.get(xUrl + "/game/pet_party.html?socialgames");
		Thread.sleep(5000);
		driver.switchTo().frame(Webdriver.mappings.social.SOCIAL_GAME_BOX);	
		WebElement Invite = driver.findElement(By.id(Webdriver.mappings.social.SOCIAL_GAME_INVITE_BUTTON));
		Invite.click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		WebElement EmailText = driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_TEXTFIELD));
		EmailText.click(); 
		EmailText.sendKeys("5");
		
		WebElement SignMeUp = driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_ME_UP_BUTTON));
		SignMeUp.click();
		Thread.sleep(2000);
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_CLOSE_BUTTON)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_CLOSE_LINK)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_WHITE_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PINK_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_WB_IMG)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_WB_LIST_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_WHATS_THIS_FOR_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_ERROR_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_ERROR_EMAIL_WRONG_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_WHATS_THIS_FOR_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_ERROR_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_ERROR_USERNAME_TOO_SHORT_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_ERROR_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_ERROR_PASSWORD_TOO_SHORT_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_ERROR_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_ERROR_TOO_YOUNG_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PARENTS_EMAIL_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_PARENTS_EMAIL_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PARENTS_EMAIL_WHATS_THIS_FOR_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PARENTS_EMAIL_WHATS_THIS_FOR_TOOLTIP_TEXT)).isDisplayed());		
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_LINE)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_TERMS_OF_USE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_ME_UP_BUTTON)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_IN_BOTTOM_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_IN_BOTTOM_LINK)).isDisplayed());

		WebElement Close = driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_CLOSE_LINK));
		Close.click();
		Thread.sleep(2000);
		driver.switchTo().frame(Webdriver.mappings.social.SOCIAL_GAME_BOX);	
		WebElement InviteSec = driver.findElement(By.id(Webdriver.mappings.social.SOCIAL_GAME_INVITE_BUTTON));
		InviteSec.click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		assertEquals("5", driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_TEXTFIELD)).getAttribute("value"));		
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_CLOSE_BUTTON)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_CLOSE_LINK)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_WHITE_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PINK_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_WB_IMG)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_WB_LIST_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_WHATS_THIS_FOR_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_ERROR_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_ERROR_EMAIL_WRONG_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_WHATS_THIS_FOR_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_ERROR_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_ERROR_USERNAME_TOO_SHORT_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_ERROR_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_ERROR_PASSWORD_TOO_SHORT_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_ERROR_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_ERROR_TOO_YOUNG_TEXT)).isDisplayed());		
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PARENTS_EMAIL_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_PARENTS_EMAIL_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PARENTS_EMAIL_WHATS_THIS_FOR_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PARENTS_EMAIL_WHATS_THIS_FOR_TOOLTIP_TEXT)).isDisplayed());		
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_LINE)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_TERMS_OF_USE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_ME_UP_BUTTON)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_IN_BOTTOM_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_IN_BOTTOM_LINK)).isDisplayed());
	}				
	
	
	/* Pet Party - Sign Up - user is not logged in, click invite next click close button after writing a young age. 5,
	 * check all controls old and new ones for parents email and how old are you correct icon, enter wrong parents email e.g. wrong_parents_mail and check error 
	 * close sign up popup and open it again, 
	 * after reopen check again all controls with icons and errors 
	 */
	@Test
	@Parameters({"xUrl"})
	public void Social16(String xUrl) throws InterruptedException {
		driver.get(xUrl + "/game/pet_party.html?socialgames");
		Thread.sleep(5000);
		driver.switchTo().frame(Webdriver.mappings.social.SOCIAL_GAME_BOX);	
		WebElement Invite = driver.findElement(By.id(Webdriver.mappings.social.SOCIAL_GAME_INVITE_BUTTON));
		Invite.click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		WebElement EmailText = driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_TEXTFIELD));
		EmailText.click(); 
		EmailText.sendKeys("5");		
		WebElement SignMeUp = driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_ME_UP_BUTTON));
		SignMeUp.click();
		Thread.sleep(2000);
		WebElement ParentsMail = driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PARENTS_EMAIL_TEXTFIELD));
		ParentsMail.click(); 
		ParentsMail.sendKeys("wrong_parents_mail");		
		SignMeUp.click();
		Thread.sleep(2000);
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_CLOSE_BUTTON)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_CLOSE_LINK)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_WHITE_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PINK_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_WB_IMG)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_WB_LIST_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_WHATS_THIS_FOR_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_ERROR_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_ERROR_EMAIL_WRONG_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_WHATS_THIS_FOR_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_ERROR_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_ERROR_USERNAME_TOO_SHORT_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_ERROR_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_ERROR_PASSWORD_TOO_SHORT_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_CORRECT_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PARENTS_EMAIL_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_PARENTS_EMAIL_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_PARENTS_EMAIL_WHATS_THIS_FOR_TEXT)).isDisplayed());		
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PARENTS_EMAIL_ERROR_ICON)).isDisplayed());	
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PARENTS_EMAIL_ERROR_PARENTS_EMAIL_WRONG_TEXT)).isDisplayed());	
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_LINE)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_TERMS_OF_USE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_ME_UP_BUTTON)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_IN_BOTTOM_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_IN_BOTTOM_LINK)).isDisplayed());

		WebElement Close = driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_CLOSE_LINK));
		Close.click();
		Thread.sleep(2000);
		driver.switchTo().frame(Webdriver.mappings.social.SOCIAL_GAME_BOX);	
		WebElement InviteSec = driver.findElement(By.id(Webdriver.mappings.social.SOCIAL_GAME_INVITE_BUTTON));
		InviteSec.click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		assertEquals("5", driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_TEXTFIELD)).getAttribute("value"));
		assertEquals("wrong_parents_mail", driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PARENTS_EMAIL_TEXTFIELD)).getAttribute("value"));		
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_CLOSE_BUTTON)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_CLOSE_LINK)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_WHITE_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PINK_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_WB_IMG)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_WB_LIST_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_WHATS_THIS_FOR_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_ERROR_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_ERROR_EMAIL_WRONG_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_WHATS_THIS_FOR_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_ERROR_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_ERROR_USERNAME_TOO_SHORT_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_ERROR_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_ERROR_PASSWORD_TOO_SHORT_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_CORRECT_ICON)).isDisplayed());	
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PARENTS_EMAIL_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_PARENTS_EMAIL_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_PARENTS_EMAIL_WHATS_THIS_FOR_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PARENTS_EMAIL_ERROR_ICON)).isDisplayed());	
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PARENTS_EMAIL_ERROR_PARENTS_EMAIL_WRONG_TEXT)).isDisplayed());	
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_LINE)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_TERMS_OF_USE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_ME_UP_BUTTON)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_IN_BOTTOM_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_IN_BOTTOM_LINK)).isDisplayed());
	}
	
	
	/* Pet Party - Sign Up - user is not logged in, click invite next click SIGN me Up button after writing correct data (user age e.g. 20)
	 * check all controls old and all correct icons 
	 * after reopen check again all controls with icons and errors 
	 */
	@Test
	@Parameters({"xUrl"})
	public void Social17(String xUrl) throws InterruptedException {
		driver.get(xUrl + "/game/pet_party.html?socialgames");
		Thread.sleep(5000);
		driver.switchTo().frame(Webdriver.mappings.social.SOCIAL_GAME_BOX);	
		WebElement Invite = driver.findElement(By.id(Webdriver.mappings.social.SOCIAL_GAME_INVITE_BUTTON));
		Invite.click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		WebElement UsernameText = driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_TEXTFIELD));
		UsernameText.click(); 
		UsernameText.sendKeys(timestamp + "Test");		
		WebElement MailText = driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_TEXTFIELD));
		MailText.click(); 
		MailText.sendKeys(timestamp + "@google.com");	
		WebElement PasswordText = driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_TEXTFIELD));
		PasswordText.click(); 
		PasswordText.sendKeys("123456");			
		WebElement EmailText = driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_TEXTFIELD));
		EmailText.click(); 
		EmailText.sendKeys("20");		
		WebElement Check = driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_WHATS_THIS_FOR_TEXT));
		Check.click();		
		Thread.sleep(2000);		
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_CLOSE_BUTTON)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_CLOSE_LINK)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_WHITE_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PINK_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_WB_IMG)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_WB_LIST_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_WHATS_THIS_FOR_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_CORRECT_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_WHATS_THIS_FOR_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_CORRECT_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_CORRECT_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_CORRECT_ICON)).isDisplayed());		
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_LINE)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_TERMS_OF_USE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_ME_UP_BUTTON)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_IN_BOTTOM_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_IN_BOTTOM_LINK)).isDisplayed());
		WebElement Close = driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_CLOSE_LINK));
		Close.click();
		Thread.sleep(2000);
		driver.switchTo().frame(Webdriver.mappings.social.SOCIAL_GAME_BOX);	
		WebElement InviteSec = driver.findElement(By.id(Webdriver.mappings.social.SOCIAL_GAME_INVITE_BUTTON));
		InviteSec.click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		assertEquals(timestamp + "Test", driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_TEXTFIELD)).getAttribute("value"));	
		assertEquals(timestamp + "@google.com", driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_TEXTFIELD)).getAttribute("value"));	
		assertEquals("123456", driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_TEXTFIELD)).getAttribute("value"));	
		assertEquals("20", driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_TEXTFIELD)).getAttribute("value"));			
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_CLOSE_BUTTON)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_CLOSE_LINK)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_WHITE_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PINK_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_WB_IMG)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_WB_LIST_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_WHATS_THIS_FOR_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_CORRECT_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_WHATS_THIS_FOR_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_CORRECT_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_CORRECT_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_CORRECT_ICON)).isDisplayed());		
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_LINE)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_TERMS_OF_USE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_ME_UP_BUTTON)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_IN_BOTTOM_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_IN_BOTTOM_LINK)).isDisplayed());
		
		WebElement SignUp = driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_ME_UP_BUTTON));
		SignUp.click();
		Thread.sleep(3000);		
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_CLOSE_BUTTON)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_CLOSE_LINK)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PINK_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_IN_SUCCESS_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_SIGN_IN_SUCCESS_CONTINUE_PLAYING_BUTTON)).isDisplayed());
		WebElement Continue = driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_SIGN_IN_SUCCESS_CONTINUE_PLAYING_BUTTON));
		Continue.click();
		Thread.sleep(10000);	
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.topBar.USERNAME_LINK)).isDisplayed());
		driver.switchTo().frame(Webdriver.mappings.social.SOCIAL_GAME_BOX);	
		WebElement Invite2 = driver.findElement(By.id(Webdriver.mappings.social.SOCIAL_GAME_INVITE_BUTTON));
		Invite2.click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();		
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.FROM_EMAIL_TAB)).isDisplayed());				
	}							
	
	
	/* Pet Party - Sign Up - user is not logged in, click invite next click SIGN me Up button after writing correct data (user age e.g. 20)
	 * check all controls old and all correct icons 
	 * after reopen check again all controls with icons and errors 
	 */
	@Test
	@Parameters({"xUrl"})
	public void Social18(String xUrl) throws InterruptedException {
		driver.get(xUrl + "/game/pet_party.html?socialgames");
		Thread.sleep(5000);
		driver.switchTo().frame(Webdriver.mappings.social.SOCIAL_GAME_BOX);	
		WebElement Invite = driver.findElement(By.id(Webdriver.mappings.social.SOCIAL_GAME_INVITE_BUTTON));
		Invite.click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		WebElement UsernameText = driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_TEXTFIELD));
		UsernameText.click(); 
		UsernameText.sendKeys(timestamp + "Test");		
		WebElement MailText = driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_TEXTFIELD));
		MailText.click(); 
		MailText.sendKeys(timestamp + "@google.com");	
		WebElement PasswordText = driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_TEXTFIELD));
		PasswordText.click(); 
		PasswordText.sendKeys("123456");			
		WebElement EmailText = driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_TEXTFIELD));
		EmailText.click(); 
		EmailText.sendKeys("5");		
		WebElement Check = driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_WHATS_THIS_FOR_TEXT));
		Check.click();		
		Thread.sleep(2000);	
		WebElement ParentsMail = driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PARENTS_EMAIL_TEXTFIELD));
		ParentsMail.click(); 
		ParentsMail.sendKeys(timestamp + "@gm.com");		
		Check.click();	
		Thread.sleep(2000);
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_CLOSE_BUTTON)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_CLOSE_LINK)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_WHITE_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PINK_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_WB_IMG)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_WB_LIST_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_WHATS_THIS_FOR_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_CORRECT_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_WHATS_THIS_FOR_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_CORRECT_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_CORRECT_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_CORRECT_ICON)).isDisplayed());		
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_LINE)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_TERMS_OF_USE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_ME_UP_BUTTON)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_IN_BOTTOM_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_IN_BOTTOM_LINK)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PARENTS_EMAIL_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_PARENTS_EMAIL_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_PARENTS_EMAIL_WHATS_THIS_FOR_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PARENTS_EMAIL_CORRECT_ICON)).isDisplayed());		
		WebElement Close = driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_CLOSE_LINK));
		Close.click();
		Thread.sleep(2000);
		driver.switchTo().frame(Webdriver.mappings.social.SOCIAL_GAME_BOX);	
		WebElement InviteSec = driver.findElement(By.id(Webdriver.mappings.social.SOCIAL_GAME_INVITE_BUTTON));
		InviteSec.click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		assertEquals(timestamp + "Test", driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_TEXTFIELD)).getAttribute("value"));	
		assertEquals(timestamp + "@google.com", driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_TEXTFIELD)).getAttribute("value"));	
		assertEquals("123456", driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_TEXTFIELD)).getAttribute("value"));	
		assertEquals("5", driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_TEXTFIELD)).getAttribute("value"));
		assertEquals(timestamp + "@gm.com", driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PARENTS_EMAIL_TEXTFIELD)).getAttribute("value"));
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_CLOSE_BUTTON)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_CLOSE_LINK)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_WHITE_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PINK_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_WB_IMG)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_WB_LIST_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_WHATS_THIS_FOR_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_EMAIL_CORRECT_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_WHATS_THIS_FOR_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_USERNAME_CORRECT_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PASSWORD_CORRECT_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_HOW_OLD_ARE_YOU_CORRECT_ICON)).isDisplayed());		
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_LINE)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_TERMS_OF_USE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_ME_UP_BUTTON)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_IN_BOTTOM_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_IN_BOTTOM_LINK)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PARENTS_EMAIL_TEXTFIELD)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_PARENTS_EMAIL_TITLE_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_PARENTS_EMAIL_WHATS_THIS_FOR_TEXT)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_PARENTS_EMAIL_CORRECT_ICON)).isDisplayed());	
		
		WebElement SignUp = driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_ME_UP_BUTTON));
		SignUp.click();
		Thread.sleep(3000);		
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_CLOSE_BUTTON)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_CLOSE_LINK)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PINK_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.social.SIGN_UP_PB_SIGN_IN_SUCCESS_ICON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_SIGN_IN_SUCCESS_CONTINUE_PLAYING_BUTTON)).isDisplayed());
		WebElement Continue = driver.findElement(By.id(Webdriver.mappings.social.SIGN_UP_PB_SIGN_IN_SUCCESS_CONTINUE_PLAYING_BUTTON));
		Continue.click();
		Thread.sleep(10000);	
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.topBar.USERNAME_LINK)).isDisplayed());
		driver.switchTo().frame(Webdriver.mappings.social.SOCIAL_GAME_BOX);	
		WebElement Invite2 = driver.findElement(By.id(Webdriver.mappings.social.SOCIAL_GAME_INVITE_BUTTON));
		Invite2.click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();		
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.FROM_EMAIL_TAB)).isDisplayed());		
	}									
}