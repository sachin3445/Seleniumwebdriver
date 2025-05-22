package groupingConcept;

import org.testng.annotations.Test;

public class payment {

	@Test (priority = 1, groups = {"regression", "sanity", "smoke"})
	void offline()
	{
		System.out.println("This is offline payment...!");
	}
	
	@Test (priority = 2, groups = {"regression", "sanity", "smoke"})
	void online()
	{
		System.out.println("This is online payment...!");
	}
}
