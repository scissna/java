//simple binary search

import java.util.*;
class simplebi{
     public static void main(String args[]){
            Scanner s=new Scanner(System.in);
            int i;
           
            System.out.print("Enter Number of elements: ");
             int n=s.nextInt();
            int a[]=new int[n];     //declaring array
               int k=0;
             System.out.print("Enter the elements in sorted order: ");
            for( i=0;i<n;i++)
            {
              a[i]=s.nextInt();   //reading values
             }
             System.out.print("Enter the element to search: ");
             int a1=s.nextInt();

             
System.out.print("\n");  
           
             int f=0,l=n-1,mid=(f+l)/2;
            while(f<=l)
             {
              if(a1>a[mid])      //case of element is right of mid
               {
                 f=mid+1;
                 mid=(f+l)/2;
                }
               else if(a1<a[mid])       //case of element is left of mid
              {
                 l=mid-1;
                 mid=(f+l)/2;
                 
               }
             else             //case of match
              {
               System.out.print("ELEMENT FOUND AT INDEX "+mid);
              k=1;
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



Enter Number of elements: 5
Enter the elements in sorted order: 1 3 5 7 9
Enter the element to search: 9

ELEMENT FOUND AT INDEX 4


Enter Number of elements: 3
Enter the elements in sorted order: 7 8 9
Enter the element to search: 1

ELEMENT NOT FOUND....  



*/

