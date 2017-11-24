package stud.subh.hibernate.o2o.dao;

import java.io.Serializable;

public class AccountPlus implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int accno;
	private String location;
	private String type;
	
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}