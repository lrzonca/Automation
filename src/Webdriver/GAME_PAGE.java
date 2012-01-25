package Webdriver;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.util.Date;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.openqa.selenium.By;
import org.junit.runner.RunWith;

@RunWith(BlockJUnit4ClassRunner.class)
public class GAME_PAGE extends SeleniumBase{
	long timestamp = new Date().getTime();
	  
	@Test
	@Parameters({"xUrl"})
	public void GamePage1(String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl + "/game/casinojigsaw.html");
		System.out.println("Sleep 30 sek");
		Thread.sleep(30000);
		System.out.println("Assertion");
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.gamepage.GAME_CONTAINTER_SHOCKWAVE)).isDisplayed());
	}
	
	@Test
	@Parameters({"xUrl"})
	public void GamePage2(String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl + "/game/bomberpengu.html");
		System.out.println("Sleep 30 sek");
		Thread.sleep(30000);
		System.out.println("Switch to GAME_CONTAINTER_IFRAME");
		driver.switchTo().frame("socialgame");
		System.out.println("Assertion");
		AssertTrue(driver.findElement(By.id("flashobj")).isDisplayed());
	}
	
	@Test
	@Parameters({"xUrl"})
	public void GamePage3(String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl + "/game/kindergarten.html");
		System.out.println("Sleep 30 sek");
		Thread.sleep(30000);
		System.out.println("Switch to GAME_CONTAINTER_IFRAME");
		driver.switchTo().frame(Webdriver.mappings.gamepage.GAME_CONTAINTER_IFRAME);
		System.out.println("Assertion");
		AssertTrue(driver.findElement(By.id("test")).isDisplayed());
	}	
}