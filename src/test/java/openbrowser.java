import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class openbrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.opencart.com.gr/");
		String act_Title = driver.getTitle();
		
		if(act_Title.equals("Your Store"))
		{
			System.out.println("Your Test is Pass");
		}
		else
		{
			System.out.println("Your Test is Failed");
	
		}
		
		driver.close(); 
	}
	

}
