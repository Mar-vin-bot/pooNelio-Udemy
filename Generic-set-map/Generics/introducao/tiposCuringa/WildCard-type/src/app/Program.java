package app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
	public static void main(String[] args) {
		/*
		 * Lista de integer não é subclass de Object List<Object> não é o supertipo de
		 * qualquer tipo de lista:
		 * 
		 * List<Object> myObjs = new ArrayList<Object>(); List<Integer> myNumbers = new
		 * ArrayList<Integer>(); myObjs = myNumbers; // erro de compilação
		 */

		// Diferente das classes
		Object obj;
		Integer x = 10;
		obj = x;

		// O supertipo de qualquer tipo de lista é List<?>. Este é um tipo curinga
		List<?> myObjs = new ArrayList<Object>();
		List<Integer> myNumbers = new ArrayList<Integer>();
		myObjs = myNumbers;
		
		/*
		Não é possivel add dados a uma coleção curinga
		List<?> myTest = new ArrayList<Integer>();
		myTest.add(5);
		*/
		
		// Com tipos curinga podemos fazer métodos q recebem um genérico de "qualquer
		// tipo": -> printList(List<?> list)
		List<Integer> myInt = Arrays.asList(5, 12, 17);
		printList(myInt);

		List<String> myStr = Arrays.asList("Maria", "João", "Paulo");
		printList(myStr);

	}

	//metodo generico
	public static void printList(List<?> list) {
		for (Object x : list) {
			System.out.println(x);
		}
	}

}
