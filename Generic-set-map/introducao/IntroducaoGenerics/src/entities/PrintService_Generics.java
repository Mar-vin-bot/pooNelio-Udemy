package entities;

import java.util.ArrayList;
import java.util.List;

//GENERICS <T>
public class PrintService_Generics<T> {
	
	private List<T> list = new ArrayList<>();
	
	public void addValue(T value) {
		list.add(value);
	}
	
	public T frist() {
		if(list.isEmpty()) {
			throw new IllegalStateException("List is empty");
		}
		return list.get(0);
	}
	
	
	public void print () {
		System.out.print("["+list.get(0));
		
		for(int i=1; i<list.size(); i++) {
			System.out.print(", "+list.get(i));
		}
		System.out.print("]");
	}
}
