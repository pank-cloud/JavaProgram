package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Write a  program to open a Google and type anything and
//navigate to autosuggestions using the down arrow keys and enter.
public class Assignment59 {

	public static void main(String[] args) throws InterruptedException {
    ChromeDriver driver = new ChromeDriver();
    driver.get("https://www.google.com/");
    WebElement e1 = driver.findElement(By.name("q"));
    e1.sendKeys("automation");
    Thread.sleep(4000);
    for(int i = 1; i<=4 ;i++)
   {
    e1.sendKeys(Keys.ARROW_DOWN);	
	}
    Thread.sleep(2000);

    e1.sendKeys(Keys.ENTER);
	}
}
