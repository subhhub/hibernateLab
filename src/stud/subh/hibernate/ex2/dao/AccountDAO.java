package stud.subh.hibernate.ex2.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import stud.subh.frm.hibernate.dao.exception.DataAccessException;
import stud.subh.hibernate.ex2.exep.AccountNotFoundExcecption;
import stud.subh.hibernate.ex2.ui.Account;

/**
 * @author subh 
 * DAO Only Perform CRUD operation
 * this is implementation class 
 */
public class AccountDAO {

	public AccountDAO() {
		System.out.println("Data Access Layer");
	}
	
	public Account findAccount(int acno) {

		Session session = SessionUtil.getSession();

		Account account = (Account) session.get(Account.class, acno);

		session.close();
		return account;
	}

	public boolean deleteAccount(int acno) {
		boolean flag = false;

		Session session = SessionUtil.getSession();

		Account account = findAccount(acno);
		if (account != null) {
			Transaction transaction = session.beginTransaction();
			session.delete(account);
			transaction.commit();	//final query generation implicitly
			flag = true;
		}

		session.close();
		return flag;
	}

	public void updateAccount(Account account) {		//Account in detached state behaving like DTO
		Session session = SessionUtil.getSession();

		Transaction transaction = session.beginTransaction();
		session.update(account);			//Account in persistent stage and become persistent object
		transaction.commit();	//final query generation implicitly

		session.close();
	}
	
	public void saveAccount(Account account) {
		Session session = SessionUtil.getSession();

		Transaction transaction = session.beginTransaction();
		session.save(account);
		transaction.commit();	//final query generation implicitly

		session.close();
	}

	public List<Account> findAccounts() throws AccountNotFoundExcecption, DataAccessException {
		
		Session session = null;
		List<Account> accounts = null;
		try {
			session = SessionUtil.getSession();
			Query qry = session.createQuery("SELECT a FROM Account a");
			accounts = qry.list();
			if(accounts==null)
				throw new AccountNotFoundExcecption();
		} catch (HibernateException e) {
			throw new DataAccessException();
		} catch (AccountNotFoundExcecption e) {
			throw new AccountNotFoundExcecption();
		}
		finally{
			if(session!=null)
				session.close();			
		}
		
		return accounts;
	}
}