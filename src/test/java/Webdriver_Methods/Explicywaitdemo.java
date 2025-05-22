package Webdriver_Methods;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Explicywaitdemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		WebDriverWait userWait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Declaration of Explicywait time
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		WebElement textUser = userWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
		textUser.sendKeys("Admin");
		
		WebElement textPassword = userWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));
		textPassword.sendKeys("admin123");
		
		WebElement logInButton = userWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Login']")));
		logInButton.click();
		
		
	}

}
