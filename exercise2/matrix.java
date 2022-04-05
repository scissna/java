//Read 2 matrices from the console and perform matrix addition.

import java.util.Scanner;
class matrix{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
int r,c,i,j;
System.out.println("Enter the no of rows:");
r=in.nextInt();

System.out.println("Enter the nof colums:");
c=in.nextInt();


int m1[][] = new int[r][c];
int m2[][] = new int[r][c];
int m3[][] = new int[r][c];
 
System.out.println("Enter the elements of matrix1");
 
for (i=0;i<r;i++)
{ 
 
for (j=0;j<c;j++ )
m1[i][j]=in.nextInt();
 
System.out.println();
}
System.out.println("Enter the elements of matrix2");
 
for (i=0;i<r;i++)
{
for (j=0;j<c;j++ )
m2[i][j] = in.nextInt();
 
System.out.println();
}
 
for (i=0;i<r;i++)
for (j=0;j<c;j++)
m3[i][j] = m1[i][j] + m2[i][j] ; 
 
System.out.println("Sum of matrices:-");
 
for (i=0;i<r;i++)
{ 
for (j=0;j<c;j++)
System.out.print(m3[i][j]+"\t");
 
System.out.println();
}
 
}
}





/*output

Enter the no of rows:
3
Enter the nof colums:
3
Enter the elements of matrix1
2 3 5

1 2 8

4 9 5

Enter the elements of matrix2
1 1 0

0 0 0

1 1 2

Sum of matrices:-
3	4	5	
1	2	8	
5	10	7	



*/
