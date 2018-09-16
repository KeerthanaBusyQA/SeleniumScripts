package mypackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumFirstClass {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "http://demo.guru99.com/test/newtours/";
		 // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);
	}
}
