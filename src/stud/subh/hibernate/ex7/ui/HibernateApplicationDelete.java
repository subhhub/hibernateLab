package stud.subh.hibernate.ex7.ui;

import java.util.Scanner;

import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import stud.subh.hibernate.ex7.dao.Account;

public class HibernateApplicationDelete {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("**Hibernate Delete Data Application**");
		System.out.println("Please Enter Account No : ");
		int acno = sc.nextInt();
		
		Configuration configuration = new Configuration();
//		configuration.configure();		//if configuration file in root directory
		configuration.configure("stud/subh/hibernate/ex1/mapping/hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Account account = (Account)session.get(Account.class, acno);
		
		//Delete Section
		if(account==null)
			System.out.println("Account Dont Exist");
		else{
			Transaction txn = session.beginTransaction();
			session.delete(account);
			txn.commit();
			System.out.println("Deleted Sucessfully");
		}
		
		session.clear();
		sessionFactory.close();
	}
}