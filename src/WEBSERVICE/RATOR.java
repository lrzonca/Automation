package WEBSERVICE;

import junit.framework.Assert;
import org.testng.annotations.Test;

public class RATOR extends WEBSERVICE_SELENIUM_BASE {
	
	@Test
	/* Basic and General Test
	 * checking if in response from service is not visible any error message
	 */
	public void TC_01() throws Throwable{
		SendGetRequest(Rator_Endpoint + "/rt/mn/2/average/90/1/0?outputtype=xml");
		Assert.assertEquals(false, SendGetRequestResult.contains("errorcode"));
	}		
}