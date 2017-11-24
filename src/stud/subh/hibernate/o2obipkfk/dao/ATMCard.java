package stud.subh.hibernate.o2obipkfk.dao;

import java.io.Serializable;

public class ATMCard implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int cardno;
	private String cardpassword;
	private String cardtype;
	private Account account;
	
	public int getCardno() {
		return cardno;
	}
	public void setCardno(int cardno) {
		this.cardno = cardno;
	}
	public String getCardpassword() {
		return cardpassword;
	}
	public void setCardpassword(String cardpassword) {
		this.cardpassword = cardpassword;
	}
	public String getCardtype() {
		return cardtype;
	}
	public void setCardtype(String cardtype) {
		this.cardtype = cardtype;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public Account getAccount() {
		return account;
	}
	
}