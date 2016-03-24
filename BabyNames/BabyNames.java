import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BabyNames
{
   public static final double LIMIT = 0.5;
   public static final int MALETOTAL = 19229058;
   public static final int FEMALETOTAL = 18450257;

   public static void main(String[] args) throws FileNotFoundException
   {  
      Scanner s = new Scanner(System.in);
      System.out.println("Enter the name of the file.");
      String fileName = s.next();
      Scanner in = new Scanner(new File(fileName));
         
      RecordReader boys = new RecordReader(LIMIT, MALETOTAL);
      RecordReader girls = new RecordReader(LIMIT, FEMALETOTAL);
      
      while ((boys.hasMore() || girls.hasMore()) && in.hasNext())
      {
         int rank = in.nextInt();
         System.out.print(rank + " ");
         boys.process(in);
         girls.process(in);
         System.out.println();
      }

      in.close();
   }
}   
