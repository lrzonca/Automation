package Webdriver;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.junit.runner.RunWith;

@RunWith(BlockJUnit4ClassRunner.class)
public class CATEGORY_PAGE extends SeleniumBase{
	  
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
	
	
	@Test
	@Parameters({"xUrl"})
	public void Category2(String xUrl) throws InterruptedException {
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
		
		String CurrentURL = driver.getCurrentUrl();
		WebElement Subcategory = driver.findElement(By.cssSelector(Webdriver.mappings.categoryPage.FIRST_AVAILABLE_SUBCATEGORY_LINK));
		Subcategory.click();
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.subcategoryPage.FIRST_AVAILABLE_GAME_LINK)).isDisplayed());
		driver.get(CurrentURL);
		
		if (driver.findElements(By.cssSelector(Webdriver.mappings.categoryPage.FIRST_AVAILABLE_GAME_LINK)).size() > 0){	
			WebElement GameLink = driver.findElement(By.cssSelector(Webdriver.mappings.categoryPage.FIRST_AVAILABLE_GAME_LINK));
			GameLink.click();
			AssertTrue(driver.findElements(By.cssSelector(Webdriver.mappings.categoryPage.FIRST_AVAILABLE_SUBCATEGORY_LINK)).size() == 0);
			AssertTrue(driver.findElements(By.cssSelector(Webdriver.mappings.categoryPage.FIRST_AVAILABLE_GAME_LINK)).size() == 0);
			AssertTrue(driver.findElement(By.id(Webdriver.mappings.gamepage.ALL_COMMENTS_BOX)).isDisplayed());
		   }			
	}	
	
	@Test
	@Parameters({"xUrl"})
	public void Category3(String xUrl) throws InterruptedException {
		driver.get(xUrl);
		Thread.sleep(2000);
		WebElement AdventureGame = driver.findElement(By.cssSelector(Webdriver.mappings.leftNavi.ADVENTURE_GAMES));
		AdventureGame.click();
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.popularGames.POPULAR_GAMES_TITLE_CATEGORY_PAGE)).isDisplayed());  		   
		int iterTry = 1;
		while (driver.findElement(By.cssSelector(".BoxList li:nth-child(" + iterTry + ")")).isDisplayed()){			
			if (iterTry % 2 == 1){
				assertEquals("white", driver.findElement(By.cssSelector(".BoxList li:nth-child(" + iterTry + ")")).getAttribute("class"));
			} else {
//				assertEquals("white", driver.findElement(By.cssSelector(".BoxList li:nth-child(" + iterTry + ")")).getAttribute(""));
			}		   
			iterTry++;
		}
//		   while (selenium.isElementPresent("css=.BoxList li:nth-child(" + iterTry + ")")){	   
//			   if (iterTry % 2 == 1){
//				   assertEquals("white", selenium.getAttribute("css=.BoxList li:nth-child(" + iterTry + ")@class"));
//			   } else {
//				   selenium.ignoreAttributesWithoutValue("css=.BoxList li:nth-child(" + iterTry + ")@class");
//			   }		   
//			   selenium.mouseOver("css=.BoxList li:nth-child(" + iterTry + ") div a");
//			   String TooltipVisible = selenium.getAttribute(GIRLS.MAPPINGS.POPULAR_GAMES.POPULAR_GAMES_SHOW_TOOLTIP_CATEGORY_PAGE+"@style");
//			   TooltipVisible.contains("display: block");
//			   String Tooltip_Title = selenium.getText("css=ul.BoxList li:nth-child(" + iterTry + ") a.tooltipHidden");
//			   String Tooltip_Img = selenium.getAttribute("css=ul.BoxList li:nth-child(" + iterTry + ") img" + "@src");	   
//			   assertEquals(Tooltip_Title, selenium.getText(GIRLS.MAPPINGS.POPULAR_GAMES.POPULAR_GAMES_SHOW_TOOLTIP_TITLE_CATEGORY_PAGE));
//			   assertEquals(Tooltip_Img, selenium.getAttribute(GIRLS.MAPPINGS.POPULAR_GAMES.POPULAR_GAMES_SHOW_TOOLTIP_IMG_CATEGORY_PAGE + "@src"));   
//			   iterTry++;
//		   }	
	}
	
	@Test
	@Parameters({"xUrl"})
	public void Category4(String xUrl) throws InterruptedException {
		driver.get(xUrl);
		Thread.sleep(2000);
		WebElement AdventureGame = driver.findElement(By.cssSelector(Webdriver.mappings.leftNavi.ADVENTURE_GAMES));
		AdventureGame.click();
		
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.categoryPage.CATEGORY_TAG_BOX)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.categoryPage.CATEGORY_TAG_GIRLS_IMG)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.categoryPage.CATEGORY_TAG_TITLE)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.categoryPage.FIRST_AVAILABLE_TAG_LINK)).isDisplayed());
	}	
	
	
	
}
