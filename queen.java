package yash;
import java.util.*;
import java.io.*;
import java.sql.*;
public class queen 
{
	    int n;// chessboard
	    int r,c;//position of queen
	    int k;//blocked positions
	    int sum=0;// total
	    boolean f= false;
	    int arr[][]= new int[50][50];
	    Scanner sc = new Scanner (System.in);
	    void input()
	    {   System.out.println("enter n");
	        n=sc.nextInt();
	        System.out.println("enter r");
	        r=sc.nextInt();
	        System.out.println("enter c");
	        c=sc.nextInt();
	        System.out.println("enter k");
	        k=sc.nextInt();
	        for(int i=0;i<k;i++)
	        {
	        for (int j=0;j<2;j++)
	        {
	        System.out.println("enter blocked");
	        arr[i][j]=sc.nextInt();
	        }
	        }
	    }
	    void up()
	    {  f=false;
	        for(int i=0;i<k;i++)
	        {
	            if(c==arr[i][1])
	            {
	                if(r>arr[i][0])
	                {
	                    sum=sum+r-arr[i][0]-1;
	                    f=true;
	                }
	            }
	            else 
	            continue;
	        }
	        if(f==false)
	        {
	            sum=sum+r-1;
	        }
	    }
	    void down()
	     {  f=false;
	        for(int i=0;i<k;i++)
	        {
	            if(c==arr[i][1])
	            {
	                if(r<arr[i][0])
	                {
	                    sum=sum-r+arr[i][0]-1;
	                    f=true;
	                }
	            }
	            else 
	            continue;
	        }
	        if(f==false)
	        {
	            sum=sum+n-r;
	        }
	      }
	    void left()
	    {  f=false;
	        for(int i=0;i<k;i++)
	        {
	            if(r==arr[i][0])
	            {
	                if(c>arr[i][1])
	                {
	                    sum=sum+c-arr[i][1]-1;
	                    f=true;
	                }
	            }
	            else 
	            continue;
	        }
	        if(f==false)
	        {
	            sum=sum+c-1;
	        }
	    }
	    void right()
	    {  f=false;
	        for(int i=0;i<k;i++)
	        {
	            if(r==arr[i][0])
	            {
	                if(c<arr[i][1])
	                {
	                    sum=sum+arr[i][1]-c-1;
	                    f=true;
	                }
	            }
	            else 
	            continue;
	        }
	        if(f==false)
	        {
	            sum=sum+n-c;
	        }
	    }
	    void top_r()
	    {   int r1=r;
	        int c1=c;
	        f=false;
	        while (r1>1 && c1<n)
	        { r1=r1-1;
	            c1=c1+1;
	            for(int i=0;i<k;i++)
	             {
	              if(r1==arr[i][0]&&c1==arr[i][1])
	              {
	                f=true;
	                break;
	              }
	             }
	             if(f==true)
	             break;
	           
	            sum++;
	        }
	    }
	    void top_l()
	    {   int r1=r;
	        int c1=c;
	        f=false;
	        while (r1>1 && c1>1)
	        { r1=r1-1;
	            c1=c1-1;
	            for(int i=0;i<k;i++)
	             {
	              if(r1==arr[i][0]&&c1==arr[i][1])
	              {
	                f=true;
	                break;
	              }
	             }
	             if(f==true)
	             break;
	           
	            sum++;
	        }
	        
	    }
	    void bottom_r()
	    {
	        int r1=r;
	        int c1=c;
	        f=false;
	        while (r1<n && c1<n)
	        {r1=r1+1;
	            c1=c1+1;
	            for(int i=0;i<k;i++)
	             {
	              if(r1==arr[i][0]&&c1==arr[i][1])
	              {
	                f=true;
	                break;
	              }
	             }
	             if(f==true)
	             break;
	            sum++;
	        }
	    }
	    void bottom_l()
	    {
	        int r1=r;
	        int c1=c;
	        f=false;
	        
	        while (r1<n && c1>1)
	        {    r1=r1+1;
	            c1=c1-1;
	            for(int i=0;i<k;i++)
	             {
	              if(r1==arr[i][0]&&c1==arr[i][1])
	              {
	                f=true;
	                break;
	              }
	             }
	             if(f==true)
	             break;
	           
	            sum++;
	        }
	    }
	    void display()
	    {
	        System.out.println("total "+sum);
	    }
	    public static void main(String args[])throws IOException
	    {
	        queen m = new queen();
	        m.input();
	         m.up();
	        m.down();
	        m.left();
	        m.right();
	        m.top_r();
	        m.top_l();
	       m.bottom_r();
	        m.bottom_l();
	        m.display();

	    }
	    
	}




