/*Write a menu driven program that would choose either in-built method or call a user defined method to sort an array of strings.*/



import java.util.*;

class Sort
{
 
	void userdef(String arr[],int n)        //sorting an array
  	{
    		for(int i=0;i<n-1;i++) 
    		{
      			for(int j=i+1;j<n;j++) 
      			{
        			if(arr[i].compareTo(arr[j])>0) 
         			{
          				String temp = arr[i];   // comparing strings, swapping the strings
          				arr[i] = arr[j];
          				arr[j] = temp;
         			}
      			}
    		}

	System.out.println("The Sorted array is :");     //sorted array
	for(int i=0;i<n;i++)
	System.out.print(arr[i]+"\n");
}
}


class sortmain
{
   	public static void main(String args[])
   	{
    		Scanner in=new Scanner(System.in);  
   
    		System.out.println("Enter the size of the array :");  //read the size of array
    		int n=in.nextInt();
    		String arr[]=new String [n];
    		System.out.println("Enter the Strings in the array :");   //reading the strings to array
    		for(int i=0;i<n;i++)
    		{
     			arr[i]=in.next();
    		}
    		Sort obj=new Sort();   //object  for the class Sort
        	do
        	{
       		System.out.println("\n1.In_build method \n2.User defined method  \n3.Exit \n Enter your choice");
       		
       		int ch=in.nextInt();

        	switch (ch)
    		{
     			case 1 : Arrays.sort(arr);    //inbuilt 
                   		System.out.println("The Sorted array is :");
         			System.out.println(Arrays.toString(arr)); //printing the sorted array using Arrays.toString(a)
                   		break;
     			case 2 :obj.userdef(arr,n); //userdefined
          			break;
         		case 3 :System.out.println("Exiting.....!");
                   		System.exit(0);
     			default: System.out.println("Enter a valid option...!");
    		} 
        }while(true);
        
   	}
}

/*output
Enter the size of the array :
3
Enter the Strings in the array :
java
ds
script
1.In_build method
2.User defined method
3.Exit
 Enter your choice
1
The Sorted array is :
[ds, java, script]
1.In_build method
2.User defined method
3.Exit
 Enter your choice
2
The Sorted array is :
ds
java
script
1.In_build method
2.User defined method
3.Exit
 Enter your choice
3
Exiting.....!
*/
