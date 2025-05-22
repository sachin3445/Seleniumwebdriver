package InteractingWithTables;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTablePagination {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		// Get the count total number of rows
		
		
		//int tCol = driver.findElements(By.xpath("//div[@class='table-container']//td")).size();
		//System.out.println("Total number of Column:" + tCol);
	
		for (int p=1; p<=4; p++)
		{
			
			if(p>1)
			{
				WebElement activePage = driver.findElement(By.xpath("//ul[@class='pagination']//li["+p+"]"));
				activePage.click();
				Thread.sleep(3000);
			}
			
			int tRow = driver.findElements(By.xpath("//div[@class='table-container']//tr")).size();
			System.out.println("Total number of Row:" + tRow);	
			
			for(int r =1; r <= tRow; r++)
			{  
						
					String id = driver.findElement(By.xpath("//div[@class='table-container']//tr["+r+"]/td[1]")).getText();
					String name = driver.findElement(By.xpath("//div[@class='table-container']//tr["+r+"]/td[2]")).getText();
					String price = driver.findElement(By.xpath("//div[@class='table-container']//tr["+r+"]/td[3]")).getText();
					System.out.println(id +"\t"+name+"\t"+price+"\t");
				
			}
		}
		
		
		
	}

}
