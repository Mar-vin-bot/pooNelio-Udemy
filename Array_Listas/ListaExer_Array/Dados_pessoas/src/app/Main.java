package app;

import java.util.Locale;
import java.util.Scanner;

import entities.People;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas serao digitadas?");
		int n = sc.nextInt();
		
		People[] pessoas = new People[n];
		
		for(int i=0; i<pessoas.length; i++) {
			System.out.println("Altura da "+(i+1)+" pessoa");
			double alt = sc.nextDouble();
			char sex = sc.next().charAt(0);
			pessoas[i] = new People(alt, sex);
		}
		
		double menor = pessoas[0].getAltura(), maior = pessoas[0].getAltura(), avg, sumAlt = 0;
		int numHomens = 0, numMulheres = 0;
		
		for(int i=0; i<pessoas.length; i++) {
			sumAlt = sumAlt + pessoas[i].getAltura();
			if(pessoas[i].getGenero() == 'f') {
				numMulheres++;
			}else {
				numHomens++;
			}
		}
		
		for(int i=0; i<pessoas.length; i++) {
			if(pessoas[i].getAltura()> maior) {
				maior = pessoas[i].getAltura();
			}
			if(pessoas[i].getAltura()< menor) {
				menor = pessoas[i].getAltura();
			}
		}
		
		avg = sumAlt/pessoas.length;
		
		System.out.println("Alturas "+menor+" "+maior);
		System.out.printf("Media %.2f%n",avg);
		System.out.println(numHomens);
		

	}

}
