package WEBSERVICE;

import junit.framework.Assert;
import org.testng.annotations.Test;

public class FILTAR extends WEBSERVICE_SELENIUM_BASE {
	
	@Test
	/* Basic and General Test
	 * checking if in response from service is not visible any error message
	 */
	public void TC_01() throws Throwable{
		SendGetRequest(Filtar_Endpoint + "/fl/mn/1/bl_list/3?outputtype=xml");
		Assert.assertEquals(false, SendGetRequestResult.contains("errorcode"));
	}		
}