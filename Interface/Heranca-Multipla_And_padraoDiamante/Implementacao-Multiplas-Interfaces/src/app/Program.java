package app;

import entities.ComboDevice;


public class Program {
	
	public static void main(String[] args) {
		
		ComboDevice c = new ComboDevice("2081");
		c.processDoc("My dissertation");
		c.print("My dissertation");
		System.out.println(c.scan());
		
		
	}

}
