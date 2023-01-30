package entities;

import java.util.ArrayList;
import java.util.List;

public class PrintService_int {

	private List<Integer> list = new ArrayList<>();

	public void addValue(Integer value) {
		list.add(value);
	}

	public int frist() {
		if (list.isEmpty()) {
			throw new IllegalStateException("Lista vazia");
		}
		return list.get(0);
	}

	public void print() {
		System.out.print("[" + list.get(0));

		for (int i = 1; i < list.size(); i++) {
			System.out.print(", " + list.get(i));
		}
		System.out.print("]");
	}

}
