package WEBSERVICE;

import junit.framework.Assert;
import org.testng.annotations.Test;

public class SOCIAL_GATEWAY extends WEBSERVICE_SELENIUM_BASE {
	
	@Test
	/* Basic and General Test
	 * checking if in response from service is not visible any error message
	 */
	public void TC_01() throws Throwable{
		SendGetRequest("http://www.girlsgogames.com/sg/pb/1/2/79/login?params={%22token%22%3A%22%22%2C%22guest%22%3Atrue%2C%22ttl%22%3A0%2C%22hash%22%3Anull}");
		Assert.assertEquals(true, SendGetRequestResult.contains("\"code\":200"));
	}		
}