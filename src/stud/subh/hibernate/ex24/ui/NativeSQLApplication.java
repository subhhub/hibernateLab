package stud.subh.hibernate.ex24.ui;

import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;

import stud.subh.hibernate.ex24.dao.Account;
import stud.subh.hibernate.ex24.dao.SessionUtil;

public class NativeSQLApplication {
	public static void main(String[] args) {
		System.out.println("**NativeSQL Read Application**");
		
		Session session = SessionUtil.getSession();
		
		/*SQLQuery sqry = session.createSQLQuery("select * from account");		//Display All Fields
		sqry.addEntity(Account.class);
		List<Account>accounts = sqry.list();
		for(Account ac : accounts)
			System.out.println(ac.getName()+" "+ac.getAccno()+" "+ac.getBalance());*/
		
		/*SQLQuery sqry = session.createSQLQuery("select * from account where balance > 3000");		//Display few fields
		sqry.addScalar("name",Hibernate.STRING);
		sqry.addScalar("balance",Hibernate.FLOAT);
		List<Object[]>objs = sqry.list();
		for(Object[] ob : objs){
//			System.out.println(ob);
			for(Object o : ob)
				System.out.println(o);
		}*/
		
		/*SQLQuery sqry = (SQLQuery)session.getNamedQuery("allaccunt");		//Named Query Using : SQLQuery API
		sqry.addEntity(Account.class);
		List<Account>accounts = sqry.list();
		for(Account ac : accounts)
			System.out.println(ac.getName()+" "+ac.getAccno()+" "+ac.getBalance());*/
		
		/*Query sqry = session.getNamedQuery("allaccunt");	//Named Query Using : Query API
		List<Object[]>objs = sqry.list();
		for(Object[] ob : objs){
//			System.out.println(ob);
			for(Object o : ob)
				System.out.println(o);
		}*/
		
		/*SQLQuery sqry = (SQLQuery)session.getNamedQuery("fewaccunt");		//Named Query Using : SQLQuery API
		List<Object[]>objs = sqry.list();
		for(Object[] ob : objs){
//			System.out.println(ob);
			for(Object o : ob)
				System.out.println(o);
		}*/
		
		SQLQuery sqry = (SQLQuery)session.getNamedQuery("avgbal");		//Named Query Using : SQLQuery API
		float avgbal = (Float) sqry.uniqueResult();
		System.out.println("Avg Balance :"+avgbal);
		
		session.close();
	}
}