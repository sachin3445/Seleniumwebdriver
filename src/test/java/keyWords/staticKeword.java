package keyWords;

public class staticKeword {
	
	static int a= 20; // Static variable
	
	static void m1()
	{
		System.out.println("This is static method m1...!");
	}
	
	int b = 50; // non static variable
	
	void m2()
	{
		System.out.println("This is non static method m2 ...!");
	}

	void m3() // non static method can access static and non static stuff directly
	{
		System.out.println(a);
		m1();
		m2();
		System.out.println(b);
		
	}
	public static void main(String[] args) 
	
	{
		System.out.println(a);
		m1();
		
		//non static stuff can access through object
		
		staticKeword ks = new staticKeword();
		System.out.println(ks.b);
		ks.m2();
		ks.m3();
	}

}
