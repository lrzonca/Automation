package Webdriver;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runner.RunWith;

@RunWith(BlockJUnit4ClassRunner.class)
public class NOTIFICATIONS extends SeleniumBase{

//	Top bar - Notifications link - login a user, click "notifications" link from top bar, check url and controls if are present and correct tab is selected 
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
}