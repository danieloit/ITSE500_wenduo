package edu.oit.lesson10;

public class Fruit {
	public static int count = 0;
	public final String flavor;
	private String color;
	public Fruit(){
		count++;
	}
	public void printCount(){
		System.out.println(Fruit.count);
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public Fruit(String color){
		super();
		this.flavor="sweet";
		this.color = color;
	}
	
	
}
