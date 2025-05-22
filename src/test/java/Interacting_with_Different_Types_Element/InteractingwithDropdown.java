package Interacting_with_Different_Types_Element;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InteractingwithDropdown {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		WebDriverWait myWait = new WebDriverWait(driver,Duration.ofSeconds(3000));

		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement dropdwnCountry = driver.findElement(By.xpath("//select[@id='country']"));
		Select dropdown = new Select(dropdwnCountry);
		
		//Select Dropdown value
		//dropdown.selectByContainsVisibleText("Australia"); //Select by VisiableTest
		//dropdown.selectByValue("uk"); //Select by Values
		//dropdown.selectByIndex(3); //Select by index and alway start from 0
		
		//capture option from dropdown
		 List <WebElement>option = dropdown.getOptions();
		 System.out.println("Total number of option:"+ option.size());
		
		 //get the values from dropdown using normal for loop
		 
		 /*for(int i=0; i<option.size(); i++){
			 
			System.out.println(option.get(i).getText()); 
		 } */
		
		 //get values using enhance for loop
		 
		 for(WebElement drpop:option) {
			 System.out.println(drpop.getText());
		 }
	}

}