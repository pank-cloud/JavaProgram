package Amazon.Project;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;

import Utility.ExcelUtil;

public class SearchPageTest extends BaseTest{

	@Test
	public void verifySearch() throws InvalidFormatException, IOException
	{
	
		SearchPage sp = new SearchPage(driver);
		String searchInv = ExcelUtil.ExcelData();
		sp.searchProduct(searchInv);
		
		Assert.assertEquals("No results for", sp.InvalidSearchMeth());

}
}