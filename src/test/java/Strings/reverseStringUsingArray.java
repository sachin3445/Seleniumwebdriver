package Strings;

import java.util.Scanner;

public class reverseStringUsingArray {

	public static void main(String[] args) {
		String s = "", rev="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the String want to reverse: ");
		s=sc.nextLine();
		
		//reverse string by converting string in to array 
		
		char a[] = s.toCharArray();
		for(int i=a.length-1; i>=0; i--)
		{
			rev = rev+a[i];
		}
		System.out.println("Reverse String is: "+rev);
	}

}
