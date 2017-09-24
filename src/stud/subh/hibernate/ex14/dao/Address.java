package stud.subh.hibernate.ex14.dao;

import java.io.Serializable;

public class Address implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String hno;
	private String street;
	private String city;
	private int pin;
	
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
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}	
}