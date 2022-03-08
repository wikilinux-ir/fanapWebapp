package webapp.service;

import java.util.List;

import webapp.dao.ProductDao;
import webapp.dao.ProductDaoMapImpl;
import webapp.models.Product;

public class ProductServiceMapImpl implements ProductService {

	private ProductDao productDao = new ProductDaoMapImpl();
	
	@Override
	public List<Product> getProducts() {
		
		return productDao.getProducts();

	}
	
	@Override
	public void createProduct(Product[] products) {
		
		productDao.createProduct(products);
		
	}
	
}
