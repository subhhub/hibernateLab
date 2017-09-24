package stud.subh.hibernate.ex6.ui;

import java.io.Serializable;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import stud.subh.hibernate.ex6.dao.Account;
import stud.subh.hibernate.ex6.dao.SessionUtil;

public class HAAccountSave {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("**Hibernate Save Data (Using Generator) Application**");
//		System.out.println("Please Enter Account No : ");
//		int acno = sc.nextInt();
		System.out.println("Please Enter Account name : ");
		String nm = sc.next();
		System.out.println("Please Enter Account Balance : ");
		float bal = sc.nextFloat();
		
		Session session = SessionUtil.getSession();
		
		//Save Operation
		Account account = new Account();
//		account.setAcno(acno);
		account.setNm(nm);
		account.setBal(bal);
		
		Transaction txn = session.beginTransaction();
		Serializable rid = session.save(account);
		txn.commit();
		System.out.println("Record Saved Successfully with ID : "+rid);
		
		session.clear();
	}
}