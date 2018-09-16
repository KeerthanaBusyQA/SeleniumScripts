

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Slider {
	@Test
	public void xtraSlider() {
	System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\Drivers\\ChromeDriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	//Launching URL
	driver.get("https://demoqa.com/slider/");
	WebElement Slider = driver.findElement(By.cssSelector(".ui-slider-handle"));
	WebElement SliderBar = driver.findElement(By.cssSelector(".ui-slider-horizontal"));
	int SliderBarWidth = SliderBar.getSize().width;
	System.out.println(SliderBarWidth);
	int PixelToBeMoved = (int) (SliderBarWidth*(54-11.11)/100);
	System.out.println(PixelToBeMoved);
	Actions act = new Actions(driver);
	act.dragAndDropBy(Slider, PixelToBeMoved, 0).build().perform();
	
	}
}
