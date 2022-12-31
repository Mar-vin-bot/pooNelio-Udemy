package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;

public class Program {

	public static void main(String[] args) {

		/*
		 * git do nelio com soluções caso de duvidas
		 * https://github.com/acenelio/exceptions1-java
		 */

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		try {
		System.out.print("Room number:");
		int room = sc.nextInt();
		System.out.println("Check-in date: ");
		Date in = sdf.parse(sc.next());
		System.out.println("Check-out date: ");
		Date out = sdf.parse(sc.next());

		

		Reservation reservetion = new Reservation(room, in, out);
		System.out.println("Reservaton " + reservetion);

		System.out.println();
		
		System.out.println("Enter data to update the reservation:");
		System.out.println("Check-in date: ");
		in = sdf.parse(sc.next());
		System.out.println("Check-out date: ");
		out = sdf.parse(sc.next());
		
		reservetion.updateDates(in, out);
		System.out.println("Reservaton " + reservetion);
		
		}
		catch(ParseException e) {
			System.out.println("Enter with valid date ");
		}
		catch(IllegalArgumentException e) {
			System.out.println("Error reservation "+ e.getMessage());
		}

	}

}
