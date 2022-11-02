package principal;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Main {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("Whats is dolar price? ");
		double priceDolar = sc.nextDouble();
		
		System.out.println("How many dollars will be bougth? ");
		double dollar = sc.nextDouble();
		
		double saida = CurrencyConverter.dollarToReal(priceDolar, dollar);
		
		System.out.printf("Amount to be paid in reais %.2f%n", saida);
		
		
		
		sc.close();
	}

}
