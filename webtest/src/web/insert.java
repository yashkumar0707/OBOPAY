package web;
import java.sql.*;


public class insert {
		public static String Insert(String rollno, String name)
		{
			try
			{connector c = new connector ();
				Connection con = c.connect();
				Statement st=con.createStatement();	
			String sql1="INSERT INTO TABLE1 "
					+"VALUES ("+rollno+","+"'"+name+"')";
			int a=st.executeUpdate(sql1);
			System.out.println(sql1);
			if(a>0)
				return "added"+rollno;
			}
			catch (Exception e)
			{
			 return "not added"+rollno+e;
			}
			return " ";
		}
		/*public static void main (String args[])
		{
			test2 t= new test2();
			System.out.println(t.Insert("12", "dhruv"));
		}*/
	}
