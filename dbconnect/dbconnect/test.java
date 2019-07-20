package dbconnect;

import java.sql.*;

public class test 
{
	public static void main (String args[])
	{
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","SCOTT","TIGER");
			System.out.println("enter a number and a name");
			Statement st = con.createStatement();
			PreparedStatement ps=con.prepareStatement("insert into stud values(?,?)");
			ps.setInt(1, 100);
			String y= "yash";
			ps.setString(2, y);
			ps.executeUpdate();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}

}
