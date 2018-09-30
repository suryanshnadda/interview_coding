/*
to check for anagram
*/
import java.util.Scanner;
import java.util.Arrays;
public class nody
{
     public static void main(String []args)
     {
     String a="sury";
     String b="ysura";


     char aa[]=a.toCharArray();
     char bb[]=b.toCharArray();

     Arrays.sort(aa);
    Arrays.sort(bb);

     boolean m =Arrays.equals(aa,bb);
     System.out.println(m);

     }

     }
