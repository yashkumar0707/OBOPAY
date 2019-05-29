package testing;
import java.sql.*;
import java.io.*;
public class test2 {
		public String Insert(int rollno, String name)
		{	
			try
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","SCOTT","TIGER");
				System.out.println("database connected");
			Statement st=con.createStatement();		
			String sql1="INSERT INTO STUD "
					+"VALUES ("+rollno+","+"'"+name+"')";
			int a=st.executeUpdate(sql1);
			if(a>0)
				return "added";
			}
			catch (Exception e)
			{
			 return "not added";
			}
			return " ";
		}
	}
