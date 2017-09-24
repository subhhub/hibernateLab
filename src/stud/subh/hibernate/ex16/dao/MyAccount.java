package stud.subh.hibernate.ex16.dao;

import java.io.Serializable;

public class MyAccount implements Serializable {

	private static final long serialVersionUID = 1L;

	private AccountID accno;
	private String name;
	private float balance;
	
	public void setAccno(AccountID accno) {
		this.accno = accno;
	}
	public AccountID getAccno() {
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
}