package factory;

import org.openqa.selenium.WebDriver;

import PageObjectModels.LoginPage;
import PageObjectModels.RegisterPage;

public class BaseClass 
{
	// Making Webdriver as protected static to access it's realtime value from subclass
	protected static WebDriver driver;
	
	public LoginPage lp;
	public RegisterPage rp;
}
