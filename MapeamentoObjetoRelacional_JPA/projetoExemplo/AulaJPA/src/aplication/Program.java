package aplication;

import dominio.Pessoa;

public class Program {
	
	public static void main(String[] args) {
	
		Pessoa p1 = new Pessoa(1, "Carlos silva", "carlos@gmamil.com");
		Pessoa p2 = new Pessoa(2, "Ana vitoria", "Ana@gmamil.com");
		Pessoa p3 = new Pessoa(3, "julia mara", "juliaMaria@gmamil.com");
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
	}
}
