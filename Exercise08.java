import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


/**
 * Write a program that reads a file containing integers, and prints out their sum. 
 */
public class Exercise08 {
     
    public static void main(String[] args) {  
      //Initializes the file and scanner 
      Scanner scan = null;
      //Enter the file path for your chosen file. 
      File file = new File("Enter file path here");
      try {
         scan = new Scanner(file);
      } catch (FileNotFoundException e) {
         System.out.println("File not found.");
         System.exit(0);
      }
      System.out.println("File found.");
      
     //Loop through the file and add up all integers in the file
        
      //Print the total sum
      
      //close the scanner
      scan.close();
    }
}
