package edu.oit.lesson3;

import java.util.Scanner;

public class SquaresAndCubes {
    
    private static Scanner input;

    public static void main(String[] args) {
      
        boolean ifContinue = true;
        int number = 0;
        char inputChar = 'n';
        input = new Scanner(System.in);
        
        do {
            System.out.println("Enter an integer:");
            number = input.nextInt();
            printTable(number);
            System.out.println("\nContinue? (y/n):");
            inputChar = input.next().charAt(0);
            ifContinue = (inputChar == 'y') ? true : false;
        } while (ifContinue);
    }
    
    public static void printTable(int number) {
        System.out.printf("\n%6s  %7s  %5s  ", "Number", "Squared", "Cubed");
        System.out.printf("\n%6s  %7s  %5s  ", "======", "=======", "=====");
        for (int i = 1; i <= number; i++) {
            System.out.printf("\n%-6s  %-7s  %-5s  ", i, i * i, i * i * i);
        }
    }
}