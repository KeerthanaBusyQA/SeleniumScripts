package TestGolf.golf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumFirst {
	public static void main(char args[]) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
	}

}
