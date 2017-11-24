package stud.subh.hibernate.ex1.ui;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import stud.subh.hibernate.ex1.dao.Account;
import stud.subh.hibernate.ex1.dao.AccountAuto;

public class HibernateApplicationSave {

	public static void main(String[] args) {
		
		HibernateApplicationSave has = new HibernateApplicationSave();
//		has.optionA();
		has.optionB();
		
	}
	
	public void optionA(){
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
		configuration.configure("stud/subh/hibernate/ex1/mapping/hibernate.cfg.xml");
//		configuration.configure("stud/subh/hibernate/ex1/mapping/hibernateMySQL.cfg.xml");
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
//		sessionFactory.close();
	}
	
	public void optionB(){
		Scanner sc = new Scanner(System.in);
		System.out.println("**Hibernate Save Data Application**");
		System.out.println("Please Enter Account No : ");
		int acno = sc.nextInt();
		System.out.println("Please Enter Account name : ");
		String nm = sc.next();
		System.out.println("Please Enter Account email : ");
		String em = sc.next();
		System.out.println("Please Enter Account Balance : ");
		float bal = sc.nextFloat();
		
		Configuration configuration = new Configuration();
		configuration.configure("stud/subh/hibernate/ex1/mapping/hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		//Save Operation
		AccountAuto account = new AccountAuto();
		account.setAcno(acno);
		account.setNm(nm);
		account.setEmail(em);
		account.setBal(bal);
		
		Transaction txn = session.beginTransaction();
		session.save(account);
		txn.commit();
		System.out.println("Record Saved Successfully");
		
		session.clear();
//		sessionFactory.close();
	}
}