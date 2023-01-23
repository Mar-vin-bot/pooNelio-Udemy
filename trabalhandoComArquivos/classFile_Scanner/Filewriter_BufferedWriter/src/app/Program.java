package app;

import java.io.BufferedWriter;

import java.io.FileWriter;
import java.io.IOException;

public class Program {
	/*
	 * o parametro (,true) não permite que file seja deletado para criar um novo, em caso
	 * reprocessamento do script simplesmente são add novas linhas com conteúdo.
	 * 
	 * quando processado sem o par (, true) o delete e create da file é executado simultaneamente
	 */
	
	public static void main(String[] args) {

		String[] lines = new String[] { "Good morning", "Good night", "Good afernoon" };

		String path = "//home/m12/out.txt";

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine(); // quebra de linha
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
