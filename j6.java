import java.util.Scanner;
public class Main{
     public void hcf()
     {
       Scanner obj= new Scanner(System.in);
       int m,n;
       System.out.println("enter number of rows");
       m=obj.nextInt();
       
       n=obj.nextInt();
       
       int a[][]=new int[m][n];
       
       //enter elements in array

       for(int i=0;i<m;i++)
       {
           for(int j=0;j<n;j++)
           {
               a[i][j]=obj.nextInt();
           }
       }
       
       //output before the transpose
       for(int i=0;i<m;i++)
       {
           for(int j=0;j<n;j++)
           {
               System.out.print(a[i][j]+" ");
           }
           
           System.out.println("");
       }
       
       
       //transpose the fucking matrix
       
       int na[][]= new int[n][m];
       
       for(int i=0;i<m;i++)
       {
           for(int j=0;j<n;j++)
           {
               na[j][i]=a[i][j];
           }
       }
       
       //print transpose matrix
       System.out.println("print transpose matrix");
         for(int i=0;i<n;i++)
       {
           for(int j=0;j<m;j++)
           {
               System.out.print(na[i][j]+" ");
           }
           
           System.out.println("");
       }
       
       
       
     }
     public static void main(String []args)
     {
     Main obj = new Main();
     obj.hcf();
     }
     }