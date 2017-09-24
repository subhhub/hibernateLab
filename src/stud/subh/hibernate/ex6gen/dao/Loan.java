package stud.subh.hibernate.ex6gen.dao;

import java.io.Serializable;

/**
 * @author subh Persistence class or entity class
 */
public class Loan implements Serializable {

	private static final long serialVersionUID = 1L;
	private String loanID;
	private String name;
	private float amount;
	
	public String getLoanID() {
		return loanID;
	}
	public void setLoanID(String loanID) {
		this.loanID = loanID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
}