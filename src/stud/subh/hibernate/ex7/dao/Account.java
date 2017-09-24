package stud.subh.hibernate.ex7.dao;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author subh Persistence class or entity class
 * Mapping through Annotation
 */
@Entity
@Table (name="ACCOUNT")
public class Account implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column (name="ACCNO")
	private int acno;
	@Column (name="NAME")
	private String nm;
	@Column (name="BALANCE")
	private float bal;

	public int getAcno() {
		return acno;
	}

	public void setAcno(int acno) {
		this.acno = acno;
	}

	public String getNm() {
		return nm;
	}

	public void setNm(String nm) {
		this.nm = nm;
	}

	public float getBal() {
		return bal;
	}

	public void setBal(float bal) {
		this.bal = bal;
	}
}