package Array;

import java.util.Arrays;

public class reverseOrderNumber {

	public static void main(String[] args) {

		int a[] = {10,45,20,11,85,96,15,30,40};
		System.out.println("Before reverse: " +Arrays.toString(a));
		System.out.println("After reverse: ");
		
		for (int i = a.length-1; i>=0; i--)
		{
			System.out.print(" " + a[i]);
		}

	}

}
