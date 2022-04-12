//area by method overloading


import java.util.*;
class overload
{
 void area(int a)
	{
	   System.out.println("Area is:" +a*a);
	}
 void area(int l,int b)
 	{
 	   System.out.println("Area is:" +l*b);
 	}
 void area(double r)
 	{
 	  System.out.println("Area is:" +3.14*r*r);
 	}
 
 

	   public static void main(String args[])
	   	{
	   	  int l,b,a;
	   	  float r;
	   	  overload obj = new overload();
	   	  System.out.println(" 1.SQUARE\n 2.RECTANGLE\n 3.CIRCLE\n");
	   	  System.out.println("Enter your choice");
	   	  
	   	  Scanner in = new Scanner(System.in);
	   	  int ch=in.nextInt();
	   	  
	   	  switch(ch)
	   	   {
	   	     case 1:
		   	     System.out.println("Enter the side:");
		   	     a=in.nextInt();
		   	     obj.area(a);
		   	     break;
	   	     case 2:
	   	     	     System.out.println("Enter the length and breadth:");
		   	     l=in.nextInt();
		   	     b=in.nextInt();
		   	     obj.area(l,b);
		   	     break;  
	   	     case 3:
		   	     System.out.println("Enter the radius:");
		   	      r=in.nextFloat();
		   	     obj.area(r);
		   	     break;
	                    //System.out.println("invalid choice \n");
	             }
	            }
	         
          
}






/* output

 1.SQUARE
 2.RECTANGLE
 3.CIRCLE

Enter your choice
1
Enter the side:
5
Area is:25


 1.SQUARE
 2.RECTANGLE
 3.CIRCLE

Enter your choice
2
Enter the length and breadth:
2 5
Area is:10


 1.SQUARE
 2.RECTANGLE
 3.CIRCLE

Enter your choice
3
Enter the radius:'
3
Area is:28.259999999999998
*/

