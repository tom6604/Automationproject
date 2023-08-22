package others;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Date 
{
	public WebDriver driver1;
	@BeforeTest
	public void setup()
	{
		
		driver1=new ChromeDriver();
		
	}
	
	@BeforeMethod
	public void urlloading()
	
	{
		driver1.get("https://www.oyorooms.com/");
		driver1.manage().window().maximize();
	}
	
	@Test
	public void date1()
	{
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver1.navigate().refresh();
		driver1.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div[3]/div/div/div/div[2]/div/div/span[1]")).click();
		while(true)
		{
			WebElement month=driver1.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div[3]/div/div/div/div[2]/div/span/div/div/div[2]/div/span[1]"));
			
			String month1=month.getText();
			if(month1.contains("August"))
			{
				System.out.println(month1);
				break;
			}
			else
			{
				driver1.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div[3]/div/div/div/div[2]/div/span/div/div/div[4]/div"));	
			}
		}
		List<WebElement> alldates1=driver1.findElements(By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div[3]/div/div/div/div[2]/div/span/div/div/div[2]/table/tbody/tr/td/span"));
		for(WebElement dateelement:alldates1)
		{
			String date=dateelement.getText();
			if(date.equals("25"))
			{
				dateelement.click();
				System.out.println("date selected");
			}
		}
	}

}
