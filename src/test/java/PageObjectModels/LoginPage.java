package PageObjectModels;

import static org.junit.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitHelper;

public class LoginPage 
{
	WebDriver driver;
    WaitHelper waitHelper;
	
	@FindBy(id="username")
	WebElement username;
	
	@FindBy(xpath="//span[@class='yfCvx60qsR50VNBG15jF' and contains(text(),'Continue with email')]")
	WebElement continueButton;
	
	@FindBy(xpath="//input[@type='password' and @name='password']")
	WebElement password;
	
	@FindBy(xpath="//span[@class='yfCvx60qsR50VNBG15jF' and contains(text(),'Sign in')]")
	WebElement signInButton;
	
	@FindBy(xpath="//a[@class='bui_color_action nw-terms' and contains(text(),'Terms & Conditions')]")
	WebElement termsAndConditionsLink;
	
	@FindBy(xpath="//a[@class='bui_color_action nw-privacy' and contains(text(),'Privacy Statement')]")
	WebElement privacyStatementLink;
	
	@FindBy(xpath="//h2[contains(text(),'Privacy Statement')]")
	WebElement privacyStatementPageTitle;
	
	@FindBy(xpath="//h1[contains(text(),'Customer terms of service')]")
	WebElement termsAndConditionsPageTitle;
	
	//WebDriver
	public LoginPage(WebDriver Driver) 
	{
		driver = Driver;
		PageFactory.initElements(Driver, this);
		waitHelper = new WaitHelper(driver);
	}
	
	//User name
	public void setUsername(String Username)
	{
		waitHelper.waitForVisibility(username, Duration.ofSeconds(15));
		username.sendKeys(Username);
	}
	
	//Continue button
	public void clickContinueButton()
	{
		waitHelper.waitForVisibility(continueButton, Duration.ofSeconds(15));
		continueButton.click();
	}
	
	//Password
	public void setPassword(String Password)
	{
		waitHelper.waitForVisibility(password, Duration.ofSeconds(15));
		password.sendKeys(Password);
	}
	
	//Sign in button 2
	public void clickSignInButton()
	{
		waitHelper.waitForVisibility(signInButton, Duration.ofSeconds(15));
		signInButton.click();
	}
	
	//Privacy statement
	public void clickPrivacyStatement()
	{
		waitHelper.waitForVisibility(privacyStatementLink, Duration.ofSeconds(15));
		privacyStatementLink.click();
	}
	
	//Terms and conditions link
	public void clickTermsAndConditions()
	{
		waitHelper.waitForVisibility(termsAndConditionsLink, Duration.ofSeconds(15));
		termsAndConditionsLink.click();
	}
	
//	// Privacy statement page
//	public void verifyPrivacyStatementPageTitle()
//	{
//		String actualTitle = privacyStatementPageTitle.getText();
//		String expectedTitle = "Privacy Statement";
//		assertEquals(expectedTitle, actualTitle);
//	}
//	
//	// Temrs & Conditions page
//	public void verifyTemrsAndConditionsPageTitle()
//	{
//		String actualTitle = termsAndConditionsPageTitle.getText();
//		String expectedTitle = "Customer terms of service";
//		assertEquals(expectedTitle, actualTitle);
//	}
}
