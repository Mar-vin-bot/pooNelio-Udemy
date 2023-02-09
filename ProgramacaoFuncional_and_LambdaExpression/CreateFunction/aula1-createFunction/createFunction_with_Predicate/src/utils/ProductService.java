package utils;

import java.util.List;

import entities.Product;

public class ProductService {

	public double filterPrice(List<Product> prod) {
		double sum =0; 
		for(Product el : prod) {
			if(el.getName().charAt(0) == 'T') {
				sum += el.getPrice();
			}
		}
		return sum;
	}
	
}
