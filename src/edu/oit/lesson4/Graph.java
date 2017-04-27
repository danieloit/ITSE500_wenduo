package edu.oit.lesson4;

public class Graph {

	public static void main(String[] args) {
		// square
        Square square = new Square();
        square.setWidth(2);
        System.out.println("The square width is " + square.getWidth() + ", area is " + square.getArea() + ".");
		//circle
        Circle circle  = new Circle();
        circle.setRadius(2);
        System.out.println("The circle radius is " + circle.getRadius() + ", area is " + circle.getArea() + ".");
        //rectangle
        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(4);
        rectangle.setWidth(3);
        System.out.println("The rectangle lengthth is " + rectangle.getHeight() +", width is " + rectangle.getWidth() + ", area is " + rectangle.getArea() + ".");
        
        //triangle
        Triangle triangle = new Triangle();
        triangle.setA(4);
        triangle.setB(3);
        triangle.setC(5);
        System.out.println("The triangle sides is " + triangle.getA() +" " + triangle.getB() + " "+ triangle.getC() +", area is " + triangle.getArea() + ".");
		
        
        
        
        
		
	}

}


class Square extends Graph {
    private int width;

    public Square() {
        
    }


    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }


    public int getArea() {
        return width * width;
    }
}


class Circle extends Graph {
    private int radius;

    public Circle() {
        
    }


    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }


    public double getArea() {
    	
        return 3.14 * radius * radius;
    }
}


class Rectangle extends Graph {
    private int height;
    private int width;
    public Rectangle(){
    	
    }
    public Rectangle(int height, int width) {
    this.height = height;
    this.width = width;
    }
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

	public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }


    public int getArea() {
        return height * width;
    }
}

class Triangle extends Graph {
    private int a;
    private int b;
    private int c;
    public Triangle(){
    	
    }
    public Triangle(int a, int b, int c) {
    this.a = a;
    this.b = b;
    this.c = c;
    }
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

	public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
    
    
    public double getArea() {
    	double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * ( s - c));
    }
}












