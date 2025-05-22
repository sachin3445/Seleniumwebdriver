package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleClickAction {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement tBox1 = driver.findElement(By.xpath("//input[@id='field1']"));
		WebElement tBox2 = driver.findElement(By.xpath("//input[@id='field2']"));
		WebElement cButton = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		
		tBox1.clear();
		tBox1.sendKeys("My Name Is Sachit...!");
		
		Actions act = new Actions(driver);
		act.doubleClick(cButton).perform();
		
		//Validation of text in the text box
		String printtext = tBox2.getAttribute("value");
		
		if(printtext.equals("My Name Is Sachit...!")) {
			System.out.println("Text copied...!");
		}
		else {
			System.out.println("Text not copied...!");
		}

	}

}
