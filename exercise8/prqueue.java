//4. Program to demonstrate the creation of queue object using the PriorityQueue class

import java.util.*;

public class  prqueue
{
    public static void main(String args[])
    {

        PriorityQueue<String> queue=new PriorityQueue<String>();

        queue.add("scissna");
        queue.add("scissmo");
        queue.add("aasima");
        queue.add("aadhi");
        System.out.println("Elements in Priority Queue : "+queue);
       
         }
}

/* output
Elements in Priority Queue : [aadhi, aasima, scissmo, scissna]
*/
