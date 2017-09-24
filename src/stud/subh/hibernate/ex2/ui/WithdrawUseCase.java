package stud.subh.hibernate.ex2.ui;

import java.util.Scanner;

import stud.subh.hibernate.ex2.dao.AccountDAO;

public class WithdrawUseCase {
	public static void main(String[] args) {
		System.out.println("**Withdraw Amount**");
		
		//Presentation layer code
		Scanner scanner = new Scanner(System.in);
		System.out.println("Plaese Enter Account No. ");
		int acno = scanner.nextInt();
		System.out.println("Plaese Enter Amount");
		float amt = scanner.nextFloat();
		
		//Service layer code (business logic)
		AccountDAO accountDAO = new AccountDAO();			//account in transient state
		Account account = accountDAO.findAccount(acno);
		if(account==null)
			System.out.println("Account Not Exist");
		else{
			float bal = account.getBalance();
			if(bal>=amt){
				bal = bal-amt;
				account.setBalance(bal);
				accountDAO.updateAccount(account);
				System.out.println("Please Collect Amount Rs. "+amt);
			}
			else
				System.out.println("Insufficient balance");
		}
	}
}