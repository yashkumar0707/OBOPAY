package dbconnect;
import java.sql.*;
public class dbcon 
{
	public static void main(String args[])
	{	try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","SCOTT","TIGER");
			Statement st=con.createStatement();
			Statement st1=con.createStatement();
			/*String sql1="INSERT INTO RECIPES "
					+"VALUES(4,'HOTDOG')";
			int a=st.executeUpdate(sql1);
			if (a>0)
				System.out.println("updated");*/
			String sql="SELECT * from RECIPES order by RECIPE_ID";
			ResultSet rs=st1.executeQuery(sql);
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2));
			}
			String sql2="update recipes "
					+"set recipe_name='burger' "
					+"where recipe_id=1";
			st1.executeUpdate(sql2);
			 sql="SELECT * from RECIPES order by RECIPE_ID";
			  rs=st1.executeQuery(sql);
			
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2));
			}
			con.close();
		}
	catch (Exception e)
	{
		System.out.println(e);
	}

}
}
