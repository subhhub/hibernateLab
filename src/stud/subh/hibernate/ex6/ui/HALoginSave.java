package stud.subh.hibernate.ex6.ui;

import java.io.Serializable;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import stud.subh.hibernate.ex6.dao.Login;
import stud.subh.hibernate.ex6.dao.SessionUtil;

public class HALoginSave {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("**Hibernate Application : Save Login Info **");
		System.out.println("Please Enter Login : ");
		String loginID = sc.next();
		System.out.println("Please Enter Password : ");
		String pass = sc.next();
		System.out.println("Please Enter Email : ");
		String email = sc.next();
		
		Session session = SessionUtil.getSession();
		
		//Save Operation
		Login login = new Login();
		login.setLoginID(loginID);
		login.setPassword(pass);
		login.setEmailID(email);
		
		Transaction txn = session.beginTransaction();
		Serializable lid = session.save(login);
		txn.commit();
		System.out.println("Login Created Successfully with LoginID : "+lid);
		
	}
}