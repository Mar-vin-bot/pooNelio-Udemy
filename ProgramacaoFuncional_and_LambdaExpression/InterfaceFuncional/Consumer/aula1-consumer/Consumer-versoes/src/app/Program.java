package app;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import entities.Product;
import utils.PriceUpdate;

public class Program {
	/*
	 * CONSUMER RETORNA UM METODO VOID
	 * 
	 * Fazer um programa que, a partir de uma lista de produtos, remova da lista
	 * somente aqueles cujo preço mínimo seja 100.
	 */
	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		//usando Lambda
		list.forEach((p) -> p.setPrice(p.getPrice() * 1.1));
		
		// para metodo NÃO STATICO
		//list.forEach(Product::naoStaticoPriceUpdate);

		// reference metodo
//		list.forEach(Product :: staticPriceUpdate);

		// metodo 1
		// list.forEach(new PriceUpdate());

		// reference metodo
		list.forEach(System.out::println);

	}

}
