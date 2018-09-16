package com.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Locators {
	public static void main(String args[]) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\Drivers\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Launching URL
		driver.get("https://www.ultimateqa.com/simple-html-elements-for-automation/");
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,1000)");
		
		
		/*//click a button using ID
		WebElement a = driver.findElement(By.id("idExample"));
				a.click();
		driver.navigate().back();
		driver.findElement(By.className("buttonClass")).click();
		driver.navigate().back();
		driver.findElement(By.linkText("Click me using this link text!")).click();
		driver.navigate().back();
		driver.findElement(By.cssSelector(".et_pb_blurb_description>a")).click();
		driver.navigate().back();
		driver.findElement(By.cssSelector("input[value = 'female']")).click();
		
		List<WebElement> checkboxes = driver.findElements(By.cssSelector("input[name = 'vehicle']"));
		for(WebElement check:checkboxes) {
			if(!(check.isSelected()))
			check.click();
		}
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(a));*/

		WebElement s1 = driver.findElement(By.cssSelector(".et_pb_blurb_description>select"));
		
		Select sel = new Select(s1);
		//sel.selectByIndex(2);
		sel.selectByValue("audi");
		
		
	}

}
