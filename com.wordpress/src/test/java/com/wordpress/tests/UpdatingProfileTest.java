package com.wordpress.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.wordpress.pages.DashboardPage;
import com.wordpress.pages.LoginPage;
import com.wordpress.pages.ProfilePage;

public class UpdatingProfileTest {
	
	@Test
	public void updateProfile() {
		System.setProperty("webdriver.gecko.driver", "E:\\Softwares\\Drivers\\Gecko\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demosite.center/wordpress/wp-login.php");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.verifyLoginWRememberMe("admin", "demo123");
		DashboardPage dashboardPage = new DashboardPage(driver);
		dashboardPage.clickProfileLink();
		ProfilePage profilePage = new ProfilePage(driver);
		profilePage.chooseLanguage("English (United States)");
		profilePage.enterFirstname("Keerthana");
		profilePage.enterLastname("Devatha");
		profilePage.clickUpdateProfile();
	}
}
