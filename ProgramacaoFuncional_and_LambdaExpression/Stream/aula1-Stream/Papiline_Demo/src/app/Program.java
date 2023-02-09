package app;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {
	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		Stream<Integer> str = list.stream().map(x -> x * 10);
		System.out.println(Arrays.toString(str.toArray()));
		
		/*
		 * O método reduce() executa uma função reducer (fornecida por você) 
		 * para cada elemento do array, resultando num único valor de retorno.
		 */
		
		int sum = list.stream().reduce(0, (x,y) -> x + y);
		System.out.println("Sum "+sum);
		
		int mult = list.stream().reduce(1, (x,y) -> x*y);
		System.out.println("Mult "+mult);
		
		/*
		 * MAP passada por argumento para cada elemento do Array 
		 * e devolve um NOVO ARRAY COMO RESULTADO
		 */
		
		List<Integer> newList = list.stream()
				.filter(x -> x % 2 == 0)	//filtra numeros pares
				.map(x -> x * 10)			// multiplica-os por 10
				.collect(Collectors.toList());
	
		System.out.println(Arrays.toString(newList.toArray()));	
		
	
	}
}
