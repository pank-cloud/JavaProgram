package Amazon.Project;

import org.testng.annotations.Test;

public class HomePageTest extends BaseTest{

	@Test 
	public void testHomePage()
	{
		HomePage hp = new HomePage(driver);
		hp.accountListing(driver);
		hp.SigninClick();
	}
}
