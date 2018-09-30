/*

Deletion Distance
The deletion distance of two strings is the minimum number of characters you need to delete in the two strings in order to get the same string. For instance, the deletion distance between "heat" and "hit" is 3:

By deleting 'e' and 'a' in "heat", and 'i' in "hit", we get the string "ht" in both cases.
We cannot get the same string from both strings by deleting 2 letters or fewer.
Given the strings str1 and str2, write an efficient function deletionDistance that returns the deletion distance between them. Explain how your function works, and analyze its time and space complexities.

Examples:

input:  str1 = "dog", str2 = "frog"
output: 3

input:  str1 = "some", str2 = "some"
output: 0

input:  str1 = "some", str2 = "thing"
output: 9

input:  str1 = "", str2 = ""
output: 0
Constraints:

[input] string str1
[input] string str2
[output] integer
*/
import java.io.*;
import java.util.*;
import java.util.Scanner;
public class Solution {

  static int deletionDistance(String str1, String str2) {
    // your code goes here
    if(str1.equals(str2))
    {
      return 0;
    }
    char aa[]= str1.toCharArray();
    char bb[]= str2.toCharArray();
    int len1=aa.length;
    int len2=bb.length;
   
    
    int len=len1+len2;
    int count=0;
    for(int i=0;i<len1;i++)
    {
      
      for(int j=0;j<len2;j++)
      {
        if(aa[i]==bb[j])
        {
          count++;
          break;
        }
 
      }
  }
  count=count*2;
    if(count==len)
    {
      return len/2;
    }
  System.out.println(len-count);
  return len-count;
}
  public static void main(String []args){

    Scanner obj= new Scanner(System.in);
    String a=obj.next();
    String b=obj.next();
    
    deletionDistance(a,b);
  }

}