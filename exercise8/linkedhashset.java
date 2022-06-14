//6. Program to demonstrate the creation of Set object using the LinkedHashset class


import java.util.*;
class linkedhashset
{
    public static void main(String args[])
    {
    Scanner in=new Scanner(System.in);
    LinkedHashSet<String> set=new LinkedHashSet<String>();
   
    System.out.println("Enter the number of elements to be inserted: ");
    int n=in.nextInt();
    System.out.println("Enter the items to add: ");
   
    for(int i=0;i<n;i++)
    {
    String s1=in.next();
    set.add(s1);
    }    
   
    System.out.println("\nLinkedHashSet=" +set);
   
   
    Iterator<String>itr=set.iterator();
    while(itr.hasNext())
    {
    System.out.println(itr.next());
    }
   
    }
}


/* output
Enter the number of elements to be inserted: 
5
Enter the items to add: 
pen
pencil
box
book
bottle

LinkedHashSet=[pen, pencil, box, book, bottle]
pen
pencil
box
book
bottle
*/
