package app;

import java.util.Locale;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		Set<Integer> courseA = new TreeSet<>();
		Set<Integer> courseB = new TreeSet<>();
		Set<Integer> courseC = new TreeSet<>();
		

		System.out.print("How many students of course A? ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int aux = sc.nextInt();
			courseA.add(aux);
		}

		System.out.print("How many students of course B? ");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int aux = sc.nextInt();
			courseB.add(aux);
		}

		System.out.print("How many students of course C? ");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int aux = sc.nextInt();
			courseC.add(aux);
		}
		Set<Integer> result = new TreeSet<>(courseA);
		result.addAll(courseB);
		result.addAll(courseC);
		
		System.out.println("Total students "+result.size());

		sc.close();
	}

}
