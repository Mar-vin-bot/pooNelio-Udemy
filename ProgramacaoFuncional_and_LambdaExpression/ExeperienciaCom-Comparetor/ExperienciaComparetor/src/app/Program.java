package app;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entities.Product;

public class Program {
	public static void main(String[] args) {

		List<Product> p = new ArrayList<>();
		
		p.add(new Product("TV", 789.14));
		p.add(new Product("Notebook", 2954.78));
		p.add(new Product("Tablet", 1544.75));
		
		
		//Arrow function: 
		/*
		Comparator<Product> comp = (p1, p2) -> {
			return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		};
		p.sort(comp);
		*/	
		
		//pode resumur tirando chaves e return
		//Comparator<Product> comp = (p1, p2) ->  p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		//p.sort(comp);
		
		
		//tbm podemos resumir como
		p.sort((p1, p2) ->  p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

		
		
		//p.sort(new MyComparetor()); //1° metodo especifico implementando Comparator<T> na classe MyComparator
		
		
		for(Product el : p) {
			System.out.println(el);
		}
		
	}
}
