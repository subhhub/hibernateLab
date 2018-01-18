package job.subh.jdbc;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCTransactionExample {

	private static final String DB_DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String DB_CONNECTION = "jdbc:oracle:thin:@localhost:1521:MKYONG";
	private static final String DB_USER = "user";
	private static final String DB_PASSWORD = "password";

	public static void main(String[] argv) throws SQLException {

		Connection dbConnection = null;
		PreparedStatement preparedStatementInsert = null;
		PreparedStatement preparedStatementUpdate = null;

		String insertTableSQL = "INSERT INTO DBUSER" + "(USER_ID, USERNAME, CREATED_BY, CREATED_DATE) VALUES"
				+ "(?,?,?,?)";
		String updateTableSQL = "UPDATE DBUSER SET USERNAME =? " + "WHERE USER_ID = ?";

		try {
			dbConnection = getDBConnection();
			dbConnection.setTransactionIsolation(3);	//Connection Isolation Level

			dbConnection.setAutoCommit(false);

			preparedStatementInsert = dbConnection.prepareStatement(insertTableSQL);
			preparedStatementInsert.setInt(1, 999);
			preparedStatementInsert.setString(2, "mkyong101");
			preparedStatementInsert.setString(3, "system");
			preparedStatementInsert.setTimestamp(4, getCurrentTimeStamp());
			preparedStatementInsert.executeUpdate();

			preparedStatementUpdate = dbConnection.prepareStatement(updateTableSQL);
			// preparedStatementUpdate.setString(1,
			// "A very very long string caused db error");
			preparedStatementUpdate.setString(1, "new string");
			preparedStatementUpdate.setInt(2, 999);
			preparedStatementUpdate.executeUpdate();

			dbConnection.commit();

			System.out.println("Done!");

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			dbConnection.rollback();
		} finally {
			if (preparedStatementInsert != null) {
				preparedStatementInsert.close();
			}
			if (preparedStatementUpdate != null) {
				preparedStatementUpdate.close();
			}
			if (dbConnection != null) {
				dbConnection.close();
			}
		}
	}

	private static Connection getDBConnection() {

		Connection dbConnection = null;

		try {
			Class.forName(DB_DRIVER);
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}

		try {
			dbConnection = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);
			return dbConnection;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		return dbConnection;
	}

	private static java.sql.Timestamp getCurrentTimeStamp() {
		java.util.Date today = new java.util.Date();
		return new java.sql.Timestamp(today.getTime());
	}
}