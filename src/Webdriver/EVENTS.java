package Webdriver;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.util.Date;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.junit.runner.RunWith;

@RunWith(BlockJUnit4ClassRunner.class)
public class EVENTS extends SeleniumBase{
	long timestamp = new Date().getTime();
	  
	@Test
	@Parameters({"xUrl"})
	public void Events1(String xUrl) throws InterruptedException {
		driver.get(xUrl + "/game/casinojigsaw.html");
		Thread.sleep(30000);
		WebElement GameObject = driver.findElement(By.id(Webdriver.mappings.gamepage.GAME_CONTAINTER_SHOCKWAVE));
		GameObject.isDisplayed();
	}
	
}

