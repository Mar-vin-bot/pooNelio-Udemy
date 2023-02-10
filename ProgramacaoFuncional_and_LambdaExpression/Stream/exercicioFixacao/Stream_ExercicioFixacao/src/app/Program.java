package app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employe;

public class Program {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		String path = "/home/m12/Documentos/GitHub/poo-nelioUdemy/ProgramacaoFuncional_and_LambdaExpression/Stream/exercicioFixacao/in.csv";
		
		System.out.println("Enter salary ");
		double userSalary = sc.nextInt();
		
		System.out.println("Enter  whit lycris");
		Character lycris = sc.next().charAt(0);
		
		
		List<Employe> list = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String line = br.readLine();
			while(line != null) {
				String [] fields = line.split(",");
				list.add(new Employe(fields[0], fields[1], Double.parseDouble(fields[2])));
				line = br.readLine();
			}
			
			System.out.println("Email of people whose salary is more than "+String.format("%.2f", userSalary)+" :" );
			
			//comparador	//não se faz necessario o comparator para esse exc
			//Comparator<String> comp = (str1, str2) -> str1.toUpperCase().compareTo(str2.toUpperCase());
			
			List<String> listEmail = list.stream()
					.filter(x -> x.getSalary() >= userSalary)
					.map(p -> p.getEmail())
					.sorted()	//.sorted(comp.reversed()) //ordem decrescente
					.collect(Collectors.toList());
			
			for(String x : listEmail) {
				System.out.println(x);
			}
			
			
			
			double sum = list.stream()
					.filter(x -> x.getName().charAt(0) == lycris.toUpperCase(lycris))
					.map(x -> x.getSalary())
					.reduce(0.0, (x,y) -> x+y);
			
			System.out.println("Sum of salary of people whose name starts with R$"+lycris.toUpperCase(lycris)+" "+ sum);
					
			
			
		} catch (IOException e) {
			System.out.println("Error "+e.getMessage());
		}
		
		sc.close();
	}

}
