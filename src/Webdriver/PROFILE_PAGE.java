package Webdriver;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PROFILE_PAGE extends SeleniumBase{	
	@Test
//	Profile page - default - login, click my profile, logout and check if url contains "/user/{username}" 
	@Parameters({"xUrl"})
	public void Profile1(String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(5);
		Login("cookietest1", "123456");	
		clickElement(topBar.MY_PROFILE_LINK);
		sleep(10);
		Logout();
		assertTrue(driver.getCurrentUrl().contains("/user/cookietest1"));
	}		
	
	@Test
//	Profile page - Overview - check messages on wall in all three tabs -- Smoke
	@Parameters({"xUrl"})
	public void Overview1(String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(5);
		System.out.println("Login Common");
		if (xUrl.contains("www")){
			Login("mptest", "123456");	
		} else {
			Login("marlacom103", "123456");	
		}		
		System.out.println("Find Element MY_PROFILE_LINK");
	    WebElement MyProfile = driver.findElement(By.cssSelector(Webdriver.mappings.topBar.MY_PROFILE_LINK));
	    System.out.println("Click Element MY_PROFILE_LINK");
	    MyProfile.click();
	    System.out.println("Sleep 10 sek");
	    Thread.sleep(10000);
	    System.out.println("Find Element LATEST_ACTIVITIES_BUTTONS_FIRST_BUTTON");
	    WebElement AllActivities = driver.findElement(By.cssSelector(Webdriver.mappings.myProfile.LATEST_ACTIVITIES_BUTTONS_FIRST_BUTTON));
	    System.out.println("Click Element LATEST_ACTIVITIES_BUTTONS_FIRST_BUTTON");
	    AllActivities.click();
	    sleep(2);
	    System.out.println("Assertion");
	    AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.myProfile.LAST_MESSAGE_CONTAINER)).isDisplayed());
	    System.out.println("Find Element LATEST_ACTIVITIES_BUTTONS_SECOND_BUTTON");
	    WebElement MyActivities = driver.findElement(By.cssSelector(Webdriver.mappings.myProfile.LATEST_ACTIVITIES_BUTTONS_SECOND_BUTTON));
	    System.out.println("Click Element LATEST_ACTIVITIES_BUTTONS_SECOND_BUTTON");
	    MyActivities.click();
	    sleep(2);
	    System.out.println("Assertion");
	    AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.myProfile.LAST_MESSAGE_CONTAINER)).isDisplayed());
	    System.out.println("Find Element LATEST_ACTIVITIES_BUTTONS_THIRD_BUTTON");
	    WebElement Messages = driver.findElement(By.cssSelector(Webdriver.mappings.myProfile.LATEST_ACTIVITIES_BUTTONS_THIRD_BUTTON));
	    System.out.println("Click Element LATEST_ACTIVITIES_BUTTONS_THIRD_BUTTON");
	    Messages.click();
	    sleep(2);
	    System.out.println("Assertion");
	    AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.myProfile.LAST_MESSAGE_CONTAINER)).isDisplayed());
	}
	
	@Test
//	Profile page - Overview - check if all components are visible
	@Parameters({"xUrl"})
	public void Overview2(String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(5);
		Login("cookietest", "123456");	
		clickElement(topBar.MY_PROFILE_LINK);
		sleep(10);
		assertIsDisplayed(myProfile.ACTIVITIES_BOX);
		assertIsDisplayed(myProfile.MY_FRIENDS_BOX);
		assertIsDisplayed(myProfile.MY_FAVE_GAMES_BOX);
		assertIsDisplayed(myProfile.LAST_CREATIONS_BOX);
		assertIsDisplayed(myProfile.MY_AWARDS_BOX);
		assertIsDisplayed(myProfile.HIGH_SCORES_BOX);
	}
	
	@Test
