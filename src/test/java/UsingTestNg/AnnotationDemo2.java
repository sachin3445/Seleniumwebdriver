package UsingTestNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/*
 1. Login --> @BeforeClass
 2. Search --> @Test
 3. Advance Search --> @Test
 6. Logout --> @AfterClasss
  */

public class AnnotationDemo2 {
	@BeforeClass
	void login()
	{
		System.out.println("This is Login...!");
	}
	
	@AfterClass
	void logout()
	{
		System.out.println("This is logout...!");
	}
	
	@Test (priority = 01)
	void search()
	{
		System.out.println("This is Search ...!");
	}
	
	@Test (priority = 02)
	void advancesearch()
	{
		System.out.println("This is Advance Search ...!");
	}

}
