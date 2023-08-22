package pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Newbrowser 
{
	WebDriver driver;
	public Newbrowser(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@Test
	public void scroll()
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-2000)","");
	}
	
	public void handle()
	{
		String pw=driver.getWindowHandle();
		driver.findElement(By.xpath("//*[@id=\"HTML4\"]/div[1]/button")).click();
		
		Set<String> wh=driver.getWindowHandles();
		for(String han:wh)
		{
			if(!han.equalsIgnoreCase(pw))
			{
				driver.switchTo().window(han);
				driver.findElement(By.xpath("//*[@id=\"narbar-menu\"]/ul/li[3]/a")).click();
				driver.findElement(By.xpath("//*[@id=\"narbar-menu\"]/ul/li[3]/div/div/ul/li[2]/a")).click();
				
				
				driver.navigate().back();
				driver.close();
			}
			driver.switchTo().window(pw);
		}
		
		
		
		
		
		
		
		
		
		
	}

}
