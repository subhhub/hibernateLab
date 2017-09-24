package stud.subh.frm.hibernate.dao;

public class DAOFactory {

	static private AccountDAO accountDAO = new AccountDAOImpl();
	private DAOFactory(){}
	public static AccountDAO getAccount(){
		return accountDAO;
	}
}