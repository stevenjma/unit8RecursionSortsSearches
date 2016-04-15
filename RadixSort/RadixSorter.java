import java.util.*;
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
        int [][] z = new int[iterations][a.length];
        ArrayList<ArrayList<Integer>> buckets = new ArrayList<ArrayList<Integer>>(10);
        for (int i = z.length - 1; i >= 0; i--)
        {
            for (int k = 0; k < 10; k++)
            {
                buckets.add(new ArrayList<Integer>());
            }
            for (int k = 0; k < 10; k++)
            {      
                for (int j = 0; j < z[i].length; j++)
                {
                    Integer y = a[j];
                    String numAsStr = String.valueOf(y);
                    for (int l = 0; l < (iterations - numAsStr.length()); l++)
                    {
                        numAsStr = "0" + numAsStr;
                    }
                    z[i][j] = Integer.parseInt(numAsStr.substring(i, i + 1));
                    if (z[i][j] == k)
                    {
                        buckets.get(k).add((z[i][j]));
                    }
                }
            }
        }
        
        ArrayList<Integer> filler = new ArrayList<>();
        
        for (int i = 0; i < buckets.size(); i++)
        {
            for (int j = 0; j < buckets.get(i).size(); j++)
            {
            }
        }
    }
}