package Webdriver_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditional_Methods {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		
		//isDisplayed
		//WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		//System.out.println("Logo Status:" + logo.isDisplayed());
		
		//Another way to check
		
		boolean status = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		System.out.println("Logo Display Status:" + status);
		
		//isEnabled
		boolean txtStatus = driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
		System.out.println("First Name Text box Status:" + txtStatus);
		
		//isSelected
	    WebElement male_radio = driver.findElement(By.xpath("//input[@id='gender-male']"));
	    WebElement female_radio = driver.findElement(By.xpath("//input[@id='gender-female']"));
	    
	    System.out.println("Radio button before selection..........");
	    System.out.println( "Male Radio Button Status" + male_radio.isSelected());
	    System.out.println( "Female Radio Button Status" + female_radio.isSelected());
	    
	    System.out.println("After Selection Male Radio Button");
	    male_radio.click();
	    System.out.println( "Male Radio Button Status" + male_radio.isSelected());
	    System.out.println( "Female Radio Button Status" + female_radio.isSelected());
	    
	    System.out.println("After Selection Female Radio Button");
	    female_radio.click();
	    System.out.println( "Male Radio Button Status" + male_radio.isSelected());
	    System.out.println( "Female Radio Button Status" + female_radio.isSelected());
	    
	    //Verify status for already selected checkbox
	    boolean newsletterStatus =  driver.findElement(By.xpath("//input[@id='Newsletter']")).isSelected();
	    System.out.println("Verify Newletter checkbox status:" + newsletterStatus);
	    
	    driver.close();
	}

}
