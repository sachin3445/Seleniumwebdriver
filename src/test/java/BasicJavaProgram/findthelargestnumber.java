package BasicJavaProgram;

import java.util.Scanner;

public class findthelargestnumber {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int a, b, c;
		System.out.println("Enete the values of a, b & C:");
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		
		if (a>b && a>c)
		{
			System.out.println("a is the largest number:" +a);
		}
		
		else if (b>a && b>c) 
		{
			System.out.println("b is the largest number:" +b);
		}
		
		else
		{
			System.out.println("c is the largest number:" +c);
		}
	}

}
