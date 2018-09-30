/*
    to remove duplicate from a aray
    we will use hashset
    */
    import java.util.Scanner;
    import java.util.Arrays;
    import java.util.HashSet;
    import java.util.Set;
    public class nody
    {
         public static void main(String []args)
         {

               int e[]={0,0,2,3,1,2,3,4,5,6,4,2,4,2,4,242,4,24,2,4};
            Integer[] numbers= new Integer[e.length];

               for(int i=0;i<e.length;i++)
               {
                numbers[i]=Integer.valueOf(e[i]);
               }

    		    Set<Integer> set = new HashSet<Integer>(Arrays.asList(numbers));

              Integer[]don=new Integer[set.size()] ;
              set.toArray(don);

              for(int i=0;i<don.length;i++)
              {
                  System.out.println(don[i]);
              }
          }


    }
