/*Program to create a class for Employee having attributes eNo, eName eSalary. Read n employ information and Search for an employee given eNo, using the concept of Array of Objects.*/


import java.util.*;
class employee
{
int eno,esal;
String ename;
 void setdata(int a,String b,int c)//to initialise variables
{
eno=a;
ename=b;
esal=c;
}
}
class p3{
     public static void main(String args[]){
            Scanner s=new Scanner(System.in);
     
             System.out.print("_____\n");
             System.out.print("\n");
             System.out.print("Enter Number of Employees: ");
             int n=s.nextInt();
            employee obj[]=new employee[n];       //declaring an array of objects
            for(int j=0;j<n;j++)          //to allocate memory for each objects
             obj[j]=new employee();
             int a,f=0;
             String b;
             int c,i;
            for(i=0;i<n;i++)
            {
             System.out.println("Enter Employee number,Employee name,Salary of person : "+(i+1));
             a=s.nextInt();
             b=s.next();
             c=s.nextInt();
             obj[i].setdata(a,b,c);       //calling setdata method to initialise
             
             }

                     

             System.out.println("Enter person id to search: ");
             int id=s.nextInt();

             System.out.print("______ \n"); 
             System.out.print("\n");            

              for(i=0;i<n;i++)
                {
                  if(id==obj[i].eno)    //comparing id's
                  {
                   System.out.println("PERSON EXISTS IN THE LIST... ");
                    f=1;
                    break;
                   }
          
                }
            if(f==0)
               System.out.println("PERSON NOT FOUND... ");
}
}





/*

output

_____

Enter Number of Employees: 3
Enter Employee number,Employee name,Salary of person : 1
1 anu 150000
Enter Employee number,Employee name,Salary of person : 2
2 abi 10000 
Enter Employee number,Employee name,Salary of person : 3
3 vani 50000
Enter person id to search: 
2
______ 

PERSON EXISTS IN THE LIST... 
_____

Enter Number of Employees: 1 
Enter Employee number,Employee name,Salary of person : 1
4 nila 500000
Enter person id to search: 
8
______ 

PERSON NOT FOUND... 


