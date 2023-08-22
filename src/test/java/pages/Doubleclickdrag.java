package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Doubleclickdrag 
{
	WebDriver driver;
	public Doubleclickdrag(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@Test
	public void doublecl()
	{
		Actions act=new Actions(driver);
		WebElement d = driver.findElement(By.xpath("//*[@id=\"HTML10\"]/div[1]/button"));
		act.doubleClick(d).perform();
	}
	
	public void drag()
	{
		WebElement de=driver.findElement(By.xpath("//*[@id=\"draggable\"]/p"));
		WebElement dr=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		Actions act=new Actions(driver);
		act.dragAndDrop(de, dr);
		act.perform();
		
	}

}
