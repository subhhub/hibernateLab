package stud.subh.frm.hibernate.ui;

import java.util.Scanner;

import stud.subh.frm.hibernate.dao.exception.AccountNotFoundExcpetion;
import stud.subh.frm.hibernate.serv.AccountService;
import stud.subh.frm.hibernate.serv.AccountServiceFactory;
import stud.subh.frm.hibernate.serv.exception.ProcessException;

public class AccountUI {

	public static void main(String[] args) {

		System.out.println("***Hibernate Applicatino Home (Based On Hibernate Internal Architecute Or DAL Architecture)***");
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Accout No : ");
		int accno = sc.nextInt();
		
//		AccountService as = new AccountServiceImpl();
		AccountService as = AccountServiceFactory.getAccountService();
		
		float f = 0;
		try {
			f = as.calculateInterest(accno);
			System.out.println("You Got Interest Rs = "+f);
		} catch (ProcessException e) {
			System.out.println("Processing Error");
		} catch (AccountNotFoundExcpetion e) {
			System.out.println("Account Does Not Exist");
		}
	}
}