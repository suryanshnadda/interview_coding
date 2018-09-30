/*
change the file name to nody.java


Maximum difference between two elements such that larger element appears after the smaller number
Given an array arr[] of integers, find out the difference between any two elements such that larger element appears after the smaller number in arr[].

Examples: If array is [2, 3, 10, 6, 4, 8, 1] then returned value should be 8 (Diff between 10 and 2). If array is [ 7, 9, 5, 6, 3, 2 ] then returned value should be 2 (Diff between 7 and 9)

Time Complexity: O(n^2)
Auxiliary Space: O(1)
*/

import java.util.*;
public class nody
{
 public static void main(String[] args)
  {

    int a[]={7, 9, 5, 6, 3, 2};
    int len=a.length;
    int max=0;
    for(int i=0;i<len-1;i++)
    {

      for(int j=i+1;j<len;j++)
      {

      int c=a[j]-a[i];

      if(c>max)
      {
        max=c;
      }

      }
    }
System.out.println(max);

  }
}
