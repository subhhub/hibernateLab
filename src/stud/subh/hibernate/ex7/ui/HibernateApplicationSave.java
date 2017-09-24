package stud.subh.hibernate.ex7.ui;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import stud.subh.hibernate.ex7.dao.Account;

public class HibernateApplicationSave {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("**Hibernate Save Data Application**");
		System.out.println("Please Enter Account No : ");
		int acno = sc.nextInt();
		System.out.println("Please Enter Account name : ");
		String nm = sc.next();
		System.out.println("Please Enter Account Balance : ");
		float bal = sc.nextFloat();
		
		Configuration configuration = new Configuration();
//		configuration.configure();		//if configuration file in root directory with default configuration file name(hibernate.cfg.xml)
		configuration.configure("stud/subh/hibernate/ex7/mapping/hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		//Save Operation
		Account account = new Account();
		account.setAcno(acno);
		account.setNm(nm);
		account.setBal(bal);
		
		Transaction txn = session.beginTransaction();
		session.save(account);
		txn.commit();
		System.out.println("Record Saved Successfully");
		
		session.clear();
		sessionFactory.close();
	}
}