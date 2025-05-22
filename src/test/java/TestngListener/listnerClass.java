package TestngListener;

import org.testng.ITestContext;
import org.testng.ITestResult;

public class listnerClass 
	{
		
		public void onStart(ITestContext context) {
			    System.out.println("This method start on excution ....!");
			  }
		
		public void onTestStart(ITestResult result) {
			System.out.println("Test Start ....!");
		  }
		
		public void onTestSuccess(ITestResult result) {
			System.out.println("Test success ....!");
		  }
		
		public void onTestFailure(ITestResult result) {
			System.out.println("Test failed ....!");
		  }
		
		public void onTestSkipped(ITestResult result) {
			System.out.println("Test Skiped ....!");
		  }
		
		public void onFinish(ITestContext context) {
			System.out.println("Test excution Finish ....!");
			  }
		
	}


