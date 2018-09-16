package LrnFramework.com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.wordpress.pages.LoginPageNew;
import utils.Browserfactory;

public class LoginTestNew {

	WebDriver driver;
	
	@Test
	public void verifyLogin() {
		driver = Browserfactory.startBrowser("firefox", "http://demosite.center/wordpress/wp-login.php");
		LoginPageNew loginpagenew = PageFactory.initElements(driver, LoginPageNew.class);
		loginpagenew.verifyLogin("admin", "demo123");
	}
}
