package Webdriver;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.util.Date;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.openqa.selenium.By;
import org.junit.runner.RunWith;

@RunWith(BlockJUnit4ClassRunner.class)
public class SOCIAL extends SeleniumBase{
	long timestamp = new Date().getTime();
	  
	@Test
	@Parameters({"xUrl"})
	public void Social1(String xUrl) throws InterruptedException {
		driver.get(xUrl + "/game/pet_party.html?socialgames");
		Thread.sleep(30000);
		driver.switchTo().frame(Webdriver.mappings.social.SOCIAL_GAME_BOX);		
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SOCIAL_GAME)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SOCIAL_GAME_PLAY_BUTTON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SOCIAL_GAME_INVITE_BUTTON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SOCIAL_GAME_GET_SAPPHIRES_BUTTON)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.social.SOCIAL_GAME_HELP_BUTTON)).isDisplayed());
	}
}

