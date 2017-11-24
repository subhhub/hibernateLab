package stud.subh.frm.hibernate.anno.m2m.ui;

import org.hibernate.Session;
import org.hibernate.Transaction;

import stud.subh.frm.hibernate.anno.m2m.dao.Employee;
import stud.subh.frm.hibernate.anno.m2m.dao.SessionUtil;
import stud.subh.frm.hibernate.anno.m2m.dao.Vehicle;

public class ManyToManyMappingApplication {
	public static void main(String[] args) {
		System.out.println("**One to Many Application**");
		
		ManyToManyMappingApplication om = new ManyToManyMappingApplication();
		om.m2m();
		
	}
	
	public void m2m(){
		Session session = SessionUtil.getSession();
		
		Employee emp = new Employee();
		emp.setName("name1");
		
		Vehicle vl1 = new Vehicle();
		vl1.setVehicleName("Dominor1");

		Vehicle vl2 = new Vehicle();
		vl2.setVehicleName("Tiger1");

		emp.getVehicle().add(vl1);
		emp.getVehicle().add(vl2);
		vl1.getEmp().add(emp);
		vl2.getEmp().add(emp);
		
		Transaction txn = session.beginTransaction();
		session.save(emp);
		session.save(vl1);
		session.save(vl2);
		txn.commit();
		System.out.println("Record Saved Successfully");
		
		session.clear();
	}
}