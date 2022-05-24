//fibonacci and even number using thread


import java.util.*;

class fibo implements Runnable       //implementing runnable interface
{

      Scanner s=new Scanner(System.in);
      int n;
       fibo(int k)     //constructor
         {     
          n=k;  
         }
     public void run()
        {

                       
             
             System.out.println("Fibonacci series upto "+n+" terms\n");          
             int a=0,b=1,c=0;
         
             for(int i=1;i<=n;i++)
             {
                 
               System.out.println("Fibonacci : "+c);
               
               a=b;
               b=c;
               c=a+b;
            }
     }
}



class even implements Runnable
{
    int n1,n2;
     even(int x,int y)
     {
       n1=x;
       n2=y;
     }
       
     public void run()
     {

           for(int i=n1;i<=n2;i++)
             {
                 
                if(i%2==0){System.out.println("Even Number : "+i);}
            }
     }
}


class thrd1
{
    public static void main(String args[])
    {

             Scanner s=new Scanner(System.in);
             System.out.println("\nEnter Limit for fibonacci series:");
             int n=s.nextInt();
            
           
             System.out.println("Enter range for even numbers:\n");
             int n1=s.nextInt();
             int n2=s.nextInt();  
           
             fibo thr=new fibo(n);                 //creating object of class sample1
             Thread t1=new Thread(thr);            //creating thread object with the abve class object
             t1.start();                         
                 
                 
             even thr1=new even(n1,n2);           //creating object of class sample2
             Thread t2=new Thread(thr1);          //creating thread object with the abve class object
             t2.start();                           
    
    }

}




/*output

Enter Limit for fibonacci series:
20
Enter range for even numbers:

1
10
Fibonacci series upto 20 terms

Fibonacci : 0
Fibonacci : 1
Fibonacci : 1
Fibonacci : 2
Fibonacci : 3
Fibonacci : 5
Fibonacci : 8
Fibonacci : 13
Fibonacci : 21
Fibonacci : 34
Fibonacci : 55
Fibonacci : 89
Fibonacci : 144
Fibonacci : 233
Fibonacci : 377
Fibonacci : 610
Fibonacci : 987
Even Number : 2
Even Number : 4
Even Number : 6
Even Number : 8
Even Number : 10
Fibonacci : 1597
Fibonacci : 2584
Fibonacci : 4181

*/
