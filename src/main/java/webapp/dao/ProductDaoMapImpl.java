package webapp.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import webapp.models.Product;

public class ProductDaoMapImpl implements ProductDao {
	
	private static Map<Integer, Product> map = new HashMap<>();

	@Override
	public List<Product> getProducts() {

		List<Product> products = new ArrayList<>();
		for(Map.Entry<Integer, Product> entry:map.entrySet()) {
			
			products.add(entry.getValue());
		}
		
		return products;
	}

	@Override
	public void createProduct(Product[] products) {
		
		Integer counter = map.size()+1;
		
		for(Product product : products) {
			
			map.put(counter++, product);
			
		}
		
		
		
	}

}
