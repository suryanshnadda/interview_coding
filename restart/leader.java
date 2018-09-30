/*
change the name of the file to nody.java
Write a program to print all the LEADERS in the array. An element is leader if it is greater than all the elements to its right side.

And the rightmost element is always a leader. For example int the array {16, 19, 4, 3, 8, 3}, leaders are 19, 8 and 3?
*/

import java.util.*;
public class nody
{
 public static void main(String[] args)
  {
    int a[]={19,3,4,9,6,7,8};
    ArrayList<Integer> obj = new ArrayList<Integer>();

    int len=a.length;

    for(int i=0;i<len-1;i++)
    {
       int count=0;

      for(int j=i+1;j<len;j++)
      {

      if(a[i]<a[j])
      {
       count++;
       continue;
      }

      }
      if(count==0)
      {
        System.out.println(a[i]);
      }


    }

      System.out.println(a[len-1]);

  }
}
