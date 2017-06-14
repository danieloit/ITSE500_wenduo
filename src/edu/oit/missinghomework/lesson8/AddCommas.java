package edu.oit.missing.lesson8;

public class AddCommas {

	public String addCommas(String numbers) {
		String temp = numbers;

		if (numbers.length() <= 3) {
			return numbers;
		}

		else {
			for (int i = 0; i < (numbers.length() - 1) / 3; i++) {

				int commasPosition = numbers.length() - 3 - 3 * i;

				temp = temp.substring(0, commasPosition) + "," + temp.substring(commasPosition);
			}
			return temp;
		}
	}

	public static void main(String[] args) {
		AddCommas myAddCommas = new AddCommas();
		System.out.println(myAddCommas.addCommas("123456789"));
		System.out.println(myAddCommas.addCommas("1234567"));
		System.out.println(myAddCommas.addCommas("123"));

	}
}
