package stud.subh.hibernate.ex17.ui;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

import stud.subh.hibernate.ex17.dao.Account;
import stud.subh.hibernate.ex17.dao.SessionUtil;

public class CriteriaReadApplication {
	public static void main(String[] args) {
		System.out.println("**Criteri API Read Application**");
		
		Session session = SessionUtil.getSession();
		
		/*Criteria criteria = session.createCriteria(Account.class);
		List<Account>account = criteria.list();
		for(Account ac: account){
			System.out.println(ac.getAccno());
		}*/
		
		Criteria criteria = session.createCriteria(Account.class);	//pagination
		criteria.setFirstResult(3);
		criteria.setMaxResults(2);
		List<Account>account = criteria.list();
		
		System.out.println("account : "+account);
		for(Account ac: account){
			System.out.println(ac.getAccno());
		}
	}
}