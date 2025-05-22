package oppsConcepts;



	class X
	{
		int a;
		void dispaly() 
		{
			System.out.println(a);
		}
		
	}
	
	
	class Y extends X
	{
		int b;
		
		void show() 
		{
			System.out.println(b);
		}
		
	}
	
	class Z extends Y
	{
		int c=300;
		void print() 
		{
			System.out.println(c);
		}
	}
	
	public class MultilevelInheritance {	
	public static void main(String[] args) 
	{

		Z obj = new Z();
		
		obj.a=100;
		obj.b=200;
		
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		obj.dispaly();
		obj.show();
		obj.print();
		

	}

}
