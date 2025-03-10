package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//Write a program to fill the registartion form in 
//https://grotechminds.com/registration/
public class Assignment61 {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.findElement(By.id("fname")).sendKeys("Testing");
		driver.findElement(By.id("lname")).sendKeys("User");
		driver.findElement(By.id("email")).sendKeys("testinguser@g.com");
		driver.findElement(By.id("password")).sendKeys("testinguserPW");
		//RADIOButton
		driver.findElement(By.id("male")).click();
		//select skill DropDown
		WebElement e1 = driver.findElement(By.name("Skills"));
		Select select = new Select(e1);
	    select.selectByValue("select1");
	    
		//select country DropDown
	    WebElement e2 = driver.findElement(By.name("Country"));
	    Select select1 = new Select(e2);
        select1.selectByVisibleText("India");
        
		driver.findElement(By.xpath("//textarea[@id= 'Present-Address']")).sendKeys("testingABC address delhi");
		driver.findElement(By.id("email")).sendKeys("testinguser@g.com");
		driver.findElement(By.xpath("//textarea[@placeholder= 'Permanent Address']")).sendKeys("testingABC address delhi");
		driver.findElement(By.xpath("//input[@id= 'Pincode']")).sendKeys("111111");
		//select religion DropDown

		WebElement e3 = driver.findElement(By.id("Relegion"));
	    Select select2 = new Select(e3);
		select2.selectByIndex(1);
		
		// checkbox click
		driver.findElement(By.id("relocate")).click();
		

		
	
	
	}

}
