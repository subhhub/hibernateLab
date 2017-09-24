package stud.subh.hibernate.ex11.ui;

import java.util.List;

import stud.subh.hibernate.ex11.dao.Account;
import stud.subh.hibernate.ex11.dao.AccountDAO;

public class NamedQueryAnnoApplication {
	public static void main(String[] args) {
		System.out.println("**HQL Named Query Using Annotation Application**");

		AccountDAO accountDAO = new AccountDAO();
		
		List<Account>accounts = accountDAO.findAccounts();
		
		System.out.println("No of persistent object : "+accounts.size());
		for(Account a:accounts){
			System.out.println(a.getAccountno()+" "+a.getName()+" "+a.getBalance());
		}
	}
}