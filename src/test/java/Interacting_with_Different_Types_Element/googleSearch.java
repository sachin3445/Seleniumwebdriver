	package Interacting_with_Different_Types_Element;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class googleSearch {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver(); //Open Browser
	driver.manage().window().maximize(); //Maximize Browser
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000)); //Waiting Time
	
	driver.get("https://www.google.com/");
	driver.findElement(By.name("q")).sendKeys("Java Selenium");
	Thread.sleep(3000);
	List <WebElement> option=driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='option']"));
	System.out.println(option.size());
	
	for (int i=0; i<option.size(); i++)
	{
		System.out.println(option.get(i).getText());
		
		if (option.get(i).getText().equals("Java Selenium"))
		{
			option.get(i).click();
			break;
		}
	}
	
	}
}
