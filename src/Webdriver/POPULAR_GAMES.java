package Webdriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class POPULAR_GAMES extends SeleniumBase{
	  
	/** Popular Games - title -  click to popular games title, check url and if left navi popular games is selected**/ 	
	@Test
	@Parameters({"xUrl"})
	public void Popular1(String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl);	
		sleep(5);
		clickElement(populargames.POPULAR_GAMES_TITLE);
		sleep(5);
		assertTrue(driver.getCurrentUrl().contains("popular.html"));
		assertTrue(findElement(leftNavi.POPULAR_GAMES).getAttribute("class").contains("currentOne"));		
	}
	
	/**Popular Games - games - click first available game in popular games, check url if correct game was open**/ 	
	@Test
	@Parameters({"xUrl"})
	public void Popular2(String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl);	
		sleep(5);
		String gameUrl = findElement(populargames.POPULAR_GAMES_FIRST_GAME_LINK).getAttribute("href");
		System.out.println(gameUrl);
		clickElement(populargames.POPULAR_GAMES_FIRST_GAME_LINK);
		sleep(5);
		System.out.println(driver.getCurrentUrl());
		assertTrue(driver.getCurrentUrl().equals(gameUrl));
	}	
	
	/**Popular Games - hover - move mouse over all popular games and check if popup with correct game image and title is showing **/
	@Test
	@Parameters({"xUrl"})
	public void Popular3(String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl);	
		sleep(5);
		Actions builder = new Actions(driver); 
		for (int i = 1; i <= 10; i++){
			WebElement game = findElement(".popularbox ul li:nth-child("+ i +")");
			if (i % 2 == 1){
				assertTrue(game.getAttribute("class").equals("white"));
			} else {
				assertTrue(game.getAttribute("class").equals(""));
			}			
			builder.moveToElement(findElement(".popularbox ul li:nth-child("+ i +") div.overflowElement a")).build().perform();
			assertTrue(findElement(populargames.POPULAR_GAMES_SHOW_TOOLTIP).getAttribute("style").contains("block"));
			assertTrue(findElement(".popularbox ul.BoxList li:nth-child(" + i + ") img").getAttribute("src").equals(findElement(populargames.POPULAR_GAMES_SHOW_TOOLTIP_IMG).getAttribute("src")));
			assertTrue(findElement(".popularbox ul.BoxList li:nth-child(" + i + ") a.tooltipHidden").getAttribute("innerHTML").equals(findElement(populargames.POPULAR_GAMES_SHOW_TOOLTIP_TITLE).getAttribute("innerHTML")));
		}	
	}					
}