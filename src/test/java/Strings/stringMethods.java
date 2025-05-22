package Strings;

import java.util.Arrays;

public class stringMethods {

	public static void main(String[] args) {
		// Find the length of String
		String s = "Sachin Mehetre";
		System.out.println("Length of given string: " +s.length());
		
		//Concat method to join two string
		String s2 = "Sachit Mehetre";
		System.out.println("Joint of two string: " +s.concat(s2));
		System.out.println("Joint of three String: " +s.concat(s2)+"Is my world");
		
		//trim() used to remove left & right spaces
		String s3 = "  Welcom  ";
		System.out.println("Before trim string s3: "+s3);
		System.out.println("Total number of chracter before trim: "+s3.length());
		System.out.println("After trim string s3: "+s3.trim());
		System.out.println("Total number of chracter after trim: "+s3.trim().length());
		
		//charAt() return the character from start based on index
		System.out.println("Print the char at position 5: "+s2.charAt(5));
		
		//contains - check the values and always return a boolean
		System.out.println(s.contains(s2));
		System.out.println(s.contains("Mehetre"));
		
		//compare - compare two string and always return a boolean
		System.out.println(s.equals("Sachin Mehetre"));
		
		//equalIngnorecase - it ignore upper and lower case of letter
		System.out.println(s2.equalsIgnoreCase("sACHIT mEHETRE"));
		
		//replace method - replace single or multiple character
		System.out.println(s2);
		System.out.println(s2.replace('e', '_'));
		System.out.println(s2.replace("Sachit", "Trupti"));
		
		//substring - used to some portion of string
		//0: is a starting index
		//1: is a ending index
		System.out.println(s2);
		System.out.println(s2.substring(2, 5));
		
		//convert string upper and lower case
		System.out.println(s2);
		System.out.println(s2.toUpperCase());
		System.out.println(s2.toLowerCase());
		
		//Split string in to multiple parts using delimiter
		String x = "sachin@gmail.com";
		String a[] = x.split("@");
		System.out.println(Arrays.toString(a));
		System.out.println(a[0]);
		System.out.println(a[1]);
		
		//replace example
		String y = "$10,20,30";
		System.out.println(y.replace("$", "").replace(",", ""));
		
		//Split string in to multiple parts using delimiter
		String z = "sachin1mehetre3445@gmail.com";
		String a1[] = z.split("1");
		System.out.println(Arrays.toString(a1));
		String a2[] = a1[1].split("@");
		System.out.println(Arrays.toString(a2));
		
		//print all values of array a1 & a2
		System.out.println(a1[0]);
		System.out.println(a2[0]);
		System.out.println(a2[1]);
	}
	

}
