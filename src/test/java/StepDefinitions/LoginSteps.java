package StepDefinitions;

import java.time.Duration;

import PageObjectModels.LoginPage;
import io.cucumber.java.en.*;

public class LoginSteps extends BaseClass
{
	LoginPage loginPage = new LoginPage(driver);
	
	@And("Open the login url {string}")
	public void open_the_loginPage_url(String url) throws InterruptedException 
	{
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(1000);
	}

	@Then("Enter valid email address as {string}")
	public void enter_valid_email_address_as(String email) throws InterruptedException
	{
		loginPage.setUsername(email);
		Thread.sleep(1000);
	}

	@Then("Click on continue button")
	public void click_on_continue_button() throws InterruptedException 
	{
		loginPage.clickContinueButton();
		Thread.sleep(1000);
	}

	@Then("Enter valid password as {string}")
	public void enter_valid_password_as(String password) throws InterruptedException 
	{
		loginPage.setPassword(password);
		Thread.sleep(1000);
	}

	@Then("Click on sign in button")
	public void click_on_sign_in_button() throws InterruptedException 
	{
		loginPage.clickSignInButton();
		Thread.sleep(1000);
	}

	@Then("Enter invalid email address as {string}")
	public void enter_invalid_email_address_as(String email)
	{
		loginPage.setUsername(email);
	}

	@Then("Enter invalid password as {string}")
	public void enter_invalid_password_as(String password) 
	{
		loginPage.setPassword(password);
	}

	@Then("Enter blank password as {string}")
	public void enter_blank_password_as(String password) 
	{
		loginPage.setPassword(password);
	}

	@Then("Enter blank email address as {string}")
	public void enter_blank_email_address_as(String email)
	{
		loginPage.setUsername(email);
	}
}
