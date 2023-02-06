package app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Map<String, Integer> map = new HashMap<>();

		String path = "/home/m12/Documentos/GitHub/poo-nelioUdemy/Generic-set-map/Map/resoluctionExercise/in.csv";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();

			while (line != null) {
				String[] fields = line.split(",");
				String name = fields[0];
				int cont = Integer.parseInt(fields[1]);

				if (map.containsKey(name)) {
					int aux = map.get(name);
					map.put(name, cont + aux);

				} else {
					map.put(name, cont);
				}

				line = br.readLine();
			}

			for (String x : map.keySet()) {
				System.out.println(x + " : " + map.get(x));
			}

		} catch (IOException e) {
			System.out.println("Erro " + e.getMessage());
		}

		sc.close();

	}

}
