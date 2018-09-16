

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Dashboardpage {
WebDriver driver;
	By MyAccount = By.cssSelector("#wp-admin-bar-my-account>a");
	By Logout = By.linkText("Log Out");

	public Dashboardpage(WebDriver driver) {
		this.driver=driver;
		driver.getTitle().contains("Dashboard");
	}

	public void verifyLogoutLink() {
		driver.findElement(MyAccount).click();
		driver.findElement(Logout).click();
	}
	
}
