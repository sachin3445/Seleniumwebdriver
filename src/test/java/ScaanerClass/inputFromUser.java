package ScaanerClass;

import java.util.Scanner;

public class inputFromUser {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//input number from user
		System.out.println("Enter the number want to displayed: ");
		int num = sc.nextInt();
		System.out.println("Here is number entred by you: " +num);
		
		//Input the double number
		System.out.println("Enter the double number want to displayed: ");
		double db = sc.nextDouble();
		System.out.println("Here is double number entred by you: " +db);
		
		//Input the String
		System.out.println("Enter the You're name: ");
		String s = sc.next();
		System.out.println("Here is you're name entred by you: " +s);

	}

}
