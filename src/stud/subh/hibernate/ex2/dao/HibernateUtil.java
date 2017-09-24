package stud.subh.hibernate.ex2.dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static final SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		try {

			SessionFactory sessionFactory = new Configuration()
					.configure("/com/mkyong/persistence/hibernate.cfg.xml")
					.addResource("com/mkyong/common/Stock.hbm.xml")
					.buildSessionFactory();

			return sessionFactory;

		} catch (Throwable ex) {
			// Make sure you log the exception, as it might be swallowed
			System.err.println("Initial SessionFactory creation failed." + ex);
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