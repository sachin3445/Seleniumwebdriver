package BasicJavaProgram;

import java.util.Scanner;

public class countEvenandOddfromgivennumber {
	public static void main(String[] args) {
		int oddcount = 0, evencount = 0, num;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number: ");
		num = in.nextInt();
		String numberString = String.valueOf(num);
		
		for(int i=0; i<numberString.length(); i++)
		{
			int digit = Character.getNumericValue(numberString.charAt(i));
			if(digit % 2 == 0)
			{
				evencount++;
			}
			else
			{
				oddcount++;
			}
		}
	System.out.println("Total number of count Even number: " + evencount);
	System.out.println("Total number of count odd number: " + oddcount);
}		

}
