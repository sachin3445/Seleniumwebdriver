package Interacting_with_Different_Types_Element;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Inetacting_With_CheckBox {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		// To select single checkbox
		//driver.findElement(By.xpath("//input[@id='sunday']")).click();
		
		//To select multiple checckbox
		List <WebElement> checkBoxes =  driver.findElements(By.xpath("//input[@class=\"form-check-input\" and @type=\"checkbox\"]"));
		
		//Using normal for loop
		/*
		 * for(int i = 0; i < checkBoxes.size(); i++) { checkBoxes.get(i).click(); }
		 */	

		//Using Enhance for loop
		/*
		 * for(WebElement checkbox : checkBoxes) {
		 * 
		 * checkbox.click();
		 * 
		 * }
		 */
		// For selecting First 3 checkboxes Total no of checkboxes - How many checkboxes want to select = Starting index. E.g 7-3=4
		
		for (int i = 4; i< checkBoxes.size(); i++)
		{
			checkBoxes.get(i).click();
		}
		
		
		//For selecting First 3 checkboxes Total no of checkboxes
		/*
		 * for (int i = 0; i<3; i++) { checkBoxes.get(i).click(); }
		 */
		
		Thread.sleep(5000);
		
		for(int i = 0; i< checkBoxes.size(); i++)
		{
			if (checkBoxes.get(i).isSelected())
			{
				checkBoxes.get(i).click();
			}
		}
		
	}

}
