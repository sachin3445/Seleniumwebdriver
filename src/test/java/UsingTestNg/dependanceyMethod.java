package UsingTestNg;
/*
 1. Openapp
 2. Login
 3. Search
 4. Advance Search
 5. Logout 
 */

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependanceyMethod {
		
		@Test (priority = 1)
		void openapp()
		{
			Assert.assertTrue(true);
		}
		
		@Test (priority = 2, dependsOnMethods = {"openapp"})
		void login()
		{
			Assert.assertTrue(false);
		}
		
		
		@Test (priority = 3, dependsOnMethods = {"login"})
		void search()
		{
			Assert.assertTrue(true);
		}
		
		
		@Test (priority = 5)
		void logout()
		{
			Assert.assertTrue(true);
		}
		
		
		@Test (priority = 4, dependsOnMethods = {"login"})
		void advancesearch()
		{
			Assert.assertTrue(true);
		}
		

	
	}
	

