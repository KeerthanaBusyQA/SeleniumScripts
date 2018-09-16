package LrnFramework.com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.wordpress.pages.Dashboardpage;
import com.wordpress.pages.LoginPage;

public class LoginTest {

	@Test
	public void verifyValidLogin() {
		System.setProperty("webdriver.gecko.driver", "E:\\Softwares\\Drivers\\Gecko\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://demosite.center/wordpress/wp-login.php");
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.typeUsername();
		loginpage.typePassword();
		loginpage.selectRemeberMe();
		loginpage.clickSubmit();
		
		Dashboardpage dashboardpage = new Dashboardpage(driver);
		dashboardpage.verifyLogoutLink();
	}
}
