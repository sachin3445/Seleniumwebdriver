package Assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggestionDrop_Datepicker {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Samsung");
		Thread.sleep(5000);
		
		List <WebElement> searchop = driver.findElements(By.xpath("//span[@class='s-heavy']"));
		System.out.println(searchop.size());
		
		for(int i =0; i<searchop.size(); i++) {
			
			System.out.println(searchop.get(i).getText());
			
			if (searchop.get(i).getText().equals("samsung s24 ultra 5g mobile")) {
				
				searchop.get(i).click();
				break;
			}
			
		}
		

	}

}
