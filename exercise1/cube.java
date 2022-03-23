//Write a program in Java to display the cube of the number up to a given integer.

import java.util.Scanner;
class cube{
	public static void main(String args[]){
		System.out.println("Enter the number:");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int i;
		for(i=1;i<=n;i++)
		{
		System.out.println("Number is: "+i);
		System.out.println("Cube of the number: "+i * i * i);
		
		}		
}
}

/*output
Enter the number:
3
Number is: 1
Cube of the number: 1
Number is: 2
Cube of the number: 8
Number is: 3
Cube of the number: 27
*/
