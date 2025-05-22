package oppsConcepts;


interface shape 
{
	int Width = 20; // final & static 
	int height = 30; // final & static
	
	void circle (); // Abstract method
	
	default void rectangle ()
	{
		System.out.println("This is rectangle ......This is default method");
	}
	
	static void tringle()
	{
		System.out.println("This is tringle .....This is Static method"); 
	}
}












public class interfaceConcept implements shape
{
	public void circle()
	{
		System.out.println("This is circle.... This is abstract method"); 
	}
	
	public static void main(String[] args) {
		/*
		//Scenario 01
		interfaceConcept iterobj = new interfaceConcept();
		iterobj.circle(); // This is abstract method
		iterobj.rectangle(); // .This is default method
		shape.tringle(); // This is Static method and directly access using interface name
		
		*/
		
		//Scenario 01
		shape sh = new interfaceConcept();
				{
					sh.circle(); // This is abstract method
					sh.rectangle(); //This is default method
					shape.tringle(); // This is Static method and directly access using interface name
				}
	
	}

}
