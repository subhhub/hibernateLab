package stud.subh.hibernate.ex6gen.dao;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.hibernate.HibernateException;
import org.hibernate.engine.SessionImplementor;
import org.hibernate.id.IdentifierGenerator;

public class LoanIDGenerator implements IdentifierGenerator{

	public Serializable generate(SessionImplementor sess, Object persistObj)
			throws HibernateException {

		System.out.println("GENERATOR : User Defined");
		
		String lnId = "LPHYD";
		
		try{
			Connection con = sess.connection();
			System.out.println("con : "+con);
			Statement  st = con.createStatement();
			ResultSet rs = st.executeQuery("select to_char(LOAN_SEQUENCE.nextval,'FM000') from dual");
			rs.next();
			lnId = lnId +rs.getString(1);
		}
		catch(SQLException e){
			System.out.println("EXCEPTION : LoanIDGenerator : "+e);
		}
		return lnId;
	}
}
