package stud.subh.hibernate.ex11.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

/**
 * @author subh <br>
 * DAO Only Perform CRUD operation this is implementation class
 */
public class AccountDAO {

	public List<Account> findAccounts() {
		
		Session session = SessionUtil.getSession();

		Query qry = session.getNamedQuery("allacounts"); // Named Query
		List<Account> accounts = qry.list();

		session.close();

		return accounts;
	}
}