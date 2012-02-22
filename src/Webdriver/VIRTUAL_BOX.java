package Webdriver;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runner.RunWith;

@RunWith(BlockJUnit4ClassRunner.class)
public class VIRTUAL_BOX extends SeleniumBase{
	  
//	Virtual Box - games - click first available game image in social games, check url if correct game was open, 
//	click back and click second available game name in social games, check url if correct game was open 	
	@Test
	@Parameters({"xUrl"})
	public void VirtualBox1(String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl);	
		String gameUrl1 = findElement(virtualbox.VIRTUAL_BOX_FIRST_GAME_BOX).getAttribute("href");
		String gameUrl2 = findElement(virtualbox.VIRTUAL_BOX_SECOND_GAME_BOX).getAttribute("href");
		clickElement(virtualbox.VIRTUAL_BOX_FIRST_GAME_IMG);
		sleep(5);
		assertTrue(driver.getCurrentUrl().equals(gameUrl1));
		System.out.println("Open URL");
		driver.get(xUrl);	
		clickElement(virtualbox.VIRTUAL_BOX_SECOND_GAME_TEXT_LINK);
		sleep(5);
		assertTrue(driver.getCurrentUrl().equals(gameUrl2));		
	}
	
//	Virtual Box - games - move mouse over all game images and check if is showing correct tooltip,
//	and next move mouse over all game names and check if is showing correct tooltip  
	@Test
	@Parameters({"xUrl"})
	public void VirtualBox2(String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl);			
		assertIsDisplayed(virtualbox.VIRTUAL_BOX_TITLE);
		findElement(virtualbox.VIRTUAL_BOX_FIRST_GAME_BOX).sendKeys("");		
		Actions builder = new Actions(driver); 
		for (int i = 1; i <= 3; i++){						
			if (i <= 2){
				builder.moveToElement(findElement(".virtualbox ul li:nth-child(" + i + ") div a")).build().perform();
				assertTrue(findElement(virtualbox.VIRTUAL_BOX_LEFT_TOOLTIP_BOX).getAttribute("style").contains("block"));
				assertTrue(findElement(virtualbox.VIRTUAL_BOX_LEFT_TOOLTIP_TEXT).getAttribute("innerHTML").equals(findElement(".virtualbox ul li:nth-child(" + i + ") div span.tooltipHidden").getAttribute("innerHTML")));
			} else {
				builder.moveToElement(findElement(".virtualbox ul li:nth-child(" + i + ") div a")).build().perform();
				assertTrue(findElement(virtualbox.VIRTUAL_BOX_RIGHT_TOOLTIP_BOX).getAttribute("style").contains("block"));
				assertTrue(findElement(virtualbox.VIRTUAL_BOX_RIGHT_TOOLTIP_TEXT).getAttribute("innerHTML").equals(findElement(".virtualbox ul li:nth-child(" + i + ") div span.tooltipHidden").getAttribute("innerHTML")));
			}			
		}	
		for (int i = 1; i <= 3; i++){						
			if (i <= 2){
				builder.moveToElement(findElement(".virtualbox ul li:nth-child(" + i + ") div a span.overflowElement span")).build().perform();
				assertTrue(findElement(virtualbox.VIRTUAL_BOX_LEFT_TOOLTIP_BOX).getAttribute("style").contains("block"));
				assertTrue(findElement(virtualbox.VIRTUAL_BOX_LEFT_TOOLTIP_TEXT).getAttribute("innerHTML").equals(findElement(".virtualbox ul li:nth-child(" + i + ") div span.tooltipHidden").getAttribute("innerHTML")));
			} else {
				builder.moveToElement(findElement(".virtualbox ul li:nth-child(" + i + ") div a span.overflowElement span")).build().perform();
				assertTrue(findElement(virtualbox.VIRTUAL_BOX_RIGHT_TOOLTIP_BOX).getAttribute("style").contains("block"));
				assertTrue(findElement(virtualbox.VIRTUAL_BOX_RIGHT_TOOLTIP_TEXT).getAttribute("innerHTML").equals(findElement(".virtualbox ul li:nth-child(" + i + ") div span.tooltipHidden").getAttribute("innerHTML")));
			}			
		}			
	}	
}