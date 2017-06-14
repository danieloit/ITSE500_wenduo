package edu.oit.extra;

public class Vampire {

	public static void main(String[] args) {
		for (int i = 1000; i<10000;i++){
			if(isVampireNumber(i)){
				System.out.print(i+ " ");
			}
			
			
		}

	}

	public static boolean isVampireNumber(int n) {
        int a = n / 1000;
        int b = (n / 100) % 10;
        int c = (n / 10) % 10;
        int d = n % 10;
        boolean isVN = false;
        if (n == (a*10 + b) * (c*10 + d)) isVN = true;
        if (n == (a*10 + b) * (d*10 + c)) isVN = true;
        if (n == (a*10 + c) * (b*10 + d)) isVN = true;
        if (n == (a*10 + c) * (d*10 + b)) isVN = true;
        if (n == (a*10 + d) * (c*10 + b)) isVN = true;
        if (n == (a*10 + d) * (b*10 + c)) isVN = true;

        if (n == (b*10 + a) * (c*10 + d)) isVN = true;
        if (n == (b*10 + a) * (d*10 + c)) isVN = true;
        if (n == (b*10 + c) * (d*10 + a)) isVN = true;
        if (n == (b*10 + d) * (c*10 + a)) isVN = true;

        if (n == (c*10 + a) * (d*10 + b)) isVN = true;
        if (n == (c*10 + b) * (d*10 + a)) isVN = true;
        return isVN;
    }
	
	
	
	
	
	
	
	
	
	
}
