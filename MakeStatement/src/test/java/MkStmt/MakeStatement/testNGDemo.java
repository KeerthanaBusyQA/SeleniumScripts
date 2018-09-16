package MkStmt.MakeStatement;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNGDemo {
	
	@BeforeTest
	public void loginSuiteTest(){
		System.out.println("Before Test");
	}
	
	@BeforeSuite
	public void loginSuite(){
		System.out.println("Before Suite");
	}
	@BeforeClass
	public void addPayeeClass(){
		System.out.println("Payee Added Class");
	}
	@AfterClass
	public void payBillClass(){
		System.out.println("Bill Paid After class");
	}
	@AfterSuite
	public void logoutAfterSuite(){
		System.out.println("Logout from the banking site After Suite");
	}
	
	@BeforeMethod
	public void login(){
		System.out.println("Login to banking site");
	}
	@Test
	public void addPayee(){
		System.out.println("Payee Added");
	}
	@Test
	public void payBill(){
		System.out.println("Bill Paid");
	}
	@AfterMethod
	public void logout(){
		System.out.println("Logout from the banking site");
	}
	
	@AfterTest
	public void logoutTest(){
		System.out.println("Logout from the banking site AfterTest");
	}
}
