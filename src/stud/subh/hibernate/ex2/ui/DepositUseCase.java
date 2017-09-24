package stud.subh.hibernate.ex2.ui;

import java.util.Scanner;

import stud.subh.hibernate.ex2.dao.AccountDAO;

public class DepositUseCase {

	public static void main(String[] args) {

		System.out.println("**Deposit Amount**");

		// Presentation layer code
		Scanner scanner = new Scanner(System.in);
		System.out.println("Plaese Enter Account No. ");
		int acno = scanner.nextInt();
		System.out.println("Plaese Enter Deposit Amount");
		float amt = scanner.nextFloat();

		// Service layer code (business logic)
		AccountDAO accountDAO = new AccountDAO();
		Account account = accountDAO.findAccount(acno);
		if (account == null)
			System.out.println("Account Not Exist");
		else {
			account.setBalance(account.getBalance()+amt);
			accountDAO.updateAccount(account);
			System.out.println("Balance Successfully Deposited");
		}
	}
}