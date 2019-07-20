package dbconnect;
import java.sql.*;
import java.io.*;
import java.util.*;
public class student_display 
{
		void dispall(Connection con)
		{	Scanner sc = new Scanner(System.in);
			try
			{
				
				Statement st = con.createStatement();
				String sql="SELECT * FROM STUDENTS";
				ResultSet rs = st.executeQuery(sql);
				while(rs.next())
				{
					System.out.println(rs.getInt(1)+" "+rs.getString(2));
				}
				
			}
			catch (Exception e)
			{
				System.out.println(e);
			}
		}
			void disp(Connection con)
			{	Scanner sc = new Scanner(System.in);
				try
				{	System.out.println("Enter ID TO PRINT");
					int id1= sc.nextInt();
					Statement st = con.createStatement();
					String sql="SELECT * FROM STUDENTS WHERE ID = "+id1;
					ResultSet rs = st.executeQuery(sql);
					System.out.print(rs);
					while(rs.next())
					System.out.println(rs.getInt(1)+" "+rs.getString(2));
				}
				catch (Exception e)
				{
				System.out.println(e);
				}
			 }
	}


