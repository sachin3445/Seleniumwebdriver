package BasicJavaProgram;

import java.util.Scanner;

public class reversenumber {

	public static void main(String[] args) {
		int num, reversed=0;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number which want to reverse:");
		num = in.nextInt();
		
		
		for(; num!=0; num/=10) // Declaration is already done so no need to declare here
		{
			int digit = num%10;
			reversed = reversed * 10 + digit;
		}
			System.out.println("This is the reverse number: " + reversed);
	}

}
