/*
Smallest Positive missing number
*/

import java.util.*;
import java.util.Scanner;
public class ArraySet {

    public static void main(String[] args) {
       Scanner ml = new Scanner(System.in);
        int[] array =new int[85];
        for(int i=0;i<85;i++)
        {
            array[i]=ml.nextInt();
        }
        String []arra= new String[array.length];
        
        for(int i=0;i<array.length;i++)
        {
            arra[i]=String.valueOf(array[i]);
        }
        Set<String> set = new HashSet<>(Arrays.asList(arra));
        
    
        int n=set.size();
        String arrb[] = new String[n];
        arrb=set.toArray(arrb);
        
        int aa[]= new int[n];
        
        for(int i=0;i<n;i++)
        {
            aa[i]=Integer.parseInt(arrb[i]);
            //System.out.println(aa[i]);
        }
        Arrays.sort(aa);
        for(int i=0;i<n-1;i++)
        {   if(aa[i]>-1)
        {
            if(aa[i]+1!=aa[i+1])
            {
                System.out.println(aa[i]+1);
                break;
            }
            
            
        }   
        }
        
        
    }
}