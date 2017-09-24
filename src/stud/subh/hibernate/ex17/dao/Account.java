package stud.subh.hibernate.ex17.dao;

import java.io.Serializable;

public class Account implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int accno;
	private String name;
	private float balance;
	private String inactive_date;
	
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public int getAccno() {
		return accno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public String getInactive_date() {
		return inactive_date;
	}
	public void setInactive_date(String inactive_date) {
		this.inactive_date = inactive_date;
	}
}  