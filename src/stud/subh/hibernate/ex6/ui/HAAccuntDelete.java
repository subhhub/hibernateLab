package stud.subh.hibernate.ex6.ui;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import stud.subh.hibernate.ex6.dao.Account;
import stud.subh.hibernate.ex6.dao.SessionUtil;

public class HAAccuntDelete {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("**Hibernate Delete Data Application**");
		System.out.println("Please Enter Account No : ");
		int acno = sc.nextInt();
		
		Session session = SessionUtil.getSession();
		
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
	}
}