package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Write a program to launch Google.com, 
//type a search query and press Enter using name locator.
public class Assignment56 {

	public static void main(String[] args) {

	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	
	WebElement search = driver.findElement(By.name("q"));
	search.sendKeys("automation" +Keys.ENTER);
		
		
	}

}
