//Read a matrix from the console and check whether it is symmetric or not.


import java.util.Scanner;
class symmetric{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int r,c,i,j,f=0;
		System.out.println("Enter the no of rows:");
		r=in.nextInt();

	System.out.println("Enter the elements in a matrix:");
 	int a[][]=new int[10][10];
for(i=0;i<r;i++)
        {
            for(j=0;j<r;j++)
            {
                a[i][j]=in.nextInt();
            }
        }
       

       
for(i=0;i<r;i++)
        {
            for(j=0;j<r;j++)
            {
                if(a[i][j]!=a[j][i])
                {
                    f=1;
                }
            }
        }

if(f==1)
        {
            System.out.println("Not symmetric");
        }
else
        {
            System.out.println("Symmetric");
        }
       
    }
}







/*output
Enter the no of rows:
3
Enter the elements in a matrix:
4 1 5
2 3 6
7 8 9
Not symmetric




Enter the no of rows:
3
Enter the elements in a matrix:
1 2 3
2 1 4
3 4 3
Symmetric
*/
