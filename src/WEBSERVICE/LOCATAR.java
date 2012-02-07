package WEBSERVICE;

import junit.framework.Assert;
import org.testng.annotations.Test;

public class LOCATAR extends WEBSERVICE_SELENIUM_BASE {
	
	@Test
	/* Basic and General Test
	 * checking if in response from service is not visible any error message
	 */
	public void TC_01() throws Throwable{
		SendGetRequest(Locatar_Endpoint + "/lc/pb/1/country?outputtype=xml");
		Assert.assertEquals(false, SendGetRequestResult.contains("errorcode"));
	}		
}