package InterviewQuestion;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathforserachinmakemytrip {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver (); 
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).click();
		Thread.sleep(5000);
		Alert promptalert =  driver.switchTo().alert();
		promptalert.dismiss();
		driver.findElement(By.xpath("//a[normalize-space()='Search']")).click();
	}

}
