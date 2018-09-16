package MouseClicks.Hover;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseClicks {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.americangolf.co.uk");
		//          .//*[@id='header-navigation']/div[1]/ul/li[1]/a
		Actions act = new Actions(driver);
		WebElement W1 = driver.findElement(By.xpath(".//*[@id='header-navigation']/div[1]/ul/li[1]/a"));
		act.moveToElement(W1).build().perform();
		
		Thread.sleep(5000);
		WebElement W2 = driver.findElement(By.xpath(".//*[@id='header-navigation']/div[1]/ul/li[1]/div/div/div/div/ul/li/ul/li[1]/a/span[1]"));
		act.moveToElement(W2).click().build().perform();
		
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scrollBy(0,1500)");
		WebElement w3 = driver.findElement(By.cssSelector("#secondary"));
		WebElement W3 = w3.findElement(By.cssSelector(".noUi-handle.noUi-handle-lower"));
		//WebElement W3 = driver.findElement(By.cssSelector("#secondary>div>div:nth-child(6)>div>div>div:nth-child(1)>div>div>div>.noUi-handle.noUi-handle-lower"));
		act.moveToElement(W3).dragAndDropBy(W3, 100, 0).build().perform();
		
		
	}
	
	
}
