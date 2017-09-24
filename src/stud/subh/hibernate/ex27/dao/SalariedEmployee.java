package stud.subh.hibernate.ex27.dao;

import java.io.Serializable;

public class SalariedEmployee  extends Employee implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private double salary;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}