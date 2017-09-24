package stud.subh.frm.hibernate.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	
	static{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
		}
	}

	public static Connection getConnection() throws SQLException {

		return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "subh", "subh");
	}
}
