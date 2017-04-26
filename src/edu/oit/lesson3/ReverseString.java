package edu.oit.lesson3;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your string:");
        String oriString = input.nextLine();
        System.out.println("The reverse string is: "+ reverseString(oriString));

    }

    public static String reverseString(String str){
        int len = str.length();
        String str2 = "";
        for ( int i=len-1 ; i >= 0 ; i--){
            str2 += str.charAt(i);
            
        }
        
        return str2;
        
    }
    
    
    
}