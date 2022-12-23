package aplication;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Departament;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Entre com dpto name");
		String dpto = sc.nextLine();
		System.out.println("Enter worker data");
		System.out.println("Name: ");
		String workerName = sc.nextLine();
		System.out.println("Level: ");
		String workerLevel = sc.nextLine();
		System.out.println("Base salary");
		double workerSalary = sc.nextDouble();
		
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel),workerSalary, new Departament(dpto) );
		
		System.out.println("How many contracts");
		int n = sc.nextInt();
		
		for(int i=0; i< n; i++) {
			System.out.println("Entre com o contrato numero "+(i+1));
			System.out.println("Date DD/MM/YYYY");
			Date contractDate = sdf.parse(sc.next());
			System.out.println("Valor por hora");
			double valorPorHora = sc.nextDouble();
			System.out.println("Duration ");
			int hors = sc.nextInt();
			HourContract contract  = new HourContract(contractDate, valorPorHora, hors);
			worker.addContract(contract);
		}
		
		System.out.println();
		System.out.println("Entre com o mes e ano para calcular o contrato ");
		String monthAndYear = sc.next();
		int month = Integer.parseInt( monthAndYear.substring(0, 2));
		int year = Integer.parseInt( monthAndYear.substring(3));
		
		System.out.println("Name " +worker.getName());
		System.out.println("Departament "+ worker.getDpto().getName());
		System.out.println("Income for "+monthAndYear+" - "+worker.income(year, month));
		
		
		
		sc.close();

	}

}
