package stud.subh.hibernate.ex17.ui;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

import stud.subh.hibernate.ex17.dao.Account;
import stud.subh.hibernate.ex17.dao.SessionUtil;

public class CriteriaProjectionApplication {
	public static void main(String[] args) {
		System.out.println("**Criteri API Read Application**");
		
		Session session = SessionUtil.getSession();
		
		Criteria criteria = session.createCriteria(Account.class);
		
		ProjectionList projList = Projections.projectionList();
		
		//select name from account;
		/*Projection proj1 = Projections.property("balance");
		Projection proj2 = Projections.property("name");
		projList.add(proj1);
		projList.add(proj2);
		criteria.setProjection(projList);
		List<Object[]>account = criteria.list();
		for(Object[] ac: account){
			System.out.println(ac[0]+" / "+ac[1]);
		}*/
		
		//select count(accno) from account;
		//select max(accno) from account;
//		Projection proj2 = Projections.count("accno");
		Projection proj2 = Projections.max("balance");
		projList.add(proj2);
		criteria.setProjection(projList);
//		List<Account>acc = criteria.list();
//		System.out.println("No of record : "+acc);
		Object acn = criteria.uniqueResult();
		System.out.println("No of record : "+acn);
	}
}