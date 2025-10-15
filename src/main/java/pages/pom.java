package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom {
	WebDriver driver;
	@FindBy(id = "user-name") private WebElement username ;
	@FindBy(id = "password") private WebElement password;
	@FindBy(id = "login-button") private WebElement loginbtn;
	
	
	public pom(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this );
	}
	
	public void Username(String strusername) 
	{
		username.sendKeys(strusername);
	}
	public void Password(String strpassword)	
	{
		password.sendKeys(strpassword);
	}
	public void loginbtn() 
	{
		loginbtn.click();
	}
	
}
