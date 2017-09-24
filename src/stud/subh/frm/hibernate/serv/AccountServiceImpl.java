package stud.subh.frm.hibernate.serv;

import stud.subh.frm.hibernate.dao.Account;
import stud.subh.frm.hibernate.dao.AccountDAO;
import stud.subh.frm.hibernate.dao.DAOFactory;
import stud.subh.frm.hibernate.dao.exception.AccountNotFoundExcpetion;
import stud.subh.frm.hibernate.dao.exception.DataAccessException;
import stud.subh.frm.hibernate.serv.exception.ProcessException;

public class AccountServiceImpl implements AccountService {

	public float calculateInterest(int accno) throws ProcessException, AccountNotFoundExcpetion {

//		AccountDAOImpl ac = new AccountDAOImpl();		//without factory direct instantiation
		AccountDAO ac = DAOFactory.getAccount();
		
		float in = 0;
		try {
			Account acn = ac.getAccount(accno);
			
			in = acn.getBALANCE()*10/12;
			
		} catch (DataAccessException e) {
			throw new ProcessException();
		} 
		/*catch (AccountNotFoundExcpetion e) {		//No need rethrow becauze it only happened exception chaneged
			throw new AccountNotFoundExcpetion();
		}*/
		
		return in;
	}
}