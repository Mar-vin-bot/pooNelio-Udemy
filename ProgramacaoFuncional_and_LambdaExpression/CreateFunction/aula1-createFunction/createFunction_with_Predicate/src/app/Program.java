package app;

import java.util.ArrayList;
import java.util.List;

import entities.Product;
import utils.ProductService;

public class Program {

	public static void main(String[] args) {
		
		List<Product> prod = new ArrayList<>();
		
		prod.add(new Product("TV",500.78 ));
		prod.add(new Product("Notebook",2758.85 ));
		prod.add(new Product("Tablet", 456.12 ));
		prod.add(new Product("Mouse", 57.12 ));
		
		ProductService ps = new ProductService();
		
		double sum = ps.filterPrice(prod, x -> x.getName().charAt(0) == 'T' );
		
		
		List<Product> listP = new ArrayList<>();
		
		
		listP = (ps.filterName(prod, x -> x.getName().charAt(0) == 'T' ));
		
		System.out.println(sum);
		//System.out.println((ps.filterName(prod, x -> x.getName().charAt(0) == 'T' )));
		
		for(Product x: listP) {
			System.out.println(x);
		}

	}

}
