package oppsConcepts;

public class mainMethodOverloading 
{
	void main (int a) 
	{
		System.out.println(a);
	}
	
	void main (String s) 
	{
		System.out.println(s);
	}
	
	void main (String x, String y) 
	{
		System.out.println(x+y);
	}
	
	public static void main(String[] args) 
	{
		mainMethodOverloading ov = new mainMethodOverloading();
		ov.main(100);
		ov.main("Sachin");
		ov.main("Sachit", "Mehetre");

	}

}
