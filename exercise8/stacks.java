//3. Program to remove an object from the Stack when the position is passed as parameter

import java.util.*;
class stacks
{
 public static void main(String args[])
  {
  Scanner sc=new Scanner(System.in);
  Stack<String> stack=new Stack<String>();
  
  System.out.println("Enter the no of elements to be inserted:\n");
  int n=sc.nextInt();
  System.out.println("Enter item to add:");
  
  
  for(int i=0;i<n;i++)
  {
  String s1=sc.next();
  stack.push(s1);
  }
  
  System.out.println("\nStack=" +stack);
  System.out.println("\nEnter the position of item to be removed:");
 
  int r=sc.nextInt();
  stack.removeElementAt(r);
  
  System.out.println("\nDisplay stack after removal of elements at "+r+":\n");
  Iterator<String> itr=stack.iterator();
  while(itr.hasNext())
   {
    System.out.println(itr.next());
   }
  }
 }
 
 
 
 /*output
 
 Enter the no of elements to be inserted:

5
Enter item to add:
anu
binu
minu
anju
suku

Stack=[anu, binu, minu, anju, suku]

Enter the position of item to be removed:
3

Display stack after removal of elements at 3:

anu
binu
minu
suku
*/
