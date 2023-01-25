package aplication;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.CarRental;
import entities.Veiculo;
import service.BrazilTaxService;
import service.RentalService;

public class Program {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("Ente with date rent");
		System.out.println("Enter model car");
		String model = sc.nextLine();
		System.out.println("Withdrawal dd/mm/yyyy HH:mm");
		LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
		System.out.println("Return dd/mm/yyyy HH:mm");
		LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);
		
		
		CarRental cr = new CarRental(start, finish, new Veiculo(model)); 
		
		System.out.println("Enter price per hour: ");
		double priceHour = sc.nextDouble();
		System.out.println("Enter price per day: ");
		double priceDay = sc.nextDouble();
		
		RentalService rental  = new RentalService(priceHour, priceDay, new BrazilTaxService() );
		
		rental.processInvoice(cr);
		
		System.out.println();
		System.out.println("FATURA ");
		System.out.println("Pagamento basico "+ cr.getInvoice().getBasicPAyment());
		System.out.println("Imposto "+ cr.getInvoice().getTax());
		System.out.println("Pagamento toral "+cr.getInvoice().getTotalPayment());
		
	
		
		
		
		sc.close();
	}

}
