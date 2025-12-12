package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Facebook {

	public static void main(String[] args) {

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--guest");
		
		ChromeDriver driver = new ChromeDriver(option);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//div[@class='_6lux']/input")).sendKeys("NewName");
		
		driver.findElement(By.xpath("(//div[@class='_6lux']))//input")).sendKeys("NewPassword");
		
		
	}

}
