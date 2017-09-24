package stud.subh.hibernate.ex9.ui;

import java.io.Serializable;

/**
 * @author subh 
 * DTO
 */
public class Account implements Serializable {

	private static final long serialVersionUID = 1L;
	private int accountno;
	private String name;
	private float balance;
	
	public int getAccountno() {
		return accountno;
	}
	public void setAccountno(int accountno) {
		this.accountno = accountno;
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