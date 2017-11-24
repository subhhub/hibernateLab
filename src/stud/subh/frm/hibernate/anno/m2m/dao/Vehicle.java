package stud.subh.frm.hibernate.anno.m2m.dao;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Vehicle {

	@Id
	@GeneratedValue
	private int vehicleID;
	private String vehicleName;
	
	@ManyToMany
	private Collection<Employee> emp = new ArrayList<>();
	
	
	public int getVehicleID() {
		return vehicleID;
	}
	public void setVehicleID(int vehicleID) {
		this.vehicleID = vehicleID;
	}
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	public Collection<Employee> getEmp() {
		return emp;
	}
	public void setEmp(Collection<Employee> emp) {
		this.emp = emp;
	}
	
}
