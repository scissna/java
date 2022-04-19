/*Define a class ‘product’ with data members pcode, pname and price.  Create 3 objects of the class and find the product having the lowest price.*/

import java.util.Scanner;
class product
	{
	 int pcode;
	 String pname;
	 double price;
	 
	 
	 void pro(int a,String b,double c)
	 	{
	 	pcode=a;
	 	pname=b;
	 	price=c;
	 	}
        }
     

class prdct{   
        
public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int a1,a2,a3;
		String b1,b2,b3;
		double c1,c2,c3;
		product obj1=new product();
		product obj2=new product();
		product obj3=new product();
	
	
System.out.println("Enter the product1 :");
	a1=in.nextInt();
	b1=in.next();
	c1=in.nextDouble();
	obj1.pro(a1,b1,c1);

System.out.println("Enter the product2 :");
	a2=in.nextInt();
	b2=in.next();
	c2=in.nextDouble();
	obj2.pro(a2,b2,c2);
	
System.out.println("Enter the product3 :");
	a3=in.nextInt();
	b3=in.next();
	c3=in.nextDouble();
	obj3.pro(a3,b3,c3);
	
System.out.println("Lowest price product:");

        if(obj1.price<obj2.price && obj1.price<obj3.price)  
        	System.out.println(" Product code= " +obj1.pcode+" , Product name="+obj1.pname+" , price="+obj1.price);
        
        if(obj2.price<obj1.price && obj2.price<obj3.price)  
              System.out.println(" Product code= " +obj2.pcode+" , Product name="+obj2.pname+" , price="+obj2.price);
              
        if(obj3.price<obj1.price && obj3.price<obj2.price)  
              System.out.println(" Product code= " +obj3.pcode+" , Product name="+obj3.pname+" , price="+obj3.price);
    }
	
}			
         	
         	
         	
         	
/* output

Enter the product1 :
101
soap
30
Enter the product2 :
102
pen
10
Enter the product3 :
103
pencil
5
Lowest price product:
 Product code= 103 , Product name=pencil , price=5.0

*/         	
         	
         	
         	      
