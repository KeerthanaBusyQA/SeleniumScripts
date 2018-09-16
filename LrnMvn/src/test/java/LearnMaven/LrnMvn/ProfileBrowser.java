package LearnMaven.LrnMvn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProfileBrowser {
	WebDriver driver;
	@BeforeMethod
	public void openBrowser() {
		System.setProperty("webdriver.gecko.driver", "E:\\Softwares\\Drivers\\Gecko\\geckodriver.exe");
		FirefoxOptions options = new FirefoxOptions();
		ProfilesIni profile = new ProfilesIni();
		FirefoxProfile myprofile = profile.getProfile("JenkinsProfile");
		options.setProfile(myprofile);
		FirefoxDriver driver = new FirefoxDriver(options);
		driver.get("http://store.demoqa.com");
	}
	
	@Test
	public void login() {
	driver.findElement(By.id("account")).click();
	driver.findElement(By.id("log")).sendKeys("Tester@987");
	driver.findElement(By.id("pwd")).sendKeys("tester@987");
	driver.findElement(By.id("login")).click();	
	}
	
@Test
	private void navigateHome() {
		driver.findElement(By.linkText("Home2")).click();	

	}
	
@Test
	private void navigateCart() {
		driver.findElement(By.id("header_cart")).click();	

	}

	@AfterMethod
	private void close() {
		driver.close();	

	}
	

	
	
	
}
