package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Main {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account conta;
		
		System.out.println("Enter account number: ");
		int numeroConta = sc.nextInt();
		
		
		System.out.println("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		
		System.out.println("Is there na initial deposit (y/n) ?");
		char resp = sc.next().charAt(0);
		
		if (resp == 'y') {
			System.out.println("Enter initial deposit value: ");
			double initialDepo = sc.nextDouble();
			 conta = new Account(numeroConta, name, initialDepo);
		}else {
			 conta = new Account(numeroConta, name);
		}
		
		
		System.out.println("Account data:");
		System.out.println(conta.toString());
		System.out.println("");
		
		System.out.println("Enter a deposit value:");
		double valueDposit = sc.nextDouble();
		conta.deposito(valueDposit);
		
		System.out.println("Updated account data:");
		System.out.println(conta.toString());
		
		System.out.println("");
		System.out.println("Enter a withdraw value:");
		double valueWithdraw = sc.nextDouble();
		conta.withdraw(valueWithdraw);
		
		System.out.println("Updated account data:");
		System.out.println(conta.toString());
		
			
		sc.close();
		
	}

}
