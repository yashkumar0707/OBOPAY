package web;
import java.sql.*;
public class update 
{
	public static String up(String roll, String name)
	{	try
		{
			connector c = new connector();
			Connection con = c.connect();
			Statement st = con.createStatement();
			String sql=" UPDATE TABLE1 "
					+"SET NAME ="+"'"+name+"' "
					+ "WHERE ROLLNO = "+roll;
			System.out.println("reached");
			System.out.println(roll);
			int a =st.executeUpdate(sql);
			if (a>0)
				System.out.println("updated");
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		return "updated";
	}
	
}