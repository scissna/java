/*Create a class ‘Person’ with data members Name, Gender, Address, Age and a
constructor to initialize the data members and another class ‘Employee’ that inherits
the properties of class Person and also contains its own data members like Empid,
Company_name, Qualification, Salary and its own constructor. Create another class
‘Teacher’ that inherits the properties of class Employee and contains its own data
members like Subject, Department, Teacherid and also contain constructors and
methods to display the data members. Use array of objects to display details of N
teachers.*/


import java.util.*;
class person        //superclass
{
	   String name;
	   String gender;
	   String address;
	   int age;
	  
	  person(String n,String g,String add,int ag)   //creating employe constructor
	   {
	      name=n;
	      gender=g;   
	      address=add;
	      age=ag;
	   }
	
	
}	
	
class employee extends person  // a class employee is a subclass of class person(superclass)
{
           int empid;
	   String compname;
	   String qualification;
	   int salary;
	   
	
         
         employee(String n,String g,String add,int ag,int e,String cname,String quali,int sal) //creating employee constructor
           {
              super(n,g,add,ag);
              empid=e;
	      compname=cname;
	      qualification=quali;
	      salary=sal;
	      
	    
	    }
	    
}	    
	    
	    
class teacher extends employee  // a class employee is a subclass of class person(superclass)
{
           String subject;
           String dept;
           String tid;
           
         
         teacher(String n,String g,String add,int ag,int e,String cname,String quali,int sal,String sub,String dep,String id) 
 
                 //creating employee constructor
           {
              super(n,g,add,ag,e,cname,quali,sal);
              subject=sub;
              dept=dep;
              tid=id;
	    
	    }	    
	    
	    
	
    
	 
void display(int i)                         //for display 
	{
	  System.out.println("Name:" +name);
	  System.out.println("Gender:" +gender);
	  System.out.println("Address:" +address);
	  System.out.println("Age:" +age);
	  System.out.println("Employee id:" +empid);
	  System.out.println("Company name :" +compname);
	  System.out.println("Qualification:" +qualification);
	  System.out.println("Salary:" +salary);
	  System.out.println("Subject:" +subject);
	  System.out.println("Department:" +dept);
	  System.out.println("Teacher id:" +tid);
	  System.out.println("----------------------");

	}
}

	
class main1
	{
	   public static void main(String args[])
	     {
	       Scanner sc=new Scanner(System.in);
	       System.out.println("Enter the no of Teachers:");
	       int n=sc.nextInt();
	       teacher obj[]=new teacher[n];   // creating an object
	       
	       
	       for(int i=0;i<n;i++)
	        {
	        
	          System.out.println("Enter NAME:");
	          String name=sc.next();
	          
	          System.out.println("Enter Gender:");
	          String gender=sc.next();
	          
	          System.out.println("Enter Address:");
	          String address=sc.next();
	          
	          System.out.println("Enter Age:");
	          int age=sc.nextInt();
	          
	          System.out.println("Enter Emp_id:");
	          int empid=sc.nextInt();
	          
	          System.out.println("Enter company name:");
	          String compname=sc.next();
	          
	          System.out.println("Enter Qualification:");
	          String qualification=sc.next();
	          
	          System.out.println("Enter Salary:");
	          int salary=sc.nextInt();
	          
	          System.out.println("Enter Subject:");
	          String subject=sc.next();
	          
	          System.out.println("Enter department:");
	          String dept=sc.next();
	          
	          System.out.println("Enter Teacher id:");
	          String tid=sc.next();
	          
	          obj[i]=new teacher(name,gender,address,age,empid,compname,qualification,salary,subject,dept,tid);
	        }
	        
	      for(int i=0;i<n;i++)
	       {
	         obj[i].display(i);
	       }
	    }
	  }  
	





/*output


Name:vani
Gender:female
Address:thekkepurath
Age:22
Employee id:101
Company name :iitr
Qualification:mca
Salary:504235
Subject:network
Department:mca
Teacher id:mca101
------------------------
Name:scissna
Gender:female
Address:kottarapatt
Age:22
Employee id:102
Company name :kmct
Qualification:mca
Salary:45033
Subject:dbms
Department:msc
Teacher id:msc102
*/

