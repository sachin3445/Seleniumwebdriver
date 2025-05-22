package Array;

import java.util.Scanner;

public class Findelementfromarry {

	public static void main(String[] args) {

		int a[] = {10, 20, 30, 40, 50};
		int searchelement;
		boolean status = false;
		for(int y:a) 
		{
			System.out.println("List of number present in arry: " +y);
			
		}
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number which want to search in arry: ");
		searchelement = in.nextInt();
		
		
		for (int x:a) 
		{
			if(x == searchelement) 
			{
				status = true;
				System.out.println("Element " + searchelement + "present.");
				break;
			}
		}
		if(status == false)
		{
			System.out.println("Element " + searchelement + " not present." );
		}
		

	}

}
