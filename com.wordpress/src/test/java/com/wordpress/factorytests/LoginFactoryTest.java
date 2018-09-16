package com.wordpress.factorytests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.wordpress.pageFactory.pages.FactoryLoginpage;
import com.wordpress.utils.BrowserFactory;
import com.wordpress.utils.ReadSingleCellValue;

public class LoginFactoryTest {

	@Test
	public void verifyLogin() throws IOException {
	ReadSingleCellValue readSingleCellValue = new ReadSingleCellValue();
	String[][] data = readSingleCellValue.excel();
	
	for(int i=1; i<=data.length-1; i++) {
		WebDriver driver = BrowserFactory.chooseBrowser("firefox", "http://demosite.center/wordpress/wp-login.php");
		FactoryLoginpage FactoryLoginpage = PageFactory.initElements(driver, FactoryLoginpage.class);
		FactoryLoginpage.verifyLoginDetails(data[i][0], data[i][1]);
	}
	}
}
