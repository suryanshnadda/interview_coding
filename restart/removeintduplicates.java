import java.util.*;
class removeintduplicates
{
public static void main(String[] args)
{
int a[]=  {1,2,3,4,4,1,2,5};
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

}
}
