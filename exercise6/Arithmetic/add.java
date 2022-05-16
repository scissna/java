
//add.java
package Arithmetic;

import java.util.*;

interface Opera
{

  public void fucn(int a,int b);

}

public class add implements Opera
{

	public void fucn(int a,int b)
	{

	System.out.println("SUM OF NUMBERS : "+ (a+b));

	}
}


