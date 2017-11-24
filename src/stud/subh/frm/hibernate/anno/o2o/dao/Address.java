package stud.subh.frm.hibernate.anno.o2o.dao;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Column (name="HOME_NO")
	private String hno;
	@Column (name="STREAT_NAME")
	private String street;
	@Column (name="CITY_NAME")
	private String city;
	
	public String getHno() {
		return hno;
	}
	public void setHno(String hno) {
		this.hno = hno;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
}