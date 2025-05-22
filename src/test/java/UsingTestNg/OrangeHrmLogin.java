package UsingTestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
/*
 1. Open
 2. Display logo Status
 3. Login
 4. Close
 */


public class OrangeHrmLogin {
	// Initialize webdriver
	
	WebDriver driver;
	
  @Test (priority = 1)
  public void open() 
  {
	  driver= new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.manage().window().maximize();
	  
  }
  
  @Test (priority = 2)
  public void displaylogo() throws InterruptedException
  {
	Thread.sleep(5000);  
	boolean logostatus = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
	System.out.println("Logo Status is Displayed: " +logostatus);
  }
  @Test (priority = 3)
  public void login()
  {
	  driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
  }
  @Test (priority = 4)
  public void close()
  {
	  driver.close();
  }
}
