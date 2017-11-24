package stud.subh.hibernate.ex1.ui;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import stud.subh.hibernate.ex1.dao.Account;

public class HibernateApplicationRead {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("**Hibernate Read Data Application**");
		System.out.println("Please Enter Account No : ");
		int acno = sc.nextInt();
		
		Configuration configuration = new Configuration();
//		configuration.configure();		//if configuration file in root directory
		configuration.configure("stud/subh/hibernate/ex1/mapping/hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
//		Session session = sessionFactory.openSession();
		Session session = sessionFactory.getCurrentSession();
		
		Transaction tx = session.beginTransaction();
		Account account = (Account)session.get(Account.class, acno);
//		Account account = (Account)session.load(Account.class, acno);	
		tx.commit();
		
		//Reading
		if(account!=null){
			System.out.println(account.getAcno());
			System.out.println(account.getNm());
			System.out.println(account.getBal());
		}
		else
			System.out.println("Account Dont Exist");
		
//		session.close();
//		session.clear();
//		sessionFactory.close();
		
		Session session2 = sessionFactory.getCurrentSession();
		session2.beginTransaction().begin();
		Query qry = session2.createQuery("select a from Account a");
		qry.setFirstResult(2);
		qry.setMaxResults(2);
		List ls = qry.list();
		session2.beginTransaction().commit();
		System.out.println("size "+ls.size());
		
	}
}