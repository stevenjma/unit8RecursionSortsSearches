import java.util.*;

public class ListMethods
{
   public static ArrayList<Integer> makeList(int n)
   {
      ArrayList<Integer> tempList = new ArrayList<Integer>();
      if (n <= 0)  // The smallest list we can make
      {
          return tempList;
      }
      else        // All other size lists are created here
      {
          tempList.add(n);
          tempList.addAll(makeList(n-1));
      }
      Collections.sort(tempList);
      return tempList;
   }
   
   public static ArrayList<Integer> deepClone(ArrayList<Integer> tList)
    {
       ArrayList<Integer> list = new ArrayList<Integer>(); 
       for (Integer i : tList)
       {
          list.add(new Integer(i));
       }
       return list;
    }
   
   public static ArrayList<Integer> reverseList(ArrayList<Integer> tList)
   {
       ArrayList<Integer> tempList = new ArrayList<Integer>();
       ArrayList<Integer> list = ListMethods.deepClone(tList);
       if (list.size() <= 1)  // The smallest list we can make
       {
          return list;
       }
       else        // All other size lists are created here
       {
          tempList.add(list.get(list.size() - 1));
          list.remove(list.size() - 1);
          tempList.add(reverseList(list).get(list.size() - 2));
       }
       System.out.println(tempList);
       return tempList;
   }
}