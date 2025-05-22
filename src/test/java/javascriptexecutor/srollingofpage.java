package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class srollingofpage {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//Scroll page by using pixel
		
		/*
		js.executeScript("window.scrollBy(0,850)", "");
		System.out.println(js.executeScript("return window.pageYOffset;")); */
		
		//Till specific element
		/*
		WebElement ele = driver.findElement(By.xpath("//h2[normalize-space()='Static Web Table']"));
		js.executeAsyncScript("arguments[0].scrollIntoView()",ele); */
		
	/*	//Till end of the page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;")); */
		
		//Till top of the page
		
		js.executeScript("window.scrollBy(0,- document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
	}

}
