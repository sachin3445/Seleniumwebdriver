package Interacting_with_Different_Types_Element;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteractingwithHiddenDropdown {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		//Login to Website
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//Select PIM module
		driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();
		
		//Click on Dropdown
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[7]/div[1]/div[2]/div[1]/div[1]")).click();
		
		//Select Single Option
		driver.findElement(By.xpath("//div[@class='oxd-select-text-input'][normalize-space()='Quality Assurance']")).click();

	} 

}
