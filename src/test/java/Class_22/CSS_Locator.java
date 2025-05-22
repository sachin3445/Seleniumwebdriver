package Class_22;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CSS_Locator {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//Tag & Tag#ID combination 
		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("iphone");
		
		//Tag & Tag.class
		driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("T-Shirt");
		
		//Tag & tag[attribute="value"]
		driver.findElement(By.cssSelector("input.[placeholder='Search store']")).sendKeys("iphone");
		
		//Tag Class & attribute tag.classname[attribute="value"]
		driver.findElement(By.cssSelector("input.search-box-text[placeholder='Search store']")).sendKeys("T-Shirt");
	}

}
