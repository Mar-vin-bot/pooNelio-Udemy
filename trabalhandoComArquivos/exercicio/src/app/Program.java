package app;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Product> list = new ArrayList<>();

		System.out.println("Enter with path folder");
		String strPath = sc.nextLine();

		File sourceFile = new File(strPath);

		// new File(sourceFile.getParent() + "/out").mkdir();
		boolean success = new File(sourceFile.getParent() + "/out").mkdir(); // create folder

		String targetFile = sourceFile.getParent() + "/out/summary.csv"; // path file in foloder

		try (BufferedReader br = new BufferedReader(new FileReader(strPath))) {

			String line = br.readLine();

			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Product(fields[0], Double.parseDouble(fields[1]), Integer.parseInt(fields[2])));

				line = br.readLine();
			}

			try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFile))) {

				for (Product item : list) {
					bw.write(item.getName() + ", " + String.format("%.2f", item.total()));
					bw.newLine();
				}

				System.out.println(success + " ??");

			} catch (IOException e) {
				System.out.println("Error witing menssage (bw)" + e.getMessage());
			}
		} catch (IOException e) {
			System.out.println("Error writing mensassage " + e.getMessage());
		}

		sc.close();

	}
}
