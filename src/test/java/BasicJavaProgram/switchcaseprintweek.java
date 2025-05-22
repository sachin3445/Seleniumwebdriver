package BasicJavaProgram;

import java.util.Scanner;

public class switchcaseprintweek {

	public static void main(String[] args) {
	
		int weeknum;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Week number:");
		
		weeknum = in.nextInt();
		
		switch(weeknum) {
		case 1: System.out.println("Sunday:" + " Week No:" + weeknum); break;
		case 2: System.out.println("Monday:" + " Week No:" + weeknum); break;
		case 3: System.out.println("Tuesday:" + " Week No:" + weeknum); break;
		case 4: System.out.println("Wednesday:" + " Week No:" + weeknum); break;
		case 5: System.out.println("Thursday:" + " Week No:" + weeknum); break;
		case 6: System.out.println("Friday:" + " Week No:" + weeknum); break;
		case 7: System.out.println("Saturday:" + " Week No:" + weeknum); break;
		default: System.out.println("Invalid week number:" + "Week No:" + weeknum);
		}

	}

}
