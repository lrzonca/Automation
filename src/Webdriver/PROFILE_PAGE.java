package Webdriver;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.util.Date;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.junit.runner.RunWith;

@RunWith(BlockJUnit4ClassRunner.class)
public class PROFILE_PAGE extends SeleniumBase{
	long timestamp = new Date().getTime();

	@Test
	@Parameters({"xUrl"})
	public void Profile1(String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl);
		System.out.println("Sleep 2 sek");
		Thread.sleep(2000);
		System.out.println("Login Common");
		Login("marlacom103", "123456");		
		System.out.println("Find Element MY_PROFILE_LINK");
	    WebElement MyProfile = driver.findElement(By.cssSelector(Webdriver.mappings.topBar.MY_PROFILE_LINK));
	    System.out.println("Click Element MY_PROFILE_LINK");
	    MyProfile.click();
	    System.out.println("Sleep 5 sek");
	    Thread.sleep(5000);
	    System.out.println("Find Element LATEST_ACTIVITIES_BUTTONS_FIRST_BUTTON");
	    WebElement AllActivities = driver.findElement(By.cssSelector(Webdriver.mappings.myProfile.LATEST_ACTIVITIES_BUTTONS_FIRST_BUTTON));
	    System.out.println("Click Element LATEST_ACTIVITIES_BUTTONS_FIRST_BUTTON");
	    AllActivities.click();
	    System.out.println("Assertion");
	    AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.myProfile.LAST_MESSAGE_CONTAINER)).isDisplayed());
	    System.out.println("Find Element LATEST_ACTIVITIES_BUTTONS_SECOND_BUTTON");
	    WebElement MyActivities = driver.findElement(By.cssSelector(Webdriver.mappings.myProfile.LATEST_ACTIVITIES_BUTTONS_SECOND_BUTTON));
	    System.out.println("Click Element LATEST_ACTIVITIES_BUTTONS_SECOND_BUTTON");
	    MyActivities.click();
	    System.out.println("Assertion");
	    AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.myProfile.LAST_MESSAGE_CONTAINER)).isDisplayed());
	    System.out.println("Find Element LATEST_ACTIVITIES_BUTTONS_THIRD_BUTTON");
	    WebElement Messages = driver.findElement(By.cssSelector(Webdriver.mappings.myProfile.LATEST_ACTIVITIES_BUTTONS_THIRD_BUTTON));
	    System.out.println("Click Element LATEST_ACTIVITIES_BUTTONS_THIRD_BUTTON");
	    Messages.click();
	    System.out.println("Assertion");
	    AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.myProfile.LAST_MESSAGE_CONTAINER)).isDisplayed());
	}
}