//	Profile page - Overview - Latest Activities - check if all controls are visible
	@Parameters({"xUrl"})
	public void Overview3(String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(5);
		Login("cookietest", "123456");	
		clickElement(topBar.MY_PROFILE_LINK);
		sleep(10);		
		assertIsDisplayed(myProfile.ACTIVITIES_ICON);
		assertIsDisplayed(myProfile.ACTIVITIES_TITLE);
		assertIsDisplayed(myProfile.ACTIVITIES_POST_TITLE);
		assertIsDisplayed(myProfile.ACTIVITIES_POST_TEXTFIELD_BOX);
		assertIsDisplayed(myProfile.ACTIVITIES_POST_ICONS_BOX);
		assertIsDisplayed(myProfile.ACTIVITIES_POST_LETTER_LEFT_TEXT);
		assertIsDisplayed(myProfile.LATEST_ACTIVITIES_BUTTONS_FIRST_BUTTON);
		assertIsDisplayed(myProfile.LATEST_ACTIVITIES_BUTTONS_SECOND_BUTTON);
		assertIsDisplayed(myProfile.LATEST_ACTIVITIES_BUTTONS_THIRD_BUTTON);
		assertIsDisplayed(myProfile.LAST_MESSAGE_CONTAINER);		
	}	
	
	@Test
//	Profile page - Overview - Latest Activities - post a message and check if messages tab is active and is visible posted text
	@Parameters({"xUrl"})
	public void Overview4(String xUrl) throws InterruptedException {
		long timestamp = new Date().getTime();
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(5);
		Login("mptest", "123456");	
		clickElement(topBar.MY_PROFILE_LINK);
		sleep(10);
		System.out.println(Long.toString(timestamp));
		System.out.println(timestamp);
		insertData(myProfile.ACTIVITIES_POST_TEXTFIELD_BOX, Long.toString(timestamp));
		clickElement(myProfile.ACTIVITIES_POST_BTN);
		sleep(5);
		assertTrue(findElement(myProfile.LATEST_ACTIVITIES_BUTTONS_THIRD_BUTTON).getAttribute("class").contains("active"));
		assertTrue(findElement(myProfile.LAST_MESSAGE_CONTAINER).getAttribute("innerHTML").contains(Long.toString(timestamp)));
	}	
	
	@Test
//	Profile page - Overview - Latest Activities - click friend avatar and check url
	@Parameters({"xUrl"})
	public void Overview5(String xUrl) throws InterruptedException {
		String userUrl = "TestUser_A";
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(5);
		Login("cookietest1", "123456");	
		clickElement(topBar.MY_PROFILE_LINK);
		sleep(10);
		for (int i = 1; i <= 10; i++) {
			if (findElement(".messages ul li:nth-child(" + i + ") div div.activity-avatar a").getAttribute("href").contains(userUrl)){
				clickElement(".messages ul li:nth-child(" + i + ") div div.activity-avatar a");
				sleep(3);
				break;	
			}			
		}
		assertTrue(driver.getCurrentUrl().contains(userUrl));
	}		
	
	@Test
//	Profile page - Overview - Latest Activities - click friend username and check url
	@Parameters({"xUrl"})
	public void Overview6(String xUrl) throws InterruptedException {
		String userUrl = "TestUser_A";
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(5);
		Login("cookietest1", "123456");	
		clickElement(topBar.MY_PROFILE_LINK);
		sleep(10);
		for (int i = 1; i <= 10; i++) {
			if (findElement(".messages ul li:nth-child(" + i + ") div div.activity-content div.activity-summary a:nth-child(1)").getAttribute("href").contains(userUrl)){
				clickElement(".messages ul li:nth-child(" + i + ") div div.activity-content div.activity-summary a:nth-child(1)");
				sleep(3);
				break;	
			}			
		}
		assertTrue(driver.getCurrentUrl().contains(userUrl));
	}		

	@Test
