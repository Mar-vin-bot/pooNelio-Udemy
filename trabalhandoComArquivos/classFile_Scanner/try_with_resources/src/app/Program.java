package app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {
	/*
	 * Neste modelo não é necesario finalizar obj com finaly o proprio try faz
	 * a instanciação e fecha obj se necessário
	 */
	

	public static void main(String[] args) {

		String path = "//home/m12/in.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();

			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}

		} catch (IOException e) {
			System.out.println("Erro " + e.getMessage());
		}
	}

}
