package utils;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import entities.Product;

public class ProductService {

	public double filterPrice(List<Product> prod, Predicate<Product> condicao) {
		double sum =0; 
		for(Product el : prod) {
			if(condicao.test(el)) {
				sum += el.getPrice();
			}
		}
		return sum;
	}
	
	public List<Product> filterName(List<Product> prod, Predicate<Product> condicaoName) {
		List <Product> element = new ArrayList<>();
		
		for(Product el : prod) {
			if(condicaoName.test(el)) {
				element.add(new Product(el.getName(), el.getPrice()));
			}
		}
		return element;
	}
	
}
