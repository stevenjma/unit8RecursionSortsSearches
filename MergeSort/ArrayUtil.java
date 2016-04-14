import java.util.Random;

/**
   This class contains utility methods for array manipulation.
*/  
public class ArrayUtil
{ 
   private static Random generator = new Random();

   /**
      Creates an array filled with random values.
      @param length the length of the array
      @param n the number of possible random values
      @return an array filled with length numbers between
      0 and n - 1
   */
   public static int[] randomIntArray(int length, int n)
   {  
      int[] a = new int[length];      
      for (int i = 0; i < a.length; i++)
      {
         a[i] = generator.nextInt(n);
      }
      
      return a;
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
      String letters = "QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm1234567890";
      String a = "";
      for (int i = 0; i < numChars; i++)
      {
          int index = generator.nextInt(letters.length() - 1);
          a += letters.substring(index, index + 1);
      }
      return a;
   }
   
   /**
      Swaps two entries of an array.
      @param a the array
      @param i the first position to swap
      @param j the second position to swap
   */
   public static void swap(int[] a, int i, int j)
   {
      int temp = a[i];
      a[i] = a[j];
      a[j] = temp;
   }
}
      
