package assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Write a selenium program to  get Title of the page.
public class Assignment55 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.navigate().refresh();
		System.out.println();
		String title = driver.getTitle();
		System.out.println("Title of the page is : " +title);
		
	}

}
