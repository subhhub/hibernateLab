package stud.subh.hibernate.ex28.ui;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;

import stud.subh.hibernate.ex28.dao.SessionUtil;

public class StoreProcApplication {
	public static void main(String[] args) throws SQLException {
		System.out.println("**NativeSQL Stored Procedure Application**");
		
		Session session = SessionUtil.getSession();
		
		/* Hibernate JDBC Style */
		/*Connection con = session.connection();
		CallableStatement cs = con.prepareCall("{call changebal(?,?)}");
		cs.setInt(1, 1002);
		cs.setInt(2, 40000);
		
		session.beginTransaction().begin();
		cs.execute();
		session.beginTransaction().commit();*/
		
		/* Pure Hibernate Style */
//		SQLQuery sqry = session.createSQLQuery("{call changebal(?,?)}");
		/*Query sqry = session.createSQLQuery("{call changebal(?,?)}");
		sqry.setParameter(0, 1002);
		sqry.setParameter(1, 40000);
		
		session.beginTransaction().begin();
		sqry.executeUpdate();
		session.beginTransaction().commit();*/
		
		/* Hibernate Named Query Procedure Call Style */
//		SQLQuery sqry = (SQLQuery) session.getNamedQuery("chngBal");
		Query sqry = session.getNamedQuery("chngBal");
		sqry.setParameter(0, 1002);
		sqry.setParameter(1, 40000);
		
		session.beginTransaction().begin();
		sqry.executeUpdate();
		session.beginTransaction().commit();

		session.close();
	}
}