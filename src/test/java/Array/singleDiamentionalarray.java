package Array;

public class singleDiamentionalarray {

	public static void main(String[] args) {
		//Declare array and stored values
		// First Approach
		int a[] = new int[5]; //Declare array
		a[0] = 100;
		a[1] = 200;
		a[2] = 300;
		a[3] = 400;
		a[4] = 500;
	
 
		// Find the length of array
		System.out.println("Here  is the length of array: " + a.length);
		
		//Read the single value from array
		System.out.println("Print the 3rd position values from arreay: " +a[2]);
		
		//Read the all values from array using normal for loop
		
		for (int i=0; i< a.length; i++)
		{
			System.out.println("All values from array: " + a[i]);
		}

		
	

	}

}
