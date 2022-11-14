package app;

import java.util.Locale;
import java.util.Scanner;

import entities.Program;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("How many rooms will be rented ");
		int n = sc.nextInt();
		
		Program[] vetRoom = new Program[10];	//VETOR DE OBJ
		
		for(int i=0; i<n; i++) {
			sc.nextLine();
			System.out.println("Enter whit "+ (1+i)+" name");
			String name = sc.nextLine();
			System.out.println("Enter whit "+(1+i)+" email");
			String email = sc.next();
			System.out.println("Enter whit "+ (1+i) +" room");
			int room = sc.nextInt();
			
			vetRoom[room] = new Program(name, email); //INSTANCIA OBJ E PASSA SUAS REF PARA VETOR NA POSIÇÃO room
			
			/* OUTRA FORMA DE FAZER 
			 * Program prog = new Program(name, email)
			 * vetRoom[room] = prog;
			 */
		}
		
		System.out.println("Busy room");
		for(int i=0; i<vetRoom.length; i++) {
			if(vetRoom[i] != null) {
				System.out.println(i+": "+vetRoom[i].toString());
			}
		}
		

	}

}
