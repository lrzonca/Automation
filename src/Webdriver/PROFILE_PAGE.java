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
		driver.get(xUrl);
		Thread.sleep(2000);
		Login("marlacom103", "123456");		
	    WebElement MyProfile = driver.findElement(By.cssSelector(Webdriver.mappings.topBar.MY_PROFILE_LINK));
	    MyProfile.click();
	    Thread.sleep(5000);
	    WebElement AllActivities = driver.findElement(By.cssSelector(Webdriver.mappings.myProfile.LATEST_ACTIVITIES_BUTTONS_FIRST_BUTTON));
	    AllActivities.click();
	    WebElement Container = driver.findElement(By.cssSelector(Webdriver.mappings.myProfile.LAST_MESSAGE_CONTAINER));
	    Container.isDisplayed();
	    WebElement MyActivities = driver.findElement(By.cssSelector(Webdriver.mappings.myProfile.LATEST_ACTIVITIES_BUTTONS_SECOND_BUTTON));
	    MyActivities.click();
	    WebElement Container2 = driver.findElement(By.cssSelector(Webdriver.mappings.myProfile.LAST_MESSAGE_CONTAINER));
	    Container2.isDisplayed();
	    WebElement Messages = driver.findElement(By.cssSelector(Webdriver.mappings.myProfile.LATEST_ACTIVITIES_BUTTONS_THIRD_BUTTON));
	    Messages.click();
	    WebElement Container3 = driver.findElement(By.cssSelector(Webdriver.mappings.myProfile.LAST_MESSAGE_CONTAINER));
	    Container3.isDisplayed();
	}
}

