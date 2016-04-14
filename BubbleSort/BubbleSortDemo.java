import java.util.Arrays;

/**
   This program demonstrates the merge sort algorithm by
   sorting an array that is filled with random numbers.
*/
public class BubbleSortDemo
{  
   public static void main(String[] args)
   {  
      int[] a = ArrayUtil.randomIntArray(5, 25);
      System.out.println(Arrays.toString(a));

      BubbleSorter.sort(a);

      System.out.println(Arrays.toString(a));
   }
}