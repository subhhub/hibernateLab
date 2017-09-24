package stud.subh.frm.hibernate.dao;

import stud.subh.frm.hibernate.dao.exception.AccountNotFoundExcpetion;
import stud.subh.frm.hibernate.dao.exception.DataAccessException;

/**
 * @author subh
 * DAO Interface 
 */
public interface AccountDAO {

	public Account getAccount(int accno) throws DataAccessException, AccountNotFoundExcpetion;
}
