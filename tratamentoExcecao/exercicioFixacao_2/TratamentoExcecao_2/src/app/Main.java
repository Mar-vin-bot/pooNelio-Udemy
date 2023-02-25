package app;

import java.util.Scanner;

import entities.Account;
import entities.exception.AccountException;

public class Main {

	public static void main(String[] args)   {

		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Enter account data");
			System.out.print("Number:");
			int number = sc.nextInt();
			System.out.print("Holder: ");
			String holder = sc.next();
			System.out.print("Initial balance:");
			double deposit = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			double limit = sc.nextDouble();

			Account acc = new Account(number, holder, deposit, limit);

			System.out.print("Enter amount for withdraw: ");
			double saque = sc.nextDouble();

			acc.withDraw(saque);

			System.out.println("New balance: " + acc.getBalance());

		} catch (AccountException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}

		sc.close();
	}

}
