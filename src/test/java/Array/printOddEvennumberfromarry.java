package Array;

public class printOddEvennumberfromarry {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,11,19,21,41,8,20,56}; 
		int even=0, odd=0;
			
		//for (int x=1; x<a.length; x++)
		
		for (int x:a)
		{
			if (x%2 == 0) 
			{				
				
				//System.out.println("This is even number: " + x);
				even++;
				
			}
			
			//System.out.println("This is Odd number: " + x);
			odd++;
			
		} 
		System.out.println("Tootal number of even number: " + even);
		System.out.println("Total number of odd number: " + odd);
	}

}
