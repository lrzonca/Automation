package WEBSERVICE;

import junit.framework.Assert;
import org.testng.annotations.Test;

public class ALERTAR extends WEBSERVICE_SELENIUM_BASE {
	
	@Test
	/* Basic and General Test
	 * checking if in response from service is not visible any error message
	 */
	public void TC_01() throws Throwable{
		SendGetRequest(Alertar_Endpoint + "/al/mn/1/alerts?outputtype=xml");
		Assert.assertEquals(false, SendGetRequestResult.contains("errorcode"));
	}		
}