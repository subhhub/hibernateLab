package stud.subh.hibernate.ex23.dao;

import java.io.Serializable;
import java.util.List;

public class Course implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int cno;
	private String cname;
	private List<Student>students;
	
	public int getCno() {
		return cno;
	}
	public void setCno(int cno) {
		this.cno = cno;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
}