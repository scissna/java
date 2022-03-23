//Write a Java program to find the number of days in a month for a given year.Check Leap year also.
import java.util.Scanner;
class month{
	public static void main(String arg[]){
	
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the month :");
	String mname=in.nextLine();
	System.out.println("Enter the year:");
	int y=in.nextInt();
	int f=0;

if ((y % 400 == 0) || ((y % 4 == 0) && (y % 100 != 0)))
	{
	System.out.println(y+"is leap year");
	f=1;
	}
else
	{
	System.out.println(y+"is not leap year");
	}


switch(mname)
	{
	case "january":
		System.out.println("31 days in this month");
		break;

	case "February":
		if(f==1)
		{
		System.out.println("29 days in this month");
		}
		else
		{
		System.out.println("28 days in this month");
		break;
		}

	case "March":
		System.out.println("31 days in this month");
		break;

	case "April":
		System.out.println("30 days in this month");
		break;

	case "May":
		System.out.println("31 days in this month");
		break;

	case "June":
		System.out.println("30 days in this month");
		break;
	case "July":
		System.out.println("31 days in this month");
		break;
	case "August":
		System.out.println("30 days in this month");
		break;
	case "September":
		System.out.println("31 days in this month");
		break;
	case "October":
		System.out.println("30 days in this month");
	case "November":
		System.out.println("31 days in this month");
		break;
	case "December":
		System.out.println("30 days in this month");
		break;
}
}
}






/*output

Enter the month :
january
Enter the year:
2020
2020is leap year
31 days in this month
*/
