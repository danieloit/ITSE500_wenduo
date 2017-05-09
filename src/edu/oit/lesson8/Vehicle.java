package edu.oit.lesson8;

public class Vehicle {
	private int speed;
	private int size;
	private int position;
	
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		vehicle.setSpeed(30);
		vehicle.setSize(100);
		vehicle.setPosition(0);
		
		System.out.println("Vehicle speed is " + vehicle.getSpeed());
        System.out.println("Vehicle initial size is " + vehicle.getSize());
        vehicle.move(5);
        System.out.println("Vehicle new position " + vehicle.getPosition());
        
        vehicle.speedUp(5);
        System.out.println("Vehicle speed up to " + vehicle.getSpeed());
        
        vehicle.speedDown(10);
        System.out.println("Vehicle speed down to " + vehicle.getSpeed());

		
		
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public void speedUp(int up){
		this.speed += up;
		
	}
	
	public void speedDown(int down){
		this.speed -=down;
		
	}
	
	public void move(int time){
		this.position += time*this.speed;
	}
	


}
