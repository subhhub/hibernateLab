package stud.subh.hibernate.ex2.dao;

import java.util.logging.Logger;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	static final Logger logger = Logger.getLogger(HibernateUtil.class.getName());

	private static final SessionFactory sessionFactory = buildSessionFactory();

	private HibernateUtil() {
	    throw new IllegalStateException("Utility class");
	}
	
	private static SessionFactory buildSessionFactory() {
		try {

			/*SessionFactory sessionFactory = new Configuration()
					.configure("/com/mkyong/persistence/hibernate.cfg.xml")
					.addResource("com/mkyong/common/Stock.hbm.xml")
					.buildSessionFactory();*/

			return  new Configuration()
					.configure("/com/mkyong/persistence/hibernate.cfg.xml")
					.addResource("com/mkyong/common/Stock.hbm.xml")
					.buildSessionFactory();

		} catch (HibernateException ex) {
			// Make sure you log the exception, as it might be swallowed
			logger.warning("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public static void shutdown() {
		// Close caches and connection pools
		getSessionFactory().close();
	}

}