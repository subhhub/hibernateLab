package stud.subh.frm.hibernate.anno.sc.ui;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import stud.subh.frm.hibernate.anno.sc.dao.Address;
import stud.subh.frm.hibernate.anno.sc.dao.Employee;
import stud.subh.frm.hibernate.anno.sc.dao.SessionUtil;

public class SavingCollectionsApplication {
	public static void main(String[] args) {
		System.out.println("**Saving Collection Application**");
		
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
		emp.getHomeAddr().add(add1);
		emp.getHomeAddr().add(add2);
		
		Transaction txn = session.beginTransaction();
		session.save(emp);
		txn.commit();
		System.out.println("Record Saved Successfully");
		
		session.clear();
	}
}