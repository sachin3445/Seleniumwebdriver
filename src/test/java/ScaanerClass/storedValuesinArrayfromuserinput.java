package ScaanerClass;

import java.util.Arrays;
import java.util.Scanner;

public class storedValuesinArrayfromuserinput {
	public static void main(String[] args) {
		int a[] = new int[5];
		
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<5; i++) {
			System.out.println("Enter the values Position: "+i);
			a[i]= sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
	}

}
