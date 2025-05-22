package BasicJavaProgram;

import java.util.Scanner;

public class countNumberofDigitin {

	public static void main(String[] args) {
		int count = 0, num;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number: ");
		num = in.nextInt();
		
		while(num !=0)
		{
			num = num / 10;
			count++;
		}
		System.out.println("Total number of digit in given number: " + count);
	}

}
