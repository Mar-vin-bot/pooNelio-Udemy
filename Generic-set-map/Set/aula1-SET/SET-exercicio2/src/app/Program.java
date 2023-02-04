package app;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {

		Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));

		// uniao
		Set<Integer> uniao = new TreeSet<>(a); // set conj (a)
		uniao.addAll(b);
		System.out.println("Uniao a,b " + uniao);

		// Intesection
		Set<Integer> intersection = new TreeSet<>(a); // set conj (a)
		intersection.retainAll(b);
		System.out.println("Intersection a,b " + intersection);

		// Difference
		Set<Integer> difference = new TreeSet<>(a); // set conj (a)
		difference.removeAll(b);
		System.out.println("Difference a,b " + difference);

	}

}
