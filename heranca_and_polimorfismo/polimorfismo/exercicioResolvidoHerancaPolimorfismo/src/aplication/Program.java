package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutSourceEmployee;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		List<Employee> list = new ArrayList<>();
		
		
		System.out.println("How many employee ? ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.println("Employee #"+(i+1)+" data");
			System.out.print("Outsorced ? (y/n)");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value hors: ");
			double valueHour = sc.nextDouble();
			
			
			if(ch == 'y') {
				System.out.print("Additional charge ");
				double addCharge = sc.nextDouble();
				Employee emp = new OutSourceEmployee(name, hours, valueHour, addCharge);
				list.add(emp);
			}else {
				list.add(new Employee(name, hours, valueHour)); //instanciado e add a lista
			}		
			
		}
		
		System.out.println("");
		System.out.println("Pagamento ");
		for(Employee x: list) {
			System.out.println(x.getName()+" - $"+String.format("%.2f", x.payment()));
		}
		
		
		
		sc.close();
	}

}
