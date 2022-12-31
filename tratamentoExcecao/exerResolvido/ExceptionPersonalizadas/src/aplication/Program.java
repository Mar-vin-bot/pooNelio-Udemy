package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;

public class Program {

	public static void main(String[] args) throws ParseException {

		// SOLUÇÃO MUITO RUIM

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Room number:");
		int room = sc.nextInt();
		System.out.println("Check-in date: ");
		Date in = sdf.parse(sc.next());
		System.out.println("Check-out date: ");
		Date out = sdf.parse(sc.next());

		if (!out.after(in)) {
			System.out.println("Error in reservation: Check-out date must be after check-in date");
		} else {
			Reservation reservetion = new Reservation(room, in, out);
			System.out.println("Reservaton " + reservetion);

			System.out.println();
			System.out.println("Enter data to update the reservation:");
			System.out.println("Check-in date: ");
			in = sdf.parse(sc.next());
			System.out.println("Check-out date: ");
			out = sdf.parse(sc.next());

			String returnMetodoUpdate = reservetion.updateDates(in, out);

			if (returnMetodoUpdate != null) {
				System.out.println("Error in reservation "+returnMetodoUpdate);
			} else {
				System.out.println("Reservaton " + reservetion);
			}
		}

	}

}
