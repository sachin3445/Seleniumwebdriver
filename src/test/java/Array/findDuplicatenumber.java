package Array;

import java.util.Scanner;

public class findDuplicatenumber {

	public static void main(String[] args) {
	int a[] = {10,20,30,10,30,10,10,10,60,40,10};
	int num, count=0;
	
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the number want to check: ");
	num = in.nextInt();
	
	for (int values:a)
	{
		if (values == num)
		{
			count++;
		}
				
	}
	
	System.out.println(count);
	
}

}
