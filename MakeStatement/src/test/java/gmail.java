import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class gmail {
public static void main(String[] args) {
	Logger logger = Logger.getLogger("gmail");
    PropertyConfigurator.configure("Log4j.properties");
    // Open browser
    System.setProperty("webdriver.gecko.driver", "E:\\Softwares\\Drivers\\Gecko\\geckodriver.exe");
    WebDriver driver = new FirefoxDriver();
    logger.info("Browser Opened");
  
    // Set implicit wait
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    logger.info("implicit wait given");
    
}
}
