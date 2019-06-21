package web;
import java.sql.*;
public class insertajax 
{
			public static String Insert(String name, String pass)
			{
				try
				{connector c = new connector ();
					Connection con = c.connect();
					Statement st=con.createStatement();	
				String sql1="INSERT INTO FORM "
						+"VALUES ('"+name+"',"+"'"+pass+"')";
				int a=st.executeUpdate(sql1);
				System.out.println(sql1);
				if(a>0)
					return "added "+name;
				}
				catch (Exception e)
				{
				 return "not added"+name+e;
				}
				return " ";
			}
			/*public static void main (String args[])
			{
				test2 t= new test2();
				System.out.println(t.Insert("12", "dhruv"));
			}*/
		}


