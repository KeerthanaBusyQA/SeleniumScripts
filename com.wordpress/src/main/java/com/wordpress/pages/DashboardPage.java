package com.wordpress.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
	
	WebDriver driver;
	By LinkProfile = By.id("wp-admin-bar-my-account");
	
	public DashboardPage(WebDriver driver){
		this.driver=driver;
	}
	
	public void clickProfileLink() {
		driver.findElement(LinkProfile).click();
	}
}
