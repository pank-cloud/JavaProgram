package Amazon.Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;
	// Use of @FindBy to create WebElement
	// Create a method and call Selenium Functions 
	// Create a cPageFactry class and call initElements methods
	
	//step 1
	@FindBy(id = "nav-link-accountList-nav-line-1")
	WebElement accountList;
	
	@FindBy(xpath = "//span[text()='Sign in']")
	WebElement signIn;
	
	//step 2
	public void accountListing(WebDriver driver)
	{
		Actions a = new Actions(driver);
		a.moveToElement(accountList).perform();
	}
	
	public void SigninClick()
	{
		signIn.click();
	}
	
	//step 3
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
