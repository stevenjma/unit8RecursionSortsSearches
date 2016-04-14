import java.util.Random;

public class ArrayUtil
{
    public static Random generator = new Random();
    
    public static int[] randomIntArray(int length, int n)
    {
        int[] a = new int[length];
        for (int i = 0; i < a.length; i++)
        {
            a[i] = generator.nextInt(n);
        }
        
        return a;
    }
    
    public static void swap(int [] a, int i, int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    
    public static String[] randomStringArray(int length, int numChars)
    {
        String[] a = new String[length];
        for (int i = 0; i < a.length; i++)
        {
            a[i] = randomString(numChars);
        }
        
        return a;
    }
    
    private static String randomString(int numChars)
    {
        String a = "";
        return a;
    }
}