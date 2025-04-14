package Amazon.Project;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utility.ExcelUtil;

public class SearchPageTest extends BaseTest{

	@DataProvider(name = "VSearch")
	public Object[][] validSearch() throws InvalidFormatException, IOException {
		return ExcelUtil.getData("Search");
	}

	@DataProvider(name = "InSearch")
	public Object[][] InvalidSearch() throws InvalidFormatException, IOException {
		return ExcelUtil.getData("Invalid_Search");
	}
	
	@Test(dataProvider = "VSearch", priority = 1, retryAnalyzer = ListenersPack.RetryLogic.class)
		public void verifySearch(String search) throws InvalidFormatException, IOException 
		{
		// LoginTest.validLoginTest(email, pw);
			SearchPage sp = new SearchPage(driver);
			sp.searchProduct(search);
			
			int add_cartCount = sp.ValidSearch.size();
			if(add_cartCount > 0)
			{
				Assert.assertTrue(true);
			}

		}

		@Test(dataProvider = "InSearch", priority = 2, retryAnalyzer = ListenersPack.RetryLogic.class)
		public void InvalidSearchTest(String search) throws InvalidFormatException, IOException {
			// LoginTest.validLoginTest(email, pw);
				SearchPage sp = new SearchPage(driver);
				sp.searchProduct(search);
				
				String invalid = sp.InvalidSearch.getText();
				Assert.assertEquals("No results for", invalid);
		}
		
}
