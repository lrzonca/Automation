package Webdriver;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runner.RunWith;

@RunWith(BlockJUnit4ClassRunner.class)
public class SEARCH extends SeleniumBase{
	  
//	Search - search game "pet party", check controls if are present and if correct game is visible	
	@Test
	@Parameters({"xUrl"})
	public void Search1(String xUrl) throws InterruptedException {
		String search = "Pet Party";
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(5);
		insertData(header.SEARCH_TEXTFIELD, search);
		clickElement(header.SEARCH_BUTTON);
		sleep(5);
		assertIsDisplayed(searchpage.WHOLE_SEARCH_LIST);
		assertIsDisplayed(searchpage.SEARCH_LIST);
		assertTrue(findElement(searchpage.SEARCH_LIST).getAttribute("innerHTML").contains(search));
	}	
	
//	Search - search "cat", check if search text is present, store first game name, click next and compare if first game from current page is different then from previous
//	continue action till next btn is available, and next do the same actions for previous btn	
	@Test
	@Parameters({"xUrl"})
	public void Search2(String xUrl) throws InterruptedException {
		String search = "cat";
		int i = 1, j = 1;		
		String[] table = new String[100];
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(5);
		insertData(header.SEARCH_TEXTFIELD, search);
		clickElement(header.SEARCH_BUTTON);
		sleep(5);
		assertIsDisplayed(searchpage.WHOLE_SEARCH_LIST);
		assertIsDisplayed(searchpage.SEARCH_LIST);		
		while (findElement(searchpage.NEXT_BUTTON).getAttribute("innerHTML").contains("a href")){
			table[i] = findElement(searchpage.FIRST_GAME_NAME).getText();
			assertTrue(findElement(searchpage.SEARCH_LIST).getAttribute("innerHTML").contains(search));	
			i++;
			clickElement(searchpage.NEXT_BUTTON);
			table[i] = findElement(searchpage.FIRST_GAME_NAME).getText();
			assertTrue(findElement(searchpage.SEARCH_LIST).getAttribute("innerHTML").contains(search));
			assertNotSame(table[i], table[j]);
			j++;
		}	
		i = 1;
		j = 1;
		while (findElement(searchpage.PREVIOUS_BUTTON).getAttribute("innerHTML").contains("a href")){
			table[i] = findElement(searchpage.FIRST_GAME_NAME).getText();
			assertTrue(findElement(searchpage.SEARCH_LIST).getAttribute("innerHTML").contains(search));	
			i++;
			clickElement(searchpage.PREVIOUS_BUTTON);
			table[i] = findElement(searchpage.FIRST_GAME_NAME).getText();
			assertTrue(findElement(searchpage.SEARCH_LIST).getAttribute("innerHTML").contains(search));
			assertNotSame(table[i], table[j]);
			j++;
		}		
	}
	
//	Search - search "asgyiedhnasjkem", check controls if are present and if nothing was founded	
	@Test
	@Parameters({"xUrl"})
	public void Search3(String xUrl) throws InterruptedException {
		String search = "asgyiedhnasjkem";
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(5);
		insertData(header.SEARCH_TEXTFIELD, search);
		clickElement(header.SEARCH_BUTTON);
		sleep(5);
		assertIsDisplayed(searchpage.NO_RESULTS_BOX);
		assertIsDisplayed(searchpage.NO_RESULTS_GAMELIST);
		assertIsDisplayed(searchpage.NO_RESULTS_SEARCH_TEXTBOX);		
		assertIsDisplayed(searchpage.NO_RESULTS_SUGGESTION);		
		assertIsDisplayed(searchpage.NO_RESULTS_TEXT);
		assertIsDisplayed(searchpage.NO_RESULTS_TITLE);		
	}	
}