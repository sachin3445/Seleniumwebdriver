package DatePicker;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FutureDatepicker {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		//using Sendkeys
		driver.switchTo().frame(0);
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("12/08/1986");
		
		// using Date picker
		String year = "2026";
		String month = "March";
		String date = "6";
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		while (true)
		{
			String curntMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String curntYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(curntYear.equals(year) && curntMonth.equals(month))
			{
				break;
			}
			
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
	// Select date from Datepicker
		
		List <WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr//td//a"));
		for (WebElement sDt : allDates)
		{
			if (sDt.getText().equals(date))
			{
				sDt.click();
				break;
			}
		}
		
	}

}
