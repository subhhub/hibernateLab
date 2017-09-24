package stud.subh.hibernate.ex12.dao;

import java.io.Serializable;

/**
 * @author subh 
 * DTO
 */
public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;
	private int empno;
	private String name;
	private int salary;
	private int deptno;
	
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	
}