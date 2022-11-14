package app;

import java.util.Locale;
import java.util.Scanner;

public class Aplication {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		
		int n = sc.nextInt();
		
		int [][] mat = new int[n][n];
		
		for(int i = 0; i< n; i++) {			//linha
			for(int j=0; j< n; j++) {		//coluna
				mat[i][j] = sc.nextInt();
			}
		}
		
		//diagonal princial são as casas iguais como 0,0 - 1,1 - 2,2 - x,x...
		System.out.println("Diagonal principal");
		for (int i=0; i<mat[i].length; i++) {
			System.out.print(mat[i][i]+" ");
		}
		
		System.out.println();
		
		//para numeros negativos
		System.out.println("Números negativos");
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				if(mat[i][j] < 0) {
					System.out.print(mat[i][j]);
				}
			}
		}
		//mat[i].length = quantidade de colunas
		
		sc.close();
	}

}
