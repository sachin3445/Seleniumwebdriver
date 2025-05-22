package Strings;

public class removeJunkorSpecialchar {

	public static void main(String[] args) {

		String s = "  wel@co#me ";
		System.out.println("String before replace junk and special character: "+s);
		String ns = s.replace("@", "").replace("#", "").trim();
		System.out.println("String after replace junk and special character: "+ns);
		

	}

}
