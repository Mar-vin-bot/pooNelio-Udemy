package app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import enitites.LogEntry;

public class Program {
	public static void main(String[] args) {

		String path = "/home/m12/Documentos/GitHub/poo-nelioUdemy/Generic-set-map/Set/exercicioResolvido/log.csv";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			Set<LogEntry> set = new HashSet<>();
			/*
			 *usado o hashset pois ele é o mais rapido e a ordem não importa 
			 * no momento da inserção usuarios repetidos são barrados assim o size é suficiente p/ saber qtd
			 */
			

			String line = br.readLine();

			while (line != null) {
				String[] fields = line.split(",");
				set.add(new LogEntry(fields[0], Date.from(Instant.parse(fields[1]))));

				line = br.readLine();
			}

			System.out.println("Total de usuários: " + set.size());
			System.out.println();
			
			for(LogEntry element : set) {
				System.out.println(element);
			}

		} catch (IOException e) {
			System.out.println("Eror " + e.getMessage());
		}

	}

}
