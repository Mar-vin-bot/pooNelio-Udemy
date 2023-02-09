package app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		String path = "/home/m12/Documentos/GitHub/poo-nelioUdemy/ProgramacaoFuncional_and_LambdaExpression/Stream/exercicioResolvido/in.csv";
		List<Product> list = new ArrayList<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String line = br.readLine();
			while(line != null){
				String[] fields = line.split(",");
				list.add(new Product(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();
			}
			
			// calc avg
			double avg = list.stream()
					.map(p -> p.getPrice())
					.reduce(0.0, (x,y) -> x+y / list.size());
			
			System.out.println("Avarege price "+ String.format("%.2f", avg));
			
			//comparador
			Comparator<String> comp = (s1, s2)-> s1.toUpperCase().compareTo(s2.toUpperCase());
					
			List<String> listNames = list.stream()
					.filter(p -> p.getPrice() < avg)
					.map(p -> p.getName())
					.sorted(comp.reversed())	//alterar a ordem
					.collect(Collectors.toList());
			
			//reference metodo
			listNames.forEach(System.out::println);
			
			
		}catch (IOException e) {
			System.out.println("Error "+e.getMessage() );
		}
		
	}

}
