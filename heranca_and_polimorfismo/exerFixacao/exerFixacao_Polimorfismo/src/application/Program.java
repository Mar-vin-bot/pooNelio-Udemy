package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UserdProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List <Product> list = new ArrayList<>();
		
		System.out.print("Enter the number of products:");
		int n = sc.nextInt();

		for(int i=0;i<n;i++) {
			System.out.println("Product #" + (i+1) + " data:");
			System.out.println("Common, used or imported (c/u/i)? ");
			char c = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			
			if(c == 'i') {
				System.out.print("Customs fee:");
				double fee = sc.nextDouble();
				Product prod = new ImportedProduct(name, price, fee);
				list.add(prod);
			}else if(c == 'u'){
				System.out.print("Manufacture date (DD/MM/YYYY):");
				Date dt = sdf.parse(sc.next());
				list.add(new UserdProduct(name, price, dt));
			}else {
				list.add(new Product(name, price));
			}
			
			
		}
		
		System.out.println("");
		System.out.println("PRICE TAGS");
		for(Product x: list) {
			System.out.println(x.priceTag());
		}
		
		sc.close();

	}

}
