package Webdriver;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.util.Date;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.junit.runner.RunWith;

@RunWith(BlockJUnit4ClassRunner.class)
public class FLAT_PAGE extends SeleniumBase{
	long timestamp = new Date().getTime();
	  
	@Test
	@Parameters({"xUrl"})
	public void Flat1(String xUrl) throws InterruptedException {
		driver.get(xUrl);
		Thread.sleep(2000);
		WebElement TermsOfUse = driver.findElement(By.cssSelector(Webdriver.mappings.footer.TERMS_OF_USE));
		TermsOfUse.click();
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.flatPage.FLAT_PAGE_HEADER)).isDisplayed());
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.flatPage.FLAT_PAGE_CONTAINER)).isDisplayed());
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.flatPage.FLAT_PAGE_ADVERT)).isDisplayed());
	}
}

