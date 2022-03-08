package webapp.utils;

import com.google.gson.Gson;

import webapp.http.RequestHttp;
import webapp.models.Product;



public class GenerateModel {

	private final static Gson gson = new Gson();

	

/*
 * This method create a array of Product object and retrun that
 * 
 * @return Product[]
 * 
 * */
	
	public static Product[] getModel() {
		
		String urlData = RequestHttp.fetchData();

		Product[] product = gson.fromJson(urlData, Product[].class);
		
		return product;
		
	}
	

	
}
