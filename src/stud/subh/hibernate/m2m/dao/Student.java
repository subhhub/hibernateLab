package stud.subh.hibernate.m2m.dao;

import java.io.Serializable;
import java.util.List;

public class Student implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int sno;
	private String sname;
	private List<Course>courses;
	
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public List<Course> getCourses() {
		return courses;
	}
	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
}