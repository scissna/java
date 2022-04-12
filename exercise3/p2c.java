//recursive binary search
import java.util.*;

class p2c
{
int bisearch(int f,int l,int x,int arr[])   //recursive fun
{

if(l>=f)
{
int mid=(f+l)/2;
if(arr[mid]==x)   //case of match
return mid;

if(x>arr[mid])
return bisearch(mid+1,l,x,arr);  //case of right side
return bisearch(f,mid-1,x,arr);  //case of left side
}
return -1;
}
public static void main(String args[]){
            
             
             System.out.print("\n");
             p2c obj=new p2c();
             Scanner s=new Scanner(System.in);
             int i;
             System.out.print("Enter Number of elements: ");
             int n=s.nextInt();
             int arr[]=new int[n];
               
             System.out.print("Enter the elements in sorted order : ");
                for( i=0;i<n;i++)
                 {
                  arr[i]=s.nextInt();
                 }
             System.out.print("Enter the element to search: ");
             int a=s.nextInt();
               
             System.out.print("\n");
             
            int k=obj.bisearch(0,n-1,a,arr);//invoking bisearch
            if(k==-1)
              System.out.print("ELEMENT NOT FOUND... ");
           
            else
              System.out.print("ELEMENT FOUND AT INDEX "+k);
           
           
}

}





/*  output


Enter Number of elements: 4
Enter the elements in sorted order : 1 4 6 9
Enter the element to search: 1

ELEMENT FOUND AT INDEX 0


Enter Number of elements: 2
Enter the elements in sorted order : 2 8   
Enter the element to search: 5

ELEMENT NOT FOUND...


*/
