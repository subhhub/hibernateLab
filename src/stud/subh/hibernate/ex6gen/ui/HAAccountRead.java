package stud.subh.hibernate.ex6gen.ui;

import java.util.Scanner;

import org.hibernate.Session;

import stud.subh.hibernate.ex6.dao.Account;
import stud.subh.hibernate.ex6.dao.SessionUtil;

public class HAAccountRead {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("**Hibernate Read Data Application**");
		System.out.println("Please Enter Account No : ");
		int acno = sc.nextInt();
		
		Session session = SessionUtil.getSession();
		
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
	}
}