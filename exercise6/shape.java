/*Create an interface having prototypes of
functions area() and perimeter(). Create two
classes Circle and Rectangle which implements
the above interface. Create a menu driven
program to find area and perimeter of objects.*/


import java.util.*;
interface ap
 {
   public void input();
   public void area();
   public void perimeter();
 }
 
 
 
  
class rectangle implements ap
   {
	    int length,breadth;
	    Scanner sc=new Scanner(System.in);
	    public void input()
		  {
		    System.out.println("Enter the length and breadth of the rectangle:");
		     length=sc.nextInt();
		     breadth=sc.nextInt();
		    
		  }
	   

            public void area()
		{
		  System.out.println("Area is:"+(length*breadth));
		}

	    public void perimeter()
		{
		   System.out.println("perimeter is:"+(length+breadth)*2);
		   
		}

   }
   
   
   
class circle implements ap
{
	 int r;
	 double pi=3.14;
	 Scanner sc=new Scanner(System.in);
	 public void input()
	      {
		 System.out.println("Enter the radius of the circle:");
	          r=sc.nextInt();
	      }

public void area()
{
 System.out.println("Area is:" +(pi*r*r));
}

public void perimeter()
{
  System.out.println("perimeter is:" +(2*pi*r));
  
}
}

class shape
{
 public static void main(String args[])
   {
         Scanner sc=new Scanner(System.in);
         
	 System.out.println("\n1.RECTANGLE\n2.CIRCLE\n3.EXIT");
	 System.out.println("Enter your choice:");
	 int c=sc.nextInt();
	 
	 rectangle obj1=new rectangle();
	 circle obj2=new circle();
	  if(c==1)
		  {
		   obj1.input();
		   obj1.area();
		   obj1.perimeter();
		  }
	  
	  else if(c==2)
	  {
	    obj2.input();
		obj2.area();
		obj2.perimeter();
	  }
	  
    }
} 



/* output

1.RECTANGLE
2.CIRCLE
3.EXIT
Enter your choice:
1
Enter the length and breadth of the rectangle:
2 4
Area is:8
perimeter is:12


1.RECTANGLE
2.CIRCLE
3.EXIT
Enter your choice:
2
Enter the radius of the circle:
4
Area is:50.24
perimeter is:25.12


1.RECTANGLE
2.CIRCLE
3.EXIT
Enter your choice:
3
*/

