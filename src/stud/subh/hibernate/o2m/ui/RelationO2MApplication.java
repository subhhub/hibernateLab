package stud.subh.hibernate.o2m.ui;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import stud.subh.hibernate.o2m.dao.Department;
import stud.subh.hibernate.o2m.dao.Employee;
import stud.subh.hibernate.o2m.dao.SessionUtil;

public class RelationO2MApplication {
	public static void main(String[] args) {
		System.out.println("**Relatino One-to-many uni/bi-directional Application**");
		
		Session session = SessionUtil.getSession();
		
		Employee emp1 = new Employee();
		emp1.setEid(1011);
		emp1.setEname("name11");
		emp1.setEsal(12000);
		
		Employee emp2 = new Employee();
		emp2.setEid(1022);
		emp2.setEname("name22");
		emp2.setEsal(1500);
		
		Employee emp3 = new Employee();
		emp3.setEid(1033);
		emp3.setEname("name33");
		emp3.setEsal(2000);
		
		List<Employee>emps = new ArrayList<Employee>();
		emps.add(emp1);
		emps.add(emp2);
		emps.add(emp3);
		
		Department dept = new Department();
		dept.setDeptno(1011);
		dept.setDeptname("Manager");
		dept.setLocation("Hyderabad");
		dept.setEmployees(emps);
		
		session.beginTransaction().begin();
		int ru = (Integer) session.save(dept);
		session.beginTransaction().commit();
		System.out.println("Object Persisted : "+ru);
		
		/*ATMCard ac = (ATMCard) session.get(ATMCard.class, 98765);	//Navigating
		System.out.println("cno : "+ac.getCardno());
		System.out.println("pass :"+ac.getCardpassword());
		System.out.println("type : "+ac.getCardtype());
		System.out.println("accno : "+ac.getAccount().getAccno());
		System.out.println("Ac Holder name : "+ac.getAccount().getName());*/
		
		session.close();
	}
}