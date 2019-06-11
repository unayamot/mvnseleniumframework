package util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import setup.TestBase;

public class Screenshot extends TestBase {

	public static void take(WebDriver wd) throws IOException {
		File scrFile = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("C:\\Users\\ivigi\\Desktop\\screenshot.png"));
	}

}
