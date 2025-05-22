package Webdriver_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Cammonds {

		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			//get method to page on browser
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			Thread.sleep(5000);
			
			driver.findElement(By.linkText("OrangeHRM, Inc")).click();
			Thread.sleep(5000);
			
			//driver.close(); // used to close single browser window
			
			driver.quit(); // used to close browser
	}

}
