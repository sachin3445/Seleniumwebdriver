package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		WebElement	src = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement trg = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		
		act.dragAndDrop(src, trg).perform();
		Thread.sleep(3000);
	

	}
	
}
