package week3.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {

	public static void main(String[] args) {

  // Step1 : Declaring Chrome driver
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//step2 declare the url
		
		driver.get("https://www.leafground.com/dashboard.xhtml");
		
		driver.findElement(By.xpath("(//li[@class='ui-menuitem-submenu'])[2]")).click();
		
		driver.findElement(By.xpath("//span[text()='Frame']")).click();
		
		// switching the driver to focus
		driver.switchTo().frame(0);
		
		// click
		
		driver.findElement(By.id("Click")).click();
					
				
		
	}

}
