package stud.subh.hibernate.ex23.ui;

import java.util.List;

import org.hibernate.Session;

import stud.subh.hibernate.ex23.dao.Course;
import stud.subh.hibernate.ex23.dao.SessionUtil;
import stud.subh.hibernate.ex23.dao.Student;

public class RelationM2MApplication {
	public static void main(String[] args) {
		System.out.println("**Relation many-to-many Application**");
		
		Session session = SessionUtil.getSession();
		
		Student s1 = (Student)session.get(Student.class,101);
		System.out.println("Name : "+s1.getSname());
		System.out.println("SID : "+s1.getSno());
		List<Course>courses = s1.getCourses();
		for(Course c : courses)
			System.out.println("Course : "+c.getCname());
		
		Course c1 = (Course)session.get(Course.class, 2001);
		System.out.println("Course : "+c1.getCname());
		System.out.println("CourseID : "+c1.getCno());;
		List<Student>students = c1.getStudents();
		for(Student s : students)
			System.out.println("sname :"+s.getSname());
		
		session.close();
	}
}