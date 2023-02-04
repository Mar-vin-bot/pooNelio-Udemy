package app;

import java.util.Set;
import java.util.TreeSet;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Set<Product> set = new TreeSet<>();

		set.add(new Product("TV", 900.0));
		set.add(new Product("Notebook", 1200.0));
		set.add(new Product("Tablet", 400.0));

		
		
		for (Product x : set) {
			System.out.println(x);
		}
	}
	/*
	 * Para que o TreeSet ordene os obj da sua classe é necessario
	 * que esta tenha o implements Comparable<Classe> e o metodo 
	 * compereTo sobrescrito
	 */

}
