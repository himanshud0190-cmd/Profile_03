package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
	static WebDriver driver;
	public WebDriver initbrowser(String browsername)
	{
		if(browsername.equalsIgnoreCase("chrome")) 
		{
			 driver =new ChromeDriver();
		}
		
		else if(browsername.equalsIgnoreCase("firefox")) 
		{
			driver=new FirefoxDriver();
		}
		else if(browsername.equalsIgnoreCase("Edge"))
		{
			System.setProperty("webdriver.edge.driver", "C:\\Users\\hd888\\Desktop\\IMP_Interview\\msedgedriver.exe");
			 driver = new EdgeDriver();
		}
		return driver;
		
	}

	public static WebDriver getdriver()
	{
		return driver;
	}
}
