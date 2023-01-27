package entities;

import entities.interfaces.Printer;
import entities.interfaces.Scanner;

public class ComboDevice extends Device implements Printer, Scanner{

	public ComboDevice(String serialNumber) {
		super(serialNumber);
	}
	
	@Override
	public void processDoc(String doc) {
		System.out.println("processDoc - herdado pelo device");
		
	}

	@Override
	public String scan() {	
		return "Scan ComboDevice";
	}

	@Override
	public void print(String doc) {
		System.out.println("print - ComboDevice");
		
	}
	
	
}
