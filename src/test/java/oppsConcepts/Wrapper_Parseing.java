package oppsConcepts;

public class Wrapper_Parseing {

	public static void main(String[] args) {
		String a = "10";
		String b = "20.23";
		String c = "true";
		
		// Convert int, double & boolean string value in int boolean & double
		
		Integer.parseInt(a);
		Boolean.getBoolean(c);
		Double.parseDouble(b);
		
		System.out.println("Values of a:" + a + " \n" +"Values of c:"+ c +" \n"+ "Values of b:" + b );
				
		
		// Convert int, double & boolean value in to string
		
		int p = 100; 
		boolean q = false; 
		double r = 201.23;
		
		String.valueOf(p);
		String.valueOf(q);
		String.valueOf(r);
		String.valueOf(c);
		
		System.out.println(p+"\n" + q + "\n"+ r+ "\n"+ c);
		
	}

}
