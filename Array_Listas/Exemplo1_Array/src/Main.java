import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
				
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		double [] vet = new double [n];
		double sum = 0;
		
		
		for(int i=0; i<vet.length; i++) {
			vet[i] = sc.nextDouble();
			sum = sum + vet[i];
		}
		
		System.out.println(sum/n);
		
		
		sc.close();
	}

}
