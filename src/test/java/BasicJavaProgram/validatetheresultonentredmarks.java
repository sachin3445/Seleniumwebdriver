package BasicJavaProgram;

import java.util.Scanner;

public class validatetheresultonentredmarks {

	public static void main(String[] args) {

		int obtainedMarks, passingMarks;
		passingMarks = 40;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your obtained marks:");
		obtainedMarks = in.nextInt();
		
		if(obtainedMarks >= passingMarks)
		{
			System.out.println("You pass the exam successfuly with marks: " + obtainedMarks);
		}
		else
		{
			System.out.println("You Failed the exam with marks: " + obtainedMarks +  " which less then passing marks: " + passingMarks);
		}
		

	}

}
