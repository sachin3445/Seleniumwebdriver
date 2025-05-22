package UsingTestNg;

import org.testng.annotations.Test;

public class FirstTestCase {

//Open Browser
// Login
// Logout	
	
	@Test(priority=01)
	void Open()
	{
	System.out.println("Open the application");

	}
@Test(priority=02)
	void Login() {
	System.out.println("Login To Application");

	}
	@Test(priority=03)
	void logout()
	{
		System.out.println("Logout From Application");
	}
}
	
