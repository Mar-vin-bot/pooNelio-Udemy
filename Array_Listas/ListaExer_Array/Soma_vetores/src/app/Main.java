package app;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos valores vai ter cada vetor?");
		int n = sc.nextInt();
		
		int[] vet1 = new int[n];
		int[] vet2 = new int[n];
		int[] soma = new int[n];
		
		System.out.println("Digite os valores do vetor A");
		for(int i=0; i<vet1.length; i++) {
			vet1[i] = sc.nextInt();
		}
		
		System.out.println("Digite os valores do vetor B");
		for(int i=0; i<vet2.length; i++) {
			vet2[i] = sc.nextInt();
		}
		
		for(int i=0; i<soma.length; i++) {
			soma[i] = vet1[i]+ vet2[i];
		}
		
		System.out.println("VETOR RESULTANTE");
		for(int i=0; i<soma.length; i++) {
			System.out.println(soma[i]);
		}

	}

}
