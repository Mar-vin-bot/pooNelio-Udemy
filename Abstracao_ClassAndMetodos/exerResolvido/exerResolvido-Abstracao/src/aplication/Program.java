package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Shape> list = new ArrayList<>();
		
		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.println("Shape "+(1+i)+" data");
			System.out.print("Retangle or circle (r/c) ");
			char sh = sc.next().charAt(0);
			System.out.print("Color (BLACK, RED OR BLUE) ");
			Color color = Color.valueOf(sc.next());
			
			if(sh == 'r') {
				System.out.print("Width ");
				double width = sc.nextDouble();
				System.out.print("Height ");
				double height = sc.nextDouble();
				
				Shape ret = new Rectangle(color, width, height);
				list.add(ret);
				
			}else {
				System.out.print("Radius ");
				double radius = sc.nextDouble();
				
				list.add(new Circle(color, radius));
			}
		}
		
		System.out.println();
		System.out.println("Shape area");
		for(Shape shape : list) {
			System.out.println(String.format("%.2f", shape.area()));
		}

	}

}
