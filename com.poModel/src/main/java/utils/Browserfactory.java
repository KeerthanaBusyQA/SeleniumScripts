package utils;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browserfactory {

	static WebDriver driver;
	
	public static WebDriver startBrowser(String BrowserName,String url) {
		if(BrowserName.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", "E:\\Softwares\\Drivers\\Gecko\\geckodriver.exe");
			FirefoxOptions options = new FirefoxOptions();
			options.addArguments("--start-maximized");
			// Add the WebDriver proxy capability.
			Proxy proxy = new Proxy();
			proxy.setHttpProxy("myhttpproxy:3337");
			options.setCapability("proxy", proxy);

			driver = new FirefoxDriver(options);
			
			//driver = new FirefoxDriver();
		}
		
		if(BrowserName.equalsIgnoreCase("chrome")){	
			System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\Drivers\\ChromeDriver\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--start-maximized");
			driver = new ChromeDriver(options);
			//driver = new ChromeDriver();
		}
		
		if(BrowserName.equalsIgnoreCase("ie")){
			System.setProperty("webdriver.ie.driver", "E:\\Softwares\\Drivers\\IEDriver\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		driver.manage().deleteAllCookies();
	//	driver.manage().window().maximize();
		driver.get(url);
		
		return driver;

	}
	
}
