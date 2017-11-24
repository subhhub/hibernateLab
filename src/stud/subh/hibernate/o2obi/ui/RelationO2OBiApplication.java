package stud.subh.hibernate.o2obi.ui;

import org.hibernate.Session;

import stud.subh.hibernate.o2obi.dao.Account;
import stud.subh.hibernate.o2obi.dao.AccountPlus;
import stud.subh.hibernate.o2obi.dao.SessionUtil;

public class RelationO2OBiApplication {
	public static void main(String[] args) {
		System.out.println("**Mapping One-to-One bi-directional Application**");
		
		Session session = SessionUtil.getSession();
		
		Account account = (Account) session.get(Account.class, 9005);		//Account to AccountPlus
		System.out.println("account : "+account.getName());
		System.out.println("account : "+account.getBalance());
//		System.out.println("account : "+account.getAccountPlus().getLocation());
//		System.out.println("account : "+account.getAccountPlus().getType());
		
		AccountPlus accountPlus = (AccountPlus) session.get(AccountPlus.class, 40001);	//AccountPlus to Account
		System.out.println("account : "+accountPlus.getLocation());
		System.out.println("account : "+accountPlus.getType());
		System.out.println("account : "+accountPlus.getAccount().getName());
		System.out.println("account : "+accountPlus.getAccount().getBalance());
		
		session.close();
	}
}