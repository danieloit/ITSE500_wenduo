package edu.oit.lesson4;

import java.util.Scanner;

public class Fruit {
    private int number;
	public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple apple = new Apple();
 
        
        Strawberry strawberry = new Strawberry();
        
        
        Grape grape = new Grape();
        
        
        Scanner input = new Scanner(System.in);
		int [] harvest = new int [3];
		int sum = 0;
        System.out.println("Input apple number:");
        harvest [0] = input.nextInt();
        apple.setNumber(harvest[0]);
        System.out.println("Input strawberry number:");
        harvest [1] = input.nextInt();
        strawberry.setNumber(harvest[1]);
        System.out.println("Input apple number:");
        harvest [2] = input.nextInt();
        grape.setNumber(harvest[2]);
        sum = apple.getNumber() + strawberry.getNumber()+ grape.getNumber();
        System.out.println("Total number of the harvest is " + sum);
        
       
	}

}



class Apple extends Fruit {
	
}
class Grape extends Fruit {
	
}
class Strawberry extends Fruit {
	
}