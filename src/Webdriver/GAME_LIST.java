package Webdriver;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GAME_LIST extends SeleniumBase{
	  
//	GameList - check if all controls are visible	
	@Test
	@Parameters({"xUrl"})
	public void GameList1(String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl);
		assertIsDisplayed(gamelist.GAME_LIST_BOX);
		assertIsDisplayed(gamelist.GAME_LIST_TITLE);
		assertIsDisplayed(gamelist.GAME_LIST_MORE_NEW_GAMES_LINK);
		for (int i = 1; i <= 25; i++){
			assertIsDisplayed(".indexFirstColumn ul li:nth-child(" + i + ") div.gameThumb");
		}		
	}		
	
//	GameList - click "More New Games" link, check if 2 page of New Games was open 
	@Test
	@Parameters({"xUrl"})
	public void GameList2(String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl);
		clickElement(gamelist.GAME_LIST_MORE_NEW_GAMES_LINK);
		sleep(3);
		assertTrue(driver.getCurrentUrl().contains("new,2.html"));
	}		
	
//	GameList - move mouse over each game and check if correct tooltip is visible 
	@Test
	@Parameters({"xUrl"})
	public void GameList3(String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl);
		Actions builder = new Actions(driver); 
		for (int i = 1; i <= 25; i++){
			String tooltip = findElement(".indexFirstColumn ul li:nth-child(" + i + ") div.gameThumb span.description").getAttribute("innerHTML");
			String category = findElement(".indexFirstColumn ul li:nth-child(" + i + ") div.gameThumb span.tooltipHidden:nth-child(3)").getAttribute("innerHTML");
			System.out.println("1 " + i + " " + tooltip);
			System.out.println("1 " + i + " " + category);			
			if ((i % 5 == 0) || ((i + 1) % 5 == 0)){
				builder.moveToElement(findElement(".indexFirstColumn ul li:nth-child(" + i + ") div.gameThumb")).build().perform();
				assertTrue(findElement(gamelist.GAME_LIST_RIGHT_TOOLTIP_BOX).getAttribute("style").contains("block"));
				assertTrue(findElement(gamelist.GAME_LIST_RIGHT_TOOLTIP_TEXT).getAttribute("innerHTML").equals(tooltip));
				assertTrue(findElement(gamelist.GAME_LIST_RIGHT_TOOLTIP_CATEGORY_TEXT).getAttribute("innerHTML").contains(category));
			} else {
				builder.moveToElement(findElement(".indexFirstColumn ul li:nth-child(" + i + ") div.gameThumb")).build().perform();
				assertTrue(findElement(gamelist.GAME_LIST_LEFT_TOOLTIP_BOX).getAttribute("style").contains("block"));
				assertTrue(findElement(gamelist.GAME_LIST_LEFT_TOOLTIP_TEXT).getAttribute("innerHTML").equals(tooltip));
				assertTrue(findElement(gamelist.GAME_LIST_LEFT_TOOLTIP_CATEGORY_TEXT).getAttribute("innerHTML").contains(category));
			}
		}
	}		
}