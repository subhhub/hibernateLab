package stud.subh.hibernate.cache2.ui;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import stud.subh.hibernate.cache2.dao.Employee;

public class SecondLevelCacheApplication {
	public static void main(String[] args) {
		
		System.out.println("Cache Level 2 Applicatin ");
	
		SecondLevelCacheApplication sla = new SecondLevelCacheApplication();
//		sla.normalSecondLevelCache();
		sla.queryCache();
		
	}
	
	public void normalSecondLevelCache(){
		Configuration cfg = new Configuration();
		cfg.configure("stud/subh/hibernate/cache2/mapping/hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session1 = factory.openSession();
		
		Employee emp1 = (Employee) session1.get(Employee.class, 1);
		System.out.println(emp1.getId() + " " + emp1.getName() + " " + emp1.getSalary());
		session1.close();

		Session session2 = factory.openSession();
		Employee emp2 = (Employee) session2.get(Employee.class, 1);
		System.out.println(emp2.getId() + " " + emp2.getName() + " " + emp2.getSalary());
		session2.close();
	}
	
	public void queryCache(){
		Configuration cfg = new Configuration();
		cfg.configure("stud/subh/hibernate/cache2/mapping/hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session1 = factory.openSession();
		
		Query qry = session1.createQuery("from Employee");
		qry.setCacheable(true);
		List ls = qry.list();
		System.out.println("first query "+ls.size());
		session1.close();

		Session session2 = factory.openSession();
		Query qry1 = session2.createQuery("from Employee");
		qry1.setCacheable(true);
		List ls1 = qry1.list();
		System.out.println("second query "+ls1.size());
		session2.close();
	}
}
