package Webdriver;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.util.Date;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.junit.runner.RunWith;

@RunWith(BlockJUnit4ClassRunner.class)
public class CATEGORY_PAGE extends SeleniumBase{
	long timestamp = new Date().getTime();
	  
	@Test
	@Parameters({"xUrl"})
	public void Category1(String xUrl) throws InterruptedException {
		driver.get(xUrl);
		Thread.sleep(2000);
		WebElement AdventureGame = driver.findElement(By.cssSelector(Webdriver.mappings.leftNavi.ADVENTURE_GAMES));
		AdventureGame.click();		
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.categoryPage.SUBCATEGORY_GAME_LIST)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.categoryPage.FIRST_AVAILABLE_SUBCATEGORY_LINK)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.categoryPage.TOP_HOME_PAGE_LINK)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.categoryPage.TOP_HOME_PAGE_LINK)).isDisplayed());
		assertTrue(driver.findElements(By.cssSelector(Webdriver.mappings.categoryPage.TOP_CATEGORY_LINK)).size() == 0);
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.categoryPage.TOP_ACTIVE_PAGE)).isDisplayed());
	}
}

