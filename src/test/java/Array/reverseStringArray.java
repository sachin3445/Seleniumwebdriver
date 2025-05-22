package Array;

import java.util.Arrays;

public class reverseStringArray {

	public static void main(String[] args) {
		String s = "Sachin Mehetre";
		String r = "";
		System.out.println("Before reverse: "+s);
		
		
		for(int i = s.length()-1; i>=0; i--)
		{
			r += s.charAt(i);
				
		}
		System.out.println("After reverse: " +r);
		
	}

}
