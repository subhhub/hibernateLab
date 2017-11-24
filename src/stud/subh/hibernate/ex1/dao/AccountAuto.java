package stud.subh.hibernate.ex1.dao;

import java.io.Serializable;

/**
 * @author subh Persistence class or entity class
 */
public class AccountAuto implements Serializable {

	private static final long serialVersionUID = 1L;
	private int acno;
	private String nm;
	private String email;
	private float bal;
	private float basebal;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAcno() {
		return acno;
	}

	public void setAcno(int acno) {
		this.acno = acno;
	}

	public String getNm() {
		return nm;
	}

	public void setNm(String nm) {
		this.nm = nm;
	}

	public float getBal() {
		return bal;
	}

	public void setBal(float bal) {
		this.bal = bal;
	}

	public void setBasebal(float basebal) {
		this.basebal = basebal;
	}

	public float getBasebal() {
		return basebal;
	}

}