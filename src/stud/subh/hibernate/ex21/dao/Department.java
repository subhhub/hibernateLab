package stud.subh.hibernate.ex21.dao;

import java.io.Serializable;
import java.util.List;

public class Department implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int deptno;
	private String deptname;
	private String location;
	private List<Employee>employees;
	
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	public List<Employee> getEmployees() {
		return employees;
	}
}