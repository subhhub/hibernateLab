package stud.subh.hibernate.ex10.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;


/**
 * @author subh 
 * DAO Only Perform CRUD operation
 * this is implementation class 
 */

//@SuppressWarnings("unchecked")
public class AccountDAO {

	public List<Account> findAccounts() {
		
		Session session = SessionUtil.getSession();


		Query qry = session.getNamedQuery("allacounts");	//Named Query
		List<Account>accounts = (List<Account>)qry.list();
		
		session.close();			
		
		return accounts;
	}
	
	public List<Object[]> findNameBalance() {
		
		Session session = SessionUtil.getSession();


		Query qry = session.getNamedQuery("nameBal");	//Named Query
		List<Object[]>accounts = qry.list();
		
		session.close();			
		
		return accounts;
	}
}