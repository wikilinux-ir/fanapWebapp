package webapp.http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class RequestHttp {
	
	
	/*
	 * 
	 * This method retireve data from server 
	 * 
	 * @return		json String
	 * 
	 * */
	public static String fetchData() {
		
		//define objects
		URL url = null;
		InputStream input = null;
		StringBuilder response = new StringBuilder();

		
		try {
			
			
			url = new URL("http://85.133.232.226:12561/appStore/restAPI/spring/service/getAllProducts?from=0&count=10");
			
			// create connecttion and set header
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestProperty("OSTYPE", "ANDROID");

			// check returned status code if status code < 100 or status code > 399 get std err else get std input stream
			int statusCode = connection.getResponseCode();

			if (statusCode >= 100 && statusCode <= 399) {
				input = connection.getInputStream();
			}else {
				input = connection.getErrorStream();
			}
			
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(input));
			
			// read data and append to response 
			String currentLine ;
			while((currentLine = reader.readLine()) != null)
			{
				response.append(currentLine);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		return response.toString();
	}

	
}
