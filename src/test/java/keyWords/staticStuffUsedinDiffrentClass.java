package keyWords;

public class staticStuffUsedinDiffrentClass {

	public static void main(String[] args) 
	{
		//To access static stuff from other class use class name
		System.out.println(staticKeword.a);
		staticKeword.m1();
		
		//non static stuff can access through object
		
		staticKeword ks = new staticKeword();
		System.out.println(ks.b);
		ks.m2();
		ks.m3();

	}

}
