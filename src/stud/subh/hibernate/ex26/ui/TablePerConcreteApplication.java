package stud.subh.hibernate.ex26.ui;

import java.io.Serializable;

import org.hibernate.Session;

import stud.subh.hibernate.ex26.dao.HourlyEmployee;
import stud.subh.hibernate.ex26.dao.SalariedEmployee;
import stud.subh.hibernate.ex26.dao.SessionUtil;

public class TablePerConcreteApplication {
	public static void main(String[] args) {
		System.out.println("**Relation Inharitance - Mismatch Application**");
		
		Session session = SessionUtil.getSession();
		
		/* Inheritance Mismatch Insertion*/
		SalariedEmployee se = new SalariedEmployee();
		se.setName("amit");
		se.setSalary(25000);
		HourlyEmployee he = new HourlyEmployee();
		he.setName("pankaj");
		he.setCostPerHour(100);
		he.setWorkedHour(10);
		
		session.beginTransaction().begin();
		Serializable id = session.save(he);
		System.out.println("Employee Persisted : "+id);
		id = session.save(se);
		System.out.println("Employee Persisted : "+id);
		session.beginTransaction().commit();
		
		/*Employee e = (Employee)session.get(Employee.class, 1);
		if(e instanceof HourlyEmployee){
			HourlyEmployee he = (HourlyEmployee)e;
			System.out.println("EID : "+he.getEmpno());
			System.out.println("Name : "+he.getName());
			System.out.println("Worked Hour : "+he.getWorkedHour());
			System.out.println("Rate Per Hour : "+he.getCostPerHour());
		}
		if(e instanceof SalariedEmployee){
			SalariedEmployee se = (SalariedEmployee)e;
			System.out.println("EID : "+se.getEmpno());
			System.out.println("Name : "+se.getName());
			System.out.println("Salary : "+se.getSalary());
		}*/
		
		session.close();
	}
}