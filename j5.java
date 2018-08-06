public class Main{

     public int hcf(int a,int b)
     {
        
        for(int i=2;i<1000;i++)
        {
            
            if(i%a==0 && i%b==0)
            {
                
                return i;
            }
        }
        
         
         return a;
     }
     
      
     public static void main(String []args)
     {
    Main obj = new Main();
    
    int a=obj.hcf(50,28);
    System.out.println(a);
     }
}