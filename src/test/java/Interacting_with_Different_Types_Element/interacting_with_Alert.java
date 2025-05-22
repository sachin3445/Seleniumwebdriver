package Interacting_with_Different_Types_Element;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class interacting_with_Alert {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		
		// Select and verify simple alert
		/*driver.findElement(By.xpath("//button[@id='alertBtn']")).click();
		Alert simplealert =  driver.switchTo().alert();
		Thread.sleep(3000);
		System.out.println(simplealert.getText());
		simplealert.accept();*/

		// Confirmation Alert
	/*	driver.findElement(By.xpath("//button[@id='confirmBtn']")).click();
		Thread.sleep(3000);
		//driver.switchTo().alert().accept(); // To accept and close
		driver.switchTo().alert().dismiss(); // To close directly */
		
		//Prompt Alert
		driver.findElement(By.xpath("//button[@id='promptBtn']")).click();
		Thread.sleep(3000);
		Alert promptalert =  driver.switchTo().alert();
		promptalert.sendKeys("Sachit Mehetre");
		promptalert.accept();
		
		
		
		
		
		
		
		
	}

}
