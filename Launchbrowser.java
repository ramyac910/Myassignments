package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launchbrowser {

	public static void main(String[] args) {
		
		// Declaring Browser driver
		ChromeDriver driver=new ChromeDriver();
		
		
		// Maximizing window
		driver.manage().window().maximize();
		
		// declare the url of the application
		
		driver.get("https://www.facebook.com/");		

		// Teststep1: locating the username field
		
		driver.findElement(By.id("email")).sendKeys("testleaf");
		
		// Teststep2: locating password input field - pass
		
		driver.findElement(By.id("pass")).sendKeys("pass@word");
		
		// Teststep3: Locating Login button field - login
		
		driver.findElement(By.name("login")).click();
		
		// Teststep4: Printing the title of the page
		
		String title = driver.getTitle();
		System.out.println(title);
		
	}

}
