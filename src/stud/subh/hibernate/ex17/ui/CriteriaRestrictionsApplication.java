package stud.subh.hibernate.ex17.ui;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import stud.subh.hibernate.ex17.dao.Account;
import stud.subh.hibernate.ex17.dao.SessionUtil;

public class CriteriaRestrictionsApplication {
	public static void main(String[] args) {
		System.out.println("**Criteri API Conditional Read Application**");
		
		Session session = SessionUtil.getSession();

//		Criteria criteria = session.createCriteria(Account.class);
//		System.out.println("criteria - "+criteria);
//		criteria.setMaxResults(3);
		
//		Criterion crEqual = Restrictions.eq("name","amit");
//		Criterion crEqual2 = Restrictions.eq("balance",1000f);
//		Criterion crNot = Restrictions.ne("name", "amit");
//		Criterion crLike = Restrictions.like("name", "%s%");
//		Criterion crIn = Restrictions.in("name", new Object[]{"subh","amit"});
		
//		criteria.add(crIn);
//		criteria.add(crEqual2);
		
		//select * form myaccunt where(accno>1001 and name like '%a%')
//		Criterion crGreater = Restrictions.gt("accno", 8);
//		Criterion crLike2 = Restrictions.like("name", "%a%");
//		Criterion crAnd = Restrictions.and(crGreater, crLike2);
//		criteria.add(crAnd);
		
//		criteria.add(crGreater);
		
//		Order or = Order.desc("name");
//		criteria.addOrder(or);
		
//		List<Account> account = session.createCriteria(Account.class).add( Restrictions.eq("accno", 5)).list();
		List<Account> account = session.createCriteria(Account.class).addOrder(Order.asc("inactive_date")).list();
		
//		List<Account>account = criteria.list();
		
		for(Account ac: account){
			System.out.println(ac.getAccno()+" / "+ac.getName()+" / "+ac.getInactive_date());
		}
	}
}