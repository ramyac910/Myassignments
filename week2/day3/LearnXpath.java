package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXpath {

	public static void main(String[] args) {

    ChromeDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    
    //Implicitly wait- global wait - selenium wait
    //thread sleep(); - java wait
    
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    
    driver.get("https://login.salesforce.com/?locale=in");
    //dilipkumar.rajendran@testleaf.com ; Testleaf@2025
    
    //xpath for username
    
    driver.findElement(By.xpath("//input[@id='username']")).sendKeys("dilipkumar.rajendran@testleaf.com");
    
    // xpath for password
    
    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("TestLeaf@2025");
    
    //xpath for Login button
    
    driver.findElement(By.xpath("//input[@id='Login']")).click();
    
    
    
		
	}

}
