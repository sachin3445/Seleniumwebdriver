package DatePicker;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class passingdateusingmethod {
	
	static void selectpastdate (WebDriver driver,String year,String month,String date) 
	{
		// Select Month & Year
				while (true)
				{
					String curntMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
					String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
					
					if (curntMonth.equals(month) && currentYear.equals(year)) 
					{
						break;
					}
					driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
				}
				
				//Select Date
				
				List <WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr//td//a"));
					for(WebElement sDt:allDates)
					{
						if(sDt.getText().equals(date)) 
						{
							sDt.click();
							break;
						}
					}
	}
	
	static void selectfuture (WebDriver driver,String fyear,String fmonth,String fdate) 
	{
		// Select Month & Year
				while (true)
				{
					String curntMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
					String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
					
					if (curntMonth.equals(fmonth) && currentYear.equals(fyear)) 
					{
						break;
					}
					driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
				}
				
				//Select Date
				
				List <WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr//td//a"));
					for(WebElement sDt:allDates)
					{
						if(sDt.getText().equals(fdate)) 
						{
							sDt.click();
							break;
						}
					}
	}

	public static void main(String[] args) 
	{
	
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
	/*	//InPut Past Date
		String year = "2022";
		String month = "February";
		String date = "19";
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		selectpastdate(driver,year,month,date); */
		
		//InPut future Date
		String fyear = "2027";
		String fmonth = "February";
		String fdate = "19";
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		selectfuture(driver,fyear,fmonth,fdate);
		
		


	}

}
