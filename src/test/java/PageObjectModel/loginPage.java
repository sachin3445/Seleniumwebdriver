package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
	
	//Without using Page Factory
	
	WebDriver driver;
	// constructor: This is initiate a driver
	loginPage(WebDriver driver) 
	{
		this.driver=driver; 
	}
		
	// locator
	 By txt_username_loc =By.xpath("//input[@placeholder='Username']");
	 By txt_password_loc =By.xpath("//input[@placeholder='Password']");
	 By btn_login_loc =By.xpath("//button[normalize-space()='Login']");
	
	 // Action methods for each element
	 
	 public void setUsername (String user) 
	 {
		 driver.findElement(txt_username_loc).sendKeys(user);
	 }
	 
	 public void setPassword (String pwd) 
	 {
		 driver.findElement(txt_password_loc).sendKeys(pwd);
	 }
	 
	 public void clickLogin() 
	 {
		 driver.findElement(btn_login_loc).click();

}
}