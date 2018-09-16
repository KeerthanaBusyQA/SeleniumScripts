package MkStmt.MakeStatement;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ToolsQA {
	static WebDriver driver;
	/*public static void main(String args[]) {
	 setUp();
	 navigateMyAccount();
	 login();
	 navigateHome();
	 viewCart();
	}*/
	@BeforeTest
	public static void setUp() {
		System.setProperty("webdriver.gecko.driver", "E:\\Softwares\\Drivers\\Gecko\\geckodriver.exe");
		 driver = new FirefoxDriver();
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://store.demoqa.com/products-page/your-account/");
	}
	
	@Test
	@Parameters({ "username", "password" })
	public static void loginParam(String username, String password) {
		long id = Thread.currentThread().getId();
        System.out.println("Before test-method. Thread id is: " + id);
		//driver.findElement(By.cssSelector("a[title='My Account']")).click();
	     driver.findElement(By.id("log")).sendKeys(username);
	     driver.findElement(By.id("pwd")).sendKeys(password);
	     driver.findElement(By.id("login")).click();
	}
	
	@Test
	public static void login(){
		long id = Thread.currentThread().getId();
        System.out.println("Before test-method. Thread id is: " + id);
		driver.findElement(By.cssSelector("a[title='My Account']")).click();
	     driver.findElement(By.id("log")).sendKeys("Tester@987");
	     driver.findElement(By.id("pwd")).sendKeys("tester@987");
	     driver.findElement(By.id("login")).click();
	}
	
	
	
	
	@Test
	public static void navigateHome() {
		long id = Thread.currentThread().getId();
        System.out.println("Before test-method. Thread id is: " + id);
	     driver.findElement(By.id("menu-item-15")).click();
	}
	
	@Test
	public static void viewCart() {
		long id = Thread.currentThread().getId();
        System.out.println("Before test-method. Thread id is: " + id);
	     driver.findElement(By.className("item")).click();
	}
	
	@Test
	public static void navigateMyAccount() {
		long id = Thread.currentThread().getId();
        System.out.println("Before test-method. Thread id is: " + id);
	     driver.findElement(By.cssSelector("a[title='My Account']")).click();
	}	
	
}
