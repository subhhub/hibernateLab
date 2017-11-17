package stud.subh.hibernate.ex9.ui;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import stud.subh.hibernate.ex9.dao.SessionUtil;

public class ListMethodApplication {
	public static void main(String[] args) {
		System.out.println("**HQL Diff List Methods Application**");

		Session session = SessionUtil.getSession();
		
		String hql1 = "SELECT a FROM Account a";		
		String hql2 = "SELECT a.name FROM Account a";
		String hql3 = "SELECT a.balance FROM Account a";
		String hql4 = "SELECT a.name, a.balance FROM Account a";
		
		Query qry = session.createQuery(hql1);
		List<Account>account = qry.list();
		System.out.println("No of persistent object : "+account.size());
		for(Account a:account){
			System.out.println(a.getAccountno()+" "+a.getName()+" "+a.getBalance());
		}
		
		qry = session.createQuery(hql2);
		List<String>name = qry.list();
		for(String a:name){
			System.out.println(a);
		}
		
		qry = session.createQuery(hql3);
		List<Float>balance = qry.list();		//return ArrayList
		for(Float f:balance){
			System.out.println(f);
		}
		
		qry = session.createQuery(hql4);
		List<Object[]>arry = qry.list();
		for(Object[] o:arry){
			System.out.println(o[0]+" / "+o[1]);
			for(Object o1 : o){
				System.out.println(o1);
			}
		}
	}
}