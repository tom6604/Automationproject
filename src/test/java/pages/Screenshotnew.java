package pages;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Screenshotnew 
{
	WebDriver driver;
	public Screenshotnew(WebDriver driver)
	{
	this.driver=driver;
	}	
	
	@Test
		public void testk() throws Exception
		{
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(src, new File("D:\\Testing\\a.png"));
		}

}
