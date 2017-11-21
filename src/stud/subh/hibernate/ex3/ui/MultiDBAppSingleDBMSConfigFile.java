package stud.subh.hibernate.ex3.ui;

import java.sql.SQLException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import stud.subh.hibernate.ex3.dao.DBUtil;
import stud.subh.hibernate.ex3.dao.SessionUtil;

public class MultiDBAppSingleDBMSConfigFile {

	public static void main(String[] args) throws SQLException {

		System.out.println("**MULTI DATABASE APPLICATION (With Single Configuration File)**");

		MultiDBAppSingleDBMSConfigFile mdc = new MultiDBAppSingleDBMSConfigFile();
//		mdc.optionA();
		mdc.optionB();
	}
	
	/**
	 * without Session Utility class
	 * 
	 * @throws SQLException
	 */
	public void optionA() throws SQLException{
		Configuration configurationOrc = new Configuration();
//		configurationOrc.configure();	//if hibernate in root and it have its default name
		configurationOrc.configure("stud/subh/hibernate/ex3/mapping/hibernate.cfg.xml");
		SessionFactory sessionFactoryOrc = configurationOrc.buildSessionFactory();
		Session sessionOrc = sessionFactoryOrc.openSession(DBUtil.getOracleConnection());

		Account accountOrc = (Account) sessionOrc.get(Account.class, 1001);
		System.out.println("Acount Oracle=" + accountOrc.getName());

		
		Configuration  configurationMy = new Configuration();
//		configurationOrc.configure();	//if hibernate in root and it have its default name
		configurationMy.configure("stud/subh/hibernate/ex3/mapping/hibernate.cfg.xml");
		SessionFactory sessionFactoryMy = configurationMy.buildSessionFactory();
		Session sessionMy = sessionFactoryMy.openSession(DBUtil.getMySQLConnection());
		
		Account accountMy = (Account)sessionMy.get(Account.class, 420);
		System.out.println("Acount MySQL="+accountMy.getName());
	}
	
	/**
	 * Using Session Utility class
	 * @throws SQLException
	 */
	public void optionB() throws SQLException{
		
		Session sessionOrc = SessionUtil.getSession(DBUtil.getOracleConnection());
		Account accountOrc = (Account) sessionOrc.get(Account.class, 1001);
		System.out.println("Acount Oracle=" + accountOrc.getName());

		Session sessionMy = SessionUtil.getSession(DBUtil.getMySQLConnection());
		Account accountMy = (Account)sessionMy.get(Account.class, 420);
		System.out.println("Acount MySQL="+accountMy.getName());
	}

}
