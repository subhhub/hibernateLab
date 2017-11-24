package stud.subh.hibernate.cache2.ui;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import stud.subh.hibernate.cache2.dao.Employee;

public class StoreTest {
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("stud/subh/hibernate/cache2/mapping/hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();

		session.persist(new Employee("Rahul", 50000));
		session.persist(new Employee("Ajay", 70000));
		session.persist(new Employee("umesh", 70000));

		tx.commit();
		
		System.out.println("Data Saved");
		
		session.close();
	}
}
