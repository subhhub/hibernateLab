package stud.subh.hibernate.ex4.ui;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import stud.subh.hibernate.ex4.dao.SessionUtil;

public class BulkUpdateApplication {

	public static void main(String[] args) {

		System.out.println("**HQL Bulk Update Record Application**");

		Session session = SessionUtil.getSession();
		System.out.println("session=" + session.hashCode());
		String hql = "update Account a set a.balance = a.balance + 500";
		Query qry = session.createQuery(hql);
		Transaction txn = session.beginTransaction();
		int ucnt = qry.executeUpdate();
		txn.commit();
		System.out.println(ucnt + " updated");
	}
}