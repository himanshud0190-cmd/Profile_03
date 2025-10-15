package Execution;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DriverFactory;
import pages.NaurkiPom;

public class NaukriStepDefinition 
{
	NaurkiPom NP;
	WebDriver driver;
	@Given("User should be at Login page")
	public void UsershouldbeatLoginpage()
	{
		 NP = new NaurkiPom(DriverFactory.getdriver());
		driver = DriverFactory.getdriver();
		driver.get("https://www.naukri.com/");
	}
	
	@When("User clicks on Login button")
	public void UserclicksonLoginbutton()
	{
		NP.ClickLoginButton();
	}
	
	@When("User enters Username as {string}")
	public void UserentersUsername(String UserName) 
	{
		NP.EnterUserName("himanshu26jd@outlook.com");
	}
	
	@When("User enters Password as {string}")
	public void UserentersPassword(String PassWord) 
	{
		NP.EnterPassWord("HIMANSHU26JD@OUTLOOK.COM");
	}
	
	@When("User clicks on Login button2")
	public void UserclicksonLoginbutton2() 
	{
		NP.ClickLoginButton2();
	}
	
	@Then("User should get redirects to Home page")
	public void UsershouldgetredirectstoHomepage() 
	{
		NP.VerifyUserImage();
	}
	
	@Given("User should be at Home page")
	public void UsershouldbeatHomepage()
	{

	}
	
	@When("User clicks on profile button")
	public void Userclicksonprofilebutton() throws InterruptedException
	{
		NP.ClickProfileIcon();
	}
	
	@When("User clicks on View & Update Profile button")
	public void UserclicksonViewUpdateProfilebutton()
	{
		NP.ClickUpdateButton();
	}
	
	@Then("User should be able to upload the resume successfully")
	public void Usershouldbeabletouploadtheresumesuccessfully() throws InterruptedException, AWTException
	{
		NP.UploadResume();
	}
	
	@Then("User should get Success message")
	public void UsershouldgetSuccessmessage()
	{
		boolean Mesage = NP.UploadResumeMessage();
		Assert.assertTrue(Mesage);
	}
	
	@When("User clicks on Resume Headline edit button")
	public void UserclicksonResumeHeadlineeditbutton()
	{
		NP.ClickResumeHeadlineEditButton();
	}
	
	@When("User enters Resume Headline")
	public void UserentersResumeHeadline() throws InterruptedException
	{
		NP.EnterResumeHeadline();
	}
	
	@When("User clicks on Save button")
	public void UserclicksonSavebutton() throws InterruptedException
	{
		NP.ClickSaveButton();
	}
	
	@Then("Verify that user should get Resume Headline Success message")
	public void VerifythatusershouldgetResumeHeadlineSuccessmessage()
	{
		boolean Message = NP.VerifyRHSuccessMessage();
		Assert.assertTrue(Message);
	}
	
	@When("User clicks on Logout button")
	public void UserclicksonLogoutbutton()
	{
		NP.ClickLogoutButton();
	}
	
	@Then("Verify that user should get navigates to Registration page")
	public void VerifythatusershouldgetnavigatestoRegistrationpage()
	{
		boolean RegButton = NP.ClickRegisterButton();
		Assert.assertTrue(RegButton);
	}

}