package edu.oit.lesson12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerDemo {


	public static void main(String[] args) {
		
		int number1= 100;
		int number2, result;		
		while(true){
			try{
				Scanner input = new Scanner(System.in);
				System.out.println("Enter division by: ");
				number2 = input.nextInt();
				result = number1 / number2;
					
				System.out.printf("The result is :%d\n", result);
				input.close();
				break;
			
			} catch (ArithmeticException e){
				System.out.println("The divison cannot be zero, please input again");
			//	e.printStackTrace();
				System.out.println(e.getCause());
			} catch (InputMismatchException e ){
				System.out.println("The divison should be int, please input again");
				System.out.println(e.getCause());
			} catch (Exception e){
				
			} finally {
				
			}
			
		}
	}	

}
