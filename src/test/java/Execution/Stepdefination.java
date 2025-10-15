package Execution;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DriverFactory;
import pages.pom;

public class Stepdefination {

	 pom pm;
	  WebDriver driver;
	@Given("user is at login page")
	public void user_is_at_login_page() 
	{
		  pm=new pom(DriverFactory.getdriver());
		   driver = DriverFactory.getdriver();
		 driver.get("https://www.saucedemo.com/");
	}
	
	@When("user enter user name {string} and password {string}")
	public void user_enter_user_name_and_password(String string, String string2) 
	{
		pm.Username("standard_user");
		pm.Password("secret_sauce");
		pm.loginbtn();
	}
	
	@Then("user should see the product page")
	public void user_should_see_the_product_page() 
	{
	
	}

}
