package stud.subh.hibernate.ex15.dao;

import java.io.Serializable;

public class MyAccount implements Serializable {

	private static final long serialVersionUID = 1L;

	private int accno1;
	private int accno2;
	private String name;
	private float balance;
	
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
	
}