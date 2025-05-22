package BasicJavaProgram;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Occarnceofletter {

	public static void main(String[] args) {
		     String s;
		     Scanner sc = new Scanner(System.in); 
		     System.out.println("Enter the string: ");
		     s=sc.nextLine();
		     
		     // convert given string in to HashMap
		     Map <Character,Integer> CharMap = new HashMap<Character,Integer>();
		     char strArray[] = s.toCharArray();
		     for(char c :strArray)
		     {
		    	 if(CharMap.containsKey(c))
		    	 {
		    		 CharMap.put(c, CharMap.get(c)+1);
		    	 }else
		    	 {
		    		 CharMap.put(c, 1);
		    	 }
		     }
		     System.out.println(s + " :" + CharMap);
	}

}
