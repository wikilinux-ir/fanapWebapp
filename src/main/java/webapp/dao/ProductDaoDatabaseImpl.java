package webapp.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Session;

import webapp.models.Product;
import webapp.utils.HibernateUtil;

public class ProductDaoDatabaseImpl implements ProductDao {

	private final Session session = HibernateUtil.getSessionFactory().openSession();
	@Override
	public void createProduct(Product[] products) {

		Session session = this.session;
		
		for(Product product:products) {
			
			session.beginTransaction();
			session.save(product);
			session.getTransaction().commit();
		}
		
	}
	
	@Override
	public List<Product> getProducts() {

		Session session = this.session;

		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<Product> criteriaQuery = criteriaBuilder.createQuery(Product.class);
		criteriaQuery.from(Product.class);
		List<Product> products = session.createQuery(criteriaQuery).getResultList();
		
		return products;
		
	}
	
}
