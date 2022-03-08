package webapp.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static SessionFactory sessionFactory= null;
	

	// create sessionFactory object and assign to sessionFactory
	public static void createSessionFactory() {
		
		Configuration configuration = new Configuration();
		configuration.configure();
		sessionFactory = configuration.buildSessionFactory(); 
		 
	}
	
	
	//return session factory 
	
	
	public static SessionFactory getSessionFactory() {
		
		if (sessionFactory==null) {
			createSessionFactory();
		}
	
		return sessionFactory;
	
	}
}
