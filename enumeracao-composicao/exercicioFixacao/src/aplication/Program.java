package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.OrdemItem;
import entities.Order;
import entities.Product;
import entities.enums.OrderStaus;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter client data ");
		System.out.print("Nome ");
		String name = sc.nextLine();
		System.out.print("email ");
		String email = sc.next();
		System.out.print("Birth date (DD/MM/YYYY):  ");
		Date birthDate = sdf.parse(sc.next());
		
		Client client = new Client(name, email, birthDate);
		
		
		System.out.println("Enter order Data");
		System.out.print("Status ");
		OrderStaus status = OrderStaus.valueOf(sc.next());
		
		Order order  = new Order (new Date(), status, client);
		
		
		System.out.println("How many to this order");
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			System.out.println("Enter "+(i+1)+" item data");
			System.out.print("Product name ");
			sc.nextLine();
			String nameProduct = sc.nextLine();
			System.out.println("Price ");
			double price = sc.nextDouble();
			
			Product product = new Product(nameProduct, price);
			
			System.out.println("Quantity ");
			int quantity = sc.nextInt();
			
			OrdemItem ordemItem = new OrdemItem(quantity, price, product);
			
			order.addItem(ordemItem);
			
			
		}
		
		System.out.println();
		System.out.println(order);

		
		
		
	}

}
