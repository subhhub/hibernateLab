package stud.subh.hibernate.ex10.ui;

import java.util.List;

import stud.subh.hibernate.ex10.dao.Account;
import stud.subh.hibernate.ex10.dao.AccountDAO;

public class NamedQueryApplication {
	public static void main(String[] args) {
		System.out.println("**HQL Named Query Application**");

		AccountDAO accountDAO = new AccountDAO();
		List<Account>accounts = accountDAO.findAccounts();
		
		System.out.println("No of persistent object : "+accounts.size());
		for(Account a:accounts){
			System.out.println(a.getAccountno()+" "+a.getName()+" "+a.getBalance());
		}
	}
}