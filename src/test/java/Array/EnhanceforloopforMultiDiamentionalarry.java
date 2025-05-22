package Array;

public class EnhanceforloopforMultiDiamentionalarry {

	public static void main(String[] args) {

		int a [][] = {{100,200}, {300,400}, {500,600}};
		
		//Read the data from array using enhance for loop
		
		for(int arr[] : a) {
			
			for (int x : arr) 
			{
				System.out.print(x + " ");
			}
			System.out.println();
		}
	}

}
