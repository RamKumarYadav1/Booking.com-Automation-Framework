package StepDefinitions;

import java.time.Duration;

import PageObjectModels.RegisterPage;
import io.cucumber.java.en.*;

public class RegisterSteps extends BaseClass
{
	RegisterPage registerPage = new RegisterPage(driver);

	@And("Open the register url {string}")
	public void open_the_registerPage_url(String url) throws InterruptedException
	{
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(1000);
	}

	@Then("Enter valid email address as {string} \\(register page)")
	public void enter_valid_email_address_as_registerPage_page(String email) throws InterruptedException 
	{
		registerPage.setUsername(email);
		Thread.sleep(1000);
	}

	@Then("Click on continue button \\(register page)")
	public void click_on_continue_button() throws InterruptedException 
	{
		registerPage.clickContinueButton();
		Thread.sleep(1000);
	}

	@Then("Enter valid password as {string} \\(register page)")
	public void enter_valid_password_as_registerPage_page(String password)
	{
		registerPage.setPassword(password);
	}

	@Then("Confirm same password as {string}")
	public void confirm_same_password_as(String password)
	{
		registerPage.setConfirmPassword(password);	
	}

	@Then("Click on create account button")
	public void click_on_create_account_button() throws InterruptedException 
	{
		registerPage.clickCreateAccountButton();
		Thread.sleep(1000);
	}

	@Then("Enter invalid email address as {string} \\(register page)")
	public void enter_invalid_email_address_as_registerPage_page(String email)
	{
		registerPage.setUsername(email);
	}

	@Then("Enter invalid password as {string} \\(register page)")
	public void enter_invalid_password_as_registerPage_page(String password)
	{
		registerPage.setPassword(password);
	}

	@Then("Enter blank email address as {string} \\(register page)")
	public void enter_blank_email_address_as_registerPage_page(String email)
	{
		registerPage.setUsername(email);
	}
}
