package stud.subh.frm.hibernate.anno.o2m.ui;

import org.hibernate.Session;
import org.hibernate.Transaction;

import stud.subh.frm.hibernate.anno.o2m.dao.Employee;
import stud.subh.frm.hibernate.anno.o2m.dao.SessionUtil;
import stud.subh.frm.hibernate.anno.o2m.dao.Vehicle;

public class OneToManyMappingApplication {
	public static void main(String[] args) {
		System.out.println("**One to Many Application**");
		
		OneToManyMappingApplication om = new OneToManyMappingApplication();
//		om.o2m();
		om.m2o();
		
	}
	
	public void o2m(){
		Session session = SessionUtil.getSession();
		
		Vehicle vl1 = new Vehicle();
		vl1.setVehicleName("Dominor3");

		Vehicle vl2 = new Vehicle();
		vl2.setVehicleName("Tiger3");

		Employee emp = new Employee();
		emp.setName("name5");
		emp.getVehicle().add(vl1);
		emp.getVehicle().add(vl2);
		
		Transaction txn = session.beginTransaction();
		session.save(emp);
		session.save(vl1);
		session.save(vl2);
		txn.commit();
		System.out.println("Record Saved Successfully");
		
		session.clear();
	}
	
	public void m2o(){
		Session session = SessionUtil.getSession();
		
		Employee emp = new Employee();
		emp.setName("name4");
		
		Vehicle vl1 = new Vehicle();
		vl1.setVehicleName("Dominor2");

		Vehicle vl2 = new Vehicle();
		vl2.setVehicleName("Tiger2");

		emp.getVehicle().add(vl1);
		emp.getVehicle().add(vl2);
		vl1.setEmp(emp);
		vl2.setEmp(emp);
		
		Transaction txn = session.beginTransaction();
		session.save(emp);
		session.save(vl1);
		session.save(vl2);
		txn.commit();
		System.out.println("Record Saved Successfully");
		
		session.clear();
	}
}