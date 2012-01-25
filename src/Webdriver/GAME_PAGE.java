package Webdriver;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.util.Date;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.junit.runner.RunWith;

@RunWith(BlockJUnit4ClassRunner.class)
public class GAME_PAGE extends SeleniumBase{
	long timestamp = new Date().getTime();
	  
	@Test
	@Parameters({"xUrl"})
	public void GamePage1(String xUrl) throws InterruptedException {
		driver.get(xUrl + "/game/casinojigsaw.html");
		Thread.sleep(30000);
		WebElement GameObject = driver.findElement(By.id(Webdriver.mappings.gamepage.GAME_CONTAINTER_SHOCKWAVE));
		GameObject.isDisplayed();
	}
	
	@Test
	@Parameters({"xUrl"})
	public void GamePage2(String xUrl) throws InterruptedException {
		driver.get(xUrl + "/game/bomberpengu.html");
		Thread.sleep(30000);
		driver.switchTo().frame("socialgame");
		WebElement GameObject = driver.findElement(By.id("flashobj"));
		GameObject.isDisplayed();
	}
	
	@Test
	@Parameters({"xUrl"})
	public void GamePage3(String xUrl) throws InterruptedException {
		driver.get(xUrl + "/game/kindergarten.html");
		Thread.sleep(30000);
		driver.switchTo().frame(Webdriver.mappings.gamepage.GAME_CONTAINTER_IFRAME);
		WebElement GameObject = driver.findElement(By.id("test"));
		GameObject.isDisplayed();
	}	
}

