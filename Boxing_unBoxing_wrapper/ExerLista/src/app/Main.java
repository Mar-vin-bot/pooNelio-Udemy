package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entitie.Employee;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> employee = new ArrayList<>();
		
		System.out.println("Quantos trabalhadores deseja digitar");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.println();
			System.out.println("Employee "+ (i+1));
			System.out.print("Id ");
			int id = sc.nextInt();
			sc.nextLine();
			
			while(verificationId(employee, id)) {
				System.out.println("Id already taken. Try again ");
				id = sc.nextInt();
				sc.nextLine();
			}
				
			System.out.print("Name ");
			String name = sc.nextLine();
			System.out.print("Salaty ");
			double salary = sc.nextDouble();
			
			employee.add(new Employee(id, name, salary)); //chamando a lista e dentro .add instanciando obj
		}
		
		System.out.println("Digite o id do trabalhador que receberá o aumento");
		int idEmployee = sc.nextInt();

		//forma de procurar o id sem usar a função position
		//Employee emp = employee.stream().filter(x -> x.getId() == idEmployee).findFirst().orElse(null);
		
		Integer pos = position (employee, idEmployee);
		if(pos == null) {
			System.out.println("This is id not exist");
		}else {
			System.out.println("Qual a porcentagem de aumento que receberá ");
			double perc = sc.nextDouble();
			employee.get(pos).increaseSalary(perc);
		}
		
		
		System.out.println("List of employees:");
		for(Employee tra: employee) {
			System.out.println(tra);
		}
		
		
		
	}
	
	//outra forma de fazer sem o stream()
	public static Integer position(List<Employee> outraLista, int id) {
		for(int i=0; i<outraLista.size(); i++) {
			if(outraLista.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
	
	//verificar se id ja existe para não haver repetição na inserção do user
	public static boolean verificationId(List<Employee> lista, int id) {
		Employee emp = lista.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
		/*
		 * .stream() transforma a lista em stream assim pode se usar função de alta ordem como filter
		 * os elementos recebe o alias de x e onde o x.getId == id será retornado o primeiro
		 * ou então retornara null
		 */
	}

}
