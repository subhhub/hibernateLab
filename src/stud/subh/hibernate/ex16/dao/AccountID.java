package stud.subh.hibernate.ex16.dao;

import java.io.Serializable;

public class AccountID implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int accno1;
	private int accno2;

	public int getAccno1() {
		return accno1;
	}
	public void setAccno1(int accno1) {
		this.accno1 = accno1;
	}
	public int getAccno2() {
		return accno2;
	}
	public void setAccno2(int accno2) {
		this.accno2 = accno2;
	}
}