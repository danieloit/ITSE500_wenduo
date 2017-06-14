package edu.oit.extra;

public class Circle {

	private double radius = 1;
	private String color = "red";

	public Circle() {

	}

	public Circle(double r) {
		radius = r;
	}

	public static void main(String[] args) {
		Circle circle = new Circle(5);
		Circle circle1 = new Circle();
		System.out.println("The area of circle is: " + circle.getArea() + "color is " + circle.color);
		;
		System.out.println("The area of circle1 is: " + circle1.getArea() + "color is " + circle1.color);
	}

	public double getRadius() {
		return radius;
	}

	public double getArea() {
		return radius * radius * Math.PI;
	}
}

