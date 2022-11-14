package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int l = sc.nextInt();
		int c = sc.nextInt();
		int mat[][] = new int [l][c];
		
		System.out.println("Digite os numeros da matriz");
		for(int i=0; i< mat.length; i++) {
			for(int j=0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println("Digite o numero que deseja buscar");
		int x = sc.nextInt();
		
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				if(mat[i][j] == x) {
					System.out.println("Position "+i+", "+j);
					if(i>0) {
						System.out.println("UP "+mat[i-1][j]);
					}
					if(i < mat.length-1) {
						System.out.println("DOWN "+mat[i+1][j]);
					}
					if(j>0) {
						System.out.println("LEFT "+mat[i][j-1]);
					}
					if(j < mat[i].length - 1) {
						System.out.println("RIGHT "+mat[i][j+1]);
					}
				}
			}
		}
		
		
	
		sc.close();
	}
}
