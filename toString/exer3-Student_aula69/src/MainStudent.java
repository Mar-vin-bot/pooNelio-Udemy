import java.util.Locale;
import java.util.Scanner;

public class MainStudent {
	
	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		
		System.out.println("Digite o nome do estudante");
		String nome = sc.next();
		 
		 
		System.out.println("Digite o valor da primeira nota");
		double nota1 = sc.nextDouble();
		System.out.println("Digite o valor da segunda nota");
		double nota2 = sc.nextDouble();
		System.out.println("Digite o valor da terceira nota");
		double nota3 = sc.nextDouble();

		Student student = new Student(nome, nota1, nota2, nota3);
		
		
		
		System.out.println(student);
		
		
	}

}
