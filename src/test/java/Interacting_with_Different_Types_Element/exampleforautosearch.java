package Interacting_with_Different_Types_Element;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class exampleforautosearch {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		
		driver.get("https://www.bjs.com/");
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Eggs");
		Thread.sleep(3000);
		List <WebElement> opList = driver.findElements(By.xpath("//div[@class='container search-suggestion']//div[@class='list list-group']"));
		System.out.println(opList.size());
		
		for (int i=0; i<opList.size(); i++)
		{
			System.out.println(opList.get(i).getText());
			if(opList.get(i).getText().equals("Eggs"))
			{
				opList.get(i).click();
				break;
			}
		}
		
		

	}

}
