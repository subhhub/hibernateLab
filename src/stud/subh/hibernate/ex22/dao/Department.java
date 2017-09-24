package stud.subh.hibernate.ex22.dao;

import java.io.Serializable;

public class Department implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int deptno;
	private String deptname;
	private String location;
	
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
}