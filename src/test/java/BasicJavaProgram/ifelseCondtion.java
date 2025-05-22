package BasicJavaProgram;

import java.util.Scanner;


public class ifelseCondtion {

	public static void main(String[] args) {
		
		int num;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number:");
		num = in.nextInt();
  // Find out enter number Even & Odd number		
		if(num%2==0)
		{
			System.out.println("This is Even number");
		}

		else {
			System.out.println("This is Odd number");
		}
	}

}
