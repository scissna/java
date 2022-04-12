//binary search using binarySearch()


import java.util.*;
class p2d{
     public static void main(String args[]){
            Scanner s=new Scanner(System.in);
            int i,k=0;
            
            System.out.print("Enter Number of elements: ");
             int n=s.nextInt();
            int arr[]=new int[n];     //declaring array
             System.out.print("Enter the elements in sorted order: ");
            for( i=0;i<n;i++)
            {
              arr[i]=s.nextInt();     //reading values
             }
             System.out.print("Enter the element to search: ");
             int a=s.nextInt();

         System.out.print("\n");
              
           int z=Arrays.binarySearch(arr,a);   //invoking binarySearch()

           if(z> -1)                          //implies element found case
            System.out.println("The Element Found at Index:  "+z); 

          else                                 //not found case
             System.out.println("The Element Not Found   ");            



}
}



/* output
Enter Number of elements: 5
Enter the elements in sorted order: 6 9 11 15 18
Enter the element to search: 10

The Element Not Found   



Enter Number of elements: 3
Enter the elements in sorted order: 10 20 30
Enter the element to search: 20

The Element Found at Index:  1


*/
