package app;

import java.util.LinkedHashSet;
import java.util.Set;

public class Program {

	public static void main(String[] args) {

		Set<String> product = new LinkedHashSet<>();

		product.add("Tv");
		product.add("Notebook");
		product.add("Tablet");

		// System.out.println(product.contains("Notebook"));
		// product.removeIf(x -> x.length() >= 3 );
		// product.removeIf(x -> x.charAt(x.length() - 1) == 't');
		

		for (String x : product) {
			System.out.println(x);
		}

	}

}
