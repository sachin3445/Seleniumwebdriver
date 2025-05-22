package Webdriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate_Cmd_Forword_Backword {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.navigate().to("https://www.google.com/");
			
		driver.navigate().back();
		System.out.println("This is First  url:" + driver.getCurrentUrl());
		
		driver.navigate().forward();
		System.out.println("This is Second url:" + driver.getCurrentUrl());
		

		driver.navigate().refresh();

	}

}
