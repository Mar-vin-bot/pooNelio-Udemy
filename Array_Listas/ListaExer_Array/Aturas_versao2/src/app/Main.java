package app;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas a ser digitadas");
		int n = sc.nextInt();
		
		String [] names = new String[n];
		double[] alturas = new double[n];
		int[] idades = new int[n];
		
		for(int i=0; i<names.length; i++) {
			System.out.println("Digite os dados da "+ (i+1)+" pessoa");
			names[i]= sc.next();
			idades[i]	 = sc.nextInt();
			alturas[i]	 = sc.nextDouble();
		}
		
		double soma = 0;
		for(int i=0; i<alturas.length; i++) {
			soma += alturas[i];
		}
		
		double avgAlt = soma/alturas.length;
		System.out.printf("A média das alturas é, %.2f%n", avgAlt);
		
		int cont = 0;
		for(int i=0; i<idades.length; i++) {
			if(idades[i]< 16) {
				cont++;
			}
		}
		
		double percent = cont * 100.0 / n;
		System.out.printf("Porcentagem de pessoas com menos de 16 anos %.1f%%%n ", percent);
		
		
		for(int i=0;i<n; i++ ) {
			if(idades[i] < 16) {
				System.out.println(names[i]);
			}
		}
		
		
		
		
		
		
		
		
		sc.close();

	}

}
