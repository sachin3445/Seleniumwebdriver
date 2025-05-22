package oppsConcepts;

public class polymorphismMethodOverloading {
	
	void sum() 
	{
		int a =100, b=200;
		System.out.println("Sum: " + (a+b));
	}

	void sum(int x, int y) 
	{
		System.out.println("Sum: " + (x+y));
	}
	
	void sum(int x, double y) 
	{
		System.out.println("Sum: " + (x+y));
	}
	
	void sum(double x, double y) 
	{
		System.out.println("Sum: " + (x+y));
	}
	
	void sum(double x, double y, int m) 
	{
		System.out.println("Sum: " + (x+y)+m);
	}
}
