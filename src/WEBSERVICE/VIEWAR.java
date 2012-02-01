package WEBSERVICE;

import junit.framework.Assert;
import org.testng.annotations.Test;

public class VIEWAR extends WEBSERVICE_SELENIUM_BASE {
	
	@Test
	/* Basic and General Test
	 * checking if in response from service is not visible any error message
	 */
	public void TC_01() throws Throwable{
		SendGetRequest(Viewar_Endpoint + "/vw/rp/1/items/90?outputtype=xml");
		Assert.assertEquals(false, SendGetRequestResult.contains("errorcode"));
	}		
}