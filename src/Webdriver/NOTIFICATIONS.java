package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NOTIFICATIONS extends SeleniumBase{

	/**Top bar - Notifications link - login a user, click "notifications" link from top bar, check url and controls if are present and correct tab is selected**/ 
	@Test
	@Parameters({"xUrl"})
	public void Notifications1(String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(5);
		Login("cookietest", "123456");	
		clickElement(notifications.NOTIFICATIONS_TOP_LINK);
		sleep(5);
		assertTrue(driver.getCurrentUrl().contains("inbox.html"));
		assertTrue(findElement(notifications.TAB_NOTIFICATIONS).getAttribute("class").equals("active"));
		assertTrue(findElement(myProfile.TOP_TITLE).getText().equals("Notifications"));
	}
	
	/**Top bar - My profile - Notifications Tab - login a user without notification, click "my profile", click "notifications" tab, check url and controls on all tabs**/
	@Test
	@Parameters({"xUrl"})
	public void Notifications2(String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(5);
		Login("cookietest1", "123456");	
		clickElement(topBar.MY_PROFILE_LINK);
		sleep(5);
		clickElement(notifications.TAB_NOTIFICATIONS);	
		sleep(5);
		assertTrue(driver.getCurrentUrl().contains("inbox.html"));
		WebElement a = driver.findElement(By.xpath(notifications.NOTIFICATIONS_ALL_BTN));
		a.click();
		sleep(2);
		assertIsDisplayed(notifications.NOTIFICATIONS_TOP_INFO_TEXT);
		assertIsDisplayed(notifications.NOTIFICATIONS_NO_NOTIFICATIONS_BOX);
		assertIsNotDisplayed(notifications.NOTIFICATIONS_NOTIFICATIONS_BOX);
		WebElement b = driver.findElement(By.xpath(notifications.NOTIFICATIONS_FRIEND_REQUESTS_BTN));
		b.click();
		sleep(2);
		assertIsDisplayed(notifications.NOTIFICATIONS_TOP_INFO_TEXT);
		assertIsDisplayed(notifications.NOTIFICATIONS_NO_NOTIFICATIONS_BOX);
		assertIsNotDisplayed(notifications.NOTIFICATIONS_NOTIFICATIONS_BOX);
		WebElement c = driver.findElement(By.xpath(notifications.NOTIFICATIONS_GIRLSGOGAMES_BTN));
		c.click();
		sleep(2);
		assertIsDisplayed(notifications.NOTIFICATIONS_TOP_INFO_TEXT);
		assertIsDisplayed(notifications.NOTIFICATIONS_NO_NOTIFICATIONS_BOX);
		assertIsNotDisplayed(notifications.NOTIFICATIONS_NOTIFICATIONS_BOX);
	}	
	
	/**Top bar - My profile - Notifications Tab - login a user with notification, click "my profile", click "notifications" tab, check url and controls on all tabs**/ 
	@Test
	@Parameters({"xUrl"})
	public void Notifications3(String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(5);
		Login("cookietest2", "123456");	
		clickElement(topBar.MY_PROFILE_LINK);
		sleep(5);
		clickElement(notifications.TAB_NOTIFICATIONS);		
		sleep(5);
		assertTrue(driver.getCurrentUrl().contains("inbox.html"));
		WebElement a = driver.findElement(By.xpath(notifications.NOTIFICATIONS_ALL_BTN));
		a.click();
		sleep(2);
		assertIsDisplayed(notifications.NOTIFICATIONS_TOP_INFO_TEXT);
		assertIsNotDisplayed(notifications.NOTIFICATIONS_NO_NOTIFICATIONS_BOX);
		assertIsDisplayed(notifications.NOTIFICATIONS_NOTIFICATIONS_BOX);
		assertIsDisplayed(notifications.NOTIFICATIONS_FRIEND_REQUEST_ACCEPTED_MSG_BOX);
		assertIsDisplayed(notifications.NOTIFICATIONS_WELCOME_MSG_BOX);
		WebElement b = driver.findElement(By.xpath(notifications.NOTIFICATIONS_FRIEND_REQUESTS_BTN));
		b.click();
		sleep(2);
		assertIsDisplayed(notifications.NOTIFICATIONS_TOP_INFO_TEXT);
		assertIsNotDisplayed(notifications.NOTIFICATIONS_NO_NOTIFICATIONS_BOX);
		assertIsDisplayed(notifications.NOTIFICATIONS_NOTIFICATIONS_BOX);
		assertIsDisplayed(notifications.NOTIFICATIONS_FRIEND_REQUEST_ACCEPTED_MSG_BOX);
		WebElement c = driver.findElement(By.xpath(notifications.NOTIFICATIONS_GIRLSGOGAMES_BTN));
		c.click();
		sleep(2);
		assertIsDisplayed(notifications.NOTIFICATIONS_TOP_INFO_TEXT);
		assertIsNotDisplayed(notifications.NOTIFICATIONS_NO_NOTIFICATIONS_BOX);
		assertIsDisplayed(notifications.NOTIFICATIONS_NOTIFICATIONS_BOX);
		assertIsDisplayed(notifications.NOTIFICATIONS_WELCOME_MSG_BOX);
	}		
	
	
	/**Top bar - My profile - Notifications Tab - login a user with notification, click "my profile", click "notifications" tab, click user avatar and check url**/ 
	@Test
	@Parameters({"xUrl"})
	public void Notifications4(String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(5);
		Login("cookietest", "123456");	
		clickElement(topBar.MY_PROFILE_LINK);
		sleep(5);
		clickElement(notifications.TAB_NOTIFICATIONS);		
		sleep(5);
		String userUrl = findElement(notifications.NOTIFICATIONS_FIRST_AVATAR_LINK).getAttribute("href");
		clickElement(notifications.NOTIFICATIONS_FIRST_AVATAR_LINK);
		sleep(3);
		assertTrue(driver.getCurrentUrl().contains(userUrl));
	}			
	
	/**Top bar - My profile - Notifications Tab - login a user with a lot notification, click "my profile", click "notifications" tab, 
	click paging-next-btn and check if first messages are different **/   
	@Test
	@Parameters({"xUrl"})
	public void Notifications5(String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(5);
		Login("mptest", "123456");	
		clickElement(topBar.MY_PROFILE_LINK);
		sleep(5);
		clickElement(notifications.TAB_NOTIFICATIONS);	
		sleep(5);
		String firstMsg = findElement(notifications.NOTIFICATION_FIRST_MESSAGE_BOX).getAttribute("innerHTML");
		System.out.println(firstMsg);
		clickElement(notifications.NOTIFICATIONS_NEXT_BTN);
		sleep(5);
		assertFalse(findElement(notifications.NOTIFICATION_FIRST_MESSAGE_BOX).getAttribute("innerHTML").equals(firstMsg));
	}				
}