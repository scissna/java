//1. Maintain a list of Strings using ArrayList from collection framework, perform built-in operations.

import java.util.*;
class strings
 {
     public static void main(String args[])
      {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> al=new ArrayList<String>();
        System.out.println("ArrayList operations are:");
        System.out.println("\n1.ADD\n2.REMOVE\n3.DISPAY\n4.GET ITEM\n5.SIZE\n6.CLEAR.\n7.EXIT...\n");
        
        
	     while(true)
	     {
		        System.out.println("Enter your option:");
		        int ch=sc.nextInt();
		switch(ch)
		{        
		  case 1:
		         System.out.println("Enter the item to add:");
		         String st=sc.next();
		         al.add(st);       //adding an item
		         break;
		       
		  case 2:
		         System.out.println("Enter the item to remove:");
		         String st1=sc.next();
		         al.remove(st1);  //removing an item 
		         break;
		         
		  case 3:     
		         System.out.println(al);   //for displaying
		         break;
		         
		  case 4: 
		        System.out.println("Enter the index position:");
		        int i=sc.nextInt();
		        System.out.println("item at index "+i+": "+al.get(i));  //getting by index position 
		        break;
		        
		  case 5:
		        System.out.println("size of ArrayList:"+al.size());  //getting size
		        break;
		        
		  case 6:
		        al.clear();  //remove all
		        System.out.println("All item cleared");      
		        break;
		        
		  case 7:
		        System.out.println("Exiting...");  
		        System.exit(0);  

		 }
	       }          
	}	
  } 





/* output

ArrayList operations are:

1.ADD
2.REMOVE
3.DISPAY
4.GET ITEM
5.SIZE
6.CLEAR.
7.EXIT...


Enter your option:
1
Enter the item to add:
voilet
Enter your option:
1
Enter the item to add:
red
Enter your option:
1
Enter the item to add:
green
Enter your option:
1
Enter the item to add:
pink
Enter your option:
3
[voilet, red, green, pink]
Enter your option:
2
Enter the item to remove:
red
Enter your option:
3
[voilet, green, pink]
Enter your option:
4
Enter the index position:
0
item at index 0: voilet
Enter your option:
5
size of ArrayList:3
Enter your option:
6
All item cleared
Enter your option:
3
[]
Enter your option:
7
Exiting...
 */       
