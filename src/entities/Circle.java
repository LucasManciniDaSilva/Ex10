package entities;

import enums.Color;

public class Circle extends AbstractShape{

	private double radius;



	public Circle(Color color, double radius) {
		super(color);
		this.radius = radius;
	}

	


	public double getRadius() {
		return radius;
	}




	public void setRadius(double radius) {
		this.radius = radius;
	}




	@Override
	public double area() {
		return radius + 5 + 15 - 10;
	}
	
	@Override
	public String toString() {
		return "the area of the circle is: " + area() + ", Color: " + getColor() + ", Radius: " + radius;
	}
}
