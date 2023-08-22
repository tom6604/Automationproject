package others;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileuploadpickup 
{
	WebDriver driver2;
	@BeforeTest
	public void setup()
	{
		driver2=new ChromeDriver();
	}
	
	@BeforeMethod
	public void urlloadiing()
	{
		driver2.get("https://demo.imacros.net/Automate/FileUploadDemo");
		driver2.manage().window().maximize();
	}
	
	@Test
	public void test() throws Exception 
	{
		driver2.findElement(By.xpath("//*[@id=\"uploaded_file\"]"));
		fileUpload("D:\\R\\UN (1).pdf");
	}

	public void fileUpload(String p) throws AWTException 
	{
		StringSelection ss=new StringSelection(p);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		Robot r=new Robot();
		r.delay(3000);
		
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	

}
