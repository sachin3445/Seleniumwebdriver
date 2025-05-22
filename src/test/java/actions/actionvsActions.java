package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class actionvsActions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
		WebElement rghtbutton = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));

		//initiate action class
		Actions act = new Actions(driver);
		Action clickaction = act.contextClick(rghtbutton).build();
		Thread.sleep(3000);
		clickaction.perform();

	}

}
