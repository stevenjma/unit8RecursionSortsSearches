import java.io.*;
import java.util.*;

public class WC
{
    public static void main (String [] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("File Name: ");
        String fileName = s.next();
        Scanner in = null;
        
        File file = new File(fileName);
        try{
            in = new Scanner(file);
            while (in.hasNext()){
                System.out.printf("%8.2f\n", in.next());
            }
            in.close();
        } 
        catch (Exception FileNotFoundException){
            System.out.println("Couldn't find the file.");
        }
        
    }
}