package MkStmt.MakeStatement;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Hello {
 
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("beforeMethod");
  }
  
  @Test(groups = {"FunctionalTest"},priority = 1, description = "Adds payee")
  public void addPayee() {
	  System.out.println("addPayee");
  }
  
  @Test(groups = {"FunctionalTest","RegressionTest"},priority = 4)
  public void payBill() {
	  System.out.println("payBill");
  }
  
  @Test(groups = {"RegressionTest"},priority = 2, description = "logs in")
  public void login() {
	  System.out.println("login");
  }
  
  @Test(groups = {"RegressionTest"},priority = 3, description = "logs out")
  public void logout() {
	  System.out.println("logout");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("afterMethod");
  }
}
