package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseOverActiona {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com.gr/");
		driver.manage().window().maximize();
		
		WebElement laptop = driver.findElement(By.xpath("//a[normalize-space()='Laptops & Notebooks']"));
		WebElement window = driver.findElement(By.xpath("//a[normalize-space()='Windows (0)']"));
		
		Actions act = new Actions(driver);
		//act.moveToElement(laptop).moveToElement(window).click().build().perform();
		// build action not mandatory it will applicable only when we want to perform the action later on
		act.moveToElement(laptop).moveToElement(window).click().perform();
		
		
	}

}
