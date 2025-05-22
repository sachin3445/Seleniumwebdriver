package InterviewQuestion;

public class reverseString {

	public static void main(String[] args) {
		String input = "Sachin";
		String reverse = "" ;
		for (int i = input.length()-1; i>=0; i--) {
			
			reverse += input.charAt(i);
			
		}
		System.out.println("This is Orignal String :" + input);
		System.out.println("This is reverese String :" + reverse);
	}

}
