package stud.subh.hibernate.o2obipkfk.dao;

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
		configuration.configure("stud/subh/hibernate/o2obipkfk/mapping/hibernate.cfg.xml");
		sessionFactory = configuration.buildSessionFactory();
	}
	public static Session getSession(){
		return sessionFactory.openSession();
	}
}