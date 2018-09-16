package com.wordpress.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageNew {

	WebDriver driver;
	public LoginPageNew(WebDriver ldriver) {
		this.driver=ldriver;
	}
	@FindBy (id="user_login") 
	WebElement Username;
	@CacheLookup
	@FindBy (id="user_pass")
	WebElement Password;
	@FindBy (id="wp-submit")
	WebElement login;
	@FindBy (id="rememberme") 
	WebElement RememberMe;
	
	@FindBy(how=How.ID, using = "RememberMe")WebElement RememberMee;
	
	
	
	
	public void verifyLogin(String uid,String Pwd) {
		Username.sendKeys(uid);
		Password.sendKeys(Pwd);
		login.click();
		System.out.println(driver.manage().getCookies());
	}
}
