package job.subh.jdbc.conn.pool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.commons.dbcp2.ConnectionFactory;
import org.apache.commons.dbcp2.PoolableConnection;
import org.apache.commons.dbcp2.PoolableConnectionFactory;
import org.apache.commons.dbcp2.PoolingDriver;
import org.apache.commons.dbcp2.Utils;
import org.apache.commons.pool2.ObjectPool;
import org.apache.commons.pool2.impl.GenericObjectPool;

/**
 * @since 1.7
 *
 */
public class PoolableConnectionMain {
	private static String URI = "jdbc:oracle:thin:@localhost:1521:xe";
	private static String user = "subh";
	private static String password = "subh";

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// 1. Register the Driver to the jbdc.driver java property
		PoolConnectionFactory.registerJDBCDriver(PoolConnectionFactory.ORACLE_DRIVER);

		// 2. Create the Connection Factory (DriverManagerConnectionFactory)
		ConnectionFactory connectionFactory = PoolConnectionFactory.getConnFactory(URI, user, password);

		// 3. Instantiate the Factory of Pooled Objects
		PoolableConnectionFactory poolfactory = new PoolableConnectionFactory(connectionFactory, null);

		// 4. Create the Pool with the PoolableConnection objects
		ObjectPool<PoolableConnection> connectionPool = new GenericObjectPool<PoolableConnection>(poolfactory);

		// 5. Set the objectPool to enforces the association (prevent bugs)
		poolfactory.setPool(connectionPool);

		// 6. Get the Driver of the pool and register them
		PoolingDriver dbcpDriver = PoolConnectionFactory.getDBCPDriver();
		dbcpDriver.registerPool("dbcp-jcg-example", connectionPool);

		// 7. Get a connection and use them
		try {
			Connection connJCG = DriverManager.getConnection("jdbc:apache:commons:dbcp:dbcp-jcg-example");

			// Print Some Properties.
			System.out.println("Hashcode: " + connJCG.hashCode());
			System.out.println("JDBC Driver: " + connJCG.getMetaData().getDriverName());
			System.out.println("URI DB: " + connJCG.getMetaData().getURL());

			// 8. Close the connection to return them to the pool. Instead of connJCG.close();
			Utils.closeQuietly(connJCG);

		} catch (SQLException e) {
			System.err.println("There was an error: " + e.getMessage());
		}

	}
}
