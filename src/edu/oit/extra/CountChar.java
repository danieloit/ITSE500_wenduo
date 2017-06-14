package edu.oit.extra;

public class CountChar {
	static int a = 0;
	static int b = 0;
	static int c = 0;
	static int d = 0;

	public static void main(String[] args) {
		String l = "hlfad f979&^*^";
		countChar(l);
	}

	public static void countChar(String s) {
		for (int i = 0; i < s.length(); i++) {
			char[] ch = s.toCharArray();
			if (Character.isLetter(ch[i]))
				a++;
			else if (Character.isDigit(ch[i]))
				b++;
			else if (Character.isSpaceChar(ch[i]))
				c++;
			else
				d++;
		}
		System.out.println("The length of the string is: " + s.length());
		System.out.println("no of Letter=" + a);
		System.out.println("no of Digit=" + b);
		System.out.println("no of Spaces=" + c);
		System.out.println("no of Symbol=" + d);
	}

}