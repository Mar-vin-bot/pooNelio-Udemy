package app;

import java.util.Scanner;

import entities.PrintService_int;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		PrintService_int service = new PrintService_int();

		System.out.println("How many values");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			Integer value = sc.nextInt();
			service.addValue(value);
		}

		service.print();
		System.out.println("Frist " + service.frist());
	}
	
	/*
	 * o PrintService_int não é recomendado pois dificulta o reuso em outras 
	 * situação como string ou double etc
	 * Já o Object deixa o codigo muito aberto podendo conter uma diversidade de 
	 * tipos string, int etc
	 * A situação do generics deixa facilita o reuso e deixa o codigo mais fechado
	 * na situação só é aceito entrada de int
	 */

}
