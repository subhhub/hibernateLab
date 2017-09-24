package stud.subh.hibernate.ex16.ui;

import org.hibernate.Session;

import stud.subh.hibernate.ex16.dao.AccountID;
import stud.subh.hibernate.ex16.dao.MyAccount;
import stud.subh.hibernate.ex16.dao.SessionUtil;

public class CompositIDKeyApplication2 {
	public static void main(String[] args) {
		System.out.println("**Composite Key Application**");
		
		Session session = SessionUtil.getSession();
		
		AccountID accid = new AccountID();
		accid.setAccno1(1003);
		accid.setAccno2(2001);
		
		MyAccount acc = new MyAccount();
		acc.setAccno(accid);
		acc.setName("Subh");
		acc.setBalance(50000.5f);
		
		session.beginTransaction().begin();
		session.save(acc);
		session.beginTransaction().commit();
		
		System.out.println("Account Detail");
		MyAccount ma = (MyAccount) session.get(MyAccount.class,accid);
		System.out.println("Account1 : "+ma.getAccno().getAccno1());
		System.out.println("Account2 : "+ma.getAccno().getAccno2());
		System.out.println("Name : "+ma.getName());
		System.out.println("Balance : "+ma.getBalance());
		session.close();
	}
}