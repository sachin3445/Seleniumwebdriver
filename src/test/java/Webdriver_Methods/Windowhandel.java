package Webdriver_Methods;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandel {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		Set<String> windowIds = driver.getWindowHandles(); 
		//System.out.println("Window id :" + windowIds);
		
		//Approach 01 : When we have only two windows
		/*
		 * List<String> windowList = new ArrayList(windowIds); String ParentID =
		 * windowList.get(0); String childID = windowList.get(1);
		 * 
		 * //Switch to Window driver.switchTo().window(childID); //Switch from Parent
		 * window to Child window System.out.println(driver.getTitle());
		 * 
		 * driver.switchTo().window(ParentID); System.out.println(driver.getTitle());
		 * //Switch from child window to Parent window
		 */
		//Approach 02 : When we have more then two windows
		
		for(String winID:windowIds) {
			
			String title =  driver.switchTo().window(winID).getTitle();
			
			if(title.equals("OrangeHRM"))
			{
				System.out.println(driver.getCurrentUrl());
			}
		}
		
	}
	

}
