package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploadmultiplefiles {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		String file1 = "D:\\Dummy Files\\Dummyfile1.txt";
		String file2 ="D:\\\\Dummy Files\\\\Dummyfile2.txt";
		
		driver.findElement(By.xpath("//input[@id='multipleFilesInput']")).sendKeys(file1 +"\n" + file2);
		driver.findElement(By.xpath("//button[normalize-space()='Upload Multiple Files']")).click();
		
		String multiplefilestatus = driver.findElement(By.xpath("//p[@id='multipleFilesStatus']")).getText();
		
		if(multiplefilestatus.contains("Dummyfile1.txt") && multiplefilestatus.contains("Dummyfile1.txt")) 
		{
			System.out.println("File upload successfully");
		}
		
		else
		{
			System.out.println("File not upload successfully");
		}
	}
	

}
