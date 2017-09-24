package stud.subh.hibernate.ex13.ui;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import stud.subh.hibernate.ex13.dao.Employee;
import stud.subh.hibernate.ex13.dao.SessionUtil;

public class NamedQueryMultiOprAnnoApplication {
	public static void main(String[] args) {
		System.out.println("**HQL Named Query Multi DB Operations Using Annotation Application**");

		Session session = SessionUtil.getSession();

		Query qry = session.getNamedQuery("allEmployee");
		List<Employee> emp = qry.list();
		System.out.println("No of persistent emp object : "+emp.size());
		for(Employee e:emp){
			System.out.println(e.getEmpno()+" "+e.getName()+" "+e.getSalary());
		}
		
		qry = session.getNamedQuery("avgSalary"); 
		System.out.println("avgSalary : "+qry.uniqueResult());
		
		qry = session.getNamedQuery("ordSalary"); 
		List<String> empNm = qry.list();
		for(String e:empNm){
			System.out.println(e);
		}
		
		qry = session.getNamedQuery("updSalary"); 
		qry.setInteger(0, 100);
		qry.setInteger(1, 40000);
		session.getTransaction().begin();
		int up = qry.executeUpdate();
		session.getTransaction().commit();
		System.out.println("Record update : "+up);
		
		session.close();
	}
}