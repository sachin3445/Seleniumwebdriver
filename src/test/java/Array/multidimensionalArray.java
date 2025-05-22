package Array;

public class multidimensionalArray {
	public static void main (String args[]) {
	
		/*
		//Declaration of array
		int a[][] = new int[3][2];
		
		//Stored a values in array
		a[0][0] = 100;
		a[0][1] = 200;
		
		a[1][0] = 300;
		a[1][1] = 400;
		
		a[2][0] = 500;
		a[2][1] = 600;
		*/

		//Approach 2
		
		int a[][] = {{100,200}, {300,400}, {500,600}, {700,800}, {900,1000}};
		
		
		System.out.println("Values of array at postion 3rd row 1st column: " + a[2][0]);
		
		//Size of array
		System.out.println("Size of rows: " + a.length);
		System.out.println("Size of column: " + a[0].length);
		
		// Read the all values from array
		
	for (int r = 0; r<a.length; r++) 
		{
			for(int c =0; c<a[r].length; c++) 
			{
				System.out.print(a[r][c] + "  ");
			}
			
			System.out.println("");
		}
		
		
			}
		
	}

