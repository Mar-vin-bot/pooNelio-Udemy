import java.io.File;
import java.util.Scanner;

public class Program {
	/*
	 * talvez necessite de (2 //) para iniciar ex: 
	 *	"//home/m12/in.txt"
	 *
	 *while (sc.hasNextLine()) enquanto houver proxima linha
	 *
	 *antes de fechar o scnner deve se verificar se foi instanciado dentro try
	 *por isso a validação dentro do if
	 */

	public static void main(String[] args) {

		File file = new File("/home/m12/in.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}

		} catch (Exception e) {
			System.out.println("Error " + e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}
		}
	}
}
