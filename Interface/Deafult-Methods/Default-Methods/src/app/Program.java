package app;

import java.util.Locale;
import java.util.Scanner;

import entities.BrazilTaxService;
import entities.UsaTaxService;
import entities.service.TaxService;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Value: ");
		double value = sc.nextDouble();
		System.out.print("Month: ");
		int month = sc.nextInt();
		
		TaxService tx = new BrazilTaxService(2.0);
		
		//TaxService ts = new UsaTaxService(1.0);
		
		double payment = tx.payment(value, month);
		
		
		System.out.print("Pagamento após 3 meses "+ String.format("%.2f", payment));
		
		
		sc.close();
	}

}
