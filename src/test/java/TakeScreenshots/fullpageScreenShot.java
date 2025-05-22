package TakeScreenshots;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fullpageScreenShot {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		/*
		//full page screenshot
		TakesScreenshot ts = (TakesScreenshot)driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		File trgFile = new File(System.getProperty("user.dir")+"\\Screenshot\\SC_01.jpg");
		srcFile.renameTo(trgFile); //copy to target folder
		
		*/
		
		//Captured specific image
		WebElement screenshot = driver.findElement(By.xpath("//div[@id='HTML1']"));
		File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
		File trgFile = new File(System.getProperty("user.dir")+"\\Screenshot\\SC_02	.jpg");
		srcFile.renameTo(trgFile); //copy to target folder
	}

}
