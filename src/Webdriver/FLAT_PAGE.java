package Webdriver;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.util.Date;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runner.RunWith;

@RunWith(BlockJUnit4ClassRunner.class)
public class FLAT_PAGE extends SeleniumBase{
	long timestamp = new Date().getTime();
	  
	@Test
	@Parameters({"xUrl"})
	public void Flat1(String xUrl) throws InterruptedException {
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(5);
		clickElement(footer.TERMS_OF_USE);
		sleep(5);
		assertIsDisplayed(flatPage.FLAT_PAGE_HEADER);
		assertIsDisplayed(flatPage.FLAT_PAGE_CONTAINER);
		assertIsDisplayed(flatPage.FLAT_PAGE_ADVERT);
	}
}