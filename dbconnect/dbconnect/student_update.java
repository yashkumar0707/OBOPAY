package dbconnect;
import java.sql.*;
import java.io.*;
import java.util.*;
public class student_update
{
	void update(Connection con)
	{	Scanner sc = new Scanner(System.in);
		try
		{
			System.out.println("enter value to be changed and new value");
			int r=sc.nextInt();
			Statement st = con.createStatement();
			String n= sc.next();
			String sql="update students "
					+"set name ="+"'"+n+"' "
					+"where ID = "+r;
			int a=st.executeUpdate(sql);
			if (a>0)
				System.out.println("UPDATED");
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
}
