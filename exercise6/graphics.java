/* 4. Create a Graphics package that has classes and interfaces for
figures Rectangle, Triangle, Square and Circle. Test the package by
finding the area of these figures.*/

import java.util.*;
import Graphics.*;//importing graphics package
class graphics
{
  public static void main(String args[])
  {
    int a,b,c,x,y,r;
    Scanner s=new Scanner(System.in);
    while(true){
    System.out.println("1.Rectangle\n2.Square\n3.Triangle\n4.Circle\n5.EXIT\n\nEnter choice : ");
    int ch=s.nextInt();
    switch(ch)
    {
       case 1:System.out.println("Enter Length and breadth of Rectangle:");
              a=s.nextInt();
              b=s.nextInt();
              Rectangle obj1=new Rectangle();//creating objest for class in package
               obj1.area(a,b);
              break;
       case 2:System.out.println("Enter side of Square:");
              c=s.nextInt();
              Square obj2=new Square();
 
              obj2.area(c,1);
              break;
       case 3:System.out.println("Enter base and height of Triangle : ");
              x=s.nextInt();
              y=s.nextInt();
              Triangle obj3=new Triangle();
              obj3.area(x,y);
              break;
       case 4:System.out.println("Enter Radius of Circle :");
               r=s.nextInt();
              Circle obj4=new Circle();
              obj4.area(r);
              break;
       case 5:System.out.println("EXITING... ");
               System.exit(0);
     
       default:System.out.println("INVALID OPTION...");
    }
    }
  }

}




1.Rectangle
2.Square
3.Triangle
4.Circle
5.EXIT

Enter choice : 
1
Enter Length and breadth of Rectangle:
2
2
AREA OF RECTANGLE : 4
1.Rectangle
2.Square
3.Triangle
4.Circle
5.EXIT

Enter choice : 
2
Enter side of Square:
5
AREA OF SQUARE : 25
1.Rectangle
2.Square
3.Triangle
4.Circle
5.EXIT

Enter choice : 
3
Enter base and height of Triangle : 
4
9
AREA OF TRIANGLE : 18.0
1.Rectangle
2.Square
3.Triangle
4.Circle
5.EXIT

Enter choice : 
5
EXITING... 

