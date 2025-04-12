package Amazon.Project;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

@Listeners(ListenersPack.ListenerLogic.class)
public class BaseTest {

	public static WebDriver driver;
	@BeforeMethod
	public void Setup()
	{
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.navigate().refresh();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	

	
	
	@AfterMethod
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(4000);
		driver.quit();
	}
	
}
