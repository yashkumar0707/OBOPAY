package servletdem;
import java.sql.*;
public class form 
{
	public static String insert(String rollno, String name)
	{	Connection con=null;
		try
		{	Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","SCOTT","TIGER");
			Statement st= con.createStatement();
			String sql="INSERT INTO TABLE1 "
					+ "VALUES ('"+rollno+"',"+"'"+name+"')";
			int a= st.executeUpdate(sql);
			if(a>0)
				{System.out.print(a);
				 return "ADDED";
				 }
			else
				return "NOT ADDED";
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return "";
	}
}
