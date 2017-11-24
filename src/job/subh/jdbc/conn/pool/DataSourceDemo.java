package job.subh.jdbc.conn.pool;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.commons.dbcp2.BasicDataSource;

public class DataSourceDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		String QRY = "select e.id, e.firstName, e.lastName, e.salary, d.name as deptName "
				+ "from emp.employee as e inner join emp.department as d on e.departmentId = d.id limit 10";
		try {
			BasicDataSource bds = DataSource.getInstance().getBds();
			connection = bds.getConnection();
			statement = connection.prepareStatement(QRY);
			resultSet = statement.executeQuery();
			System.out.println("employeeId, employeeName, employeeSalary, employeeDepartment");
			while (resultSet.next()) {
				System.out.println(resultSet.getString("id") + ", "
						+ resultSet.getString("firstName") + " "
						+ resultSet.getString("lastName") + ", "
						+ resultSet.getString("salary") + ", "
						+ resultSet.getString("deptName"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null)
					resultSet.close();
				if (statement != null)
					statement.close();
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}