import java.util.Scanner;

class lefta
{
    
    public static void man(int a[],int rot)
    {
    
        for(int i=0;i<rot;i++)
        {
            doo(a);
            
        }
    }
    
    public static void doo(int a[])
    {
        
        int len=a.length;
        
        int temp = a[0];
        
        for(int i=0;i<len-1;i++)
        {
            a[i]=a[i+1];
        }
        a[len-1]=temp;
    }
    
    
    public static void main(String args[])
    {
     Scanner obj = new Scanner(System.in);
        
       int len =obj.nextInt();
       int rot =obj.nextInt();
       int a[]=new int[len];
        for(int i=0;i<len;i++)
        {
            a[i]=obj.nextInt();
        }
        man(a,rot);    
        
        for(int i=0;i<len;i++)
        {
        System.out.print(a[i]+" ");
        }
        
    }
    
}import java.util.Scanner;

class lefta
{
    
    public static void man(int a[],int rot)
    {
    
        for(int i=0;i<rot;i++)
        {
            doo(a);
            
        }
    }
    
    public static void doo(int a[])
    {
        
        int len=a.length;
        
        int temp = a[0];
        
        for(int i=0;i<len-1;i++)
        {
            a[i]=a[i+1];
        }
        a[len-1]=temp;
    }
    
    
    public static void main(String args[])
    {
     Scanner obj = new Scanner(System.in);
        
       int len =obj.nextInt();
       int rot =obj.nextInt();
       int a[]=new int[len];
        for(int i=0;i<len;i++)
        {
            a[i]=obj.nextInt();
        }
        man(a,rot);    
        
        for(int i=0;i<len;i++)
        {
        System.out.print(a[i]+" ");
        }
        
    }
    
}