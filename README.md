# Box_Pattern

The requirement is to print the name inside the box with some rules

To take the input of name,rows and collumns from the user i used scanner class

    import java.util.Scanner;
    Scanner sc= new Scanner(System.in);
	    System.out.println("enter name");
	    String name= sc.next();
	    System.out.println("enter rows");
	    int r=sc.nextInt();
	    System.out.println("enter columns");
	    int c=sc.nextInt();
	    int a=name.length();
      
And for the condition that the name should come with in the 3rd line of right edge side of box   

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
