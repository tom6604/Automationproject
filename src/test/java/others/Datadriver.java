package others;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datadriver 
{
	public WebDriver driver;
	@BeforeTest
	public void setup()
	{
		
		driver=new ChromeDriver();
		
	}
	@BeforeMethod
	public void start()
	{
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
	}
	
    @Test
    public void test() throws IOException
    {
    	File f=new File("D:\\Testing\\data.xlsx");
		FileInputStream fi=new FileInputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet sh=wb.getSheet("Sheet1");
		
		for(int i=1;i<=sh.getLastRowNum();i++)
		{
			String username=sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println("username="+username);
			String pswd=sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println("Password"+pswd);
			
			driver.findElement(By.xpath("//*[@id=\"username\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(username);
			driver.findElement(By.xpath("//*[@id=\"password\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(pswd);
			
			driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		}
		
	}
    }


