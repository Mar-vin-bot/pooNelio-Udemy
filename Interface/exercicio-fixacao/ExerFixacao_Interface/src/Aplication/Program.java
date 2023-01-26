package Aplication;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Contract;
import entities.Installment;
import service.ContractService;
import service.PaypalService;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Entre com os dados do contrato :");
		System.out.print("Numero :");
		int number = sc.nextInt();
		System.out.print("Data dd/mm/yyy :");
		LocalDate  dateContract = LocalDate.parse(sc.next(), dtf);
		System.out.print("Valor do contrato :");
		double value = sc.nextDouble();
		
		Contract contract = new Contract(number, dateContract, value);
		
		
		System.out.print("Entre com o numero de parcelas :");
		int nPar = sc.nextInt();
		
		
		ContractService service = new ContractService(new PaypalService());
		
		service.processContract(contract, nPar);
		
		
		
		
		System.out.println();
		System.out.println("Installments :");
		
		for(Installment element : contract.getInstallment()) {
			System.out.println(element);
		}
		
		
		
		
		
		
		sc.close();
	}

}
