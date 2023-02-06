package app;

import java.util.Map;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {
		
		Map<String, String> cookies = new TreeMap<>();
		
		cookies.put("Name", "Marvin");
		cookies.put("Email", "Marvi@gmail.com");
		cookies.put("Telefone", "3245678");
		
		cookies.put("Telefone", "78946"); //PUT NÃO ACEITA REPEAT KEY, SOBRESCREVEU
		
		System.out.println("Contem chave (name) "+cookies.containsKey("Name")); //true
		//System.out.println("Contem chave (name) "+cookies.containsKey("name")); 
		System.out.println("Value telefone --> "+cookies.get("Telefone"));
		System.out.println("cep : "+cookies.get("cep")); //null
		
		
		System.out.println("saida");
		for(String key: cookies.keySet()) {
			System.out.println(key+" : "+cookies.get(key));
		}
		

	}

}
