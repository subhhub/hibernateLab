package stud.subh.hibernate.ex2.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author subh
 * Session Object Provider
 */
public class SessionUtil {

	private static SessionFactory sessionFactory;
	
	//OPTION A
	static{
		Configuration configuration = new Configuration(); 
//		configuration.configure();		//if configuration file in root directory
		configuration.configure("stud/subh/hibernate/ex2/mapping/hibernate.cfg.xml");
		sessionFactory = configuration.buildSessionFactory();
	}
	public static Session getSession(){
		return sessionFactory.openSession();
	}
	
	//OPTION B
	/*static {
        try {
            // Create the SessionFactory from hibernate.cfg.xml
            sessionFactory = new Configuration().configure("stud/subh/hibernate/ex2/mapping/hibernate.cfg.xml").buildSessionFactory();
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
     */
	 
	 //How to use this OPTION B
//	 Session session = HibernateUtil.getSessionFactory().getCurrentSession();
}