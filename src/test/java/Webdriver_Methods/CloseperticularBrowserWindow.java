package Webdriver_Methods;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseperticularBrowserWindow {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500)); // To add waiting time
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		Set<String> windowID = driver.getWindowHandles(); //get the windows ids
		
		//To close specific single browser window 
		
		/*
		 * for(String winID:windowID) { String tittle =
		 * driver.switchTo().window(winID).getTitle();
		 * System.out.println(driver.getTitle());
		 * 
		 * if(tittle.
		 * equals("Human Resources Management Software | OrangeHRM HR Software")) {
		 * driver.close(); } }
		 */

		// To close specific multiple bowser windows
		/*
		 * for(String winID:windowID) { String tittle =
		 * driver.switchTo().window(winID).getTitle();
		 * System.out.println(driver.getTitle());
		 * 
		 * if(tittle.
		 * equals("Human Resources Management Software | OrangeHRM HR Software") ||
		 * tittle.equals ("OrangeHRM")) { driver.close(); } }
		 */

		 // using page URL we can close the specific tab
		
		for(String winID:windowID) {
			String url = driver.switchTo().window(winID).getCurrentUrl();
			System.out.println(driver.getCurrentUrl());
			
			if(url.equals("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")) {
				driver.close();
			}
		}
		
	}

}
