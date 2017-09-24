package stud.subh.frm.hibernate.dao;

import java.io.Serializable;

/**
 * @author subh
 * DTO Object
 *
 */
public class Account implements Serializable {
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String ACCNO;
	 private String NAME;
	 private float BALANCE;
	 
	public String getACCNO() {
		return ACCNO;
	}
	public void setACCNO(String aCCNO) {
		ACCNO = aCCNO;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	public float getBALANCE() {
		return BALANCE;
	}
	public void setBALANCE(float bALANCE) {
		BALANCE = bALANCE;
	}
}
