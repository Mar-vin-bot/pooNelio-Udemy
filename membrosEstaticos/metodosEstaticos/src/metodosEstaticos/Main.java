package metodosEstaticos;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Main {
	
	/* Versão 3
	 * Nelio alves
	 * Udemy
	 * aula 70 metodos estaticos
	 */
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Entre com o raio do circulo");
		double raio = sc.nextDouble();
		
		double c = Calculator.calculaCirc(raio);
		double v = Calculator.volume(raio);
		
		System.out.printf("Circuferencia: %.2f%n", c);
		System.out.printf("Volume: %.2f%n ", v);
		System.out.printf("Valor PI: %.2f%n", Calculator.PI);
		
		
		
		sc.close();
	}

}
