package stud.subh.hibernate.ex4.ui;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import stud.subh.hibernate.ex4.dao.SessionUtil;

public class ReadAccountApplication {
	public static void main(String[] args) {
		System.out.println("**HQL Read All Record Application**");

		Session session = SessionUtil.getSession();
		String hql = "SELECT a FROM Account a";
		Query qry = session.createQuery(hql);
		List<Account>account = qry.list();
		for(Account a:account){
			System.out.println(a.getAccountno()+" "+a.getName()+" "+a.getBalance());
		}
	}
}