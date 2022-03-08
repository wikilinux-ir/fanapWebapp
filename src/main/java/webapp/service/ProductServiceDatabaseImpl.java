package webapp.service;

import java.util.List;

import webapp.dao.ProductDao;
import webapp.dao.ProductDaoDatabaseImpl;
import webapp.models.Product;

public class ProductServiceDatabaseImpl implements ProductService {

	private ProductDao productDao = new ProductDaoDatabaseImpl();
	
	@Override
	public List<Product> getProducts() {
		
		return productDao.getProducts();

	}
	
	@Override
	public void createProduct(Product[] products) {
		
		productDao.createProduct(products);
		
	}
	
}
