package webapp.service;

import java.util.List;

import webapp.models.Product;

public interface ProductService {

	List<Product> getProducts();
	void createProduct(Product[] products);
}
