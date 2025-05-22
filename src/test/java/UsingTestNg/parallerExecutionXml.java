package UsingTestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;


public class parallerExecutionXml {
	
	WebDriver driver;
		
	@BeforeClass
	@Parameters({"browser"})
	
		void setup(String br) throws InterruptedException
	{
		switch (br)
		{
		case "chrome": driver =new ChromeDriver(); break;
		case "firefox" : driver =new FirefoxDriver(); break;
		case "edge" : driver =new EdgeDriver(); break;
		default : System.out.println("Invalid browser...!");
		return;
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
	}
	
	

	@Test (priority = 1)
	void testlogo()
	{
		boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		Assert.assertEquals(status, true);
	}
	
	@Test(priority = 2)
	void testtitle()
	{
	  Assert.assertEquals(driver.getTitle(), "OrangeHRM");	
	}
	
	@Test(priority = 3)
	void testurl()
	{
		Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
	}
	
	@AfterClass
	void close()
	{
		driver.quit();
	}

}
