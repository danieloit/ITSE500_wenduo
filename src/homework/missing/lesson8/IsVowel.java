package homework.missing.lesson8;

public class IsVowel {	
	public static void main(String[] args) {
		IsVowel targetString = new IsVowel();
		targetString.isVowel("O");
		targetString.isVowel("a");
		targetString.isVowel("Oa");
		targetString.isVowel("b");
	}
	public void isVowel(String c){
		String vowelList = "AEIOUaeiou";
		if (vowelList.contains(c) && c.length() == 1){
			System.out.println( "The string  "+ c +"  is a vowel.");
		}else{
			System.out.println("The string  "+ c +"  is not a vowel.");
		}
		
	}
}