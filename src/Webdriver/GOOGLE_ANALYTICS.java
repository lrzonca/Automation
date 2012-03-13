package Webdriver;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.util.Date;

public class GOOGLE_ANALYTICS extends SeleniumBase{
	long timestamp = new Date().getTime();
	  
	@Test
	@Parameters({"xUrl"})
	public void Google01(String xUrl) throws InterruptedException {
		GA_check(xUrl, "homepage", 600000);
	}
	
	
	@Test
	@Parameters({"xUrl"})
	public void Google02(String xUrl) throws InterruptedException {
		GA_check(xUrl, "categories", 600000);
	}
	
	@Test
	@Parameters({"xUrl"})
	public void Google03(String xUrl) throws InterruptedException {
		GA_check(xUrl, "subcategories", 600000);
	}
	
	@Test
	@Parameters({"xUrl"}) // not done jet
	public void Google04(String xUrl) throws InterruptedException {
		GA_check(xUrl, "games-", 600000);
	}
	
	@Test
	@Parameters({"xUrl"})
	public void Google05(String xUrl) throws InterruptedException {
		GA_check(xUrl, "search", 600000);
	}
	
	@Test
	@Parameters({"xUrl"})
	public void Google06(String xUrl) throws InterruptedException {
		GA_check(xUrl, "staticsites", 600000);
	}
	
	@Test
	@Parameters({"xUrl"})
	public void Google07(String xUrl) throws InterruptedException {
		GA_check(xUrl, "gameshighscore", 600000);
	}
	
	@Test
	@Parameters({"xUrl"})
	public void Google08(String xUrl) throws InterruptedException {
		GA_check(xUrl, "newgames", 600000);
	}
	
	@Test
	@Parameters({"xUrl"})
	public void Google09(String xUrl) throws InterruptedException {
		GA_check(xUrl, "awardgames", 600000);
	}
	
	@Test
	@Parameters({"xUrl"})
	public void Google10(String xUrl) throws InterruptedException {
		GA_check(xUrl, "seosites", 600000);
	}	
	
	@Test
	@Parameters({"xUrl"}) // not done jet
	public void Google11(String xUrl) throws InterruptedException {
		GA_check(xUrl, "userprofile-registrationform", 600000);
	}
	
	@Test
	@Parameters({"xUrl"})
	public void Google12(String xUrl) throws InterruptedException {
		GA_check(xUrl, "flatpages", 600000);
	}
	
	@Test
	@Parameters({"xUrl"})
	public void Google13(String xUrl) throws InterruptedException {
		GA_check(xUrl, "tags", 600000);
	}
}