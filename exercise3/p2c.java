//recursive binary search
import java.util.*;

class rebinary
	{
	int bisearch(int f,int l,int x,int a[])   //recursive function
	{

	if(l>=f)
	{
		int mid=(f+l)/2;
		if(a[mid]==x)   //case of match
		return mid;

		if(x>a[mid])
		return bisearch(mid+1,l,x,a);  //case of right side
		return bisearch(f,mid-1,x,a);  //case of left side
	}
	return -1;
	}
	public static void main(String args[]){
		    
		     
		     System.out.print("\n");
		     rebinary obj=new rebinary();
		     Scanner s=new Scanner(System.in);
		     int i;
		     System.out.print("Enter Number of elements: ");
		     int n=s.nextInt();
		     int a[]=new int[n];
		       
		     System.out.print("Enter the elements in sorted order : ");
		        for( i=0;i<n;i++)
		         {
		          a[i]=s.nextInt();
		         }
		     System.out.print("Enter the element to search: ");
		     int a1=s.nextInt();
		       
		     System.out.print("\n");
		     
		    int k=obj.bisearch(0,n-1,a1,a);//invoking bisearch
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


