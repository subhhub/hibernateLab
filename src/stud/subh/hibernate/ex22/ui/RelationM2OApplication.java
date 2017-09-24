package stud.subh.hibernate.ex22.ui;

import org.hibernate.Session;

import stud.subh.hibernate.ex22.dao.Employee;
import stud.subh.hibernate.ex22.dao.SessionUtil;

public class RelationM2OApplication {
	public static void main(String[] args) {
		System.out.println("**Relation many-to-many uni/bi-directional Application**");
		
		Session session = SessionUtil.getSession();
		
		Employee emp = (Employee)session.get(Employee.class, 1001);
		System.out.println("empID : "+emp.getEid());
		System.out.println("name : "+emp.getEname());
		System.out.println("sal : "+emp.getEsal());;
		System.out.println(emp.getDeprtment().getDeptname());
		System.out.println(emp.getDeprtment().getDeptno());
		
		/*ATMCard ac = (ATMCard) session.get(ATMCard.class, 98765);	//Navigating
		System.out.println("cno : "+ac.getCardno());
		System.out.println("pass :"+ac.getCardpassword());
		System.out.println("type : "+ac.getCardtype());
		System.out.println("accno : "+ac.getAccount().getAccno());
		System.out.println("Ac Holder name : "+ac.getAccount().getName());*/
		
		session.close();
	}
}