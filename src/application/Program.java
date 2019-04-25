package application;

import java.util.Scanner;

import entities.AbstractShape;
import entities.Circle;
import enums.Color;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the radius of the circle: ");
		double radius = sc.nextDouble();
		System.out.println("Enter the color of the circle: ");
		String colorstg = sc.next();
		Color color = Color.valueOf(colorstg.toUpperCase());
		AbstractShape circle = new Circle(color, radius);
		
		
		System.out.println(circle);
		
		sc.close();
		
		
		
		

	}

}
