package aplication;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
	
		method1();
		
		System.out.println("End of program");

	}
	
	public static void method1() {
		
		System.out.println("***** metodo1 start");
		method2();
		System.out.println("***** metodo1 end");
		
	}
	
	public static void method2() {
		
		System.out.println("***** metodo2 start");
		
		Scanner sc = new Scanner(System.in);
		
		try {
		System.out.println("Input with text ");
		String [] vet = sc.nextLine().split(" ");
		System.out.println("Input with position");
		int pos = sc.nextInt();
		System.out.println(vet[pos]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Ivalid position");
			e.printStackTrace(); //mostra a pilha de chamdas que gerou exeption
			sc.next();
		}
		catch (InputMismatchException e) {
			System.out.println("Pos different of number");
		}
		
		
		//ArrayIndexOutOfBoundsException : array estourado
		//InputMismatchException : entrada diferente de number
		
		sc.close();
		System.out.println("***** metodo2 end");	
	}
}
