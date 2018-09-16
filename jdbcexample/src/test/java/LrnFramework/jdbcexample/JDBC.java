package LrnFramework.jdbcexample;

import org.testng.annotations.Test;


public class JDBC {
	
	public void connectDatabase() throws ClassNotFoundException {
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	}
	
	
}
