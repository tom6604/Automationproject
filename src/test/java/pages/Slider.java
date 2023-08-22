package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Slider 
{

	WebDriver driver;
	public Slider(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@Test
	public void slice()
	{
		WebElement slide = driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
		Actions a=new Actions(driver);
		
		a.clickAndHold(slide);
		a.moveByOffset(80, 0).build().perform();	
	}
	
	public void resize()
	{
		WebElement size = driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
		Actions b=new Actions(driver);
		
		b.clickAndHold(size);
		b.moveByOffset(0, -45).build().perform();
	}
	

}
