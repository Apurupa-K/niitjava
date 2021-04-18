package assignment;

public class StringPalindrome {
	public static void main(String[] args) {
		String s1 = "apurupa";
		String s2 = "";
		for (int i = s1.length() - 1; i >= 0; i--) {
			s2 += s1.charAt(i);
		}
		if (s1.contentEquals(s2))
			System.out.println("It is a Palindrome");
		else {
			System.out.println("It is not a Palindrome");
		}
	}
	

}
