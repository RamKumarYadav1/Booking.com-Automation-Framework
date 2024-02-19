package StepDefinitions;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.chrome.ChromeDriver;

import PageObjectModels.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonSteps extends BaseClass
{
	LoginPage loginPage;
	
	ArrayList<String> tabs;
	
	@Given("Launch the browser")
	public void launch_the_browser() 
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	@When("I click on Privacy Statement link")
	public void i_click_on_click_on_privacy_statement_link() throws InterruptedException 
	{
		loginPage = new LoginPage(driver);
		loginPage.clickPrivacyStatement();
		Thread.sleep(1000);
		
		// Switching the driver to new opened tab 
	    tabs = new ArrayList<String>(driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1));
	}
	
	@Then("I should be in Privacy Statement page")
	public void i_should_be_in_privacy_statement_page() throws InterruptedException 
	{
		String actualTitle = driver.getTitle();
		String expectedTitle = "Booking.com: Privacy & cookie statement.";
		assertEquals(expectedTitle, actualTitle);
		
		// Switching back the driver to the original previous tab 
		driver.close();
		driver.switchTo().window(tabs.get(0));
		Thread.sleep(1000);		
	}
	
	@When("I click on Terms & Conditions link")
	public void i_click_on_terms_conditions_link() throws InterruptedException 
	{
		loginPage = new LoginPage(driver);
	    loginPage.clickTermsAndConditions();
	    Thread.sleep(1000);
	    
		// Switching the driver to new opened tab 
	    tabs = new ArrayList<String>(driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1));
	}
	
	@Then("I should be in Customer terms of service page")
	public void i_should_be_in_customer_terms_of_service_page() throws InterruptedException 
	{
		String actualTitle = driver.getTitle();
		String expectedTitle = "Booking.com: Terms and Conditions.";
		assertEquals(expectedTitle, actualTitle);
		
		// Switching back the driver to the original previous tab 
		driver.close();
		driver.switchTo().window(tabs.get(0));
		Thread.sleep(1000);
	}	
	
	@Then("close the browser")
	public void close_the_browser() 
	{
		driver.quit();
		// Not using driver.close() method to avoid the connection reset error.
	}
	
//	@Then("I should be in Privacy Statement page")
//	public void i_should_be_in_privacy_statement_page() throws InterruptedException 
//	{
//		WebElement privacyStatementPageTitle = driver.findElement(By.xpath("//h2[contains(text(),'Privacy Statement')]"));
//		String actualTitle = privacyStatementPageTitle.getText();
//		String expectedTitle = "Privacy Statement";
//		assertEquals(expectedTitle, actualTitle);
//		
//		// Switching back the driver to the original previous tab 
//		driver.close();
//		driver.switchTo().window(tabs.get(0));
//		Thread.sleep(1000);		
//	}	
//	
//	@Then("I should be in Customer terms of service page")
//	public void i_should_be_in_customer_terms_of_service_page() throws InterruptedException 
//	{
//		WebElement termsAndConditionsPageTitle = driver.findElement(By.xpath("//h1[contains(text(),'Customer terms of service')]"));
//		String actualTitle = termsAndConditionsPageTitle.getText();
//		String expectedTitle = "Booking.com: Terms and Conditions.";
//		assertEquals(expectedTitle, actualTitle);
//		
//		// Switching back the driver to the original previous tab 
//		driver.close();
//		driver.switchTo().window(tabs.get(0));
//		Thread.sleep(1000);
//	}
	
}
