package aplication;

import java.util.Locale;
import java.util.Scanner;

import entitie.People;

public class Main {

	private static final String[][] String = null;

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantas pessoas serão inseridas");
		int n = sc.nextInt();

		People[] vet = new People[n];

		for (int i = 0; i < vet.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			int age = sc.nextInt();
			double alt = sc.nextDouble();
			vet[i] = new People(name, age, alt);
		}
		
		double sumAlt = 0;
		for(int i=0; i<vet.length; i++) {
			sumAlt = sumAlt + vet[i].getHeight();
		}
		
		double cont = 0;
		
		System.out.println("User com menos de 16 anos");
		for (int i=0; i<vet.length; i++) {
			if(vet[i].getAge()<16) {
				cont++;
				System.out.println(vet[i].getName());
			}
		}
		
		
		double porcentagem = (cont/vet.length)*100;
		double avg = sumAlt / vet.length;
		
		System.out.println("Pessoas com menos de 16 anos: "+porcentagem+" %");
		
		System.out.printf("Altura média %.2f%n", avg);
		
		
		

	}

}
