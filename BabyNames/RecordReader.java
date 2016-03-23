import java.util.Scanner;

/**
   This class processes baby name records.
*/
public class RecordReader
{
   private double total;
   private double limit;
   private int totalNumber;

   /**
      Constructs a RecordReader with a zero total.
   */
   public RecordReader(double aLimit, int aTotalNumber)
   {
      total = 0;
      limit = aLimit;
      totalNumber = aTotalNumber;
   }

   /**
      Reads an input record and prints the name if the current total is less 
      than the limit.
      @param in the input stream
   */
   public void process(Scanner in)
   {
       String name = in.next();
       int number = in.nextInt();
       double percent = number / totalNumber;
      
      if (total < limit) { System.out.print(name + " "); }
      total = total + percent;
   }

   /**
      Checks whether there are more inputs to process
      @return true if the limit has not yet been reached
   */
   public boolean hasMore()
   {
      return total < limit;
   }
}
