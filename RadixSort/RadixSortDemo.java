import java.util.Arrays;

/**
   This program demonstrates the merge sort algorithm by
   sorting an array that is filled with random numbers.
*/
public class RadixSortDemo
{  
   public static void main(String[] args)
   {  
      int[] a = ArrayUtil.randomIntArray(25, 1000);
      System.out.println(Arrays.toString(a));

      RadixSorter.sort(a);

      System.out.println(Arrays.toString(a));
   }
}