//sum of complex numbers

import java.util.*;
class complexnum
{
int r;
int i;

complexnum(int a,int b)//to initialise
{
r=a;
i=b;
}
public static void main(String arg[])
{
int c;
int d;
Scanner s=new Scanner(System.in);//CREATING SCANNER CLASS OBJECT

System.out.print("\n");

	
	

System.out.println("Enter Real and Imaginary Part of First Complex Number: ");

//reading first
int x=s.nextInt();
int y=s.nextInt();
complexnum obj1=new complexnum(x,y);       //passing

System.out.println("Enter Real and Imaginary Part of Second Complex Number: ");

//reading second
int p=s.nextInt();
int q=s.nextInt();
complexnum obj2=new complexnum(p,q);     //passing
c=obj1.r+obj2.r;         //adding real part
d=obj1.i+obj2.i;         //adding img part

System.out.print("\n");
             
             

System.out.println("SUM OF COMPLEX NUMBERS: "+c+"+i"+d);


}
}





/*output



Enter Real and Imaginary Part of First Complex Number: 
2 6
Enter Real and Imaginary Part of Second Complex Number: 
7 6

SUM OF COMPLEX NUMBERS: 9+i12
*/
