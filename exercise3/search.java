//2. Write a program to search an element in an array using


import java.util.*;
class search{
     public static void main(String args[]){
            Scanner in=new Scanner(System.in);
            int i;
            
            
            System.out.print("Enter Number of elements: ");
            int n=in.nextInt();

            int arr[]=new int[n];//declaring array
            int k=0;

            System.out.print("Enter the elements in sorted order: ");
            for( i=0;i<n;i++)
            {
              arr[i]=in.nextInt();//reading values
             }
             System.out.print("Enter the element to search: ");
             int a=in.nextInt();

           System.out.print("\n");
            int f=0,l=n-1,mid=(f+l)/2;
            while(f<=l)
             {
                if(a>arr[mid])//case of element is right of mid
                 {
                 f=mid+1;
                 mid=(f+l)/2;
                 }
                else if(a<arr[mid])//case of element is left of mid
                {
                  l=mid-1;
                 mid=(f+l)/2;
                 
                }
                else//case of match
                {
                System.out.print("Element found at index: "+mid);
                k=1;
                break;
                
                }
            }
             if(k==0)
              {
               System.out.print("Element Not Found....  ");
              }
}
}





/* output

Enter Number of elements: 3
Enter the elements in sorted order: 1 6 8
Enter the element to search: 5

Element Not Found.... 


Enter Number of elements: 5
Enter the elements in sorted order: 7 8 9 10 15
Enter the element to search: 9

Element found at index: 2
*/






