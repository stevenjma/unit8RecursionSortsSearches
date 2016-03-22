import java.io.*;
import java.util.*;
import java.lang.Exception;

public class WC
{
    public static void main (String [] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("File Name: ");
        String fileName = s.next();
        
        File file = new File(fileName);
        
        int words = 0; 
        int chars = 0;
        
        try{
            Scanner in = new Scanner(file);
            
            while (in.hasNext()){
                in.next();
                words++;
            }
            
            in.close();
            in = new Scanner(file);
            in.useDelimiter("");
            
            while (in.hasNext()){
                in.next();
                chars++;
            }
            
            System.out.println(words);
            System.out.println(chars);
            in.close();
        } 
        catch (Exception FileNotFoundException){
            System.out.println("Couldn't find the file.");
        }
        
    }
}