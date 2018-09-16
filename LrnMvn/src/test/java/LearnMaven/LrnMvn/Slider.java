package LearnMaven.LrnMvn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Slider {
	@Test
	public void slideSlider() {
		System.setProperty("webdriver.gecko.driver", "E:\\Softwares\\Drivers\\Gecko\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://jqueryui.com/slider/#steps");
		Actions act = new Actions(driver);
		WebElement sliderFrame = driver.findElement(By.cssSelector(".demo-frame"));
		driver.switchTo().frame(sliderFrame);
		WebElement SliderBar = driver.findElement(By.xpath("//*[@id='slider']"));
		WebElement Slider = driver.findElement(By.cssSelector(".ui-slider-handle"));
	int width = Slider.getSize().width;
	
		act.dragAndDropBy(Slider, (50/100)*500, 0).build().perform();
System.out.println(width);
	}


}
