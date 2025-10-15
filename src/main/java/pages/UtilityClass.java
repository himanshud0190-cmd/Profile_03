package pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UtilityClass {
	
	static WebDriver driver;
	public static  String property(String key) throws IOException 
	{
		
		String path = System.getProperty("user.dir")+"\\src\\test\\resources\\Browser.properties";
		
		FileInputStream fs=new FileInputStream(path);
	
		Properties prop=new Properties();
		prop.load(fs);
		
		String value = prop.getProperty(key);
		
		return value;
	}
	
	public static WebElement WaitandClick(WebElement Element)
	{
		driver = DriverFactory.getdriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		WebElement Locator = wait.until(ExpectedConditions.visibilityOf(Element));
		Locator.click();
		return Locator;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
