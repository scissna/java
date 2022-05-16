/*1. Create interfaces Student and Sports. Create
a class Result implements Student and Sports.
Display the academic and sports score of a
student.*/

import java.util.*;
interface student //defining interface
	{
	 int score=10;
	 void displayscore();
	}

interface sports
	{
	 int score=25;
	 void displaysportscore();
	}

class result implements student,sports
{
	  public void displayscore()
	   {
	     System.out.println("Academic Score is:" +student.score);
	   }
	  public void displaysportscore()
	   {
	     System.out.println("sports score is:" +sports.score);
	   }
}


class sportsstudentresult
{
	 public static void main(String args[])
	  {
	    result x=new result();
	    x.displayscore();
	    x.displaysportscore();
	  }	
}



/*output

Academic Score is:10
sports score is:25

*/

