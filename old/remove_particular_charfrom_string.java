/*
to remove particular character from string
*/
import java.util.Scanner;
import java.util.Arrays;
public class nody
{
     public static void main(String []args)
     {
        String a="suryanhs_sharma";
        //char to remove from the array
        char b='s';
        String n =" ";
        for(int i=0;i<a.length();i++)
         {
             char s=a.charAt(i);

             if(s==b)
             {
              //
             }
             else
             {
                n=n.concat(String.valueOf(s));
             }
         }
        n=n.trim();
        System.out.println(n);
     }
}
