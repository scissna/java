//Write a program that accepts three numbers from the user and prints
//"increasing" if the numbers are in increasing order, "decreasing" if the
//numbers are in decreasing order, and "Neither increasing or decreasing order"
//otherwise.

import java.util.Scanner;
class Numorder{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the first number :");
		int f=in.nextInt();
		System.out.print("Enter the second number :");
		int s=in.nextInt();
		System.out.print("Enter the third number :");
		int t=in.nextInt();
	if(f > s && s > t)
		{
		System.out.print("decreasing order");
		}
	else if(f < s && s < t)
		{
		System.out.print("increasing order");
		}
		
	else
		{
		System.out.print("Neither increasing or decreasing order");
		}	
}
}

/*Enter the first number :12
Enter the second number :5
Enter the third number :15
Neither increasing or decreasing order

Enter the first number :10
Enter the second number :20
Enter the third number :30
increasing order


Enter the first number :10
Enter the second number :5
Enter the third number :2
decreasing order
*/



