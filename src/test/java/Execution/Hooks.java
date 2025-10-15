package Execution;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import pages.DriverFactory;
import pages.UtilityClass;

public class Hooks 
{
	static WebDriver driver;
	@Before
	public void openbrowser() throws IOException
	{
		DriverFactory df=new DriverFactory();
		String browsername = UtilityClass.property("browsername");
		driver = df.initbrowser(browsername);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@After
	public void closebrowser() throws IOException
	{
//		Desktop.getDesktop().browse(new File("test-output\\SparkReport\\Index.html").toURI());
		driver.quit();
	}

}