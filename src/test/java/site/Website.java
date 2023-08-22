package site;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Doubleclickdrag;
import pages.Form;
import pages.Jsalerts;
import pages.Newbrowser;
import pages.Slider;
import pages.Tab;
import pages.Screenshotnew;

public class Website 
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
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
	}
	
    @Test
    public void test() throws Exception
    {
    	Form ob1=new Form(driver);
    	ob1.test1("Tom", "tom@gmail.com", "9207886604", "Karukaparambil edathua");
    	ob1.test2();
 
    	Tab ob2=new Tab(driver);
    	ob2.tabss("testing");
    	
    	Jsalerts ob3=new Jsalerts(driver);
    	ob3.alert();
    	ob3.confirm();
    	ob3.prompt("David");

    	Doubleclickdrag ob4=new Doubleclickdrag(driver);
    	ob4.doublecl();
    	ob4.drag();
    	
    	Slider ob5=new Slider(driver);
    	ob5.slice();
    	ob5.resize();
    	
    	Newbrowser ob6=new Newbrowser(driver);
    	ob6.scroll();
    	ob6.handle();
    	
    	
    	Screenshotnew ob7=new Screenshotnew(driver);
    	ob7.testk();
    	
    }
}
