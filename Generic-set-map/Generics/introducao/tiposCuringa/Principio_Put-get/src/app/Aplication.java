package app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Aplication {

	/*
	 * Vamos fazer um método que copia os elementos de uma lista para uma outra
	 * lista que pode ser mais genérica que a primeira.
	 */

	/*
	 * Number é uma superclass da qual os wrapper de numeros extends é tipo mais
	 * generico de numero Object é classe da qual todos os wrapper extends sendo
	 * assim esta pode receber toda a variedade de tipos
	 */

	public static void main(String[] args) {

		List<Integer> myInt = Arrays.asList(1, 2, 3, 4, 5, 6);
		List<Double> myDouble = Arrays.asList(9.1, 92.2, 43.3);
		List<Object> myObject = new ArrayList<>();

		copy(myInt, myObject);
		printList(myObject);
		copy(myDouble, myObject);
		printList(myObject);

	}

	public static void copy(List<? extends Number> source, List<? super Number> target) {

		for (Number numb : source) {
			target.add(numb);
		}
	}

	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.print(obj + " ");

		}
		System.out.println();
	}

}
