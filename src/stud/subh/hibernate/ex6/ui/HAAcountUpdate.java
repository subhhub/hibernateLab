package stud.subh.hibernate.ex6.ui;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import stud.subh.hibernate.ex1.dao.Account;
import stud.subh.hibernate.ex6.dao.SessionUtil;

public class HAAcountUpdate {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("**Hibernate Update Data Application**");
		System.out.println("Please Enter Account No : ");
		int acno = sc.nextInt();
		System.out.println("Please Enter Update Account : ");
		float bal = sc.nextFloat();
		
		Session session = SessionUtil.getSession();
		
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
	}
}