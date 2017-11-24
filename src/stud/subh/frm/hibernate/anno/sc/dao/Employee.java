package stud.subh.frm.hibernate.anno.sc.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
@Table (name="EMPLOYEE_DETAIL")
public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int empno;
	private String name;

	/*This is the basic collection data saving implementation*/
	/*@ElementCollection
	@JoinTable(name="EMPLOYEE_ADDRESS",			//optional. Without this hibernate will provide default name.	
				joinColumns=@JoinColumn(name="EMP_NO")
			)				
	private Set<Address> homeAddr = new HashSet<>();*/
	
	/*This implementation for id generation reference table while adding collection data*/
//	@ElementCollection (fetch=FetchType.EAGER)	//Optional fetch attribute
	@ElementCollection
	@JoinTable(name="EMPLOYEE_ADDRESS",			//optional. Without this hibernate will provide default name.	
				joinColumns=@JoinColumn(name="EMP_NO"))		
	@GenericGenerator(name = "hilo-gen", strategy = "hilo")
	@CollectionId(columns = { @Column (name="Address_ID") }, generator = "hilo-gen", type = @Type(type="long"))
	private Collection<Address> homeAddr = new ArrayList<>();
	
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
	/*public Set<Address> getHomeAddr() {
		return homeAddr;
	}
	public void setHomeAddr(Set<Address> homeAddr) {
		this.homeAddr = homeAddr;
	}*/
	public Collection<Address> getHomeAddr() {
		return homeAddr;
	}
	public void setHomeAddr(Collection<Address> homeAddr) {
		this.homeAddr = homeAddr;
	}

}