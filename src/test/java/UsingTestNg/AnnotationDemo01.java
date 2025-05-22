package UsingTestNg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*
 1. Login --> @BeforeMethod
 2. Search --> @Test
 3. Logot --> @AfterMethod
 4. Login
 5. Advance Search --> @Test
 6. Logout
  */

public class AnnotationDemo01 {
	@BeforeMethod
	void login()
	{
		System.out.println("This is Login...!");
	}
	
	@Test (priority = 01)
	void search()
	{
		System.out.println("This is Search ...!");
	}
	
	@AfterMethod
	void logout()
	{
		System.out.println("This is logout...!");
	}
	
	@Test (priority = 02)
	void advancesearch()
	{
		System.out.println("This is Advance Search ...!");
	}

}
