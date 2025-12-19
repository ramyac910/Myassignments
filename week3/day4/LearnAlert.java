package week3.day4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) throws InterruptedException {

       ChromeDriver driver = new ChromeDriver();
       
       driver.manage().window().maximize();
       
       // step2 declare url
       
       driver.get("https://www.leafground.com/dashboard.xhtml");
       
       driver.findElement(By.xpath("(//li[@class='ui-menuitem-submenu'])[2]")).click();
       
       driver.findElement(By.xpath("//span[text()='Alert']")).click();
       
       driver.findElement(By.xpath("//span[text()='Show']")).click();
       
      // driver.findElement(By.xpath("//span[text()='Show'])[2]")).click();
       
       //handling alert
       
       Alert alert1 = driver.switchTo().alert();
       
       String alert1Text = alert1.getText();
       System.out.println(alert1Text);
       
       Thread.sleep(3000);
       
       alert1.accept();
       System.out.println("you have successfully clicked an alert");
       
       // confirmation alert
       
       driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
       Alert alert2 = driver.switchTo().alert();
       String text2 = alert2.getText();
       System.out.println(text2);
       
       alert2.accept();
       System.out.println("Userclicked : OK");
       
       driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
       Thread.sleep(3000);
       alert2.dismiss();
       System.out.println("Userclicked : cancel");
       
	}

}
