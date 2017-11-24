package stud.subh.frm.hibernate.anno.o2m.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name="EMPLOYEE_DETAIL")
public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int empno;
	private String name;
	
	@OneToMany
//	@OneToMany (mappedBy="emp")		//optional. if you don't want a seperate table for mapping
//	@JoinTable(name="EMPLOYEE_VEHICLE")	//optional
	/*@JoinTable (name="EMPLOYEE_VEHICLE", joinColumns=@JoinColumn(name="EMP_ID"),		//Optional
				inverseJoinColumns=@JoinColumn(name="VEHICLE_ID"))*/
	private Collection<Vehicle> vehicle = new ArrayList<>();

	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Collection<Vehicle> getVehicle() {
		return vehicle;
	}
	public void setVehicle(Collection<Vehicle> vehicle) {
		this.vehicle = vehicle;
	}
}