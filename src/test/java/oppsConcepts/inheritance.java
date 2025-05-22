package oppsConcepts;



	class A
	{
		int a = 100;
		void dispaly() 
		{
			System.out.println(a);
		}
		
	}
	
	
	class B extends A
	{
		int b = 300;
		
		void show() 
		{
			System.out.println(b);
		}
		
	}
	
	
	public class inheritance {	
	public static void main(String[] args) 
	{

		B obj = new B();
		
		System.out.println(obj.a);
		System.out.println(obj.b);
		obj.dispaly();
		obj.show();
		

	}

}
