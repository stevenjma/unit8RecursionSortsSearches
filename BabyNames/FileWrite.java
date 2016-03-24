import java.io.*;
import java.util.*;
import java.net.*;

/**
 * Write a description of class FileWrite here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FileWrite
{
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a website url, then enter a file to be pasted onto.");
        String url = s.next();
        String fileName = s.next();
        try{
            URL pageLocation = new URL(url);
            Scanner in = new Scanner(pageLocation.openStream());
            PrintWriter out = new PrintWriter(fileName);
            
            while (in.hasNext()){
                String word = in.next();
                out.print(word);
            }
            
            in.close();
            out.close();
        }
        catch (MalformedURLException e){
            System.out.println("URL not found.");
        }
        catch (FileNotFoundException e){
            System.out.println("File not found.");
        }
        catch (IOException e){
            System.out.println("Stream failed to open.");
        }
        System.out.println("Done.");
    }
}
