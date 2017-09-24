package stud.subh.frm.hibernate.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import stud.subh.frm.hibernate.dao.exception.AccountNotFoundExcpetion;
import stud.subh.frm.hibernate.dao.exception.DataAccessException;

public class AccountDAOImpl implements AccountDAO {

	public Account getAccount(int accno) throws DataAccessException, AccountNotFoundExcpetion {
		
		Account ac = null;
		
		Connection con = null;
		PreparedStatement ps=null;
		ResultSet rs= null;
		
		try {
			con = DBUtil.getConnection();
			
			System.out.println("accno="+accno);
			
			ps=con.prepareStatement("select * from account where accno=?");
			ps.setInt(1,accno);
			rs=ps.executeQuery();
			if(rs.next()){
				ac = new Account();
				ac.setACCNO(rs.getString(1));
				ac.setNAME(rs.getString(2));
				ac.setBALANCE(rs.getFloat(3));
			}
			else
				throw new AccountNotFoundExcpetion("Account Missing");
			
		} catch (SQLException e) {
			System.out.println("Log AccountDAOImpl : SQLException "+e);
			throw new DataAccessException();
		}
		catch (AccountNotFoundExcpetion e) {
			System.out.println("Log AccountDAOImpl : AccountNotFoundExcpetion "+e);
			throw new AccountNotFoundExcpetion("Account Missiong");
		}
		finally{
			try {
				if(con!=null)
					con.close();
				if(ps!=null)
					ps.close();
				if(rs!=null)
					rs.close();
			} catch (SQLException e) {}
		}
		return ac;
	}
}