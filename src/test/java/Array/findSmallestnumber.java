package Array;

public class findSmallestnumber {

	public static void main(String[] args) {
		int a[] = {11,10,13,10};
		int small = a[0], count = 0;
		
		for (int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
			
			if(a[i]<small) 
			{
				small = a[i];
				count++;
			}
			
		}
		System.out.println("The smallest number in array: " +small);
		System.out.println("The Total number of count: " +count);
	}

}
