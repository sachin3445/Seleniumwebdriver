package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class sortingOfArray {

	public static void main(String[] args) {
		int a[] = {10,20,14,20,45,60,21,78,41,66,23,55};
		
		System.out.println("Before sorting array: ");
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(a);
		
		System.out.println("After sorting array: ");
		System.out.println(Arrays.toString(a));
		
	}
}
