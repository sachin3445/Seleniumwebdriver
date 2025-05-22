package BasicJavaProgram;

import java.util.Scanner;

public class numbercount {

	public static void main(String[] args) {
		String s;
		
		Scanner in = new Scanner (System.in);
		System.out.println("Enter the number: ");
		
		s = in.next();
		
	      int numOfcount = s.length();
	      System.out.println("Total number of count: " + numOfcount);

	}

}
