package Webdriver_Methods;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicitWaitDemo {

	public static <Webdriver> void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
				
				//implicit Wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
				driver.close();

	}

}
