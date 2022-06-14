//5. Program to demonstrate the addition and deletion of elements in deque



import java.util.*;
public class deque
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        Deque<String> deque = new ArrayDeque<String>();        //Creating Deque  


 
        System.out.print("Enter the number of elements to be inserted: ");    //adding elements
        int n=in.nextInt();
        System.out.println("Enter item to add: ");  
        for(int i=0;i<n;i++)
        {            
            String s1=in.next();
            deque.add(s1);            
        }
        System.out.println("\nElements in Deque:");
        
        for (String str : deque)
        {
            System.out.println(str);
        }



        deque.poll();            //delete elements from deque
        System.out.println("\nElements after deletion:");
        
        for (String str : deque)
        {
            System.out.println(str);
        }
       
       

    }
}

/* output
Enter the number of elements to be inserted: 3
Enter item to add: 
java
python
ds

Elements in Deque:
java
python
ds

Elements after deletion:
python
ds
*/

