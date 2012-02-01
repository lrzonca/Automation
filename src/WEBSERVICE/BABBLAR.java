package WEBSERVICE;

import junit.framework.Assert;
import org.testng.annotations.Test;

public class BABBLAR extends WEBSERVICE_SELENIUM_BASE {
	
	@Test
	/* Basic and General Test
	 * checking if in response from service is not visible any error message
	 */
	public void TC_01() throws Throwable{
		SendGetRequest(Babblar_Endpoint + "/bb/mn/1/draft/2?outpyttype=xml");
		Assert.assertEquals(false, SendGetRequestResult.contains("errorcode"));
	}		
}