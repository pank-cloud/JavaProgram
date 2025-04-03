package Selenium_Practice;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderConcept {

	WebDriver driver = new ChromeDriver();   

	@DataProvider(name = "login")
	
	public Object[][] loginMethod() throws InvalidFormatException, IOException
	{

			FileInputStream fs = new FileInputStream("----------Excel Path----------------");	
			Workbook w1 = WorkbookFactory.create(fs);
			
                        String s1[][] = new String[2][2];
			
			for(int i = 0 ; i <=1 ; i++)
			{
				for(int j=0 ; j<=1 ; j++)
				{
					s1[i][j] =  w1.getSheet("login").getRow(i).getCell(j).getStringCellValue();
				}
			}
			
//			String s1 = w1.getSheet("login").getRow(0).getCell(0).getStringCellValue();
//			String s2 =w1.getSheet("login").getRow(0).getCell(1).getStringCellValue();
//			String s3 = w1.getSheet("login").getRow(1).getCell(0).getStringCellValue();
//			String s4 = w1.getSheet("login").getRow(1).getCell(1).getStringCellValue();
	
			
			return new Object[][] {
				{s1[0][0], s1[0][1]},
				{s1[1][0], s1[1][1]},
				};
	
	}
	
	@Test(dataProvider = "login")
	public void loginFB(String un, String pw) throws InterruptedException
	{
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(un);
		driver.findElement(By.id("pass")).sendKeys(pw);
		Thread.sleep(2000);

	}
	
	
	
	
	
}
