public class don
{
    void check(int a[],int x)
    {
     int len=a.length;
     int count=0;
     for(int i=0;i<len-3;i++)
     {
         for(int j=i+1;j<len-2;j++)
         {
             for(int k=j+1;k<len-1;k++)
             {
                 
                 for(int l=k+1;l<len;l++)
                 {
                     if(a[i]+a[j]+a[k]+a[l]==x)
                     {
                      count=count+1;
                      System.out.println(1);
                      return;
                     }
                 }
             }
         }
     }
     if(count==0)
     {
         System.out.println(0);
     }
    }
    public static void main(String [] args)
    {
        don obj= new don();
        int a[]={1,1,1,1,2,3,4,31,2};
        obj.check(a,7);
    }
}