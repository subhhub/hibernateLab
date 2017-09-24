package stud.subh.hibernate.ex8.ui;

import org.hibernate.Query;
import org.hibernate.Session;

import stud.subh.hibernate.ex8.dao.SessionUtil;

public class UpdateApplication {

	public static void main(String[] args) {

		System.out.println("**HQL Positional/Named parameter Application**");

		Session session = SessionUtil.getSession();
		
//		String hql = "update Account a set a.balance = a.balance + ? where a.accountno < ?";	//Positional Parameter
//		String hql = "update Account a set a.balance = a.balance + :bal where a.accountno < :acc";	//named Parameter
		String hql = "update Account a set a.balance = a.balance + ? where a.accountno < :acc";	//Positional & named Parameter 
//		String hql = "update Account a set a.balance = a.balance + :bal where a.accountno < ?";	//Positional & named Parameter (cannot define positional parameter after any named parameters have been defined)
		Query qry = session.createQuery(hql);
		
//		qry.setParameter(0, 100f);
//		qry.setParameter(1, 60000);
		
//		qry.setParameter("bal", 100f);
//		qry.setParameter("acc", 60000);
		
		qry.setParameter(0, 100f);
		qry.setParameter("acc", 60000);
		
		session.getTransaction().begin();	//transaction object in singleton and session object contain the ref of transaction object
		int ucnt = qry.executeUpdate();
		session.getTransaction().commit();	//thats why when commit perform with singleton transaction object that is contained by session
		
		System.out.println(ucnt + " updated");
	}
}