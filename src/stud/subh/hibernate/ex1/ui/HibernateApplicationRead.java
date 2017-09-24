package stud.subh.hibernate.ex1.ui;

import java.util.Scanner;

import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

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
		Session session = sessionFactory.openSession();
		
		Account account = (Account)session.get(Account.class, acno);
		
		//Reading
		if(account!=null){
			System.out.println(account.getAcno());
			System.out.println(account.getNm());
			System.out.println(account.getBal());
		}
		else
			System.out.println("Account Dont Exist");
		
		session.clear();
		sessionFactory.close();
	}
}