package MkStmt.MakeStatement;

import org.testng.annotations.Test;

public class PriorityTestNG {

	@Test(groups={"functional-group"},priority=1, description = "this testcase verify login functionality",dependsOnMethods="addPayee")
	public void login(){
		System.out.println("Login to banking site");
	}
	@Test(priority=2, description = "this testcase verify add payee functionality")
	public void addPayee(){
		System.out.println("Payee Added");
	}
	@Test(groups={"functional-group", "regression-group"},priority=3, description =" this testcase verify bill payment functionality")
	public void payBill(){
		System.out.println("Bill Paid");
	}
	@Test(groups={"regression-group"},priority=4, description =" this testcase verify logout functionality")
	public void logout(){
		System.out.println("Logout from the banking site");
	}
}
