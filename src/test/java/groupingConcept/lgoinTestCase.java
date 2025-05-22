package groupingConcept;

import org.testng.annotations.Test;

public class lgoinTestCase {
	
	@Test (priority =1, groups = {"sanity"})
	void facebooklogin()
	{
		System.out.println("This is FaceBook Login...!");
	}
	
	@Test (priority =2,  groups = {"sanity"})
	void twitteerlogin()
	{
		System.out.println("This is twitter Login...!");
	}
	
	@Test (priority =3, groups = {"sanity"})
	void nukari()
	{
		System.out.println("This is nukari Login...!");
	}
}
