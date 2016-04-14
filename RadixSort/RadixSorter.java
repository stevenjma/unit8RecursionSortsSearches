public class RadixSorter
{
    public static void sort(int[] a)
    {
        Integer greatest = 0;
        for (int i = 0; i < a.length; i++)
        {
            if (a[i] > greatest)
            {
                greatest = a[i];
            }
        }
        int iterations = greatest.toString().length();
        for (int i = 0; i < iterations; i++)
        {
            
        }
    }
}