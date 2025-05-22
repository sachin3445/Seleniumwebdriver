package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage2 {
	
	//Using Page Factory
	
	WebDriver driver;
	// constructor: This is initiate a driver
	loginPage2(WebDriver driver) 
	{
		this.driver=driver;
		
	// This is extra line to add in page factory object class page
		PageFactory.initElements(driver, this); // This is mandatory 
	}
		
	// locator
	 
	 @FindBy(xpath = "//input[@placeholder='Username']")
	 WebElement txt_username;
	 
	 @FindBy(xpath = "//input[@placeholder='Password']")
	 WebElement txt_password;
	 
	 @FindBy(xpath = "//button[normalize-space()='Login']")
	 WebElement btn_login;
	
	 // Action methods for each element
	 
	 public void setUsername (String user) 
	 {
		 txt_username.sendKeys(user);
	 }
	 
	 public void setPassword (String pwd) 
	 {
		 txt_password.sendKeys(pwd);
	 }
	 
	 public void clickLogin() 
	 {
		 btn_login.click();

}
}