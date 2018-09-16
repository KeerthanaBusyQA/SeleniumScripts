package com.wordpress.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	By username = By.id("user_login");
	By password = By.id("user_pass");
	By login = By.id("wp-submit");
	By RememberMe = By.id("rememberme");
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void typeUsername() {
		driver.findElement(username).sendKeys("admin");
	}
	
	public void typePassword() {
		driver.findElement(password).sendKeys("demo123");
	}
	
	public void clickSubmit() {
		driver.findElement(login).click();
	}
	
	public void selectRemeberMe() {
		if(!(driver.findElement(RememberMe).isSelected()))
		driver.findElement(RememberMe).click();
	}
}
