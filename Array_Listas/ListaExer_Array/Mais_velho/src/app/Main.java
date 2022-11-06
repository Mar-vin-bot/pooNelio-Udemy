package app;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantas pessoas vc quer digitar");
		int n = sc.nextInt();
		
		String[] nome = new String[n];
		int[] idade = new int[n];

		for (int i = 0; i < nome.length; i++) {
			System.out.println("Digite os dados da " + (i + 1) + "º pessoa");
			sc.nextLine();
			nome[i] = sc.nextLine();
			idade[i] = sc.nextInt();
		}

		int aux = 0;
		String auxName = null;
		for (int j = 0; j < idade.length; j++) {
			for (int i = 0; i < nome.length; i++) {
				if (idade[i] > aux) {
					aux = idade[j];
					auxName = nome[i];
				}
			}
		}
		
		System.out.println(auxName+": "+aux+" anos");

	}

}
