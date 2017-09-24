package stud.subh.hibernate.ex21.dao;

import java.io.Serializable;

public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int eid;
	private String ename;
	private float esal;
//	private int empdeptno;
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public float getEsal() {
		return esal;
	}
	public void setEsal(float esal) {
		this.esal = esal;
	}
	/*public void setEmpdeptno(int empdeptno) {
		this.empdeptno = empdeptno;
	}
	public int getEmpdeptno() {
		return empdeptno;
	}*/
}