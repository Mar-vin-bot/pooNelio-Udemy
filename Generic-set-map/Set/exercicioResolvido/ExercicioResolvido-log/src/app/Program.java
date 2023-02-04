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

		Set<LogEntry> set = new HashSet<>();

		String path = "/home/m12/Documentos/GitHub/poo-nelioUdemy/Generic-set-map/Set/exercicioResolvido/log.csv";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				set.add(new LogEntry(fields[0], Date.from(Instant.parse(fields[1]))));

				line = br.readLine();
			}

			System.out.println("Número de usuarios distintos: " + set.size());

		} catch (IOException e) {
			System.out.println("Eror " + e.getMessage());
		}

	}

}
