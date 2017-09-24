package stud.subh.hibernate.ex26.dao;

import java.io.Serializable;

public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int empno;
	private String name;
	
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}