//linear search

import java.util.*;
class p2a{
     public static void main(String args[]){
            Scanner s=new Scanner(System.in);
            int i,k=0;
    
            System.out.print("Enter Number of elements: ");
             int n=s.nextInt();
            int arr[]=new int[n];     //declaring array
             System.out.print("Enter the elements: ");
            for( i=0;i<n;i++)
            {
              arr[i]=s.nextInt();       //reading values
             }
             System.out.print("Enter the element to search: ");
             int a=s.nextInt();

             System.out.print("\n");         

              for( i=0;i<n;i++)
                {
                  if(a==arr[i])       //comparing
                  {
                   System.out.print("ITEM FOUND AT INDEX "+i);
                   k=1;       //setting flag
                    break;
                   }
          
                }
 if(k==0)
             {
               System.out.print("ELEMENT NOT FOUND....  ");
              }
             
}
}





/* output


Enter Number of elements: 3
Enter the elements: 1 5 9
Enter the element to search: 4


ELEMENT NOT FOUND.... 


Enter Number of elements: 2
Enter the elements: 6 7
Enter the element to search: 7


ITEM FOUND AT INDEX 0

*/
