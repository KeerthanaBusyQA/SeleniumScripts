package com.wordpress.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {
	static WebDriver driver;
	public static WebDriver chooseBrowser(String Browser,String url) {
		if(Browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "E:\\Softwares\\Drivers\\Gecko\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		if(Browser.equalsIgnoreCase("chrome")){	
			System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\Drivers\\ChromeDriver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		if(Browser.equalsIgnoreCase("ie")){
			System.setProperty("webdriver.ie.driver", "E:\\Softwares\\Drivers\\IEDriver\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(url);
		
		return driver;
	}
}
