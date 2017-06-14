package homework.missing.lesson8;

import java.util.Scanner;

public class FibonacciSequence {

	public static void main(String[] args) {
		System.out.println("This program lists the Fibonacci sequence.");
		System.out.print("Max value ? " );
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();

		System.out.print("0");
		for (int i = 1; i <= n; i++) {
			if (fibonacci(i) >= n) {
				break;
			} else {
				System.out.print(", " + fibonacci(i));
			}
		}
		input.close();
	}

	public static int fibonacci(int number) {
		if (number == 1 || number == 2) {
			return 1;
		}
		int fibo1 = 1, fibo2 = 1, fibo = 1;
		for (int i = 3; i <= number; i++) {
			fibo = fibo1 + fibo2; 
			fibo1 = fibo2;
			fibo2 = fibo;
 
		}
		return fibo; 
	}
}
