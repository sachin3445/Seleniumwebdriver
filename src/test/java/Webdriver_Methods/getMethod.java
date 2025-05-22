package Webdriver_Methods;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//get method to page on browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		
		//getTitle of the page 
		System.out.println(driver.getTitle());
	
		//getCurrentPageUrl
		System.out.println(driver.getCurrentUrl());
		
		//getPageSource
		//System.out.println(driver.getPageSource());
	
		// Single window handel
		//String window = driver.getWindowHandle();
		//System.out.println("Window ID:"+ window);
		
		//Handle mutiple window ID's
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Set<String> windowIds = driver.getWindowHandles(); 
		System.out.println("Window id :" + windowIds);
	}
	
}
