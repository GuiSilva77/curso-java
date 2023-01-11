package application;

import java.util.Scanner;

import entities.BankAccount;

/*
 * Realizado em 10/01/23
 */
public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BankAccount account;

		System.out.printf("Enter account number: ");
		int accountNumber = sc.nextInt();

		sc.nextLine();
		System.out.printf("Enter account holder: ");
		String name = sc.nextLine();

		System.out.printf("Is there an initial deposit (y/n)?");
		double initialDeposit = 0;

		char option = sc.next().charAt(0);
		if (option == 'y') {
			System.out.printf("Enter initial deposit value: ");
			initialDeposit = sc.nextDouble();
			account = new BankAccount(accountNumber, name, initialDeposit);
		} else {
			account = new BankAccount(accountNumber, name);
		}

		System.out.println("Account data: ");
		System.out.println(account);

		System.out.printf("Enter a deposit value: ");
		double depositValue = sc.nextDouble();

		account.deposit(depositValue);

		System.out.println("Updated account data: ");
		System.out.println(account);

		System.out.printf("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();

		account.withdraw(withdrawValue);

		System.out.println("Updated account data: ");
		System.out.println(account);

		sc.close();

	}
}
