package edu.oit.lesson5;

public class Square extends Shape {

	private int width;
	
	
	public int getWidth() {
		return width;
	}


	public void setWidth(int width) {
		this.width = width;
	}


	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return this.width * this.width;
	}

}
