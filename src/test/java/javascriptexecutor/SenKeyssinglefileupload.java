package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SenKeyssinglefileupload {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.findElement(By.xpath("//input[@id='singleFileInput']")).sendKeys("D:\\Dummy Files\\Dummyfile1.txt");
		driver.findElement(By.xpath("//button[normalize-space()='Upload Single File']")).click();
		
		String fileStatus = driver.findElement(By.xpath("//p[@id='singleFileStatus']")).getText();
				
		if(fileStatus.contains("Dummyfile1.txt")) 
		{
			System.out.println("File upload successfuly");
		}
		else 
		{
			System.out.println("File upload Failed");
		}
		
	}

}
