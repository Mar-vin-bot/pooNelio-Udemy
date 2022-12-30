package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		List <TaxPayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			System.out.println("Tax payer #"+(i+1)+" data ");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Anual income: ");
			double income = sc.nextDouble();
			
			if(ch =='i') {
				System.out.print("Health expenditures: ");
				double health = sc.nextDouble();
				list.add(new Individual(name, income, health));
				
			}else {
				System.out.print("Number of employees: ");
				int employees = sc.nextInt();		
				list.add(new Company(name, income, employees));
			}
			
			
		}
		
		
		double sum = 0;
		System.out.println();
		System.out.println("TAXES PAID: ");
		for(TaxPayer tx: list) {	
			sum += tx.tax();
			System.out.println(tx.getName()+": $"+String.format("%.2f", tx.tax()));
			
		}
		System.out.println();
		System.out.println("TOTAL TAXES: $"+String.format("%.2f", sum));
		
		sc.close();
	}
	
}
