package entities;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		
		
		System.out.println("Digite o nome ");
		String nome = sc.next();	
		System.out.println("Digite o salario bruto ");
		double sal = sc.nextDouble();
		System.out.println("Digite o imposto ");
		double imposto = sc.nextDouble();
		
		Employee employe = new Employee(nome, sal, imposto);
		
		System.out.println(employe.toString());
		
		System.out.println("-----------Reajuste");
		
		System.out.println("Percentual de reajuste");
		double reajuste = sc.nextDouble();
		
		employe.IncreaseSalary(reajuste);
		
		//o toString é chamando implicitamente 
		System.out.println(employe);
		
		
		
		
		
		
		
	}

}
