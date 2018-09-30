public class Main{

     public int hcf(int a,int b)
     {
         int max=1;
         
         for(int i=1;i<a+1;i++)
         {
             if(a%i==0 && b%i==0)
             {
                 max=i;
             }
             
         }
         
         return max;
     }
     
      
     public static void main(String []args)
     {
    Main obj = new Main();
    
    int a=obj.hcf(852,1065);
    System.out.println(a);
     }
}