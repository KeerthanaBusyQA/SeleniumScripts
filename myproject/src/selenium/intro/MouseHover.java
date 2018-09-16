package selenium.intro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String args[]) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\Drivers\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.americangolf.co.uk/");
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		WebElement W1 = driver.findElement(By.xpath(".//*[@id='header-navigation']/div[1]/ul/li[1]/a"));
		Thread.sleep(3000);
		act.moveToElement(W1).build().perform();
		Thread.sleep(3000);

		WebElement W2 = driver.findElement(By.xpath(".//*[@id='CLUBS_1']/ul/li[1]/ul/li[1]/a/span[1]\r\n"));
		act.moveToElement(W2).click().build().perform();
		
		
		
	}
	
}
