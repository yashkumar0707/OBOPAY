package web;
import java.sql.*;


public class test2 {
		public static String compute(String rollno, String name,String c)
		{	insert i= new insert();
			try
			{	String s;
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","SCOTT","TIGER");
				System.out.println("database connected");
			Statement st=con.createStatement();	
			//if (c.equalsIgnoreCase("insert"))
				//return i.Insert(rollno,name,con);
			//else if (c.equalsIgnoreCase("update"))
				//eturn i.Insert(rollno,name,con);
			}
			catch (Exception e)
			{
			 return "not added"+rollno+e;
			}
			return "";
		}
		/*public static void main (String args[])
		{
			test2 t= new test2();
			System.out.println(t.Insert("12", "dhruv"));
		}*/
	}
