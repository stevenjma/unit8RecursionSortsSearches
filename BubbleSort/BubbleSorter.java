

/**
 * Write a description of class BubbleSorter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BubbleSorter
{
    public static void sort(int[] a)
    {
        boolean isSorted = false;
        while (!isSorted){
            isSorted = true;
            for (int i = 0; i < a.length - 1; i++)
            {
                if (a[i] > a[i + 1])
                {
                    ArrayUtil.swap(a, i, i+1);
                    isSorted = false;
                }
            }
        }
    }
}
