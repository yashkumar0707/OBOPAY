package dbconnect;

import java.sql.*;

public class connector
{	
	public Connection get()
	{Connection con=null;
	try
	{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","SCOTT","TIGER");
	System.out.println("database connected");
	}
	catch (Exception e)
	{
		System.out.println(e);
	}
	return con;
	}
}
