package chromeOptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class headlessexcution {

	public static void main(String[] args) {
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--headless=new");

		WebDriver driver= new ChromeDriver(option);
		driver.get("https://demo.opencart.com.gr/");
		driver.manage().window().maximize();
		
		String logotitle=driver.findElement(By.xpath("//a[normalize-space()='Your Store']")).getText();
		if(logotitle.equals("Your Store"))
		{
			System.out.println("Test Case is Passed...!");
		}
		else 
		{
			System.out.println("Test Case is Failed...!");
		}

	}

}
