package application;

import java.util.Locale;
import java.util.Scanner;

import models.entities.Account;
import models.exception.AccountException;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		try {
		System.out.println("Enter account data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Holder: ");
		sc.next();
		String holder = sc.nextLine();
		System.out.print("Inititial limit: R$");
		double initialLimit = sc.nextDouble();
		System.out.print("WithDraw limit: R$");
		double withDraw = sc.nextDouble();
		
		Account account = new Account(number, holder, initialLimit, withDraw);
		
		System.out.println();
		System.out.print("Enter amount for withdraw: ");
		double amount = sc.nextDouble();
		account.withDraw(amount);
		System.out.println("New ballance: R$"+String.format("%.2f", account.getBallance()));
		}
		
		catch (AccountException e) {
			System.out.println("Withdraw error: "+e.getMessage());
		}
		
		
		
		
	}
}
