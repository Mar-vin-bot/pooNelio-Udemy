package app;

import java.util.HashMap;
import java.util.Map;

import entities.Product;

public class Program_2 {

	public static void main(String[] args) {

		Map<Product, Double> stock = new HashMap<>();

		Product p1 = new Product("TV", 700.00);
		Product p2 = new Product("Tablet", 987.77);
		Product p3 = new Product("Notebook", 1243.74);

		stock.put(p1, 1000.00);
		stock.put(p2, 754.00);
		stock.put(p3, 500.00);

		Product newProd = new Product("TV", 700.00);
		/*
		 * sem a implementação do equals and hashCode o retorno é false pois a
		 * comparação é feita por ponteiros. Após implementados os metodos na class
		 * Product e referencia passa a ser true
		 */

		System.out.println("Contains (newProd) " + stock.containsKey(newProd));

	}

}
