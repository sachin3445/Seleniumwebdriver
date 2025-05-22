package brokenLinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Steps
 1) Find the all links o page
 2) https://xyz.com --> Server --> Status code
 3) Status code > = 400  --> Broken links
  	Status code < 400 --> Not a broken links
*/
public class validateBrokenlinks {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
		//find the all links on page using tag name
		List <WebElement> alllinks = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links: " +alllinks.size());
		
		// check the href value present or not using for loop
		int numberofbrokenlinks = 0;
		for(WebElement eleLink:alllinks) {
			@SuppressWarnings("deprecation")
			String hrefvalue = eleLink.getAttribute("href");
			
			
			
			if(hrefvalue == null || hrefvalue.isEmpty()) 
			{
				System.out.println("href value is null or empty not possible to check");
				continue;
			}
			
			// hit url into server
			
			// convert href value string to url
			try 
			
			{
			URL linkUrl = new URL(hrefvalue);
			HttpURLConnection conec=(HttpURLConnection)linkUrl.openConnection();
			conec.connect();
			if(conec.getResponseCode()>=400) {
				System.out.println(hrefvalue+ "---> Broken links" );
				numberofbrokenlinks++;
			}
			else 
			{
				System.out.println(hrefvalue+ "---> not a Broken links" );
			
			}
		} 
			catch(Exception e) 
			{
			
			}
			
			
	}
		System.out.println("Total number of brokenlinks: "+numberofbrokenlinks);
}
			

}


