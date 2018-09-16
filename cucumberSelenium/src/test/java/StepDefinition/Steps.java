package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	
	WebDriver driver;
	By Username = By.cssSelector("#user_login");
	By Password = By.id("user_pass");
	By Login = By.id("wp-submit");
	By RememberMe = By.id("rememberme");
	@Given("^Open the Firefox and launch the application$")
	public void open_the_Firefox_and_launch_the_application() throws Throwable {
		System.setProperty("webdriver.gecko.driver", "E:\\Softwares\\Drivers\\Gecko\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://demosite.center/wordpress/wp-login.php");
	}

	/*@When("^Enter the Username and Password$")
	public void enter_the_Username_and_Password() throws Throwable {
		Thread.sleep(3000);
		driver.findElement(Username).sendKeys("Hello");
		driver.findElement(Password).sendKeys("Hi");
	}*/

	/*@When("^Enter the \"(.*?)\" and \"(.*?)\"$")
	public void enter_the_Username_Usera_and_Password_passworda(String username, String password) throws Throwable {
		driver.findElement(Username).sendKeys(username);
		driver.findElement(Password).sendKeys(password);
	}*/
	
	@Then("^login with credential successfully$")
	public void login_with_credential_successfully() throws Throwable {
		driver.findElement(Login).click();	    
	}
}
