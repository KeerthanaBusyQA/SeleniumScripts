package com.wordpress.pageFactory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FactoryLoginpage {
	WebDriver driver;
	
	@FindBy(css = "#user_login")
	WebElement username;
	
	@FindBy(how=How.ID, using = "RememberMe")
	WebElement RememberMee;
	
	@FindBy(id ="user_pass")
	WebElement password;
	
	@FindBy(id ="wp-submit")
	WebElement Login;

	public FactoryLoginpage(WebDriver driver){
		this.driver=driver;
	}
	
	public void verifyLoginDetails(String uid,String pwd)
	{
		username.sendKeys(uid);
		password.sendKeys(pwd);
		Login.click();
		System.out.println(driver.manage().getCookies());
	}
}
