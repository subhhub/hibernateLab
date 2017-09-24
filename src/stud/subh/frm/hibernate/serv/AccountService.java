package stud.subh.frm.hibernate.serv;

import stud.subh.frm.hibernate.dao.exception.AccountNotFoundExcpetion;
import stud.subh.frm.hibernate.serv.exception.ProcessException;

public interface AccountService {

	public float calculateInterest(int accno) throws ProcessException, AccountNotFoundExcpetion;
}
