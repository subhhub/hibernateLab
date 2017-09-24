package stud.subh.hibernate.ex15.ui;

import org.hibernate.Session;

import stud.subh.hibernate.ex15.dao.MyAccount;
import stud.subh.hibernate.ex15.dao.SessionUtil;

public class CompositIDKeyApplication {
	public static void main(String[] args) {
		System.out.println("**Composite Key Application**");
		
		Session session = SessionUtil.getSession();
		
		MyAccount acc = new MyAccount();
		
		acc.setAccno1(1001);
		acc.setAccno2(2001);
		acc.setName("Subh");
		acc.setBalance(50000.5f);
		
		session.beginTransaction().begin();
		session.save(acc);
		session.beginTransaction().commit();
		
		System.out.println("Account Detail");
		MyAccount ma = (MyAccount) session.get(MyAccount.class,acc);
		System.out.println("Account1 : "+ma.getAccno1());
		System.out.println("Account2 : "+ma.getAccno2());
		System.out.println("Name : "+ma.getName());
		System.out.println("Balance : "+ma.getBalance());
		session.close();
	}
}