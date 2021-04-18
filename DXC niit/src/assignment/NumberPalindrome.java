package assignment;

public class NumberPalindrome {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,n1,r,p=0;
		n = 12343;
		n1 = n;
		while(n1>0) {
			r = n1 % 10;
			p = p * 10 + r;
			n1 /= 10;
		}
		if(p == n)
			System.out.println("It is a Palindrome");
		else
			System.out.println("It is not a Palindrome");
	}


}
