package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

//Write a  program to navigate to amazon type shoes
//and click on search using id locator for both.
public class Assignment58 {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoes");
     
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		
	}

}
