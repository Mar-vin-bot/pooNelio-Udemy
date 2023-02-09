package utils;

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
	
}
