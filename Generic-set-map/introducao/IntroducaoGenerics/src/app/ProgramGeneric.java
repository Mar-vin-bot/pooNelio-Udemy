package app;

import java.util.Scanner;

import entities.PrintService_Generics;

public class ProgramGeneric {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		PrintService_Generics<Integer> generic = new PrintService_Generics<Integer>();
		
		
		System.out.print("How many values ");
		int n = sc.nextInt();
		
		for(int i=0;i<n; i++) {
			int values = sc.nextInt();
			generic.addValue(values);
		}

		generic.print(); 
		System.out.println();
		System.out.println("Frist "+generic.frist());
	}

}
