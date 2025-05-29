package actions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class opennewtabusingCtrl_Click {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com.gr/");
		
		Actions act = new Actions(driver); //Initiate action class
		
		WebElement software = driver.findElement(By.xpath("//a[normalize-space()='Software']"));
				
		act.keyDown(Keys.CONTROL).click(software).keyUp(Keys.CONTROL).perform();
		
		//Switching to tabs
		
		List <String> ids = new  ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(ids.get(1));
			
		driver.findElement(By.xpath("//h2[normalize-space()='Software']")).getText();
		Thread.sleep(3000);
		driver.switchTo().window(ids.get(0));
		
		
		
		
		
	}
	

}
