package stud.subh.hibernate.ex11.dao;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * @author subh 
 * DTO
 */

@Entity
//@Table (name="account")	// No need to mention because table name and persistent object name is same
@NamedQuery (name = "allacounts", query = "SELECT a FROM Account a")
//@NamedQuery (name="namBal", query="SELECT a.name, a.balance FROM Account a")	//Not Allow its overloaded
public class Account implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column (name="accno")
	private int accountno;
//	@Column (name="name")	//No need to mention because table field name and persistent object instance name is same
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