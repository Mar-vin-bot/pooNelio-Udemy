package app;

import java.util.ArrayList;
import java.util.List;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

public class Program {

	public static void main(String[] args) {

		List<Shape> myShape = new ArrayList<>();
		myShape.add(new Rectangle(3.0, 2.0));
		myShape.add(new Circle(2.0));

		List<Circle> myCircle = new ArrayList<>();
		myCircle.add(new Circle(3.0));
		myCircle.add(new Circle(6.0));

		System.out.println("Total de areas é circle " + totalArea(myCircle));

		System.out.println("Total de areas é " + totalArea(myShape));
	}

	public static double totalArea(List<? extends Shape> list) {
		//ao usar um metodo com lista curinga não é possivel add novos valores
		// list.add(new Rectangle(5, 4)); 
		double sum = 0;
		for (Shape el : list) {
			sum += el.area();
		}
		return sum;
	}

}
