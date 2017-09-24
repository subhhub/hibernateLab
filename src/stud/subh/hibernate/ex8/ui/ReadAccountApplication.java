package stud.subh.hibernate.ex8.ui;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;

import stud.subh.hibernate.ex8.dao.SessionUtil;

public class ReadAccountApplication {
	public static void main(String[] args) {
		System.out.println("**HQL Read All Record (Positionl/named Parameter) Application**");

		Session session = SessionUtil.getSession();
		
		System.out.println("Please enter Account No : ");
		Scanner sc = new Scanner(System.in);
		int acc = sc.nextInt();
		
//		String hql = "SELECT a FROM Account a where a.accountno=?";		//Positional Parameter
		String hql = "SELECT a FROM Account a where a.accountno=:acc";		//named Parameter
		Query qry = session.createQuery(hql);
//		qry.setParameter(0, acc);
		qry.setParameter("acc", acc);
		
		List<Account>account = qry.list();
		for(Account a:account){
			System.out.println(a.getAccountno()+" "+a.getName()+" "+a.getBalance());
		}
	}
}