package demo;
import java.util.Scanner;

public class BoxPattern 
{
	 public static void main(String[]args)
	  {
	    Scanner sc= new Scanner(System.in);
	    System.out.println("enter name");
	    String name= sc.next();
	    System.out.println("enter rows");
	    int r=sc.nextInt();
	    System.out.println("enter columns");
	    int c=sc.nextInt();
	    int a=name.length();
	    for(int i=0;i<r;i++)
	     {
	        for(int j=0;j<c;j++)
	         {
	          if(i==0 && j==0 || i==0 && j==c-1 || i==r-1 && j==0|| i==r-1 && j==c-1)
	            System.out.print("+");
	          else if(i==0 || i==r-1)
	             System.out.print("-");
	          else if(j==0 || j==c-1)
	               System.out.print("|");
	          else if(i==r-3 && j==c-(a+2))
	            {
	               System.out.print(name);
	               j+=a-1;
	             }
	          else 
	             System.out.print(" ");
	          }
	          
	           System.out.println();
	      }
	   }
	}


