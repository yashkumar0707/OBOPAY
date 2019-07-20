package dbconnect;
import java.sql.*;
import java.util.*;
public class student_delete
{	Scanner sc = new Scanner(System.in);
	Connection con = null;
	void delete(Connection con)
	{	try
		{
		System.out.println("Enter id to delete");
		int d=sc.nextInt();
		Statement st = con.createStatement();
		String sql="delete from students where id = "+d;
		st.executeUpdate(sql);	
		System.out.println("SUCCESSFULLY DELETED");
		}
		catch (Exception e)
		{
			System.out.print(e);
		}
	}
	
}
