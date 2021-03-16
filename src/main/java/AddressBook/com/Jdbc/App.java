package AddressBook.com.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException
    {
//        try {
//        	
//        	String jdbcurl = "jdbc:mysql://localhost:3306/employee_payroll";
//        	String user = "root";
//        	String password = "root";
//        	
//        	Class.forName("com.mysql.cj.jdbc.Driver");
//        	System.out.println("Loaded");
//        	
//        	Connection con = DriverManager.getConnection(jdbcurl, user, password);
//        	System.out.println("Connected");
//        	
//        	Statement query = con.createStatement();
//        	Resultset
//        	
//        }
        
        try
    	{
			// db parameters
		   String jdbc_url = "jdbc:mysql://localhost:3306/employee_payroll";
		   String user = "root";
		   String password = "root";
		   
		   // load Drivers
		   Class.forName("com.mysql.cj.jdbc.Driver");
		   System.out.println("Loaded");
		   
		   // creating connection
		   Connection conn = DriverManager.getConnection(jdbc_url, user, password);
		   System.out.println("Connected");
		   
		   //firing queries
		   Statement query = conn.createStatement();
		   ResultSet result = query.executeQuery("select * from employee_payroll");
		   
//		   while (result.next())
//		   {
//			   System.out.println("Id: " + result.getString("id"));
//

			   while (result.next())
		   {
			   System.out.println("Id: " + result.getString("id"));
		       System.out.println("Name: " + result.getString("name"));
		       System.out.println("Start Date: " + result.getString("start_date"));
		   }
		   
    	}
		   catch(SQLException e) 
    	{
    		e.printStackTrace();
    	}
    }
    
}

        