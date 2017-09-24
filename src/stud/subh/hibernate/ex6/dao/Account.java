package stud.subh.hibernate.ex6.dao;

import java.io.Serializable;

/**
 * @author subh Persistence class or entity class
 */
public class Account implements Serializable {

	private static final long serialVersionUID = 1L;
	private int acno;
	private String nm;
	private float bal;

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

}