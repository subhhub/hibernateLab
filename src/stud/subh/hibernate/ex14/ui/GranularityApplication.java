package stud.subh.hibernate.ex14.ui;

import org.hibernate.Session;

import stud.subh.hibernate.ex14.dao.Employee;
import stud.subh.hibernate.ex14.dao.SessionUtil;

public class GranularityApplication {
	public static void main(String[] args) {
		System.out.println("**O/R Mismatch  (Granularity) Application**");
		
		Session session = SessionUtil.getSession();
		
		Employee emp = (Employee)session.get(Employee.class, 1001);
		
		System.out.println(" Employee Details ");
		System.out.println("empno : "+emp.getEmpno());
		System.out.println("deptno : "+emp.getDeptno());
		System.out.println("slary Rs : "+emp.getSalary());
		System.out.println("name : "+emp.getName());
		System.out.println("Address hno : "+emp.getAddr().getHno());
		System.out.println("Address city : "+emp.getAddr().getCity());
		System.out.println("Address pin : "+emp.getAddr().getPin());
		System.out.println("Address street : "+emp.getAddr().getStreet());
		
		session.close();
	}
}