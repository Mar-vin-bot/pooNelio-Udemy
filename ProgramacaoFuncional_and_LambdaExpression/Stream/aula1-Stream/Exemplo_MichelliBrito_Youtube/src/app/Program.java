package app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import entities.Client;

public class Program {
	
	public static void main(String[] args) {
		
		List<Client> list = new ArrayList<>();
		
		list.add(new Client("Maria", "123", 10));
		list.add(new Client("Jake", "456", 159));
		list.add(new Client("Murdoc", "789", 123));
		
		list.forEach(c -> System.out.println(c.getPoint()));
		
		Stream<Client> str1 = list.stream().filter(x-> x.getPoint() > 10);
		
		System.out.println(Arrays.toString(str1.toArray()));
		
		Stream<Integer> str2 = list.stream().map(x -> x.getPoint() * 2);
		
		System.out.println(Arrays.toString(str2.toArray()));
		
		
	}

}
