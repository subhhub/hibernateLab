package stud.subh.hibernate.o2o.ui;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

import stud.subh.hibernate.o2o.dao.Account;
import stud.subh.hibernate.o2o.dao.AccountPlus;
import stud.subh.hibernate.o2o.dao.SessionUtil;

public class RelationO2OUniApplication {
	public static void main(String[] args) {
		System.out.println("**Mapping One-to-One Uni-directional Application**");
		
		Session session = SessionUtil.getSession();
		
		AccountPlus accid = new AccountPlus();
		accid.setLocation("hyd");
		accid.setType("reg");
		
		Account acc = new Account();
		acc.setName("rajesh");
		acc.setBalance(50000.5f);
		acc.setAccountPlus(accid);
		
//		session.beginTransaction().begin();
//		int up = (Integer) session.save(acc);
//		session.beginTransaction().commit();
		
//		System.out.println("Object Persisted : "+up);
		
		Account account = (Account) session.get(Account.class, 9005);
		System.out.println("account : "+account.getName());
		System.out.println("account : "+account.getBalance());
		System.out.println("account : "+account.getAccountPlus().getLocation());
		System.out.println("account : "+account.getAccountPlus().getType());
		
		session.close();
	}
}