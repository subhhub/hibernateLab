package stud.subh.hibernate.ex3.ui;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MultiDBAppPerDBMSConfigFile {
	public static void main(String[] args) {
		System.out.println("**MULTI DATABASE APPLICATION (With Multiple Configuration File)**");
		
		Configuration  configurationOrc = new Configuration();
		configurationOrc.configure("stud/subh/hibernate/ex3/mapping/hibernateOracle.cfg.xml");
		SessionFactory sessionFactoryOrc = configurationOrc.buildSessionFactory();
		Session sessionOrc = sessionFactoryOrc.openSession();
		
		Account accountOrc = (Account)sessionOrc.get(Account.class, 1001);
		System.out.println("Acount Oracle="+accountOrc.getName());
		
		Configuration  configurationMy = new Configuration();
		configurationMy.configure("stud/subh/hibernate/ex3/mapping/hibernateMySQL.cfg.xml");
		SessionFactory sessionFactoryMy = configurationMy.buildSessionFactory();
		Session sessionMy = sessionFactoryMy.openSession();
		
		Account accountMy = (Account)sessionMy.get(Account.class, 420);
		System.out.println("Acount MySQL="+accountMy.getName());
	}
}