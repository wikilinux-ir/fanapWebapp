package webapp.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import webapp.models.Product;
import webapp.service.ProductService;
import webapp.service.ProductServiceDatabaseImpl;
import webapp.service.ProductServiceMapImpl;
import webapp.utils.GenerateModel;

@WebServlet("/getProduct")
public class GetProduct extends HttpServlet{

	
	private final static Long CACHE_TIME_EXPIRE = 2 * 3600000L;
	private static Long LAST_TIME = 0L ;
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		// read cache system type from init params 
		String selectCache = request.getServletContext().getInitParameter("cache-system").toUpperCase();
		
		
		// check if cache time expire , retireve data from the server.in the first run, information will be received from the server
		if (LAST_TIME < System.currentTimeMillis()) {

			
			switch (selectCache) {
			case "DB":
				setCacheInDB();
				break;
			case "MAP":
				setCacheInMap();
				break;
			default:
				break;
			}
			// set new expire cache time
			LAST_TIME = CACHE_TIME_EXPIRE + System.currentTimeMillis();
			
			
		}else {
			
			switch (selectCache) {
			case "DB":
				getCacheFromDB();
				break;
			case "MAP":
				GetCacheFromMap();
				break;
			default:
				break;
			}
			
		}
		
		
	}
	
	// read products from DB cache
	
	public void getCacheFromDB() {
		
		ProductService productService = new ProductServiceDatabaseImpl();
		List<Product> products = productService.getProducts();
		System.out.println("from DB cache");
		int counter = 1;
		for(Product product:products) {
			System.out.println("Product "+counter++ +":");
			System.out.println(product.toString());
		}
	}
	
	public void setCacheInDB() {
		
		Product[] products = GenerateModel.getModel();
		
		ProductService productService = new ProductServiceDatabaseImpl();
		
		productService.createProduct(products);
		System.out.println("from server");
		int counter = 1;
		for(Product product:products) {
			System.out.println("Product "+counter++ +":");
			System.out.println(product.toString());
		
		}
		
		
	}
	
	
	// set received data from the server on map Cache
	
	public void setCacheInMap() {
		
		ProductService productService = new ProductServiceMapImpl();
		
		Product[] products = GenerateModel.getModel();
		productService.createProduct(products);
		System.out.println("from server");
		int counter = 1;
		for(Product product:products) {
			System.out.println("Product "+counter++ +":");
			System.out.println(product.toString());
		
		}
		
	}
	
	
	// read products from Map cache

	public void GetCacheFromMap() {
		
		ProductService productService = new ProductServiceMapImpl();
		List<Product> products = productService.getProducts();
		System.out.println("from Map cache");
		int counter = 1;
		for(Product product:products) {
			System.out.println("Product "+counter++ +":");
			System.out.println(product.toString());
		}
		
	}
	
	
}
