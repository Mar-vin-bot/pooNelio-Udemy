package app;

import java.util.Scanner;

import entities.PrintService_Object;

public class Program_Object {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		PrintService_Object obj = new PrintService_Object();
		
		
		System.out.print("How many values ");
		int n = sc.nextInt();
		
		obj.addValue("maria");
		
		for(int i=0;i<n; i++) {
			int values = sc.nextInt();
			obj.addValue(values);
		}

		obj.print(); 
		System.out.println();
		System.out.println("Frist "+obj.frist());
		
		sc.close();
	}
	
	

}
