package com.wordpress.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	By Username = By.cssSelector("#user_login");
	By Password = By.id("user_pass");
	By Login = By.id("wp-submit");
	By RememberMe = By.id("rememberme");
	
	public LoginPage(WebDriver driver){
		this.driver=driver;
	}
	
	public void verifyLoginWRememberMe(String Uid, String pwd) {
		driver.findElement(Username).sendKeys(Uid);
		driver.findElement(Password).sendKeys(pwd);
		if(!(driver.findElement(RememberMe).isSelected())){
			driver.findElement(RememberMe).click();
		}
		driver.findElement(Login).click();
	}
	
	public void verifyLogin(String Uid, String pwd) {
		driver.findElement(Username).sendKeys(Uid);
		driver.findElement(Password).sendKeys(pwd);
		driver.findElement(Login).click();
	}

}
