package webapp.dao;

import java.util.List;

import webapp.models.Product;

public interface ProductDao {

	List<Product> getProducts();
	void createProduct(Product[] products);
	
}
