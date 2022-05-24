/*2. Find the average of N positive integers, raising a user defined exception for each negative input.*/


import java.util.*;

class myException extends Exception
{
    public myException(String s)
    {
        super(s);
    }
}

class expt1
{
       public static void main(String ar[])
        {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of limit:");
        int n=in.nextInt();
       
        int a,b=0,total=0;
        System.out.println("Enter numbers:");
        for(int i=0;i<n;i++)
        {
            a=in.nextInt();
            try
            {
                if(a>=0)
                {
                    b++;
                    total=total+a;
                }
                else
                {
                    throw new myException("Negative numbers are not allowed");
                }
            }
            catch(myException ex)
               {
                    System.out.print(ex.getMessage()+"\n");
               }
            if(a<0)
            {
                i--;
            }
        }
           
        System.out.println("Average of "+ n + " positive number:" + (double)total/b);
    }
}




/*OUTPUT
Enter the number of limit:
2
Enter numbers:
4
9
Average of 2 positive number:6.5



Enter the number of limit:
4
Enter numbers:
1
5
-8
Negative numbers are not allowed
3
7
Average of 4 positive number:4.0



*/

