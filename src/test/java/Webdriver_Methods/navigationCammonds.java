package Webdriver_Methods;

//import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigationCammonds {

	public static void main(String[] args) throws MalformedURLException  {

		WebDriver driver = new ChromeDriver();
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); //Pass only URL sting
		
		driver.navigate().to("https://testautomationpractice.blogspot.com/"); //Pass String
		
		URL mylink=new URL ("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); // Pass as object
		driver .navigate().to(mylink); 
		driver.manage().window().maximize();
				
		
		
	}

}	

