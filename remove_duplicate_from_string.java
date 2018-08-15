
/*

to remove duplicates from a string




*/
import java.util.Scanner;
public class nody{

     public static void main(String []args){

        String a="aaab";
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

    System.out.println(b);

     }


}
