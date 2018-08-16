/*
to remove duplicates from a int
*/
import java.util.Scanner;
public class nody
{
     public static void main(String []args)
     {
        int m=1112010;
        String a=String.valueOf(m);
        String b=" ";
        int len=a.length();
        for(int i=0;i<len;i++)
        {
         if(i==0)
         {
             String bb=String.valueOf(a.charAt(i));
             b=b.concat(bb);
         }
         else
         {
              String bb=String.valueOf(a.charAt(i));
              if(b.contains(bb))
              {
              }
              else
              {
              b=b.concat(bb);
              }
         }
        }
        //because it keeps empty spaces which cant be converted to int

    b=b.trim();
         int d=Integer.parseInt(b);
         System.out.println(d);
     }
}
