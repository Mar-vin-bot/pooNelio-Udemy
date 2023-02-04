package app;

import java.util.HashSet;
import java.util.Set;

import entities.Product;

public class Program {
	public static void main(String[] args) {

		Set<Product> set = new HashSet<>();
		
		set.add(new Product("Tv", 900.00));
		set.add(new Product("Notebook", 1200.00));
		set.add(new Product("Tablet", 400.00));

		Product prod = new Product("Notebook", 1200.00);
		
		System.out.println(set.contains(prod));
		
		/*
		 * set.contains(prod) sem HashCode e equals na class
		 * product a saida no sysout é false pois a varredura é
		 * feita por referencia desse modo são referencias distintas
		 * 
		 * Quando inserido o hashcode e equals na classe product
		 * a varredura é feita por conteúdo ou seja Notebook 1200.00
		 * assim saida será true.
		 */
	}
}
