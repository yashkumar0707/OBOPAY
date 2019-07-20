package dbconnect;
import java.util.*;
import java.io.*;
import java.sql.Connection;
import java.sql.Statement;

public class student_insert
{
	void Insert(Connection con)
	{	int c=0;
		try
		{System.out.println("enter id and name");
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int id = sc.nextInt(); 
		String s= br.readLine();
		Statement st=con.createStatement();
		
		String sql1="INSERT INTO STUDENTS "
				+"VALUES ("+id+","+"'"+s+"')";
		c++;
		int a=st.executeUpdate(sql1);
		if(a>0)
			System.out.println("added");
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
}