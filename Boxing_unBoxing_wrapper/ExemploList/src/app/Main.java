package app;


import java.util.ArrayList;	
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> ex = new ArrayList<>();
		
		ex.add(20); //0
		ex.add(50);	//1
		ex.add(60);	//2
		
		//add novo elemento na pos 1
		ex.add(1, 1001);
		
		
		for(Integer var : ex) {
			System.out.println(var);
		}
		
		System.out.printf("Tamanho da lista %d%n ",ex.size());
		
		System.out.println("--------------------------------------------");
		
		ex.removeIf(x -> x < 50);
		
		for(Integer var : ex) {
			System.out.println(var);
		}
		
		System.out.println("------------Encontrar index-----------------");
		System.out.println("o index do numero 60 - "+ ex.indexOf(60));
		System.out.println("o index do numero 777 - "+ ex.indexOf(777)); //nao ta na lista
		
		
	}

}