//	Profile page - Overview - Latest Activities - click own avatar and check url
	@Parameters({"xUrl"})
	public void Overview7(String xUrl) throws InterruptedException {
		String userUrl = "cookietest1";
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(5);
		Login("cookietest1", "123456");	
		clickElement(topBar.MY_PROFILE_LINK);
		sleep(10);
		for (int i = 1; i <= 15; i++) {
			if (findElement(".messages ul li:nth-child(" + i + ") div div.activity-avatar a").getAttribute("href").contains(userUrl)){
				clickElement(".messages ul li:nth-child(" + i + ") div div.activity-avatar a");
				sleep(3);
				break;	
			}			
		}
		assertTrue(driver.getCurrentUrl().contains(userUrl));
	}		
	
	@Test
//	Profile page - Overview - Latest Activities - click friend own and check url
	@Parameters({"xUrl"})
	public void Overview8(String xUrl) throws InterruptedException {
		String userUrl = "cookietest1";
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(5);
		Login("cookietest1", "123456");	
		clickElement(topBar.MY_PROFILE_LINK);
		sleep(10);
		for (int i = 1; i <= 15; i++) {
			System.out.println(i + " " + findElement(".messages ul li:nth-child(" + i + ") div div.activity-content div.activity-summary a:nth-child(1)").getAttribute("href"));
			if (findElement(".messages ul li:nth-child(" + i + ") div div.activity-content div.activity-summary a:nth-child(2)").getAttribute("href").contains(userUrl)){				
				clickElement(".messages ul li:nth-child(" + i + ") div div.activity-content div.activity-summary a:nth-child(2)");
				sleep(3);
				break;	
			}			
		}
		assertTrue(driver.getCurrentUrl().contains(userUrl));
	}		
	
	@Test
//	Profile page - Overview - My Friends - login user without friends, click my profile and check controls, click friends btn and check url
	@Parameters({"xUrl"})
	public void Overview9(String xUrl) throws InterruptedException {		
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(5);
		Login("cookietest", "123456");	
		clickElement(topBar.MY_PROFILE_LINK);
		sleep(10);
		assertIsDisplayed(myProfile.MY_FRIENDS_TITLE);
		assertIsDisplayed(myProfile.MY_FRIENDS_NO_FRIENDS_BOX);
		assertIsDisplayed(myProfile.MY_FRIENDS_NO_FRIENDS_BTN);
		clickElement(myProfile.MY_FRIENDS_NO_FRIENDS_BTN);
		assertTrue(driver.getCurrentUrl().contains("/myfriends.html"));
	}		
	
	@Test
//	Profile page - Overview - My Friends - login user with friends, click my profile and check controls
	@Parameters({"xUrl"})
	public void Overview10(String xUrl) throws InterruptedException {		
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(5);
		Login("cookietest2", "123456");	
		clickElement(topBar.MY_PROFILE_LINK);
		sleep(10);
		assertIsDisplayed(myProfile.MY_FRIENDS_TITLE);
		for (int i = 1; i <= 6 ; i++) {
			assertIsDisplayed(".friends_latest_list ul li:nth-child(" + i + ")");
		}
		assertIsDisplayed(myProfile.MY_FRIENDS_SEE_ALL_FRIENDS_LINK);
	}		
	
	@Test
//	Profile page - Overview - My Friends - login user with friends, click my profile, click first avatar from my friends and check url
	@Parameters({"xUrl"})
	public void Overview11(String xUrl) throws InterruptedException {		
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(5);
		Login("cookietest2", "123456");	
		clickElement(topBar.MY_PROFILE_LINK);
		sleep(10);
		String friendUrl = findElement(myProfile.MY_FRIENDS_FIRST_FRIENDS_BOX + " a").getAttribute("href");
		clickElement(myProfile.MY_FRIENDS_FIRST_FRIENDS_AVATAR);
		assertTrue(driver.getCurrentUrl().equals(friendUrl));
	}		

	@Test
