package stud.subh.hibernate.ex2.ui;

import java.util.Scanner;

import stud.subh.hibernate.ex2.dao.AccountDAO;

public class AccountOpeningUseCase {

	public static void main(String[] args) {

		//Presentation layer code
		Scanner scanner = new Scanner(System.in);
		System.out.println("Plaese Enter Account No. ");
		int acno = scanner.nextInt();
		System.out.println("Plaese Enter Account Holder Name. ");
		String name = scanner.next();
		System.out.println("Plaese Initial Balance");
		float bal = scanner.nextFloat();
		
		//Service layer code (business logic)
		AccountDAO accountDAO = new AccountDAO();
		Account account = new Account();
		account.setAccountno(acno);
		account.setBalance(bal);
		account.setName(name);
		accountDAO.saveAccount(account);
		System.out.println("Account Open Successfully");
	}

}
