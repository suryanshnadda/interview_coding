/*
Description:
You have got a range of numbers between 1 to N, where one of the number is
repeated. You need to write a program to find out the duplicate number.
*/


import java.util.Arrays;
public class nody{
       public static void duplicate(int[] a)
       {
           Arrays.sort(a);
           int count=0;
           for(int i=0;i<a.length-1;i++)
           {
               if(a[i]==a[i+1])
               {
                   System.out.println(a[i]);
                   count++;
                   return;
               }
           }

           if(count==0)
           {
               System.out.println("no duplicate found");
           }
       }

       public static void main(String []args){
        int a[]={1,1,2,23,3,4,52,62,7,8,9,9};
        nody.duplicate(a);
     }
}
