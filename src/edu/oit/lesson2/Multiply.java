package edu.oit.lesson2;

public class Multiply {

	public static void main(String[] args) {		
		for(int i=1;i<=9;i++){			
			for(int j=1;j<=9;j++){
				if(j<i){
					System.out.printf("            ");
				}
				else			
				System.out.printf("%d * %d = %2d  ", i,j,i*j);					
			}
			System.out.println();			
		}	
	}
}