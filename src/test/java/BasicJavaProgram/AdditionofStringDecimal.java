package BasicJavaProgram;

import java.math.BigDecimal;

public class AdditionofStringDecimal {

	public static void main(String[] args) {
		String a = "$ 100.25";
        String b = "$ 300.35";
        
       //Remove dollar and Space
        
        BigDecimal valueA = new BigDecimal(a.replace("$", " ").trim());
        BigDecimal valueB = new BigDecimal(b.replace("$", "").trim());
        
        //Add values
        
        BigDecimal sum = valueA.add(valueB);
        System.out.println("Sum $" + sum);

	}

}
