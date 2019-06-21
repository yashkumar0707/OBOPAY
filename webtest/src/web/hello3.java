package web;
import java.sql.*;
public class hello3
{
	public static String check(String name)
	{	boolean f=false;
		try
		{connector c = new connector ();
			Connection con = c.connect();
			Statement st=con.createStatement();
			System.out.println("aaaa");
			String sql="SELECT * FROM FORM WHERE NAME = '"+name+"'";
			System.out.println("vv");
			ResultSet rs = st.executeQuery(sql);
			while(rs.next())
			if(rs.getString(1).equalsIgnoreCase(name))
			{	
				return("username not available");
			}
			return( "username available");
		}
		catch(Exception e)
		{
			return ""+e;
		}
		
	}
}
