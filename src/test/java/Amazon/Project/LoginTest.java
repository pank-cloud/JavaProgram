package Amazon.Project;

import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Utility.ExcelUtil;

public class LoginTest extends BaseTest {

	@DataProvider(name = "VLogin")
	public Object[][] validtest() throws InvalidFormatException, IOException {
		return ExcelUtil.getData("Login");
	}

	@DataProvider(name = "InvLogin")
	public Object[][] Invalidtest() throws InvalidFormatException, IOException {
		return ExcelUtil.getData("Invalid_login");
	}

	@Test(dataProvider = "VLogin", priority = 1, retryAnalyzer = ListenersPack.RetryLogic.class)
	public static void validLoginTest(String email, String pw) throws InvalidFormatException, IOException 
	{
		HomePage hp = new HomePage(driver);
		hp.accountListing(driver);
		hp.SigninClick();
		Login lo = new Login(driver);

		lo.SignIn(email, pw);
		Assert.assertTrue(lo.AmazonLogo.isDisplayed());

	}

	@Test(dataProvider = "InvLogin", priority = 2,  retryAnalyzer = ListenersPack.RetryLogic.class)
	public void InvalidLoginTest(String email, String pw) throws InvalidFormatException, IOException {
		HomePage hp = new HomePage(driver);
		hp.accountListing(driver);
		hp.SigninClick();
		Login lo = new Login(driver);

		lo.SignIn(email, pw);

		String invalidPwText = lo.InvalidPwddd.getText();

		Assert.assertEquals(invalidPwText, "There was a problem");

	}
}