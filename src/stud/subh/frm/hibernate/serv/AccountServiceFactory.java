package stud.subh.frm.hibernate.serv;

public class AccountServiceFactory {

	private static AccountServiceImpl asi = new AccountServiceImpl();
	
	private AccountServiceFactory() {
	}
	
	/*public static AccountServiceImpl getAccountService(){
		return asi;
	}*/
	
	/*public static AccountServiceImpl getAccountService(){
		
		AccountServiceImpl asi = null;
		synchronized(syncObject_){
			asi = new AccountServiceImpl();
		}
		
		return asi;
	}*/
	
	public static AccountServiceImpl getAccountService(){
		
		AccountServiceImpl asi = null;
		synchronized(AccountServiceFactory.class){
			asi = new AccountServiceImpl();
		}
		
		return asi;
	}
}
