/*
to find maximum occrance of an element in an array

before compiling the program change the name of the program to nody.java



*/
import java.util.*;
class nody
{

 // to calculate max occurance of the number in the Arra
  void match(Integer b[], int a[])
  {
    int max=0;
    int m=-1;
    for(int i=0;i<b.length;i++)
    {
     int count=0;
     for(int j=0;j<a.length;j++)
     {
       if(b[i]==(int)a[j])
       {
         count++;
       }
     }
     if(count>max)
     {
       max=count;
       m=a[i];
     }

    }
System.out.println( "element with maximum occrance is"+ m);
  }
public static void main(String[] args)
{
int a[]=  {1,2,3,4,4,4,1,2,5};
ArrayList<Integer> obj = new ArrayList<Integer>();
obj.add(a[0]);
for(int i=1;i<a.length;i++)
{
if(obj.contains(a[i]))
{
  //
}
else
{
  obj.add(a[i]);
}
}
Integer[] ob = new Integer[obj.size()];
ob=obj.toArray(ob);
for(int i=0;i<ob.length;i++)
{
  System.out.println(ob[i]);
}
 nody on = new nody();
 on.match(ob,a);

}
}
