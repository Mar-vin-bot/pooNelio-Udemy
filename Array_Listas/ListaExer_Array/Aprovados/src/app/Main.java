package app;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos alunos serão digitados");
		int n = sc.nextInt();

		String[] names = new String[n];
		double[] nota1 = new double[n];
		double[] nota2 = new double[n];

		for (int i = 0; i < names.length; i++) {
			System.out.println("Digite a nota do " + (i + 1) + "º aluno");
			sc.nextLine();
			names[i] = sc.nextLine();
			nota1[i] = sc.nextDouble();
			nota2[i] = sc.nextDouble();

		}
		
		System.out.println("Alunos aprovados:");
		for(int i=0; i<names.length;i++) {
			if ((nota1[i] + nota2[i]) >= 12) {
				System.out.println(names[i]);
			}
		}


	}

}
