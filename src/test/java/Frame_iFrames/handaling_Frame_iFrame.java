package Frame_iFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class handaling_Frame_iFrame {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(3000));
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		//Frame 01
		WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']")); //Store the frame in webelement
		driver.switchTo().frame(frame1); //Switch driver to frame
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Sachin Mehetre");
		driver.switchTo().defaultContent(); //driver move to default page
		
		//Frame 02
		WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Trupti Mehetre");
		driver.switchTo().defaultContent();
		
		//Frame 03
		WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Sachit Mehetre");
		//Switch to inner iframe
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//div[@id='i9']//div[@class='AB7Lab Id5V1']")).click();
		driver.switchTo().defaultContent();
		
		//Frame 05
		WebElement frame5 = driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
		driver.switchTo().frame(frame5);
		//driver.findElement(By.xpath("//input[@name='mytext5']")).sendKeys("Aai-Aana");
		driver.findElement(By.cssSelector("a[href='https://a9t9.com']")).click();
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//img[@alt='Ui.Vision by a9t9 software - Image-Driven Automation']")).isDisplayed();
		//System.out.println("Is logo Displayed:" + logoStatus);
	}

}
