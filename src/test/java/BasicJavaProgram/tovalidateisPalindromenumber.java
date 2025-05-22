package BasicJavaProgram;

import java.util.Scanner;

public class tovalidateisPalindromenumber {

	public static void main(String[] args) {
		
		int num, revers = 0;
		System.out.println("Enter the number whichwant to reverse: ");
		
		Scanner in = new Scanner (System.in);
		num = in.nextInt();
		int orignalnumber = num;
		
		for (; num != 0; num/=10) 
		{
			int digit = num%10;
			revers = revers * 10 + digit;
		}
		
		if(orignalnumber == revers) 
		{
			System.out.println("Revers number is Palindrome number: " + revers);
		}
		else 
		{
			System.out.println("Revers number is Not a Palindrome number: " + revers);
		}
	}

}
