package TestngListener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportmanage implements ITestListener
{
	public ExtentSparkReporter sparkReporter; // used for UI
	public ExtentReports extent; //used for common information
	public ExtentTest test; // Creating test entries and update the status like pass failed in report

	public void onStart(ITestContext context) {
		// Create a folder and give the path to stored the report
		sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir")+"/Reports/test.html");
		
		sparkReporter.config().setDocumentTitle("TestRport"); // Give the document title
		sparkReporter.config().setReportName("Funcational Test"); //Give the report name
		sparkReporter.config().setTheme(Theme.DARK); // Set the theme
		
		extent = new ExtentReports();
		extent.attachReporter(sparkReporter);
		
		
		extent.setSystemInfo("Computer Name", "localhost");
		extent.setSystemInfo("Enviroment", "QA");
		extent.setSystemInfo("Tester Name", "Sachin");
	  }
	
	public void onTestSuccess(ITestResult result) 
	{
		test =extent.createTest(result.getName()); // create new entry in test report
		test.log(Status.PASS, "Test Case is Pass : "+result.getName());
	}

	public void onTestFailure(ITestResult result) 
	{
		test =extent.createTest(result.getName()); // create new entry in test report
		test.log(Status.FAIL, "Test Case is Failed : "+result.getName());
		test.log(Status.FAIL, "Test Case Failed Caused is : "+result.getThrowable());
	}

	public void onTestSkipped(ITestResult result) 
	{
		test =extent.createTest(result.getName()); // create new entry in test report
		test.log(Status.SKIP, "Test Case is Skiped : "+result.getName());
  	}

	public void onFinish(ITestContext context) 
	{
		extent.flush();
	}






}
