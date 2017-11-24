package stud.subh.frm.hibernate.anno.o2o.ui;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import stud.subh.frm.hibernate.anno.o2o.dao.Employee;
import stud.subh.frm.hibernate.anno.o2o.dao.SessionUtil;
import stud.subh.frm.hibernate.anno.o2o.dao.Vehicle;

public class OneToOneMappingApplication {
	public static void main(String[] args) {
		System.out.println("**One to One Application**");
		
		/*Session session = SessionUtil.getSession();
		
		Vehicle vl = new Vehicle();
		vl.setVehicleName("Dominor2");
		
		Vehicle vl1 = new Vehicle();
		vl1.setVehicleName("Dominor3");

		Employee emp = new Employee();
		emp.setName("name3");
		emp.setVehicle(vl);
		emp.setVehicle(vl1);
		
		Transaction txn = session.beginTransaction();
		session.save(emp);
		session.save(vl);
		session.save(vl1);
		txn.commit();
		System.out.println("Record Saved Successfully");
		
		session.clear();*/
		
//		select order_1.code, item.code, item.quantity from Order order_1 inner join order_1.item item;
		
		Session session2 = SessionUtil.getSession();
		Query qry = session2.createQuery(" FROM   Vehicle v inner JOIN Employee e "
				);
		List ls = qry.list();
		
		System.out.println(ls.size());
	}
}