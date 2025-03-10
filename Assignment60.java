package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Write a  program to open a flipkart  and type shoes and 
//navigate to autosuggestions using the down arrow keys and enter.
public class Assignment60 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebElement e1 = driver.findElement(By.name("q"));
		e1.sendKeys("shoes");
		Thread.sleep(2000);
		for(int i = 0 ; i<=4 ; i++)
		{
		e1.sendKeys(Keys.ARROW_DOWN);
		}
		Thread.sleep(2000);
		e1.sendKeys(Keys.ENTER);
	}

}
