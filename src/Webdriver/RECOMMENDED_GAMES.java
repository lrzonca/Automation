package Webdriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class RECOMMENDED_GAMES extends SeleniumBase{
	  
//	Recommended Games - games - click first available game in recommended games, check url if correct game was open 	
	@Test
	@Parameters({"xUrl"})
	public void Recommended1(String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl);				
		String gameUrl = findElement(recommendedgames.RECOMMENDED_GAMES_FIRST_GAME_LINK).getAttribute("href");
		System.out.println(gameUrl);
		clickElement(recommendedgames.RECOMMENDED_GAMES_FIRST_GAME_LINK);
		sleep(5);
		System.out.println(driver.getCurrentUrl());
		assertTrue(driver.getCurrentUrl().equals(gameUrl));
	}	
	
//	Recommended Games - hover - move mouse over all recommended games and check if popup with correct game image and title is showing
	@Test
	@Parameters({"xUrl"})
	public void Recommended2(String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl);			
		assertIsDisplayed(recommendedgames.RECOMMENDED_GAMES_TITLE);
		Actions builder = new Actions(driver); 
		for (int i = 1; i <= 5; i++){
			WebElement game = findElement(".tipsbox ul li:nth-child("+ i +")");
			if (i % 2 == 1){
				assertTrue(game.getAttribute("class").equals("white"));
			} else {
				assertTrue(game.getAttribute("class").equals(""));
			}			
			builder.moveToElement(findElement(".tipsbox ul li:nth-child("+ i +") div.overflowElement a")).build().perform();		
			assertTrue(findElement(recommendedgames.RECOMMENDED_GAMES_SHOW_TOOLTIP).getAttribute("style").contains("block"));
			assertTrue(findElement(".tipsbox ul.BoxList li:nth-child(" + i + ") img").getAttribute("src").equals(findElement(recommendedgames.RECOMMENDED_GAMES_SHOW_TOOLTIP_IMG).getAttribute("src")));
			assertTrue(findElement(".tipsbox ul.BoxList li:nth-child(" + i + ") a.tooltipHidden").getAttribute("innerHTML").equals(findElement(recommendedgames.RECOMMENDED_GAMES_SHOW_TOOLTIP_TITLE).getText()));
		}	
	}					
}