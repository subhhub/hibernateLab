package stud.subh.hibernate.ex3.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	
	static{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("EXCEPTION DBUtil "+e);
		}
	}

	public static Connection getOracleConnection() throws SQLException {

		return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "subh", "subh");
	}
	public static Connection getMySQLConnection() throws SQLException {

		return DriverManager.getConnection("jdbc:mysql://localhost:3306/hibernatdb", "root", "mysql");
	}
}