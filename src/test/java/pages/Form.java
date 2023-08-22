package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Form  
{
	
	WebDriver driver;
	By name=By.xpath("//*[@id=\"name\"]");
	By gmail=By.xpath("//*[@id=\"email\"]");
	By pho=By.xpath("//*[@id=\"phone\"]");
	By add=By.xpath("//*[@id=\"textarea\"]");
	
	By radio=By.xpath("//*[@id=\"male\"]");
	By check=By.xpath("//*[@id=\"sunday\"]");
	By check1=By.xpath("//*[@id=\"monday\"]");
	
	By country=By.xpath("//*[@id=\"country\"]/option[10]");
	By colour=By.xpath("//*[@id=\"colors\"]/option[3]");
	
	public Form(WebDriver driver)
	{
		this.driver=driver;
	}
	@Test
	public void test1(String fname,String mail,String phone,String address)
	{
		driver.findElement(name).sendKeys(fname);
		driver.findElement(gmail).sendKeys(mail);
		driver.findElement(pho).sendKeys(phone);
		driver.findElement(add).sendKeys(address);
	}
	public void test2()
	{
		driver.findElement(radio).click();
		driver.findElement(check).click();
		driver.findElement(check1).click();
		driver.findElement(country).click();
		driver.findElement(colour).click();
	}
}
		
	
