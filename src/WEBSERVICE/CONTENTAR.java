package WEBSERVICE;

import junit.framework.Assert;
import org.testng.annotations.Test;

public class CONTENTAR extends WEBSERVICE_SELENIUM_BASE {
	
	@Test
	/* Basic and General Test
	 * checking if in response from service is not visible any error message
	 */
	public void TC_01() throws Throwable{
		SendGetRequest(Contentar_Endpoint + "/cn/mn/1/itemtypes?outputtype=xml");
		Assert.assertEquals(false, SendGetRequestResult.contains("errorcode"));
	}		
}