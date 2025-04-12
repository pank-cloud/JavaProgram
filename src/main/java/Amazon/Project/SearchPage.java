package Amazon.Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {

	WebDriver driver;
	
	//step 1
	@FindBy(id="twotabsearchtextbox")
	WebElement searchbox;
	
	@FindBy(id= "nav-search-submit-button")
	WebElement searchButton;
	
	@FindBy(xpath = "//span[text()='No results for ']")
	WebElement InvalidSearch;
	
	//step2 - creating method and calling abstract methods using webElement created
	public void searchProduct(String productName)
	{
		searchbox.clear();
		searchbox.sendKeys(productName);
		searchButton.click();
	}
	
	public String InvalidSearchMeth()
	{
		return InvalidSearch.getText();
	}
	
	//step3
	public SearchPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
