/*
printing alternate elements of an array
*/
import java.util.Scanner;
public class nody{
     public static void main(String []args){
        int a[]=new int[]{2,3,4,5,1,6,7,8,5};

        for(int i=0;i<a.length;i=i+2)
        {
            System.out.println(a[i]);
        }
     }
}
