       /*
How to find first non repeated character of a given String
*/


import java.util.Scanner;
public class Main{
    
    public char ste(String a)
    {
      
      for(int i=0;i<a.length();i++)
      {
       int count=0;
       
       for(int j=0;j<a.length();j++)
       {
           if(i==j)
           {
               continue;
           }
           
          if(a.charAt(i)==a.charAt(j))
          {
              count++;
          }
       }
       if(count==0)
       {
           
           char m =a.charAt(i);
           return m;
       }
          
      }
        return '-';
    }
     public static void main(String args[])
   {
     Main obj= new Main();
    char a= obj.ste("dodo");
    System.out.println(a);
   }
}