package stud.subh.hibernate.ex2.ui;

import java.util.Scanner;

import stud.subh.hibernate.ex2.dao.AccountDAO;

public class AccountClosingUseCase {
	public static void main(String[] args) {

		System.out.println("**Account Closing**");

		// Presentation layer code
		Scanner scanner = new Scanner(System.in);
		System.out.println("Plaese Enter Account No. ");
		int acno = scanner.nextInt();

		// Service layer code (business logic)
		AccountDAO accountDAO = new AccountDAO();
		boolean flag = accountDAO.deleteAccount(acno);
		if(flag)
			System.out.println("Account Closing Successfully");
		else
			System.out.println("Account Aleardy Closed");
	}
}