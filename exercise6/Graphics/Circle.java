package Graphics;
import java.util.*;
interface fig
{
  public void area(int a);
}


public class Circle implements fig
{
 public void area(int a)
  {
    System.out.println("AREA OF CIRCLE : "+  (a*a*3.14));
  }

}

