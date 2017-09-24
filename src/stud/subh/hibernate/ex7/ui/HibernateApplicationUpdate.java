package stud.subh.hibernate.ex7.ui;

import java.util.Scanner;

import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import stud.subh.hibernate.ex7.dao.Account;

public class HibernateApplicationUpdate {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("**Hibernate Update Data Application**");
		System.out.println("Please Enter Account No : ");
		int acno = sc.nextInt();
		System.out.println("Please Enter Update Account : ");
		float bal = sc.nextFloat();
		
		Configuration configuration = new Configuration();
//		configuration.configure();		//if configuration file in root directory
		configuration.configure("stud/subh/hibernate/ex7/mapping/hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Account account = (Account)session.get(Account.class, acno);
		
		//Update Section
		if(account==null)
			System.out.println("Account Dont Exist");
		else{
			Transaction txn = session.beginTransaction();
			account.setBal(account.getBal()+bal);			//no method only changing the object state (it is schynchronizing with object and database)
			txn.commit();
			System.out.println("Balance Update Sucessfully");
		}

		session.clear();
		sessionFactory.close();
	}
}