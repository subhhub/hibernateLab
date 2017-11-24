package stud.subh.frm.hibernate.anno.aoeo.ui;

import org.hibernate.Session;
import org.hibernate.Transaction;

import stud.subh.frm.hibernate.anno.aoeo.dao.Address;
import stud.subh.frm.hibernate.anno.aoeo.dao.Employee;
import stud.subh.frm.hibernate.anno.aoeo.dao.SessionUtil;

public class EmbeddedObjectApplication {
	public static void main(String[] args) {
		System.out.println("**AttributeOverrides and Embedded Object Keys Application**");
		
		Session session = SessionUtil.getSession();
		
		Address add1 = new Address();
		add1.setHno("1001");
		add1.setStreet("S11");
		add1.setCity("C11");
		
		Address add2 = new Address();
		add2.setHno("1002");
		add2.setStreet("S12");
		add2.setCity("C12");
		
		//Save Operation
		Employee emp = new Employee();
		emp.setName("name2");
		emp.setSalary(90000);
		emp.setHomeAddr(add1);
		emp.setOfficeAddr(add2);
		
		Transaction txn = session.beginTransaction();
		session.save(emp);
		txn.commit();
		System.out.println("Record Saved Successfully");
		
		session.clear();
	}
}