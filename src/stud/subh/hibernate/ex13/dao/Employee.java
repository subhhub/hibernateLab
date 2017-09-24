package stud.subh.hibernate.ex13.dao;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * @author subh 
 * DTO
 */

@Entity
@Table (name="EmployeeHbr")
@NamedQueries ({
		@NamedQuery(name="allEmployee", query="SELECT e FROM Employee e"), 
		@NamedQuery(name="avgSalary", query="SELECT sum(e.salary) FROM Employee e"),
		@NamedQuery(name="ordSalary", query="SELECT e.name FROM Employee e where e.salary<30000 order by e.name desc"),
		@NamedQuery(name="updSalary", query="update Employee e set e.salary=e.salary+? where e.salary<?")})
public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	private int empno;
	private String name;
	private int salary;
	private int deptno;
	
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
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	
}