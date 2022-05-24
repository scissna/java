/*Write a user defined exception class to authenticate the user name and password.*/

import java.util.*;
class myException extends Exception{
public myException(String s){
super(s);
}
}

class expt
{
   public static void main(String ar[])
    {
       String username="scissna";
       String password="SCISSN@";
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter Username:");
       String u=sc.next();
       System.out.print("Enter Password:");
       String p=sc.next();
  try
    {
     if((u.equals(username)) && (p.equals(password))){
     System.out.print("Authentication success");
    }
  else
   {
     throw new myException("Authentication Faild");
   }
   }
  catch(myException ex)
   {

    System.out.print(ex.getMessage()+"\n");
   }
  }
}


/*OUTPUT

Enter Username:scissna 
Enter Password:SCISSN@
Authentication success


Enter Username:SCISSNA
Enter Password:SCISSN@
Authentication Faild
*/
