package app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Employer;

public class Program {

	public static void main(String[] args) {

		List<Employer> list = new ArrayList<>();
		String path = "/home/m12/Documentos/GitHub/poo-nelioUdemy/Interface/Interface-Comparable/employes.csv";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String readLine = br.readLine();
			while (readLine != null) {
				String[] auxFields = readLine.split(",");
				list.add(new Employer(auxFields[0], Double.parseDouble(auxFields[1])));
				readLine = br.readLine();
			}
			Collections.sort(list);
			for (Employer element : list) {
				System.out.println(element.getName() + " - " + element.getSalary());
			}

		} catch (IOException e) {
			System.out.println("Error " + e.getMessage());
		}

	}

}
