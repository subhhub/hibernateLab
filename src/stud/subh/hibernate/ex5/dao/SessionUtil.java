package stud.subh.hibernate.ex5.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author subh
 * Session Object Provider
 */
public class SessionUtil {

	private static SessionFactory sessionFactory;
	private static ThreadLocal<Session> threadLocal;
	
	static{
		Configuration configuration = new Configuration(); 
//		configuration.configure();		//if configuration file in root directory
		configuration.configure("stud/subh/hibernate/ex5/mapping/hibernate.cfg.xml");
		sessionFactory = configuration.buildSessionFactory();
		threadLocal = new ThreadLocal<Session>();
	}
	public static Session getSession(){
		return sessionFactory.openSession();
	}
	public static Session getThreadLocalSession(){

		Session session = threadLocal.get();
		if(session==null){
			session = sessionFactory.openSession();
			threadLocal.set(session);
		}
		return session;
	}
}