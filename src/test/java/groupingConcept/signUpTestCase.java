package groupingConcept;

import org.testng.annotations.Test;

public class signUpTestCase {
	
	@Test (priority = 1, groups = {"regression"})
	void signupFB() 
	{
		System.out.println("This is signup for FaceBook...!");
	}

	@Test (priority = 2, groups = {"regression"})
	void signupTwitter() 
	{
		System.out.println("This is signup for Twitter...!");
	}
	
	@Test (priority = 3, groups = {"regression"})
	void signupnukari() 
	{
		System.out.println("This is signup for Naukri...!");
	}

}
