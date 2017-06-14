package homework.missing.lesson8;

public class IsMultiple {

	public static void main(String[] args) {
		IsMultiple myMultiple = new IsMultiple();
		System.out.println(myMultiple.isMultiple(15, 5));
		System.out.println(myMultiple.isMultiple(15, 2));

	}

	public boolean isMultiple(int a, int b) {
		boolean temp = false;
		if (a % b == 0) {
			temp = true;
		}
		return temp;
	}

}