//	Profile page - Overview - My Friends - login user with friends, click my profile, click first name from my friends and check url
	@Parameters({"xUrl"})
	public void Overview12(String xUrl) throws InterruptedException {		
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(5);
		Login("cookietest2", "123456");	
		clickElement(topBar.MY_PROFILE_LINK);
		sleep(10);
		String friendUrl = findElement(myProfile.MY_FRIENDS_FIRST_FRIENDS_BOX + " a").getAttribute("href");
		clickElement(myProfile.MY_FRIENDS_FIRST_FRIENDS_NAME);
		assertTrue(driver.getCurrentUrl().equals(friendUrl));
	}	
	
	@Test
//	Profile page - Overview - My Friends - login user with friends, click my profile, click "see all friends" link
	@Parameters({"xUrl"})
	public void Overview13(String xUrl) throws InterruptedException {		
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(5);
		Login("cookietest2", "123456");	
		clickElement(topBar.MY_PROFILE_LINK);
		sleep(10);
		clickElement(myProfile.MY_FRIENDS_SEE_ALL_FRIENDS_LINK);
		assertTrue(driver.getCurrentUrl().contains("/myfriends.html"));
	}	

	@Test
//	Profile page - Overview - Fave Games - login user without fave games, click my profile and check controls,
//	click "See all fave games" and check url
	@Parameters({"xUrl"})
	public void Overview14(String xUrl) throws InterruptedException {		
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(5);
		Login("cookietest1", "123456");	
		clickElement(topBar.MY_PROFILE_LINK);
		sleep(10);
		assertIsDisplayed(myProfile.MY_FAVE_GAMES_TITLE);
		for (int i = 1; i <= 4 ; i++) {
			assertIsDisplayed(".tc-favorites-list li:nth-child(" + i + ")");
			assertTrue(findElement(".tc-favorites-list li:nth-child(" + i + ") a.profileGameItem").getAttribute("href").contains("#"));
		}
		assertIsDisplayed(myProfile.MY_FAVE_GAMES_SEE_ALL_FAVE_GAMES_LINK);
		clickElement(myProfile.MY_FAVE_GAMES_SEE_ALL_FAVE_GAMES_LINK);
		assertTrue(driver.getCurrentUrl().contains("/mygames.html"));
		assertTrue(findElement(favoriteGames.FAVORITE_GAMES_FIRST_GAME_BOX).getAttribute("href").contains("#"));
	}	
	
	@Test
//	Profile page - Overview - Fave Games - login user with fave games, click my profile and check controls
//	click "See all fave games" and check url
	@Parameters({"xUrl"})
	public void Overview15(String xUrl) throws InterruptedException {		
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(5);
		Login("cookietest2", "123456");	
		clickElement(topBar.MY_PROFILE_LINK);
		sleep(10);
		assertIsDisplayed(myProfile.MY_FAVE_GAMES_TITLE);
		assertIsDisplayed(myProfile.MY_FAVE_GAMES_FIRST_GAME_BOX);
		assertIsDisplayed(myProfile.MY_FAVE_GAMES_FIRST_GAME_DELETE_BTN);
		String gameUrl = findElement(myProfile.MY_FAVE_GAMES_FIRST_GAME_BOX).getAttribute("href");		
		assertIsDisplayed(myProfile.MY_FAVE_GAMES_SEE_ALL_FAVE_GAMES_LINK);
		clickElement(myProfile.MY_FAVE_GAMES_SEE_ALL_FAVE_GAMES_LINK);
		assertTrue(driver.getCurrentUrl().contains("/mygames.html"));
		assertTrue(findElement(favoriteGames.FAVORITE_GAMES_FIRST_GAME_BOX).getAttribute("href").equals(gameUrl));
	}		
	
	@Test
//	Profile page - Overview - Fave Games - login user with fave games, click first fave game and check url
	@Parameters({"xUrl"})
	public void Overview16(String xUrl) throws InterruptedException {		
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(5);
		Login("cookietest2", "123456");	
		clickElement(topBar.MY_PROFILE_LINK);
		sleep(10);
		String gameUrl = findElement(myProfile.MY_FAVE_GAMES_FIRST_GAME_BOX).getAttribute("href");	
		clickElement(myProfile.MY_FAVE_GAMES_FIRST_GAME_BOX);	
		sleep(5);
		assertTrue(driver.getCurrentUrl().equals(gameUrl));
	}		
	
	@Test
