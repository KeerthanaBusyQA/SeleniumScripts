package LrnFramework.jdbcexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class JDBCConnect {

@Test
public void script() throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	System.out.println("Driver loaded");
	//Connection URL Syntax: "jdbc:mysql://ipaddress:portnumber/db_name"		
    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/selenium", "root", "Keerthana@1");
	System.out.println("Connected to SQL");
	Statement statement = connection.createStatement();
	ResultSet resultset = statement.executeQuery("select * from seleniumusers");
	
	while(resultset.next()) {
		String Firstname = resultset.getString("firstname");
		System.out.println(Firstname);
	}

}
}
