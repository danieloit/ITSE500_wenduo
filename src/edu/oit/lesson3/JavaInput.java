package edu.oit.lesson3;

import java.util.Scanner;

public class JavaInput {

    public static void main(String[] args) {
    
    int number1, number2, sum;
    
    Scanner input = new Scanner(System.in);
    System.out.println("Enter first multiple:");
    number1 = input.nextInt();
    System.out.println("Enter second multiple:");
    number2 = input.nextInt();
    sum = number1 *number2;
    System.out.println(sum);
    
    
    }
}
