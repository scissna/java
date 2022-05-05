//create a employee class with data members empid,name,salary,address and constructors to intialize data members.
//create another class teacher that inherit the properties of class employee and contain its own data members 
//department ,subject taught and constructors to initialze these data members and also include display function to display all
//the data members .use array of objects to display details of n teachers.


import java.util.*;
class Employee        //superclass
{
	   int empid;
	   String name;
	   int salary;
	   String address;
	  Employee(){}
	  Employee(int e,String n,int sal,String add)   //creating employe constructor
	   {
	      empid=e;
	      name=n;
	      salary=sal;
	      address=add;
	   }
	
	
	
	
class Teacher extends Employee  // a class teacher is a subclass of class employee(superclass)
{
         String department;
         String subject;
         
         Teacher(int e,String n,int sal,String add,String dept,String sub) //creating teacher constructor
           {
              empid=e;
	      name=n;
	      salary=sal;
	      address=add;
	      
	      department=dept;
	      subject=sub;
	    }
	 
void display(int i)                         //for display 
	{
	  System.out.println("Employee id:" +empid);
	  System.out.println("Employee Name:" +name);
	  System.out.println(" Salary:" +salary);
	  System.out.println(" Address:" +address);
	  System.out.println(" Department:" +department);
	  System.out.println(" Subject:" +subject);
	  System.out.println("----------------------------");
	}
}

}	
class main
	{
	   public static void main(String args[])
	     {
	       Scanner sc=new Scanner(System.in);
	       System.out.println("Enter the no of Employees:");
	       int n=sc.nextInt();
	       Teacher obj[]=new Teacher[n];   // creating an object
	       
	       
	       for(int i=0;i<n;i++)
	        {
	        
	          System.out.println("Enter Empid:");
	          int empid=sc.nextInt();
	          
	          System.out.println("Enter Name:");
	          String name=sc.next();
	          
	          System.out.println("Enter salary:");
	          int salary=sc.nextInt();
	          
	          System.out.println("Enter Address:");
	          String address=sc.next();
	          
	          System.out.println("Enter Department:");
	          String department=sc.next();
	          
	          System.out.println("Enter Subject:");
	          String subject=sc.next();
	          
	          System.out.println("\n");
	          System.out.println("----------------------------");
	          
	          obj[i]=new Teacher(empid,name,salary,address,department,subject);

	        }
	        
	      for(int i=0;i<n;i++)
	       {
	         obj[i].display(i);
	       }
	    }
	  } 




/*OUTPUT
Employee id:101
Employee Name:SCISSNA
Employee Salary:500000
Employee Address:THEKKEPURATH
Employee Department:MCA
Employee Subject:OS
----------------------------
Employee id:102
Employee Name:VANI
Employee Salary:502000
Employee Address:MADHUCHIRAYIL
Employee Department:MBA
Employee Subject:HR
*/
	
