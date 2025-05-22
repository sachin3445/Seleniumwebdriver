package oppsConcepts;

class parent {
	void display (int a) 
	{
		System.out.println(a);
	}
}

class Child1 extends parent
{
	void show (int b)
	{
		System.out.println(b);
	}
}

class Child2 extends parent
{
	void print (int c)
	{
		System.out.println(c);
	}
}


public class HierarchyInheritance {

	public static void main(String[] args) {
		
		Child1 ch1 = new Child1();
		ch1.display(100);
		ch1.show(200);
		
		Child2 ch2 = new Child2();
		ch2.display(500);
		ch2.print(1000);

	}

}
