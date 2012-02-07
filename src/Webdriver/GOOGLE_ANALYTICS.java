package Webdriver;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.util.Date;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.openqa.selenium.By;
import org.junit.runner.RunWith;

@RunWith(BlockJUnit4ClassRunner.class)
public class GOOGLE_ANALYTICS extends SeleniumBase{
	long timestamp = new Date().getTime();
	  
	@Test
	@Parameters({"xUrl"})
	public void Google01(String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl + "/game/casinojigsaw.html");
		System.out.println("Sleep 30 sek");
		Thread.sleep(30000);
		System.out.println("Assertion");
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.gamepage.GAME_CONTAINTER_SHOCKWAVE)).isDisplayed());
	}
}