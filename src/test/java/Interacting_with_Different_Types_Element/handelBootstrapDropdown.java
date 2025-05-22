package Interacting_with_Different_Types_Element;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class handelBootstrapDropdown {

	public static void main(String[] args) {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			WebDriverWait myWait = new WebDriverWait(driver,Duration.ofSeconds(3000));
			
			driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
			driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
			
			//Single option select
			//driver.findElement(By.xpath("//input[@value='Python']")).click();
			
			//capture all the option and size
			 List <WebElement> drpoption = driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
			 System.out.println("Numbet of options:" + drpoption.size()); //Get total number of option
			 
			/* //Print all options
			 for (WebElement option:drpoption) {
				 System.out.println("List of All Dropdown option:"+ option.getText());
			 }*/
			 
			 //Select Multiple Option
			 for (WebElement option:drpoption) {
				 String	optittle = option.getText();
				 
				 if(optittle.equals("jQuery") || optittle.equals("HTML") || optittle.equals("Oracle"))
				 {
					 option.click();
				 }

			 }
			
	}

}
