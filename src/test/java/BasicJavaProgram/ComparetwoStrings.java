package BasicJavaProgram;

import java.util.Scanner;

public class ComparetwoStrings {

	public static void main(String[] args) {

		String s1, s2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string s1: ");
		s1 = sc.next();
		
		System.out.println("Enter the Second string s2: ");
		s2 = sc.next();

		if (s1.compareTo(s2) < 0) 
			System.out.println("First String is greater then second string: ");
		
		else if (s1.compareTo(s2) > 0) 
			System.out.println("First String is smaller then second string: ");
		
		else 
			System.out.println("First String is equal to second string: ");
		
	}

}