//	Profile page - Overview - My Latest Creations - login user without any Creations, click my profile and check controls,
//	click "view album" and check url
	@Parameters({"xUrl"})
	public void Overview17(String xUrl) throws InterruptedException {		
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(5);
		Login("cookietest1", "123456");	
		clickElement(topBar.MY_PROFILE_LINK);
		sleep(10);
		assertIsDisplayed(myProfile.MY_LATEST_CREATIONS_TITLE);
		for (int i = 1; i <= 2 ; i++) {
			assertIsDisplayed(".tc-creations-list li:nth-child(" + i + ")");
			assertTrue(findElement(".tc-creations-list li:nth-child(" + i + ") div span a").getAttribute("href").contains("javascript:;"));
		}
		assertIsDisplayed(myProfile.MY_LATEST_CREATIONS_VIEW_ALBUM_LINK);
		clickElement(myProfile.MY_LATEST_CREATIONS_VIEW_ALBUM_LINK);
		sleep(5);
		assertTrue(driver.getCurrentUrl().contains("/myalbum.html"));
		assertTrue(findElement(album.ALBUM_FIRST_CREATION_BOX).getAttribute("href").contains("javascript:;"));
	}	
	
	@Test
//	Profile page - Overview - My Latest Creations - login user with any Creations, click my profile and check controls
//	click "view album" and check url
	@Parameters({"xUrl"})
	public void Overview18(String xUrl) throws InterruptedException {		
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(5);
		Login("cookietest2", "123456");	
		clickElement(topBar.MY_PROFILE_LINK);
		sleep(10);
		assertIsDisplayed(myProfile.MY_LATEST_CREATIONS_TITLE);
		assertIsDisplayed(myProfile.MY_LATEST_CREATIONS_FIRST_CREATION_BOX);
		String creationUrl = findElement(myProfile.MY_LATEST_CREATIONS_FIRST_CREATION_BOX).getAttribute("href");		
		assertIsDisplayed(myProfile.MY_LATEST_CREATIONS_VIEW_ALBUM_LINK);
		clickElement(myProfile.MY_LATEST_CREATIONS_VIEW_ALBUM_LINK);
		sleep(5);
		assertTrue(driver.getCurrentUrl().contains("/myalbum.html"));
		assertTrue(findElement(album.ALBUM_FIRST_CREATION_BOX).getAttribute("href").equals(creationUrl));
	}		
	
	@Test
//	Profile page - Overview - My Latest Creations - login user with Creations, click first creation and check url
	@Parameters({"xUrl"})
	public void Overview19(String xUrl) throws InterruptedException {		
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(5);
		Login("cookietest2", "123456");	
		clickElement(topBar.MY_PROFILE_LINK);
		sleep(10);
		String creationUrl = findElement(myProfile.MY_LATEST_CREATIONS_FIRST_CREATION_BOX).getAttribute("href");	
		clickElement(myProfile.MY_LATEST_CREATIONS_FIRST_CREATION_BOX);			
		sleep(5);
		assertTrue(driver.getCurrentUrl().equals(creationUrl));
	}
	
	@Test
