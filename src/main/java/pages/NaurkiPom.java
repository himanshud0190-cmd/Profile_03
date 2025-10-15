package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NaurkiPom 
{
	WebDriver driver;
	
	@FindBy (id = "login_Layer") private WebElement LoginButton;
	@FindBy (xpath = "//input[@placeholder='Enter your active Email ID / Username']") private WebElement EnterUsername;
	@FindBy (xpath = "//input[@placeholder='Enter your password']") private WebElement EnterPassword;
	@FindBy (xpath = "//button[@type='submit']") private WebElement ClickLoginButton2;
	@FindBy (xpath = "//img[@class='user-img']") private WebElement VerifyUserImage;
	@FindBy (xpath = "//img[@alt='naukri user profile img']/self::img[@class='nI-gNb-icon-img']") private WebElement ProfileIcon;
	@FindBy (xpath = "//a[@class='nI-gNb-info__sub-link']/self::a[text()='View & Update Profile']") private WebElement UpdateButton;
	@FindBy (xpath = "//input[@value='Update resume']") private WebElement UploadResume;
	@FindBy (xpath = "//div[@class='s12 typ-16Bold']/self::div[text()='Resume']") private WebElement Scroll;
	@FindBy (xpath = "//div[@class='msgBox success ']/descendant::p[text()='Success']") private WebElement UploadSuccessMessage;
	@FindBy (xpath = "//span[text()='Resume headline']/following-sibling::span[text()='editOneTheme']") private WebElement RHEditButton;
	@FindBy (id        = "resumeHeadlineTxt") private WebElement EnterResumeHeadline;
	@FindBy (xpath = "//button[text()='Save']") private WebElement ClickSaveButton;
	@FindBy (xpath = "//div[@class='msgBox success ']/descendant::p[@class='msg']") private WebElement RHSuccessMessage;
	@FindBy (xpath = "//a[@title='Logout']") private WebElement LogoutButton;
	@FindBy (id        = "register_Layer") private WebElement RegistrationButton;
	
	public NaurkiPom(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void ClickLoginButton() 
	{
		UtilityClass.WaitandClick(LoginButton);
	}
	
	public void EnterUserName(String UserName) 
	{
		EnterUsername.sendKeys(UserName);
	}
	
	public void EnterPassWord(String PassWord) 
	{
		EnterPassword.sendKeys(PassWord);
	}
	
	public void ClickLoginButton2() 
	{
		UtilityClass.WaitandClick(ClickLoginButton2);
	}
	
	public void VerifyUserImage() 
	{
		VerifyUserImage.isDisplayed();
	}
	
	public void ClickProfileIcon() throws InterruptedException
	{
		Thread.sleep(2000);
		UtilityClass.WaitandClick(ProfileIcon);
	}
	
	public void ClickUpdateButton()
	{
		UtilityClass.WaitandClick(UpdateButton);
	}
	
	public void UploadResume() throws InterruptedException, AWTException
	{
		Thread.sleep(2000);
		// Click on the upload button
		UtilityClass.WaitandClick(UploadResume);
//        WebElement uploadBtn = driver.findElement(By.xpath("//input[@value='Update resume']"));
//        uploadBtn.click();
        
        // Give your file path here
        String filePath = "C:\\Users\\hd888\\Desktop\\Himanshu's Projects\\Profile_02\\src\\test\\resources\\Resume\\HJD_CV.pdf";
        
        // Copy file path to clipboard
        StringSelection sel = new StringSelection(filePath);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel, null);
        
        // Use Robot to paste the path and press Enter
        Robot robot = new Robot();
        robot.delay(1000);
        
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        
        robot.delay(500);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        
        System.out.println("File uploaded successfully!");
	}
	
	public boolean UploadResumeMessage()
	{
		boolean Message  = UploadSuccessMessage.isDisplayed();
		return Message;
	}
	
	public void ClickResumeHeadlineEditButton()
	{
		UtilityClass.WaitandClick(RHEditButton);
	}
	
	public void EnterResumeHeadline() throws InterruptedException
	{
		Thread.sleep(1000);
		EnterResumeHeadline.clear();
		Thread.sleep(1000);
		EnterResumeHeadline.sendKeys("Experienced Automation Test Engineer (3.5 years) with expertise in Selenium WebDriver, Java and API Testing. Adept at writing automation scripts, executing test cases, and collaborating in Agile teams to ensure product quality and timely delivery.");
	}
	
	public void ClickSaveButton() throws InterruptedException
	{
		UtilityClass.WaitandClick(ClickSaveButton);
	}
	
	public boolean VerifyRHSuccessMessage()
	{
		boolean RHMessage = RHSuccessMessage.isDisplayed();
		return RHMessage;
	}
	
	public void ClickLogoutButton()
	{
		UtilityClass.WaitandClick(LogoutButton);
	}
	
	public boolean ClickRegisterButton()
	{
		boolean RegButton = RegistrationButton.isDisplayed();
		return RegButton;
	}

}