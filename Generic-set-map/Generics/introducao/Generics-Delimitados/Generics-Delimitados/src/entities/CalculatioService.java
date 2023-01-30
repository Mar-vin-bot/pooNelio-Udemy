package entities;

import java.util.List;

public class CalculatioService {

	public static <T extends Comparable<T>> T max(List<T> list) {
		if (list.isEmpty()) {
			throw new IllegalStateException("List can't be empty");
		}
		T max = list.get(0);
		for (T item : list) {
			if (item.compareTo(max) > 0) { 		//comparaTo return: 0, -1, 1;
				max = item;
			}
		}
		return max;
	}

}
