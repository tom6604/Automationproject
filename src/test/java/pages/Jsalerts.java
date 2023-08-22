package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Jsalerts 
{
	WebDriver driver;
	
	
	
	public Jsalerts(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@Test
	public void alert()
	{
		driver.findElement(By.xpath("//*[@id=\"HTML9\"]/div[1]/button[1]")).click();
		

	    Alert a=driver.switchTo().alert();
	    a.accept();  
	}
	public void confirm()
	{
		driver.findElement(By.xpath("//*[@id=\"HTML9\"]/div[1]/button[2]")).click();
		Alert b=driver.switchTo().alert();
		
		b.dismiss();
	}
	
	public void prompt(String name)
	{
		driver.findElement(By.xpath("//*[@id=\"HTML9\"]/div[1]/button[3]")).click();
		Alert c=driver.switchTo().alert();
		
		c.sendKeys(name);
		c.accept();
	}
	

}
