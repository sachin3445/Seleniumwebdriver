package BasicJavaProgram;

public class Addoftwtostringnumber {

	public static void main(String[] args) {
		String a = "$ 100.25";
        String b = "$ 300.35";
        
       //replace $ & Space
        
        a = a.replace("$", "").trim();
        b = b.replace("$", "").trim();
        
        double valueA = Double.parseDouble(a);       
        double valueB = Double.parseDouble(b);
        
        double sum = valueA+valueB;
        System.out.println("Sum of String a & String b: " + sum);
        
	}

}
