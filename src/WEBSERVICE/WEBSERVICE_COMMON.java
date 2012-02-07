package WEBSERVICE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

import com.thoughtworks.selenium.Selenium;

public class WEBSERVICE_COMMON {
	public static Selenium selenium;		
	public String TestCaseName, TestCaseRunDate, SendGetRequestResult;
	String Alertar_Endpoint = "http://api.alertar.org";
	String Babblar_Endpoint = "http://api.babblar.org";
	String Configar_Endpoint = "http://api.configar.org";
	String Contentar_Endpoint = "http://api.contentar.org";
	String Filtar_Endpoint = "http://api.filtar.org";
	String Hyscor_Endpoint = "http://api.stg.hyscor.org";
	String Locatar_Endpoint = "http://api.locatar.org";
	String Profilar_Endpoint = "http://stg.pl.girlsgogames.com/pr/pb/1/";
	String Rator_Endpoint = "http://api.rator.org";
	String Reportar_Endpoint = "http://api.reportar.org";
	String Viewar_Endpoint = "http://api.viewar.org";
	
	
	public void SendGetRequest(String service_url) throws IOException {
		try {		
			URL url = new URL(service_url);
			URLConnection conn = url.openConnection();
			HttpURLConnection httpConnection = (HttpURLConnection) conn;

			String code = Integer.toString(httpConnection.getResponseCode());
			System.out.println("code " + code);
			System.out.println("url.toString() " + url.toString());

			// Get the response
			BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			StringBuffer response = new StringBuffer();
			String line;
			while ((line = br.readLine()) != null) {
				response.append(line);
				response.append("\n");
			}
			br.close();
			SendGetRequestResult = response.toString();	
			System.out.println("\nResponse = " + SendGetRequestResult + "\n");
		} catch (Exception e) {}	
	}	
	
	
	public void SendProfilarRequest(String service_request, String service_url) throws IOException {
		try {
			HttpURLConnection con = (HttpURLConnection) new URL(service_url).openConnection();
			con.setConnectTimeout(7000);
			con.setReadTimeout(7500);
			con.setDoOutput(true);
			con.setRequestMethod("POST");

			con.getOutputStream().write(service_request.getBytes("UTF-8"));
			InputStream inputStream = con.getInputStream();

			BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));

			StringBuilder response = new StringBuilder();
			String line = null;

			while ((line = br.readLine()) != null) {
				response.append(line);
				response.append("\n");
			}
			br.close();
			SendGetRequestResult = response.toString();
			System.out.println("\nResponse:" + SendGetRequestResult + "\n");
		} catch (Exception e) {}		
	}		
}