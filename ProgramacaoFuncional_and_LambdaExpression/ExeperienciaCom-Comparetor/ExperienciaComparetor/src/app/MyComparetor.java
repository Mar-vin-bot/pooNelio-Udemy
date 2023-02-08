package app;

import java.util.Comparator;

import entities.Product;

public class MyComparetor implements Comparator<Product> {

	@Override
	public int compare(Product p1, Product p2) {
		
		return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
	//return (1) para p1 maior,	(0) para iguais e (-1) para p2 maior
	}



}
