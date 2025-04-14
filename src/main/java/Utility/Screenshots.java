package Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import Amazon.Project.BaseTest;

public class Screenshots {

	public static void ScreenshotsMethod(String Status) throws IOException {

		WebDriver driver = BaseTest.driver;

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(
				"F:\\Users\\Pankaj\\eclipse-workspace\\Project\\Screenshots\\"+Status+"\\" + Math.random() + ".png");
		FileHandler.copy(source, destination);
	    }
	}

