package job.subh.jdbc.conn.pool;

import org.apache.commons.dbcp2.BasicDataSource;

/**
 * @author ashraf
 *
 */
public class DataSource {

	private static final String MYSQL_DRIVER_CLASS_NAME = "com.mysql.jdbc.Driver";
	private static final String MYSQL_DB_URL = "jdbc:mysql://localhost:3306/emp";
	private static final String MYSQL_DB_USER = "root";
	private static final String MYSQL_DB_PASSWORD = "root123";
	
	private static final String ORACLE_DRIVER_CLASS_NAME = "oracle.jdbc.driver.OracleDriver";
	private static final String ORACLE_DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String ORACLE_DB_USER = "subh";
	private static final String ORACLE_DB_PASSWORD = "subh";
	
	private static final int CONN_POOL_SIZE = 5;

	private BasicDataSource bds = new BasicDataSource();

	private DataSource() {
		//Set database driver name
		bds.setDriverClassName(ORACLE_DRIVER_CLASS_NAME);
		//Set database url
		bds.setUrl(ORACLE_DB_URL);
		//Set database user
		bds.setUsername(ORACLE_DB_USER);
		//Set database password
		bds.setPassword(ORACLE_DB_PASSWORD);
		//Set the connection pool size
		bds.setInitialSize(CONN_POOL_SIZE);
	}

	private static class DataSourceHolder {
		private static final DataSource INSTANCE = new DataSource();
	}

	public static DataSource getInstance() {
		return DataSourceHolder.INSTANCE;
	}

	public BasicDataSource getBds() {
		return bds;
	}

	public void setBds(BasicDataSource bds) {
		this.bds = bds;
	}
}