package Strings;

import java.util.Scanner;

public class reverseStringIsPalindrome {

	public static void main(String[] args) {
		String s = "";
		String rev = "";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string which want to reverse: ");
		s=sc.next();
		
		System.out.println("String before reverse: "+s);
		
		for (int i=s.length()-1; i >= 0; i--) 
		{
			rev = rev+s.charAt(i);
		}
			System.out.println("String before reverse: "+rev);
			if (s.equals(rev))
			{
				System.out.println("This is Palindrome string");
			}
			else
			{
				System.out.println("This is not Palindrome string");
			}
	}

}
