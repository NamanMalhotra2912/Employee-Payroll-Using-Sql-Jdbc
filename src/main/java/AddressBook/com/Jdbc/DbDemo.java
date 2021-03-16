package AddressBook.com.Jdbc;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

import java.sql.ResultSet;
//import com.mysql.cj.protocol.Resultset;
//import com.mysql.cj.xdevapi.Statement;
import java.sql.SQLException;

public class DbDemo {

	private Connection connection;

	public void readData ()throws SQLException {

		String jdbcURL = "jdbc:mysql://localhost:3306.Payroll_service?useSSL=false";
		String userName= "root";
		String password = "root";
		connection = null;
		Statement statement = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded");
			statement = connection.createStatement();
			ResultSet resultset = statement.executeQuery("select * from employee_payroll");
			
			while (resultset.next()) {
		        System.out.println("Id: " + resultset.getInt("id"));
		        System.out.println("Name: " + resultset.getString("name"));
		        System.out.println("Department: " + resultset.getString("department"));
		        System.out.println("Start Date: " + resultset.getString("start_date"));
		      }
			
			}	
		catch(Exception e) {
			e.printStackTrace();
		}
		
		finally {
			if(statement != null) {
				statement.close();
			}
			if(connection != null) {
				connection.close();
			}
			
		}
	}
}

//Statement vs Prepared STatement
// execute Query vs  ExecuteScalar
