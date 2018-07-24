import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {

        char aa[]=a.toCharArray();
        char bb[]=b.toCharArray();
         int ca[]= new int[26];
         int cb[] = new int[26];

         for(int i=0;i<26;i++)
         {
             int count=0;
             for(int j=0;j<aa.length;j++)
             {
                 int d= (int)aa[j];
                 
                 if(d==(i+97))
                 {
                     count++;
                 }
             }
             ca[i]=count;
         }
        
        
        for(int i=0;i<26;i++)
         {
             int count=0;
             for(int j=0;j<bb.length;j++)
             {
                 int d= (int)bb[j];
                 
                 if(d==(i+97))
                 {
                     count++;
                 }
             }
             cb[i]=count;
         }
        int sum=0;
        for(int i=0;i<26;i++)
        {
           sum = sum+ Math.abs(ca[i]-cb[i]);
            
        }
        
        return sum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String a = scanner.nextLine();

        String b = scanner.nextLine();

        int res = makeAnagram(a, b);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
