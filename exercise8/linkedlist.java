//2. Program to remove all the elements from a linked list

import java.util.*;

class Linkedlist
	{
	 public static void main(String args[])
	  {
	  Scanner sc=new Scanner(System.in);
	  LinkedList<String> Llist=new LinkedList<String>();//create an empty linked list
	  System.out.println("Enter the limit to add the values:");
	  int n=sc.nextInt();
	  System.out.println("Enter the items :");
	  
	  for(int i=0;i<n;i++)
	   {
	   String st=sc.next();
	   Llist.add(st); 
	   }
	  
	  //add the values in the linked list using add()
	  
	  
	  System.out.println("The original Linked list :" +Llist);//print the original values
	  
	  Llist.removeAll(Llist);  //remove the all items in the linked list 
	  
	  System.out.println("The new Linked list is :" +Llist); //print the new values
	  }
	 } 
	  
	  
/*output

Enter the limit to add the values:
5
Enter the items :
voilet
purple
lavender
black
white
The original Linked list :[voilet, purple, lavender, black, white]
The new Linked list is :[]
*/
