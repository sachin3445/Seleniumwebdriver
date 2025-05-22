package BasicJavaProgram;

public class printseriesletter {

	public static void main(String[] args) {

		String s = "abcdfabc";
		// find the first occurrence of abc
		
		int index = s.indexOf("abc");
		
		if(index !=-1)
		{
			System.out.println("abc");
		}
		
		else {
			System.out.println("\"abc\" not found");
		}
	}

}
