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
		System.out.println("Open URL");
		driver.get(xUrl);
		sleep(5);
		System.out.println("Find Element TERMS_OF_USE");
		WebElement TermsOfUse = driver.findElement(By.cssSelector(Webdriver.mappings.footer.TERMS_OF_USE));
		System.out.println("Click Element TERMS_OF_USE");
		TermsOfUse.click();
		System.out.println("Assertion");
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.flatPage.FLAT_PAGE_HEADER)).isDisplayed());
		System.out.println("Assertion");
		AssertTrue(driver.findElement(By.id(Webdriver.mappings.flatPage.FLAT_PAGE_CONTAINER)).isDisplayed());
		System.out.println("Assertion");
		AssertTrue(driver.findElement(By.cssSelector(Webdriver.mappings.flatPage.FLAT_PAGE_ADVERT)).isDisplayed());
	}
}