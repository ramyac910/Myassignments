package week3.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindAllPrice {

	public static void main(String[] args) {


		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobile",Keys.ENTER);
		
		List<WebElement> elements = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		
		// to find the no of products
		
		int size = elements.size();
		System.out.println(size);
		
		List<Integer> price = new ArrayList<Integer>();
		
		for (int i =0; i < elements.size() ;  i++) {
			String text = elements.get(i).getText();
			
			System.out.println(text);
			
			if (!text.isEmpty()) {
				String replaceAll = text.replaceAll(",", "");
				int finalValues = Integer.parseInt(replaceAll);
				price.add(finalValues);
				
			}
			
		}
		
		System.out.println(price);
		
	}

}
