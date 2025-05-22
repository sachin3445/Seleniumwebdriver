package Array;

import java.util.Arrays;

public class findThelargestnumber {

	public static void main(String[] args) {
	int a[] = {4,8,11,9,11,11};
	int count=0, max=a[0];//Assume here is first number in array
	Arrays.sort(a);
	
	for(int i=0; i<a.length; i++) 
	{
		if(a[i] > max ) 
		{
			max = a[i];
			count++;
						
		}
		
	} 
	
	System.out.println(max);
	System.out.println("Number of occorance in max number" + count);
	}

}
