package dbconnect;
import java.util.*;
import java.sql.*;
public class studentdatabase 
{	
	public static void main(String args[])
	{	Scanner sc = new Scanner(System.in);
		student_insert i = new student_insert();
		student_update u= new student_update();
		student_display d = new student_display();
		student_delete de= new student_delete();
		connector n = new connector();
		Connection con = n.get();
		while(true)
		{
		System.out.println("enter 1 for insert \n 2 for update \n 3 for display \n 4 for delete \n 5 for display particular \n 6 for EXIT");
		int ch=sc.nextInt();
		switch(ch)
		{	case 1:
				i.Insert(n.get());
				break;
			case 2:
				u.update(n.get());
				break;
			case 3:
				d.dispall(n.get());
				break;
			case 6:
				System.exit(0);
				break;
			case 4:
				de.delete(n.get());
				break;
			case 5:
				d.disp(n.get());
							
		}
		}
	}
}
