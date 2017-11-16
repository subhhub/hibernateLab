package stud.subh.hibernate.ex2.ui;

import java.util.List;

import stud.subh.frm.hibernate.dao.exception.DataAccessException;
import stud.subh.hibernate.ex2.dao.AccountDAO;
import stud.subh.hibernate.ex2.exep.AccountNotFoundExcecption;

public class AccountAllRecord {
	public static void main(String[] args) {
		System.out.println("**Accounts All Record**");
		
		//Service layer code (business logic)
		AccountDAO accountDAO = new AccountDAO();			//account in transient state
		List<Account> account = null;
		try {
			account = accountDAO.findAccounts();
		} catch (AccountNotFoundExcecption e) {
			System.out.println("Account Not Found."+e);
		} catch (DataAccessException e) {
			System.out.println("Data Access Problem."+e);
		}
		if(account==null)
			System.out.println("No Record");
		else{
			System.out.println("Record Available");
			for(Account a:account){
				System.out.println(a.getAccountno()+" "+a.getName()+" "+a.getBalance());
			}
		}
	}
}