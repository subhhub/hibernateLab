package stud.subh.frm.hibernate.anno.aoeo.dao;

import java.io.Serializable;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="EMPLOYEE_DETAIL")
public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int empno;
	private String name;
	private int salary;

	@Embedded  
    @AttributeOverrides({
        @AttributeOverride(name="street", column=@Column(name="HOME_STREET_NAME")),
        @AttributeOverride(name="city", column=@Column(name="HOME_CITY_NAME")),
        @AttributeOverride(name="hno", column=@Column(name="HOME_NUMBER")),
    })
	private Address homeAddr;
	
	private Address officeAddr;
	
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Address getHomeAddr() {
		return homeAddr;
	}
	public void setHomeAddr(Address homeAddr) {
		this.homeAddr = homeAddr;
	}
	public Address getOfficeAddr() {
		return officeAddr;
	}
	public void setOfficeAddr(Address officeAddr) {
		this.officeAddr = officeAddr;
	}


}