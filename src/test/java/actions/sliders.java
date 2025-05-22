package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sliders {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		Actions act = new Actions(driver);
		
		WebElement leftslide = driver.findElement(By.xpath("//div[@id='slider-range']//span[1]"));
		//get the current position of slider
		System.out.println("Default position of left slide:" + leftslide.getLocation()); //(890, 2019)
		act.dragAndDropBy(leftslide, 910, 2019).perform();
		System.out.println("After change the slide position of left slide:" + leftslide.getLocation());
	}

}