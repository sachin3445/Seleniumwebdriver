package UsingTestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProviderDemo {
	
	
	WebDriver  driver;
	@BeforeClass
	void setup()
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
	}
	
	@Test (dataProvider = "userdetails")
	void login(String user, String pass ) throws InterruptedException 
	{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys(user);
		driver.findElement(By.name("password")).sendKeys(pass);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		String title = driver.findElement(By.xpath("//div[@class='oxd-topbar-header-title']")).getText();
		System.out.println(title);
		if(title.equals("Dashboard")) 
		{
			driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
			driver.findElement(By.xpath("//li[4]//a[@class='oxd-userdropdown-link']")).click();
			Assert.assertTrue(true);
		}
		else 
		{
			Assert.fail();
		}
	}
	
	@AfterClass
	void close() 
	{
		driver.close();
	}
	
	@DataProvider (name = "userdetails")
	Object[][] logindata()
	{
		Object data[][] = {
							{"Abc", "abc123"},
							{"Xyz", "xyz123"},
							{"Admin", "admin123"},
							{"Pqr", "pqr123"},
							{"Aft", "aft123"},
						  };
		return data;
	}
	
	
}