//	Profile page - Overview - My Awards - login user without any awards, click my profile and check controls,
//	click "see all awards" and check url
	@Parameters({"xUrl"})
	public void Overview20(String xUrl) throws InterruptedException {		
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(5);
		Login("cookietest1", "123456");	
		clickElement(topBar.MY_PROFILE_LINK);
		sleep(10);
		assertIsDisplayed(myProfile.MY_AWARDS_TITLE);
		for (int i = 1; i <= 3 ; i++) {
			assertIsDisplayed("#awards ul li:nth-child(" + i + ")");
			assertTrue(findElement("#awards ul li:nth-child(" + i + ") span img").getAttribute("src").contains("/spacer.gif"));
		}
		assertIsDisplayed(myProfile.MY_AWARDS_SEE_ALL_AWARDS_LINK);
		clickElement(myProfile.MY_AWARDS_SEE_ALL_AWARDS_LINK);
		sleep(5);
		assertTrue(driver.getCurrentUrl().contains("/myawards.html"));
		assertTrue(findElement(awards.AWARDS_FIRST_EMPTY_AWARD_BOX).getAttribute("src").contains("/empty.jpg"));
	}	
	
	@Test
//	Profile page - Overview - My Awards - login user with any awards, click my profile and check controls
//	click "see all awards" and check url
	@Parameters({"xUrl"})
	public void Overview21(String xUrl) throws InterruptedException {		
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(5);
		Login("cookietest2", "123456");	
		clickElement(topBar.MY_PROFILE_LINK);
		sleep(10);
		assertIsDisplayed(myProfile.MY_AWARDS_TITLE);
		assertIsDisplayed(myProfile.MY_AWARDS_FIRST_AWARD_BOX);
		String creationUrl = findElement(myProfile.MY_AWARDS_FIRST_AWARD_BOX).getAttribute("src");		
		assertIsDisplayed(myProfile.MY_AWARDS_SEE_ALL_AWARDS_LINK);
		clickElement(myProfile.MY_AWARDS_SEE_ALL_AWARDS_LINK);
		sleep(5);
		assertTrue(driver.getCurrentUrl().contains("/myawards.html"));
		System.out.println(findElement(awards.AWARDS_FIRST_AWARD_BOX).getAttribute("src"));
		System.out.println(creationUrl);
		assertTrue(findElement(awards.AWARDS_FIRST_AWARD_BOX).getAttribute("src").contains(creationUrl));
	}		
	
	@Test
//	Profile page - Overview - My Awards - login user with awards, click first award and check url
	@Parameters({"xUrl"})
	public void Overview22(String xUrl) throws InterruptedException {		
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(5);
		Login("cookietest2", "123456");	
		clickElement(topBar.MY_PROFILE_LINK);
		sleep(10);
		String creationUrl = findElement(myProfile.MY_AWARDS_FIRST_AWARD_LINK).getAttribute("href");	
		clickElement(myProfile.MY_AWARDS_FIRST_AWARD_BOX);		
		sleep(5);
		assertTrue(driver.getCurrentUrl().equals(creationUrl));
	}	
	
	@Test
//	Profile page - Overview - High Scores - login user without any high scores, click my profile and check controls
	@Parameters({"xUrl"})
	public void Overview23(String xUrl) throws InterruptedException {		
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(5);
		Login("cookietest1", "123456");	
		clickElement(topBar.MY_PROFILE_LINK);
		sleep(10);
		assertIsDisplayed(myProfile.HIGH_SCORES_NO_HIGH_SCORES_BOX);
	}		
	
	@Test
//	Profile page - Overview - High Scores - login user with any high scores, click my profile and check controls
	@Parameters({"xUrl"})
	public void Overview24(String xUrl) throws InterruptedException {		
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(5);
		Login("cookietest2", "123456");	
		clickElement(topBar.MY_PROFILE_LINK);
		sleep(10);
		assertIsDisplayed(myProfile.HIGH_SCORES_HIGH_SCORES_BOX);
		assertIsDisplayed(myProfile.HIGH_SCORES_FIRST_HIGH_SCORES_BOX);
		String gameUrl = findElement(myProfile.HIGH_SCORES_FIRST_HIGH_SCORES_BOX).getAttribute("href");
		clickElement(myProfile.HIGH_SCORES_FIRST_HIGH_SCORES_BOX);
		sleep(5);
		assertTrue(driver.getCurrentUrl().contains(gameUrl));
		
	}		
}