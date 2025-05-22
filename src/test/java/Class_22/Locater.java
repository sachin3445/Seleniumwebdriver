package Class_22;

import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			WebDriver driver= new ChromeDriver();
			driver.get("https://demo.opencart.com.gr/");
			driver.manage().window().maximize();
			
		//Find by name	
			driver.findElement(By.name("search")).sendKeys("mac");
		//Find by ID
			boolean	logoDisplayedStatus = driver.findElement(By.id("logo")).isDisplayed();
			System.out.println(logoDisplayedStatus);
			
//Linktext must be use don't use partial link		
			driver.findElement(By.linkText("Tablets")).click();
			driver.findElement(By.partialLinkText("Tab")).click();
		
		//Class name locator	
		List<WebElement> headerlinks = driver.findElements(By.className("list-inline"));
		System.out.println("Total number of header lniks:" +headerlinks.size());
		
		//Tag name locator
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total number of lniks:" + links.size());
		
	} 
				
}
