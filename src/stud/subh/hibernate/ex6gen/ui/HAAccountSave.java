package stud.subh.hibernate.ex6gen.ui;

import java.io.Serializable;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import stud.subh.hibernate.ex6gen.dao.Loan;
import stud.subh.hibernate.ex6gen.dao.SessionUtil;

public class HAAccountSave {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("**Hibernate Save Data (Using User Define Generator) Application**");
//		System.out.println("Please Enter Account No : ");
//		int lnid = sc.nextInt();
		System.out.println("Please Enter loan name : ");
		String nm = sc.next();
		System.out.println("Please Enter loan amount : ");
		float amnt = sc.nextFloat();
		
		Session session = SessionUtil.getSession();
		
		//Save Operation
		Loan ln = new Loan();
//		ln.setLoanID(lnid);
		ln.setName(nm);
		ln.setAmount(amnt);
		
		Transaction txn = session.beginTransaction();
		Serializable rid = session.save(ln);
		txn.commit();
		System.out.println("Record Persisted Successfully with ID : "+rid);
		
		session.clear();
	}
}


