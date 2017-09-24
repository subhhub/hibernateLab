package job.subh.hibernate.uc1.dao;

import java.io.Serializable;

public class Disease implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int cardno;
	private String cardpassword;
	private String cardtype;
	private Appointment appointment;
	
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
	public void setAccount(Appointment appointment) {
		this.appointment = appointment;
	}
	public Appointment getAccount() {
		return appointment;
	}
	
}