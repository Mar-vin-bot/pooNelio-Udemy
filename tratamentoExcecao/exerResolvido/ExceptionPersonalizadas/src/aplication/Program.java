package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;
import model.exception.DomainException;

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
		System.out.print("Check-in date: ");
		Date in = sdf.parse(sc.next());
		System.out.print("Check-out date: ");
		Date out = sdf.parse(sc.next());

		//instancia da reservation
		Reservation reservetion = new Reservation(room, in, out);
		System.out.println("Reservaton " + reservetion.toString());

		//update reservation
		System.out.println();
		System.out.println("Enter data to update the reservation:");
		System.out.print("Check-in date: ");
		in = sdf.parse(sc.next());
		System.out.print("Check-out date: ");
		out = sdf.parse(sc.next());
		
		//set update reservation and print update
		reservetion.updateDates(in, out);
		System.out.println("Reservaton " + reservetion);
		}
		
		//catch exigido pelo SimpleDateFormat
		catch(ParseException e) {
			System.out.println("Enter with valid date ");
		}
		//catch com class exception caso algum if do update seja validado
		catch(DomainException e) {
			System.out.println("Error reservation: "+ e.getMessage());
		}

	}

}
