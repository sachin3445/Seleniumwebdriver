package Strings;

import java.util.Scanner;

public class reverseString {

	public static void main(String[] args) {
		String s = "", rev="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the String want to reverse: ");
		s=sc.nextLine();
		
		//Approach 1: using length() & charAt() method
		
		for(int i = s.length()-1; i>=0; i--) 
		{
			rev = rev+s.charAt(i);
		}
		System.out.println("Reverse String is: "+rev);
	}

}
