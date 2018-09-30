/*
check if two strings are anagram or not
*/

import java.util.Arrays;
import java.util.Scanner;
public class Main{
    
    public boolean ste(String a,String b)
    {
    
    char aa[]=a.toCharArray();
    char bb[]=b.toCharArray();
    Arrays.sort(aa);
    Arrays.sort(bb);
    
     int len=a.length();
     
     for(int i=0;i<len;i++)
     {
         
         if(aa[i]!=bb[i])
         {
             return false;
         }
     }
     return true;
    }
     public static void main(String args[])
   {
     Main obj= new Main();
    boolean a= obj.ste("silent","listen");
    System.out.println(a);
   }
}