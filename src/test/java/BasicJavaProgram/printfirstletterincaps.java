package BasicJavaProgram;

public class printfirstletterincaps {

	public static void main(String[] args) {

		String s = "my name is sachin";
		String capLetter = s.substring(0, 1).toUpperCase()+s.substring(1).toLowerCase();
		System.out.println(capLetter);
	}

}
