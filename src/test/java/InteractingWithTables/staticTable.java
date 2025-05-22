package InteractingWithTables;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class staticTable {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//get the table
		driver.get("https://testautomationpractice.blogspot.com/");
		
		// Get the count total number of rows
		int tRows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println("Total number of Rows" + tRows);
		
		// Get the count total number of column
		int tCol = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		System.out.println("Total number of Columns:" + tCol);
		
		//Read the data from specific row:3 and column:1
		/*String tData = driver.findElement(By.xpath("//table[@name='BookTable']//tr[4]//td[1]")).getText();
		System.out.println("Table Data from row:3 and column:1=" + tData);*/
		
		//Read the all table data
		
		//System.out.println("BookName" +"\t"+"Author"+"\t"+"Subject"+"\t"+"\t"+"Price");
	/*	for(int r =2; r <= tRows; r++)
		{
			for (int c=1; c <= tCol; c++)
			{
				String tableData = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
				System.out.print(tableData +"\t");
			}
			System.out.println();
		}
		*/
		
		// Print book name whose author name "XYZ"
		
	/*	for ( int r =2; r<=tRows; r++)
		{
		 String authorName = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
		 if (authorName.equals("Amit"))
		 {
			 String bookName = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
			 System.out.println(bookName +"\t"+authorName);
		 }
		}
		*/
		
		//Count total price of Book
		
		int total =0;
		for ( int r =2; r<=tRows; r++)
		{
		 String price = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
		 
			 String bookName = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
			 total = total + Integer.parseInt(price);
		}
		
		System.out.println("Total price of Book:"+ total);
				
	}

}
