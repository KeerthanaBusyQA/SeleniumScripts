package com.wordpress.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ProfilePage {
WebDriver driver;
	By drpdwnLanguage = By.name("locale");
	By fieldFirstname = By.id("first_name");
	By fieldLastname = By.id("last_name");
	By btnUpdateProfile = By.cssSelector("input[value = 'Update Profile']");
	
	public ProfilePage(WebDriver driver){
		this.driver=driver;
	}	
public void chooseLanguage(String locale) {
	Select drpdwnSel = new Select(driver.findElement(drpdwnLanguage));
	drpdwnSel.selectByVisibleText(locale);
}

public void enterFirstname(String FName) {
	driver.findElement(fieldFirstname).sendKeys(FName);
}

public void enterLastname(String LName) {
	driver.findElement(fieldLastname).sendKeys(LName);
}
public void clickUpdateProfile() {
	driver.findElement(btnUpdateProfile).click();

}

}
