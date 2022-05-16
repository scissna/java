/*5. Create an Arithmetic package that has classes and interfaces for the 4 basic arithmetic operations. Test the package by implementing all operations on two given numbers*/


import java.util.*;

import Arithmetic.*;//importing arithmetic package

class Operations
{
    public static void main(String args[])
    {
    int a,b,c,x,y,r;
    Scanner in=new Scanner(System.in);
       while(true)
    {
        System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.EXIT\n\nEnter your choice : ");
        int op=in.nextInt();
        if(op==5)
    {
        System.out.println("EXITING... ");
        break;
    }
        System.out.println("Enter 2 Numbers for operation:");
              a=in.nextInt();
              b=in.nextInt();
        switch(op)
        {
         case 1:
                add obj1=new add();//creating object of class in package
                obj1.fucn(a,b);
                break;
         case 2:
                sub obj2=new sub();
                obj2.fucn(a,b);
                break;
         case 3:
                mul obj3=new mul();
                obj3.fucn(a,b);
                break;
         case 4:
                if(b==0)
        {
            System.out.println("Division not possible...");
        }
               else
        {
                div obj4=new div();
                obj4.fucn(a,b);
        }
               break;
       default:System.out.println("INVALID OPTION...");
    }
   }

  }

}


/* output


1.Addition
2.Subtraction
3.Multiplication
4.Division
5.EXIT

Enter your choice : 
1
Enter 2 Numbers for operation:
5
5
SUM OF NUMBERS : 10
1.Addition
2.Subtraction
3.Multiplication
4.Division
5.EXIT

Enter your choice : 
2
Enter 2 Numbers for operation:
10
5
DIFFERENCE OF NUMBERS : 5
1.Addition
2.Subtraction
3.Multiplication
4.Division
5.EXIT

Enter your choice : 
3
Enter 2 Numbers for operation:
5
5
PRODUCT OF NUMBERS : 25
1.Addition
2.Subtraction
3.Multiplication
4.Division
5.EXIT

Enter your choice : 
4
Enter 2 Numbers for operation:
10
2
QUOTIENT : 5
1.Addition
2.Subtraction
3.Multiplication
4.Division
5.EXIT

Enter your choice : 
5
EXITING... 
*/
