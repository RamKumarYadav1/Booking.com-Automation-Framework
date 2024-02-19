package PageObjectModels;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitHelper;

public class RegisterPage 
{
	WebDriver driver;
    WaitHelper waitHelper;
	
	@FindBy(id="username")
	WebElement username;
	
	@FindBy(xpath="//span[@class='yfCvx60qsR50VNBG15jF' and contains(text(),'Continue with email')]")
	WebElement continueButton;
	
	@FindBy(xpath="//input[@type='password' and @name='new_password']")
	WebElement password;
	
	@FindBy(xpath="//input[@type='password' and @name='confirmed_password']")
	WebElement confirmPassword;
	
	@FindBy(xpath="//span[@class='yfCvx60qsR50VNBG15jF' and contains(text(),'Create account')]")
	WebElement createAccountButton;
	
	@FindBy(xpath="//a[@class='bui_color_action nw-terms' and contains(text(),'Terms & Conditions')]")
	WebElement termsAndConditions;
	
	@FindBy(xpath="//a[@class='bui_color_action nw-privacy' and contains(text(),'Privacy Statement')]")
	WebElement privacyStatement;
	
	//WebDriver
	public RegisterPage(WebDriver Driver) 
	{
		driver = Driver;
		PageFactory.initElements(driver, this);
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
	
	//Confirm password
	public void setConfirmPassword(String ConfirmPassword)
	{
		waitHelper.waitForVisibility(confirmPassword, Duration.ofSeconds(15));
		confirmPassword.sendKeys(ConfirmPassword);
	}
	
	//Create account button
	public void clickCreateAccountButton()
	{
		waitHelper.waitForVisibility(createAccountButton, Duration.ofSeconds(15));
		createAccountButton.click();
	}
	
	//Terms and conditions
	public void clickTermsAndConditions()
	{
		waitHelper.waitForVisibility(termsAndConditions, Duration.ofSeconds(15));
		termsAndConditions.click();
	}
	
	//Privacy statement
	public void clickPrivacyStatement()
	{
		waitHelper.waitForVisibility(privacyStatement, Duration.ofSeconds(15));
		privacyStatement.click();
	}
	
}
