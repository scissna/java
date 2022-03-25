//Write a Java program to read a floating-point number and if the number is zero it prints "zero", otherwise, print "positive" or "negative". Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,00,000 

import java.util.Scanner;
class Number{
	public static void main(String args[]){
	
	System.out.print("Enter the floating point number : ");
	Scanner in = new Scanner (System.in );
	float i = in.nextFloat( ) ;
	if(i==0)
	{
	System.out.println("The number is zero");
	}
	
	
	if(i<0)
	{
	//check absolute large or small
	
		if(Math.abs(i)>100000)
		{
		System.out.println("The number is large negative");
		}
		else if(Math.abs(i)<1)
		{
		System.out.println("The number is small negative");
		}
		else
		{
		System.out.println("The number is negative");
		}
	}
	
	else
	{
	//check absolute large or small
	
		if(i>100000)
		{
		System.out.println("The number is large positive");
		}
		else if(i<1)
		{
		System.out.println("The number is small positive");
		}
		else
		{
		System.out.println("The number is positive");
		}
	}
	
		 
	}
	}
	
	
	
/*	
output

Enter the floating point number : -8
The number is negative 


Enter the floating point number : -4656652336
The number is large negative


Enter the floating point number : -0.2
The number is small negative

Enter the floating point number : 8
The number is positive

Enter the floating point number : 4545656521266565
The number is large positive

Enter the floating point number : .02
The number is small positive

*/


