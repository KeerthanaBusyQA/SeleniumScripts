package selenium.intro;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class seleniumLocators {
	
public static void main(String args[]) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\Drivers\\ChromeDriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	
	/*System.setProperty("webdriver.ie.driver", "E:\\Softwares\\Drivers\\IEDriver\\IEDriverServer.exe");
	WebDriver driver = new InternetExplorerDriver();
	

	System.setProperty("webdriver.edge.driver", "E:\\Softwares\\Drivers\\Edge\\MicrosoftWebDriver.exe");
	WebDriver driver = new EdgeDriver();*/
				
	
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS );
	/*driver.get("https://www.ultimateqa.com/simple-html-elements-for-automation/");
	
	
	driver.findElement(By.id("idExample")).click();
	driver.navigate().back();
	driver.findElement(By.className("buttonClass")).click();
	driver.navigate().back();	
	driver.findElement(By.name("button1")).click();
	driver.navigate().back();
	driver.findElement(By.linkText("Click me using this link text!")).click();
	driver.navigate().back();
	driver.findElement(By.cssSelector("input[value='female']")).click();
	//checkbox
	driver.findElement(By.cssSelector("input[type='checkbox'][value = 'Car']")).click();
	Thread.sleep(1000);
	List<WebElement> oCheckbox = driver.findElements(By.cssSelector("input[type='checkbox'][name = 'vehicle']"));
	for(WebElement checks:oCheckbox) {
		if(!(checks.isSelected()))
		checks.click();
	}
	
	WebDriverWait wait = new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("input[type='checkbox'][value = 'Car']"))));
	
	
	//Tables
	String SecondTitle = driver.findElement(By.cssSelector("#htmlTableId>tbody>tr:nth-child(3)>td:nth-child(1)")).getText();
	System.out.println(SecondTitle);
	
	String SecondTitleNoID = driver.findElement(By.cssSelector(".et_pb_column>div:nth-child(5)>.et_pb_text_inner>table>tbody>tr:nth-child(3)>td:nth-child(1)")).getText();
	System.out.println(SecondTitleNoID);
	
	//Dropdown
	Select car = new Select(driver.findElement(By.cssSelector(".et_pb_blurb_description>select\r\n")));
	car.selectByIndex(1);
		
	driver.close();
	
	WebElement table = driver.findElement(By.id("htmlTableId"));
	String A = table.findElement(By.cssSelector("tbody>tr:nth-child(3)>td:nth-child(1)")).getText();
	
	*/
	driver.get("http://toolsqa.com/iframe-practice-page/");
	WebElement Frame1 = driver.findElement(By.id("IF1"));
	
	driver.switchTo().frame(Frame1);
	WebElement FirstName = driver.findElement(By.name("firstname"));
	FirstName.sendKeys("Keerthana");
	
	File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scrFile, new File("E:\\Screenshots\\screencapture.jpg"));

	
	//driver.quit();
	
	
}

}
