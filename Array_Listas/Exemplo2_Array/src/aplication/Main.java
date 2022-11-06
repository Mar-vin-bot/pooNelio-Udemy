package aplication;

import java.util.Locale;
import java.util.Scanner;

import entitie.Prodructs;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		Prodructs [] vet = new Prodructs[n];
		
		for(int i=0; i<vet.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vet[i] = new Prodructs(name, price);
		}
		
		double sum = 0.0;
		for(int i=0; i<vet.length; i++) {
			sum = sum + vet[i].getPrice();
		}
		
		double avg = sum/n;
		
		System.out.printf("%.2f%n", avg);
		
		sc.close();
	}

}
